package br.com.javainsider.account;

@SuppressWarnings("ALL")
public class EncapsulatedAccount {

    private final String accountNumber;
    private final String accountOwner;
    private double balance;

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

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    public boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);

    }

    public void printBalance() {
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

}
