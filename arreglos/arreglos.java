
import java.util.Scanner;

public class arreglos{

    public static void leerCalificaciones(){

    }

    public static void evaluarCalificaciones(){

    }

    public static void main(String[] args) {
        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<calificaciones.length; i++){
            System.out.println("Ingresa califiación [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        //No se imprime el contenido de todas las casillas del arreglo
        //solo se imprime la dirección de memoria en donde empieza el arreglo
        //System.out.println("calificaciones: " + calificaciones);
        
        //Imoresión usando el for extendido
        System.out.println("Contenido del arreglo calificaciones: ");
        for(int i=0; i<calificaciones.length; i++)
            System.out.println(calificaciones[i]);
        sc.close();
    }
}