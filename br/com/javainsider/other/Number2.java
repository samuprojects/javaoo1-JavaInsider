package br.com.javainsider.other;

@SuppressWarnings("ALL")
public class Number2 {

    private static int instances;
    private final int number; // pode até ser final no caso de ser tudo estático

    // deixar o construtor privado é uma forma de controlar, dentro da própria classe, a criação de objetos
    // construtor está encapsulado.
    private Number2(int number) { // não será possível instanciar diretamente com o new...
        this.number = number;
        instances++;
    }

    public int getNumber() { // usado para obter o número para a soma mais a frente
        return number;
    }

    public static Number2 add (Number2 n1, Number2 n2) { // método estático não depende de informações do objeto
        return new Number2(n1.getNumber() + n2.getNumber());
    }

    public static int getInstances() {
        return instances;
    }

    // ... com esse método estático é possível fornecer um objeto da classe para a aplicação que desejar
    public static Number2 newNumber(int n) {
        return new Number2(n);
    }


}
