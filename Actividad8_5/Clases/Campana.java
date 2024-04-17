package Actividad8_5.Clases;

public class Campana extends Instrumento {
    private int dingDong;



    public Campana() {
    }

    public Campana(int dingDong) {
        this.dingDong = dingDong;
    }

    @Override
    public void interpretar() {
        for (Notas n:melodia){
            switch (n){
                case SI -> System.out.println("Dong");
                case DO -> System.out.println("Ding");
            }
        }
        System.out.println(" ");
    }
}
