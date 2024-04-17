package Actividad8_4.Controller;

import Actividad8_4.Clases.Campana;
import Actividad8_4.Clases.Notas;
import Actividad8_4.Clases.Piano;

public class Main {
    public static void main(String[] args) {
        Notas notas[] = {Notas.MI,Notas.RE,Notas.MI,Notas.SI,Notas.RE,Notas.SI,Notas.DO,Notas.DO};
        Piano p=new Piano();
        for (Notas nota : notas) {
            p.add(nota);
        }
        p.interpretar();

        Campana c=new Campana();

        for (Notas n:notas){
            c.add(n);
        }
        c.interpretar();


    }




}
