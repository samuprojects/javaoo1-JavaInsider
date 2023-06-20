@SuppressWarnings("ALL")
public class NullReference {

    public static void main(String[] args) {

        Account a = null;
       // a.printBalance(); // ao retirar o comentário dessa linha ocorrerá um NullPointerException

        if (a != null){ // uma forma de evitar o problema
            a.printBalance();
        } else {
            System.out.println("nulo");
        }
    }
}
