public class Account {

    String accountNumber;
    String accountOwner;
    double balance;

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

        @SuppressWarnings("SameParameterValue")
        boolean withdraw(double amount) {
        if (amount > 0 ) {
            balance -= amount;
            return true;
        }
        return false;
        }

        void printBalance() {
            System.out.println("Balance: R$ " + balance);
        }
    }
