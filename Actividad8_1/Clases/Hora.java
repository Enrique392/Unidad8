package Actividad8_1.Clases;

public class Hora {
    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
       if (!setHora(hora)){
           System.out.println("Hora no valida");
       }
       if (!setMinuto(minutos)){
           System.out.println("Minutos no valida");
       }
    }

    //Metodo verificar hora
    public boolean setHora(int hora) {
        boolean correcta = false;
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            correcta = true;
        }
        return correcta;
    }

    public boolean setMinuto(int minuto) {
        boolean correcta = false;
        if (minuto >= 0 && minuto <= 59) {
            this.minutos = minuto;
            correcta = true;
        }
        return correcta;
    }

    public void incrementar(){
        this.minutos++;
        if (this.minutos > 60) {
            this.minutos = 0;
            this.hora++;
            if (this.hora > 23) {
                this.hora = 0;
            }


        }
    }

    public int getHora() {
        return hora;
    }

//    public boolean setHora(int hora) {
//        if (hora >= 0 && hora <= 23) {
//
//        }
//        this.hora = hora;
//    }

    public int getMinutos() {
        return minutos;
    }

//    public void setMinutos(int minutos) {
//        this.minutos = minutos;
//    }

    @Override
    public String toString() {
        if (this.hora<=9 && this.minutos<=9) {
            return "Hora{"+0+""+ this.hora +
                    ":" +0+""+ this.minutos +
                    '}';
        } else if (this.hora<=9) {
            return "Hora{"+0+""+ this.hora +
                    ":" + this.minutos +
                    '}';
        }else if (this.minutos<=9) {
            return "Hora{"+ this.hora +
                    ":" +0+""+ this.minutos +
                    '}';
        } else {
            return "Hora{"+ this.hora +
                    ":" + this.minutos +
                    '}';
        }
    }


    public String toStringIrina() {
        String horaT = "";
        String minutosT="";
        if (this.hora<=9 && this.minutos<=9) {
            horaT=0+""+String.valueOf(this.hora);
            minutosT=0+""+String.valueOf(this.minutos);
        } else if (this.hora<=9) {
            horaT=0+""+String.valueOf(this.hora);
        } else if (this.minutos<=9) {
            minutosT=0+""+String.valueOf(this.minutos);
        }else{
            horaT=String.valueOf(this.hora);
            minutosT=String.valueOf(this.minutos);
        }
        return "Hora{"+ horaT +
                ":" + minutosT +
                '}';
    }
}
