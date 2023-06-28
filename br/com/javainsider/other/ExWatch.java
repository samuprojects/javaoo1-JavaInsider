package br.com.javainsider.other;

public class ExWatch {

    public static void main(String[] args) {

        Watch w = new Watch();
        System.out.println("A hora informada foi");
        w.setTime(11,30,40);
        System.out.println(w.readHour() + ":" + w.readMinute() + ":" + w.readSecond());
        System.out.println("O ponteiro das horas está no " + w.hour.number);
        System.out.println("O ponteiro dos minutos está no " + w.minute.number);
        System.out.println("O ponteiro dos segundos está no " + w.second.number);

    }
}
