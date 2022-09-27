package Formas;

public class Triangulo {

    double área;
    double perímetro;

    public void calcularPerímetro(double a, double b, double c){
        perímetro=a+b+c;
        System.out.printf("O perímetro do triângulo é: %.2f",perímetro);
        System.out.println("\n");
    }
    public void calcularÁrea(double a, double b){
        área=(a*b)/2;
        System.out.printf("A área do triângulo é: %.2f",área);
        System.out.println("\n");
    }
}
