import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        int num;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa el numero factorial: ");
        num = miScanner.nextInt();

        long factorial=1;
        for(int i=1;i<=num;i++)
            factorial = factorial * i;
        System.out.println("EL factorial de " + num + " es " + factorial);
    }
}