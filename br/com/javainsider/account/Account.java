package br.com.javainsider.account;

@SuppressWarnings("ALL")
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

    boolean deposit(String amount){
       return deposit(Double.parseDouble(amount));
    }

        boolean withdraw(double amount) {
        if (amount > 0 ) {
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
    }
