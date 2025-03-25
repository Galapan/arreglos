import java.util.Scanner;



public class Programa1{
    public static void main(String[] args) {
        int x; //Declarar una variable de tipo entero
        int y=12; //Declarar la variable e inicializarla
        double a, b, c; //Declarar varias variables
        boolean d = true, e = false;
        String nombre1 = "Pancracio", nombre2 = "Petra";
        char caracter1 = 'g', caracter2 = '@';
        b = 20.120; 
        c = 5.30;

            Scanner miScanner = new Scanner(System.in);


        x = 10;
        System.out.println("Hola mundo");
        System.out.println();
        System.out.print("Esto es una");
        System.out.print(" sola");
        System.out.print(" línea");
        System.out.println();
        System.out.println();
        System.out.println("El contenido de x es: " + x);
        a = 12.569;
        System.out.println("El contenido de a es: " + a);
        System.out.println();
        System.out.println(d);
        System.out.println("d = " + d + " e = " + e);
        System.out.println("b = " + b + " c = " + c + " y = " + y);


        System.out.println("Escribe tu nombre: ");
        nombre1 = miScanner.nextLine(); 
        System.out.println("Tu nombre es: " + nombre1);
        System.out.println("Escribe un valor entero");
        x = miScanner.nextInt();
        System.out.println();
        System.out.println("El valor entero es: " + x);

        System.out.println("Escribe un valor double");
        c = miScanner.nextDouble();
        System.out.println("El valor double es: " + c   );
    }
}