
@SuppressWarnings("ALL")
public class EncapsulatedAccount {

    private String accountNumber;
    private String accountOwner;
    private double balance;

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
