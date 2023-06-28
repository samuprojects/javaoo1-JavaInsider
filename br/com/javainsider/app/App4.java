package br.com.javainsider.app;

import br.com.javainsider.account.Account;

public class App4 {

    public static void main(String[] args) {

        Account a = new Account();
        a.printBalance();
        System.out.println(a.accountNumber);
    }
}
