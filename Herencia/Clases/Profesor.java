package Herencia.Clases;

import java.time.LocalDate;

public class Profesor extends Persona{
    private static int contador;
    private int idProfesor;
    private String materia;
    private boolean tutor;
    private double sueldo;
    private LocalDate fechaAlta;
    private boolean personalFijo;
    private boolean equipoDirectivo;
    private String jornada;


    public Profesor() {
        super();
        this.idProfesor=asignarID();
    }





    public Profesor(String nombre, String telefono, String direcion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idProfesor, String materia, boolean tutor, double sueldo, LocalDate fechaAlta, boolean personalFijo, boolean equipoDirectivo, String jornada) {
        super(nombre, telefono, direcion, sexo, fechaNacimiento, nacionalidad);
        this.idProfesor = idProfesor;
        this.materia = materia;
        this.tutor = tutor;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
        this.personalFijo = personalFijo;
        this.equipoDirectivo = equipoDirectivo;
        this.jornada = jornada;
    }

    public int asignarID(){
        contador=contador+1;
        return contador;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean isTutor() {
        return tutor;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isPersonalFijo() {
        return personalFijo;
    }

    public void setPersonalFijo(boolean personalFijo) {
        this.personalFijo = personalFijo;
    }

    public boolean isEquipoDirectivo() {
        return equipoDirectivo;
    }

    public void setEquipoDirectivo(boolean equipoDirectivo) {
        this.equipoDirectivo = equipoDirectivo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Nombre->"+super.getNombre());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", materia='" + materia + '\'' +
                ", tutor=" + tutor +
                ", sueldo=" + sueldo +
                ", fechaAlta=" + fechaAlta +
                ", personalFijo=" + personalFijo +
                ", equipoDirectivo=" + equipoDirectivo +
                ", jornada='" + jornada + '\'' +
                "} " + super.toString();

    }

}
