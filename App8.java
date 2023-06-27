@SuppressWarnings("ALL")
public class App8 {

    private int id;

    public App8(String s){

    }

    public void hello(){

    }

    // main é executado diretamente na classe e o seu funcionamento é igual a qualquer outra classe
    // pode ser criado atributos, construtores, métodos e até chamar outras classes com main
    // o que importa para a JVM é que haja um método main para iniciar a aplicação e por isso é estático.
    // existem outros exemplos da API do Java como a classe System onde utilizamos o atributo estático out
    // elementos estáticos são amplamente utilizados mesmo dentro da API do Java.
    // outro exemplo a classe Math para diversos tipos de operações matemáticas
    public static void main(String[] args) {
        App7.main(null);
        System.out.println(Math.pow(2, 3));
    }
}
