import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        int horasT, tipo, salario, sueldoH = 0, sueldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántas horas trabajaste?: ");
        horasT = scanner.nextInt();
        System.out.println("Selecciona tu área de trabajo: ");
        System.out.println("1 - Producción");
        System.out.println("2 - Mantenimiento");
        System.out.println("3 - TI");
        System.out.println("4 - Administrativos");
        System.out.println("5 - Vigilancia");
        System.out.println("Escribe el número que te corresponda");
        tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                sueldoH = 150;
                break;
            case 2:
                sueldoH = 100;
                break;
            case 3:
                sueldoH = 160;
                break;
            case 4:
                sueldoH = 80;
                break;
            case 5:
                sueldoH = 85;
                break;
            default:{
                System.out.println("Área no váida, imposible capturar pago");
                System.exit(1);
            }
        }
        sueldo = horasT * sueldoH;
        System.out.println("Su sueldo es de: " + sueldo);
    }   
}