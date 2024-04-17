package Herencia.Controller;
import Herencia.Clases.Alumno;
import Herencia.Clases.Persona;
import Herencia.Clases.Profesor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Alumno al1 = new Alumno();
        al1.setNombre("Maria");
        al1.setTelefono("");
        al1.setDirecion("Calle tal,numero 3");
        al1.setNacionalidad("Costarricense");
//        LocalDate f = LocaleDate.of(2018/05/12);
        al1.setFechaNacimiento(LocalDate.of(2018,05,12));
        al1.setCurso("3");
        al1.setAula("A13");
        al1.setComedor(true);
        al1.setNombreTutor("Manuel Perez");
        al1.setNumeroTutor(123456);
        al1.setDireccionTutores("Calle tal.numero 3");

        System.out.println(al1.toString());
        Alumno al2 = new Alumno();
        al2.setNombre("Juan jose");
        al2.setEmailTutor("hola@.com");
        System.out.println(al2.toString());

        Alumno al3 = new Alumno();
        al3.setNombre("Esteban");
        al3.setEmailTutor("hola@.com");
        System.out.println(al3.toString());


        if (al2.equals(al3)){
            System.out.println("email son iguales");
        }else System.out.println("No son iguales");

        System.out.println(al3.getClass());
        System.out.println(al3.getClass().getName());



        Profesor prof1 = new Profesor();
        prof1.setNombre("Maria");
        System.out.println(prof1.toString());

        Profesor prof2 = new Profesor();
        prof2.setNombre("Maria");
        System.out.println(prof2.toString());

//        Persona p= new Persona();
//        System.out.println(p.toString());
//        System.out.println(p.getClass());

    }
}
