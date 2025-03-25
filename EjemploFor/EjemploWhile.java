import java.util.Scanner;
public class EjemploWhile {
    
    public static void ejemploDO() {
        //Un modulo o función
        
        //Variables locales, solo pertenecen a este módulo
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do{
            System.out.println("Escribe el valor de n1: ");
            n1 = sc.nextInt();
            System.out.println("Escribe el valor de n2: ");
            n2 = sc.nextInt();
            if(n1 % n2 == 0)
            System.out.println("n2 es multiplo de n1");
            else
            System.out.println("n2 no es multiplo de n1");
            
        }while (n1 != n2);
        sc.close();
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            System.out.println("i = " + i);
            if ( i % 2 == 0) {
                System.out.println("i es par");
                i = i + 1; //i++
            }   else {
                System.out.println("i es impar");
                i = i + 3; //i += 3
            }
        }
        ejemploDO();
    }
}
