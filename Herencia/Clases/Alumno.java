package Herencia.Clases;

import java.time.LocalDate;

public class Alumno extends Persona{
    private static int contador;
    private  int idAlumno;
    private String curso;
    private String aula;
    private String nombreTutor;
    private int numeroTutor;
    private String direccionTutores;
    private String emailTutor;
    private String alergias;
    private boolean comedor;
    private boolean beca;

    public Alumno() {
        super();
        this.idAlumno=asignarID();
        setTelefono("");
    }

    public Alumno(int idAlumno, String curso, String aula, String nombreTutor, int numeroTutor, String direccionTutores, String emailTutor, String alergias, boolean comedor, boolean beca) {
        this.idAlumno = idAlumno;
        this.curso = curso;
        this.aula = aula;
        this.nombreTutor = nombreTutor;
        this.numeroTutor = numeroTutor;
        this.direccionTutores = direccionTutores;
        this.emailTutor = emailTutor;
        this.alergias = alergias;
        this.comedor = comedor;
        this.beca = beca;
    }

    public Alumno(String nombre, String telefono, String direcion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idAlumno, String curso, String aula, String nombreTutor, int numeroTutor, String direccionTutores, String emailTutor, String alergias, boolean comedor, boolean beca) {
        super(nombre, telefono, direcion, sexo, fechaNacimiento, nacionalidad);
        this.idAlumno = idAlumno;
        this.curso = curso;
        this.aula = aula;
        this.nombreTutor = nombreTutor;
        this.numeroTutor = numeroTutor;
        this.direccionTutores = direccionTutores;
        this.emailTutor = emailTutor;
        this.alergias = alergias;
        this.comedor = comedor;
        this.beca = beca;
    }

    public int asignarID(){
        contador=contador+1;
        return contador;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public int getNumeroTutor() {
        return numeroTutor;
    }

    public void setNumeroTutor(int numeroTutor) {
        this.numeroTutor = numeroTutor;
    }

    public String getDireccionTutores() {
        return direccionTutores;
    }

    public void setDireccionTutores(String direccionTutores) {
        this.direccionTutores = direccionTutores;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public boolean isComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public void setTelefono(String telefono) {
        this.telefono = "No tiene telefono";
    }

    public boolean equals(Object otroAlumno){
        Alumno e=(Alumno) otroAlumno; //cast del objeto otroAlumno a tipo alumno
        boolean igual=false;
        if (this.emailTutor.equals(e.emailTutor)){
            igual=true;
        }
        return igual;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("nombre->" + super.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+" Alumno{" +
                "idAlumno=" + idAlumno +
                ", curso='" + curso + '\'' +
                ", aula='" + aula + '\'' +
                ", nombreTutor='" + nombreTutor + '\'' +
                ", numeroTutor=" + numeroTutor +
                ", direccionTutores='" + direccionTutores + '\'' +
                ", emailTutor='" + emailTutor + '\'' +
                ", alergias='" + alergias + '\'' +
                ", comedor=" + comedor +
                ", beca=" + beca +
                '}';
    }
}
