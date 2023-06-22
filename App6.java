@SuppressWarnings("ALL")
public class App6 {

    public static void main(String[] args) {

        final var account1 = new EncapsulatedAccount("1234"); // Variável está imutável
        final var account2 = new EncapsulatedAccount("4321", 1000);

        // account1 = new EncapsulatedAccount("3456"); ERRO -> Cannot assign a value to final variable 'account1'
    }
}
