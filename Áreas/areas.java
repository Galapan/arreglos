import java.util.Scanner;

public class areas {
    public static Scanner sc = new Scanner(System.in);

    //metodo que regresa un valor
    //argumentos: ninguno
    //Regresa el area(double) del circulo
    public static double circulo() {
        double area;
        double radio;
        final double PI = 3.1416;

        System.out.println("Calculando el area del circulo");
        System.out.println("Ingresa el radio: ");
        radio = sc.nextDouble();
        area = PI * Math.pow(radio, 2);
        return area;
    }

    //metodo que no regresa un valor
    //argumentos: ninguno
    //regresa: nada
    public static void triangulo() {
        double area;
        double base, altura;

        System.out.println("Calculando el area del triangulo");
        System.out.println("Ingresa la base: ");
        base = sc.nextDouble();
        System.out.println("Ingresa la altura: ");
        altura = sc.nextDouble();
        area = base * altura / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public static double cuadrado() { //Firma del metodo (encabezado del metodo)
        double lado;
        double area;
        System.out.println("Calculando el area del cuadrado");
        System.out.println("Ingresa el lado: ");
        lado = sc.nextDouble();
        area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area);
        return area;
    }

    public static void main(String[] args) {

        int opcion = 0;

        do {
            System.out.println("Calculo de areas");
            System.out.println("1. Area del circulo");
            System.out.println("2. Area del triangulo");
            System.out.println("3. Area del cuadrado");
            System.out.println("4. Salir del programa");
            System.out.println("Escribe tu opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:{
                    double area = circulo();
                    System.out.println("El area del circulo es: " + area);
                }
                    break;
                case 2:
                    triangulo();
                    break;
                case 3:
                    cuadrado(); //llamado o invocación del metodo   
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escoge una opción valida (1-4)");
                    break;
            }

        } while (opcion != 4);
        sc.close();
    }
}