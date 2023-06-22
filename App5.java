public class App5 {

    public static void main(String[] args) {

        var a = new EncapsulatedAccount();
        a.deposit(1000);
        a.withdraw(200);
        a.printBalance();
    }
}
