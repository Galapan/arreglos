import java.util.Scanner;


public class ParImpar {

    public static void esPar(int n){
        if(n % 2 == 0)
            System.out.println("El número " + n + " es par");
        else
            System.out.println("El número " + n + " es impar");
    }

    public static boolean esPrimo(int n){
        int divisores;
        divisores = 0;
        for (int div = 1; div <= n; div++){
            if (n % div == 0)
                divisores++;
        }
        if (divisores == 2)
            return true;
        else
            return false;
    }

    public static boolean esPerfecto(int n){
        int sumaDivisores;
        sumaDivisores = 0;
        for (int div = 1; div < n; div++){
            if (n % div == 0)
                sumaDivisores += div;
        }
        return sumaDivisores == n;
    }

    public static int esAbundante(int n){
        int sumaDivisores2, abundancia;
        sumaDivisores2 = 0;
        for (int div = 1; div < n; div++){
            if (n % div == 0)
                sumaDivisores2 += div;
        }
        abundancia = sumaDivisores2 - n;
        return abundancia;
    }

    /*
     * Programa que clasifica númeror pares, impares y primos
     * en un rango determinado por el usuario.s
     */

    public static void main(String[] args) {
        int n1, n2, abundancia;
        boolean primo, perfecto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este es un programa que indica si un número es par, impar o primo.");
        System.out.println("Indica el valor inicial del rango: ");
        n1 = sc.nextInt();
        System.out.println("Indica el valor final del rango: ");
        n2 = sc.nextInt();

        for(int n = n1; n <= n2; n++){

            esPar(n);//n es un argumento
        
            primo = esPrimo(n);// n es un argumento
            if (primo) //equivale a primo == true
                System.out.println("El número " + n + " es primo");
            else
                System.out.println("El número " + n + " no es primo");
            //Agregar un número perfecto, la suma de sus divisores, menos el mismo número es igual al número    
            perfecto = esPerfecto(n);
            if (perfecto)
                System.out.println("El número " + n + " es perfecto");
            else
                System.out.println("El número " + n + " no es perfecto");
                
            //Agregar un número abundante, la suma de sus divisores, menos el mismo número es mayor al número y agregamos abundancia
            abundancia = esAbundante(n);
            if (abundancia > 0)
                System.out.println("El número " + n + " es abundante y su abundancia es " + abundancia);
            else
                System.out.println("El número " + n + " es deficiente");
        }
        sc.close();
    }
}