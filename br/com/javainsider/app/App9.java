package br.com.javainsider.app;

import br.com.javainsider.account.*; // Posso usar o Fully Qualified, ou imports diretos, ou o *
// no intellij o atalho CrtL + Alt + O a IDE já organiza os imports em ordem alfabética
// ou pelo menu Code Optimize Imports

public class App9 {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        // Fully Qualified Name
        Account a = new Account();
        Account b = new Account();
        Account c = new Account();
        EncapsulatedAccount d = new EncapsulatedAccount("1234");
    }

}


