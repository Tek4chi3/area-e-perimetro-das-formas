package Formas;

public class Circulo{
    double área;
    double perímetro;

    public void calcularPerímetro(double a){
        perímetro=2*Math.PI*a;
        System.out.printf("O perímetro do círculo é: %.2f",perímetro);
        System.out.println("\n");
    }
    public void calcularÁrea(double a){
        área=Math.PI*Math.pow(a,2);
        System.out.printf("A área do círculo é: %.2f",área);
        System.out.println("\n");
    }
}
