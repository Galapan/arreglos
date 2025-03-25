import java.util.Scanner;

public class Practica1{
    public static void main(String[] args) {
        double base, altura, radio, triangulo, circulo;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de la base: ");
        base = miScanner.nextDouble();
        System.out.println("Ingresa el valor de la altura: ");
        altura = miScanner.nextDouble();
        System.out.println("Ingresa el valor de la radio: ");
        radio = miScanner.nextDouble();

        triangulo = base*altura/2;
        circulo = 3.1416*radio*radio;
        System.out.println("el area del triangulo es = " + triangulo);
        System.out.println("el area del circulo es = " + circulo);
    }
}