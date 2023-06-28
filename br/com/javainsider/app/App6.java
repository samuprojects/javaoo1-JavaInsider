package br.com.javainsider.app;

import br.com.javainsider.account.EncapsulatedAccount;

@SuppressWarnings("ALL")
public class App6 {

    public static void main(String[] args) {

        final var account1 = new EncapsulatedAccount("1234"); // Variável está imutável
        final var account2 = new EncapsulatedAccount("4321", 1000);

        account1.printBalance();
        account1.deposit(1000); // cai na prova!!!!
        account1.printBalance(); // é possível pois o objeto pode ser alterado, o que não pode mudar
        // é a referência desse objeto na variável que está na stack esse é final
    }
}
