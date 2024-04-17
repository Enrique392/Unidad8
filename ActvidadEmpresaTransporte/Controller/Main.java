package ActvidadEmpresaTransporte.Controller;

import ActvidadEmpresaTransporte.Clases.Caja;
import ActvidadEmpresaTransporte.Clases.Unidad;

import java.util.Scanner;

public class Main {

    static Scanner sn = new Scanner(System.in); //El Scanner esta afuera del main para ser uilizado en funciones tambien
    static Caja c1 = new Caja(); //El objeto esta afuera del para ser utilizado en funciones

    public static void main(String[] args) {
        String unidadT; //variable temporal para unidad
        int opcion; //variable para las opciones


        System.out.println("Ingrese los datos de la caja");
        System.out.println("Que unidad de medida desea Utilizar"); //preguna al usuario los datos de la unidad deseada

        do { //Este do se encarga de repetir hasta que el usuario indique una opcion valida
            unidadT = sn.next().toUpperCase();
            if (unidadT.equals("CM")) {
                System.out.println("La unidad que se utilizara seran los centimetros (CM)");
                c1.setUnidad(Unidad.valueOf(unidadT));
            }else if (unidadT.equals("M")) {
                System.out.println("La unidad que se utilizara seran los metro (M)");
                c1.setUnidad(Unidad.valueOf(unidadT));
            }else if (!unidadT.equals("CM") && !unidadT.equals("MTS")) {
                System.out.println("La unidad indicada no es correcta \nLa opcion: "+unidadT+" no es valida. Ingrese una opcion valida (CM o MTS)");
            }
        } while (c1.getUnidad() == null);

        System.out.println("\nIngrese los datos de la caja usando la medida indicada anteriormente ("+c1.getUnidad()+")"); //los siguientes 3 se encargan de recoger la informacion dde alto, ancho y fondo
        System.out.println("Indique el alto->");
        c1.setAlto(sn.nextInt());

        System.out.println("indique el ancho ->");
        c1.setAncho(sn.nextInt());

        System.out.println("indique el fondo ->");
        c1.setFondo(sn.nextInt());

        System.out.println("Indique los datos importantes del cliente (Nombre, direccion, numero telefonico por ejemplo. ¡Maximo 30 caracteres!)");
        do { //repite el bucle hasta que la etiqueta sea valida
            c1.setEtiqueta(sn.nextLine());
        }while (c1.getEtiqueta() == null);

        System.out.println(c1.toString()); //enseña los daos de la caja
        c1.volumen(); //muestra el volumen de la caja

        System.out.println("desea realizr alguna modificacion?");
        System.out.println("1. SI\t2. NO"); //le pregunta a usuario si quiere modificar alguna caracterstica de la caja
        opcion = sn.nextInt();

        if (opcion == 1) {
            cambio(opcion); //lleva a la funcion de cambio
        }else if (opcion == 2) {
            System.out.println("El proceso de la caja empezar de inmediato, gracias por su tiempo");
        }else {
            System.err.println("Opcion no valida, no se puede realizar cambios");
        }
    }


    public static void cambio(int opcion){
        String unidadT;
        System.out.println("¿Que cambio desea realizar?"); //Menu donde se le pregunta al usuario que aspecto cambiar
        System.out.println("1. Cambiar el ancho");
        System.out.println("2. Cambiar el alto");
        System.out.println("3. Cambiar el fondo");
        System.out.println("4. Cambiar la etiqueta");
        System.out.println("5. No realizar ningun cambio");
        opcion= sn.nextInt();

        switch (opcion) { //swich con los casos y los aspectos a cambiar
            case 1-> {
                System.out.println("Ingrese el nuevo ancho");
                c1.setAncho(sn.nextInt());
            }
            case 2->{
                System.out.println("Ingrese el nuevo alto");
                c1.setAlto(sn.nextInt());
            }
            case 3->{
                System.out.println("Ingrese el nuevo fondo");
                c1.setFondo(sn.nextInt());
            }
            case 4->{
                System.out.println("Ingrese la nueva etiqueta");
                do { //repite el bucle hasta que la etiqueta sea valida
                    c1.cambioEiqueta(sn.nextLine());
                }while (c1.getEtiqueta() == null);
            }
            case 5-> System.out.println("No se realizara ningun cambio");
            default -> {
                System.err.println("opcion no valida, ingrese una opcio entre 1 y 5");
                cambio(opcion);
            }
        }

        System.out.println("los datos despues de los cambios"); //muestra los datos para que el usuario los revise
        System.out.println(c1.toString());
        c1.volumen();

        System.out.println("desea realizar alguna otra modificacion?"); //preguta por alguna clase de cambios adicionales
        System.out.println("1. SI\t2. NO");
        opcion = sn.nextInt();


        if (opcion == 1) {
            cambio(opcion);
        }else if (opcion == 2) {
            System.out.println("El proceso de la caja empezará de inmediato, gracias por su tiempo");
        }else {
            System.err.println("Opcion no valida, no se puede realizar cambios");
        }
    }
}
