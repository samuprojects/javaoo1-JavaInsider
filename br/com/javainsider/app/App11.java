package br.com.javainsider.app;

import static java.lang.Math.*; // outra opção é importar todos os elementos estáticos de uma classe para simplificar o código
// não é questão de desempenho apenas para deixar o código mais limpo mesmo.

// import static java.lang.Math.PI;

import static java.lang.Math.pow;


@SuppressWarnings("ALL")
public class App11 {

    public static void main(String[] args) {

        double n = pow(3,2); // usando ALT + ENTER na frente do Math.pow vai sugerir importar a classe estática
        double pi = PI; // ou na frente do Math.PI vai importar o elemento estático PI da classe Math
        double x = abs(-10);
    }
}
