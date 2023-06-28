package br.com.javainsider.other;

@SuppressWarnings("ALL")
public class Number {

    private static int instances; // para constabilizar quantas instancias forem cridadas
    private int number; // representa um número do enunciado

    public Number(int number) { // construtor de br.com.javainsider.other.Number que obriga informar um número na instanciação
        this.number = number;
        instances++; // ao invés de criar um método increments para contabilizar as instanciações
        // foi implementado direto dentro do construtor
    }


    public int getNumber() { // usado para obter o número para a soma mais a frente
        return number;
    }

    public static Number add (Number n1, Number n2) { // método estático não depende de informações do objeto
        return new Number(n1.getNumber() + n2.getNumber());
    }

    public static int getInstances() { // método que retorna a quantidade de instances implementado no construtor
        return instances;
    }

    public static void main(String[] args) {
        var n1 = new Number(10);
        System.out.println(n1.getNumber());

        var n2 = new Number(5);
        var n3 = Number.add(n1, n2); // método add utilizado para soma e atribuição em uma nova variável
        System.out.println(n3.getNumber()); // seguido da impressão da soma

        System.out.println(Number.getInstances()); // seguido da impressão de quantos objetos foram criados
        // pelo método get de instances
    }
}
