package Actividad8_3.Controller;

import Actividad8_3.Clases.HoraExacta;

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

        System.out.println("Ingresa la hora que quieres probar-> \nSi los valores no son validos se usaran lo valores anteriores 2:0:0");
        System.out.println("Hora");
        h1.setHora(sn.nextInt());
        System.out.println("Minutos");
        h1.setMinutos(sn.nextInt());
        System.out.println("Segundos");
        h1.setSegudos(sn.nextInt());

        System.out.println(h1.toString()+ "\n");

        System.out.println("Ingresa una segunda hora para comparar. Ingrese unicamente valores correctos (h=23 max, m=59 max, s=59");
        System.out.println("Hora");
        int hT= sn.nextInt();
        System.out.println("Minutos");
        int mT= sn.nextInt();
        System.out.println("Segundos");
        int sT= sn.nextInt();
        HoraExacta h2=new HoraExacta(hT,mT,sT);

        System.out.println(h2.toString());

        if (!h1.compararFechas(h2)){
            System.out.println("Fecha no son iguales");
        }else{
            System.out.println("Fecha iguales");
        }
    }
}
