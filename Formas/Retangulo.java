package Formas;

public class Retangulo {
    double área;
    double perímetro;

    public void calcularPerímetro(double a,double b){
        perímetro=(a+b)*2;
        System.out.printf("O perímetro do retângulo é: %.2f",perímetro);
        System.out.println("\n");
    }
    public void calcularÁrea(double a, double b){
        área=a*b;
        System.out.printf("A área do retângulo é: %.2f",área);
        System.out.println("\n");
    }
}
