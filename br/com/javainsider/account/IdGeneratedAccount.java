package br.com.javainsider.account;

@SuppressWarnings("ALL")
public class IdGeneratedAccount {
    // pode ter a visibilidade public pois como é static final o seu valor não é alterado.
    // em alguns cenários pode ser interessante ter uma classe só para definir as constantes
    // centralizando o que seriam as configurações de uma aplicação num lugar só.
    public static final int INITIAL_VALUE = 10;

    private final String accountNumber;
    private final String accountOwner;
    private double balance;

    private static int currentId;


    static {
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
