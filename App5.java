public class App5 {

    public static void main(String[] args) {

        var a = new EncapsulatedAccount("12345", 0);
        a.deposit(1000);
        a.withdraw(200);
        a.printBalance();

        System.out.println(a.getAccountNumber());

       // a.setAccountOwner("Pedro");
        System.out.println(a.getAccountOwner());
    }
}
