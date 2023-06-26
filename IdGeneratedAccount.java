
@SuppressWarnings("ALL")
public class IdGeneratedAccount {

    private final String accountNumber;
    private final String accountOwner;
    private double balance;

    private static int currentId = 1; // com o static a contagem do ID pertence à classe e não mais à instância

    public IdGeneratedAccount(String accountOwner) {
        this.accountNumber = "000" + currentId++; // cada novo cliente deve receber um novo ID sequencial se estiver static
        this.accountOwner = accountOwner;
        this.balance = 0.0;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    void transfer(double amount, IdGeneratedAccount targetAccount) {
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

}
