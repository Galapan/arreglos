import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args){
        int edad, prueba1, prueba2; 
        boolean pruebaF;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa la edad del aplicante: ");
        edad = miScanner.nextInt();
        System.out.println("Ingresa el resultado de la prueba 1: ");
        prueba1 = miScanner.nextInt();
        System.out.println("Ingresa el resultado de la prueba 2: ");
        prueba2 = miScanner.nextInt();

        if(edad>=18 && (prueba1>=85 || prueba2>=85)){
            System.out.println("Aprobó el examen fisico:");
            pruebaF = miScanner.nextBoolean();
            if(pruebaF==true)
                System.out.println("El aplicante tiene la edad suficiente y pasó una prueba");
            else
                System.out.println("No pasó el examen fisico");
        }else{
            System.out.println("El aplicante no pasó");
        }
        miScanner.close();
    }
}