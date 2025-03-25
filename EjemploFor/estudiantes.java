import java.util.Scanner;

public class estudiantes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i; 
        double p1, p2, p3, p4, pi, pg = 0;
        System.out.println("Ingresa el número de estudiantes: ");
        n = sc.nextInt();
        if (n <= 5 && n >= 1){
            for (i = 0; i < n; i++){
                do{
                    System.out.println("Ingresa la calificación del primer parcial: ");
                    p1 = sc.nextDouble();
                }while(p1 < 0 || p1 > 10);
                do{
                    System.out.println("Ingresa la calificación del segundo parcial: ");
                    p2 = sc.nextDouble();
                }while(p2 < 0 || p2 > 10);
                do{
                    System.out.println("Ingresa la calificación del tercer parcial: ");
                    p3 = sc.nextDouble();
                }while(p3 < 0 || p3 > 10);
                do{
                    System.out.println("Ingresa la calificación del cuarto parcial: ");
                    p4 = sc.nextDouble();
                }while(p4 < 0 || p4 > 10);
                pi = (p1 + p2 + p3 + p4) / 4;
                System.out.println("Promedio" + pi);
                pg = pg + pi; 
            }
        }else{
            System.out.println("El número de estudiantes debe ser al menos 5");
            System.exit(1);
        }
        pg = pg / n;
        System.out.println("Promedio general: " + pg);
    }
}
