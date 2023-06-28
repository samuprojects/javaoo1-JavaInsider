package br.com.javainsider.other;

public class Fraction {

    int n;
    int d;

    void set (int n, int d) {
        this.n = n;
        this.d = d;

    }

    Fraction multiply(Fraction f){
        Fraction r = new Fraction();
        r.n = n * f.n;
        r.d = d * f.d;
        return r;
    }

    void show(){
        System.out.println(n + " / " + d);
    }
}
