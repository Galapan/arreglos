import java.util.Scanner;

public class PracticaNumeros {

    public static void rellenarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 25 + 1);
        }
    }

    public static double calcularMedia(int[] numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static int[] contarParImpar(int[] numeros) {
        int[] resultado = new int[2]; 
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                resultado[0]++;
            } else {
                resultado[1]++;
            }
        }
        return resultado;
    }

    public static int contarDivisibles(int[] numeros, int divisor) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % divisor == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] numeros, parImpar; 
        int divisor, divisibles;
        double media;
        Scanner sc = new Scanner(System.in);

        numeros = new int[20];
        rellenarNumeros(numeros);

        System.out.println("Números en el arreglo:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        media = calcularMedia(numeros);
        System.out.println("La media de los números es: " + media);

        parImpar = contarParImpar(numeros);
        System.out.println("Pares: " + parImpar[0]);
        System.out.println("Impares: " + parImpar[1]);

        System.out.println("Ingrese un número para verificar divisibilidad:");
        divisor = sc.nextInt();
        divisibles = contarDivisibles(numeros, divisor);
        System.out.println("Cantidad de números divisibles entre " + divisor + ": " + divisibles);

        sc.close();
    }
}