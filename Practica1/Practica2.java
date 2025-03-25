import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        double z1, z2, x, y;
        boolean z3;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa el calor de x: ");
        x = miScanner.nextDouble();
        System.out.println("Ingresa el calor de y: ");
        y = miScanner.nextDouble();

        z1 = (3*x+6)/(12*x)+3*x*x+6*y-12*x/(6-y);
        z2 = 3*x*x*(6*y/12-(5*x*x+3*y)/(8*x*y));
        z3 = !(z1>z2+3);

        System.out.println("El valor de z1 es = " + z1);
        System.out.println("El valor de z2 es = " + z2);
        System.out.println("El valor de z3 es = " + z3);
    }
}