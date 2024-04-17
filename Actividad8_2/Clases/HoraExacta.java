package Actividad8_2.Clases;

public class HoraExacta extends Hora{

        int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (!setSegudos(segundos)){
            System.out.println("Segundos no validos");
        }
    }

    public boolean setSegudos(int segundos) {
            boolean correcta = false;
            if (segundos >= 0 && segundos <= 59) {
                this.segundos = segundos;
                correcta = true;
            }
            return correcta;
        }


        public void incrementarSegundos() {
        segundos++;
        if ( this.segundos>=60) {
            this.segundos = 0;
            this.minutos++;
        }

        }

    public int getSegundos() {
        return segundos;
    }


    @Override
    public String toString() {
        return "HoraExacta{"+ hora +
                ":" + minutos +
                ":" + segundos +
                "} ";
    }

    public void revisarHora(){
        if (this.segundos>=60){
            this.minutos++;
            this.segundos-=60;
        }

        if (this.minutos>=60){
            this.hora++;
            this.minutos-=60;
        }
    }
}

