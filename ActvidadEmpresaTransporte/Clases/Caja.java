package ActvidadEmpresaTransporte.Clases;

/*
* Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho, un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del destinatario, dirección, etc.
Implementa la clase Caja con los siguientes métodos:
Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja con las dimensiones especificadas, que pueden encontrarse en «cm» (centímetros) o «m» (metros).
double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
String toString(): que devuelve una cadena con la representación de la caja*/

public class Caja { //variables
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected String etiqueta;
    protected Unidad unidad;
    protected double volumen;


    public Caja(int ancho, int alto, int fondo, String etiqueta, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.etiqueta = etiqueta;
        this.unidad = unidad;
    }

    public Caja(int ancho, int alto, int fondo) {
        System.out.println("Ingrese los datos de la caja usando la medida indicada anteriormente ("+getUnidad()+")");
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public Caja() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {//se ecarga que la etiqueta enga un maximo de caracteres
        int caracteresSobrantes=etiqueta.length()-30;
        if (etiqueta.length()>30){
            System.out.println("La longitud excede la capacidad, reduzca "+caracteresSobrantes+" caracteres");
        }else if(etiqueta.length()<30 && etiqueta.length()>0){
            System.out.println("La etiqueta es valida");
            this.etiqueta = etiqueta;
        }


    }

    public void cambioEiqueta(String etiqueta2){
        this.etiqueta=null;
        int caracteresSobrantes=etiqueta2.length()-30;
        if (etiqueta2.length()>30){
            System.out.println("La longitud excede la capacidad, reduzca "+caracteresSobrantes+" caracteres");
        }else if(etiqueta2.length()<30 && etiqueta2.length()>0){
            System.out.println("La etiqueta es valida");
            this.etiqueta = etiqueta2;
        }
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad=unidad;
        }

        public void volumen(){
        System.out.println("Volumen de la caja");
        volumen=this.ancho*this.alto*this.fondo;
            System.out.println(this.volumen);


        }

    @Override
    public String toString() {
        return  "Estos son los datos de la caja -> \n"+
                "El ancho=" + ancho+getUnidad()+ "\n" +
                "El alto=" + alto + getUnidad()+"\n"+
                "El fondo=" + fondo + getUnidad()+"\n"+
                "La etiqueta= " + etiqueta + "\n";
    }
}



