package Actividad8_1.Controller;

import Actividad8_1.Clases.Hora;

public class Main {
    public static void main(String[] args) {
        Hora h1=new Hora(50,100);
        System.out.println(h1.toString());

        h1.setMinuto(1);
        h1.setHora(1);
        System.out.println(h1.toString());
        h1.incrementar();
        System.out.println(h1.toString());
        System.out.println(h1.toStringIrina());
    }
}
