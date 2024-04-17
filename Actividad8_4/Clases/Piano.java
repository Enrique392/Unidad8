package Actividad8_4.Clases;

public class Piano extends Instrumento{

    public Piano(){
        super();
    }

    @Override
    public void interpretar() {
        for (Notas n:melodia){
            switch (n){
                case DO -> System.out.println("DO");
                case RE -> System.out.println("RE");
                case MI -> System.out.println("MI");
                case FA -> System.out.println("FA");
                case SOL -> System.out.println("SOL");
                case LA -> System.out.println("LA");
                case SI -> System.out.println("SI");

            }
        }
        System.out.println(" ");
    }
}
