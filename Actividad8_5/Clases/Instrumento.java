package Actividad8_5.Clases;

import java.util.Arrays;

public abstract class Instrumento {

    String nombreCancion;
//    protected String [] notas = new String [0];
    protected Notas[] melodia;

//    public Instrumento(String nombreCancion, String[] notas) {
//        this.nombreCancion = nombreCancion;
//        this.notas = notas;
//    }

    public Instrumento() {
        melodia=new Notas[0];
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

//    public String[] getNotas() {
//        return notas;
//    }

//    public void setNotas(String[] notas) {
//        this.notas = notas;
//    }

    public void add(Notas n){
        melodia= Arrays.copyOf(melodia,melodia.length+1);
        melodia[melodia.length-1]=n;
    }

//    public void interpretar(){
//        System.out.println(Arrays.toString(melodia));
//    }
//
    public abstract void interpretar();

}
