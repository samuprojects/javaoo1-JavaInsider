public class Account {

    String accountNumber;
    String accountOwner;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }
}
