package Formas;

public class Quadrado {

    double área;
    double perímetro;

    public void calcularPerímetro(double a){
        perímetro=a*4;
        System.out.printf("O perímetro do quadrado é: %.2f",perímetro);
        System.out.println("\n");
    }
    public void calcularÁrea(double a, double b){
        área=a*b;
        System.out.printf("A área do quadrado é: %.2f",área);
        System.out.println("\n");
    }
}
