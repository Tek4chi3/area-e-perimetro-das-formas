package Formas;

public class TestarFormas {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado();
        quadrado1.calcularPerímetro(5);
        quadrado1.calcularÁrea(5,5);

        Triangulo triangulo1 = new Triangulo();
        triangulo1.calcularPerímetro(5,6,7);
        triangulo1.calcularÁrea(5,5);

        Retangulo retangulo1 = new Retangulo();
        retangulo1.calcularPerímetro(5,9);
        retangulo1.calcularÁrea(5,5);

        Circulo circulo1 = new Circulo();
        circulo1.calcularPerímetro(2);
        circulo1.calcularÁrea(4);



    }
}
