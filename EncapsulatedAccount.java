
@SuppressWarnings("ALL")
public class EncapsulatedAccount {

    private String accountNumber;
    private String accountOwner;
    private double balance;

    // Construtor padrão do Java
    public EncapsulatedAccount(){
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber){
        //System.out.println(); ERRO -> Call to 'this()' must be first statement in constructor body
        this(accountNumber,null,0); // como o objeto não foi construído ainda não pode chamar nada antes do this
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner){
        this(accountNumber, accountOwner,0);
    }

    public EncapsulatedAccount(String accountNumber, double balance){
        this(accountNumber, null, balance);
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);

    }

    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) { // permite alteração condicional
        if(!accountOwner.isBlank()) {
            this.accountOwner = accountOwner;
        } // atalho intelliJ ALT + INSERT
    }
}
