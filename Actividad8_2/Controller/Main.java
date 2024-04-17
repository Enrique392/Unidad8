package Actividad8_2.Controller;

import Actividad8_1.Clases.Hora;
import Actividad8_2.Clases.HoraExacta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HoraExacta h1=new HoraExacta(50,61,100);

        Scanner sn=new Scanner(System.in);

        System.out.println(h1.toString()+ "\n");
        h1.setHora(1);
        h1.setMinutos(58);
        h1.setSegudos(59);
        System.out.println(h1.toString()+ "\n");

        h1.incrementar();
        h1.revisarHora();
        System.out.println("Incremento: "+h1.toString()+ "\n");

        h1.incrementarSegundos();
        h1.revisarHora();
        System.out.println("Incrementar segundos: "+h1.toString()+ "\n");

        System.out.println("Ingresa la hora que quieres probar-> \n Si los valores no son validos se usaran lo valores anteriores 2:0:0");
        System.out.println("Hora");
        h1.setHora(sn.nextInt());
        System.out.println("Minutos");
        h1.setMinutos(sn.nextInt());
        System.out.println("Segundos");
        h1.setSegudos(sn.nextInt());

        System.out.println(h1.toString()+ "\n");




    }
}
