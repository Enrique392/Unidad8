package Herencia.Clases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    protected String Nombre;
    protected String telefono;
    protected String direcion;
    protected String sexo;
    protected LocalDate fechaNacimiento;
    protected String nacionalidad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String direcion, String sexo, LocalDate fechaNacimiento, String nacionalidad) {
        Nombre = nombre;
        this.telefono = telefono;
        this.direcion = direcion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        DateTimeFormatter formator = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public abstract void mostrarNombre();


    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direcion='" + direcion + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

}
