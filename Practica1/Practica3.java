import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args){
        int edad, prueba1, prueba2;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa la edad del aplicante: ");
        edad = miScanner.nextInt();
        System.out.println("Ingresa el resultado de la prueba 1: ");
        prueba1 = miScanner.nextInt();
        System.out.println("Ingresa el resultado de la prueba 2: ");
        prueba2 = miScanner.nextInt();

        if(edad>=18){
            System.out.println("El aplicante tiene la edad suficiente");
        }
        else{
            System.out.println("El aplicante no tiene la edad suficiente");
        }
    }
}
