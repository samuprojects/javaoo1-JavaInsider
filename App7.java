public class App7 {

    public static void main(String[] args) {

        var a1 = new IdGeneratedAccount("Pedro");
        System.out.println(a1.getAccountNumber());

        var a2 = new IdGeneratedAccount("Maria");
        System.out.println(a2.getAccountNumber());

        var a3 = new IdGeneratedAccount("Paulo");
        System.out.println(a3.getAccountNumber());

        // não é possível acessar elementos do objeto em métodos estáticos, esses métodos só
        // podem manusear atributos estáticos.
        // Já um método não estático pode manusear um atributo estático porque o objeto consegue
        // enxergar elementos estáticos
        int id = IdGeneratedAccount.getCurrentId();
        System.out.println(id);
    }
}
