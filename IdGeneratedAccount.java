
@SuppressWarnings("ALL")
public class IdGeneratedAccount {

    private final String accountNumber;
    private final String accountOwner;
    private double balance;

    private static int currentId;

    // Vantagem do static block é a garantia de que será executado e apenas uma vez,
    // antes de qualquer construtor e criação de objeto no Java.
    static { // É uma forma de inicialização de atributos estáticos dentro de uma classe
        System.out.println("Inicialiando currentId");
        currentId = 1;
    }

    public IdGeneratedAccount(String accountOwner) {
        this.accountNumber = "000" + currentId++;
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

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCurrentId() {
        return currentId;
    }
}
