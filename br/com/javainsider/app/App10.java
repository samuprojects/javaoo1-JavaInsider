package br.com.javainsider.app;

import br.com.javainsider.account.Account;

@SuppressWarnings("ALL")
public class App10 {

    public static void main(String[] args) {

        // Caso em que será obrigatório usar o Fully Qualified Name, ou chama direto sem imports como no comentário
        // ou importa um pacote e o outro usa o Fully Qualified Name por conta de Classes Ambíguas
        // br.com.javainsider.account.Account a = new br.com.javainsider.account.Account();
        // br.com.javainsider.account2.Account b = new br.com.javainsider.account2.Account();

        Account a = new Account();
        br.com.javainsider.account2.Account b = new br.com.javainsider.account2.Account();
    }
}
