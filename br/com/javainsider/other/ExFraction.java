package br.com.javainsider.other;

public class ExFraction {

    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        f1.set(2, 4);
        f1.show();

        Fraction f2 = new Fraction();
        f2.set(3, 6);
        f2.show();

        Fraction f3 = f1.multiply(f2);
        f3.show();
    }
}
