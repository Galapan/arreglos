package NumerosPractica;

import java.util.Scanner;

public class PracticaNumeros {

    public static void rellenarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 25 + 1);
        }
    }

    // Método para calcular la media de los números en el arreglo
    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    // Método para contar cuántos números son pares e impares
    public static int[] contarParImpar(int[] numeros) {
        int[] resultado = new int[2]; // resultado[0] = pares, resultado[1] = impares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                resultado[0]++;
            } else {
                resultado[1]++;
            }
        }
        return resultado;
    }

    // Método para contar cuántos números son divisibles entre un número dado
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
        Scanner sc = new Scanner(System.in);

        // Pedir el tamaño del arreglo
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        rellenarNumeros(numeros);

        // Mostrar los números generados
        System.out.println("Números en arreglo:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Calcular y mostrar la media
        double media = calcularMedia(numeros);
        System.out.println("La media de los números es: " + media);

        // Contar pares e impares
        int[] parImpar = contarParImpar(numeros);
        System.out.println("Cantidad de números pares: " + parImpar[0]);
        System.out.println("Cantidad de números impares: " + parImpar[1]);

        // Pedir un número y contar divisibles
        System.out.println("Ingrese un número para verificar divisibilidad:");
        int divisor = sc.nextInt();
        int divisibles = contarDivisibles(numeros, divisor);
        System.out.println("Cantidad de números divisibles entre " + divisor + ": " + divisibles);

        sc.close();
    }
}