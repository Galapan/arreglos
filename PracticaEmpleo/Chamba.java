import java.util.Scanner;

public class Chamba {

    // Método para validar las horas trabajadas
    public static boolean validarHoras(int horas) {
        return horas >= 40 && horas <= 52;
    }

    public static int calcularHorasNormales(int horas) {
        if (horas > 40)
            return 40;
        else
            return horas;
    }

    public static int calcularhorasE(int horas) {
        if (horas > 40)
            return horas - 40;
        else
            return 0;
    }

    public static double calcularbonoP(double sueldoB, int retardos) {
        if (retardos == 0) {
            return sueldoB * 0.10; 
        } else if (retardos >= 3) {
            return -(sueldoB * 0.10);
        } else {
            return 0;
        }
    }

    public static double calcularbonoA(int antiguedad) {
        if (antiguedad >= 5)
            return 200.0;
        else
            return 0.0;
    }

    public static void main(String[] args) {
        int horasE, horasT, retardos, antiguedad;
        double pagosE, bonoP, bonoA, sueldoTotal, sueldoB = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                
                System.out.println("Ingrese las horas trabajadas en la semana (entre 40 y 52): ");
                horasT = scanner.nextInt();

                if (!validarHoras(horasT)) {
                    System.out.println("Error: Las horas deben estar entre 40 y 52.");
                    return;
                }
                
                System.out.println("Ingrese el número de retardos en la semana: ");
                retardos = scanner.nextInt();
                
                System.out.println("Ingrese los años de antigüedad en la empresa: ");
                antiguedad = scanner.nextInt();
                
                System.out.println("Seleccione el área de trabajo:");
                System.out.println("1. Producción");
                System.out.println("2. Mantenimiento");
                System.out.println("3. TI");
                System.out.println("4. Administración");
                int opcionArea = scanner.nextInt();
                
                switch (opcionArea) {
                    case 1:
                        sueldoB = 100; // Producción
                        break;
                    case 2:
                        sueldoB = 120; // Mantenimiento
                        break;
                    case 3:
                        sueldoB = 150; // TI
                        break;
                    case 4:
                        sueldoB = 80; // Administración
                        break;
                    default:
                        System.out.println("Área no válida. Intente de nuevo.");
                        System.exit(1);
                        break;
                }
                
                int horasN = calcularHorasNormales(horasT);
                horasE = calcularhorasE(horasT);

                double sueldoBase2 = horasN * sueldoB;
                pagosE = horasE * (sueldoB * 2);
                
                bonoP = calcularbonoP(sueldoBase2, retardos);
                bonoA = calcularbonoA(antiguedad);
                
                sueldoTotal = sueldoBase2 + pagosE + bonoP + bonoA;
                
                System.out.println("El sueldo base es de: " + sueldoBase2);
                System.out.println("El sueldo total es de: " + sueldoTotal);

                System.out.println("¿Desea ingresar otro sueldo? ");
                boolean respuesta = scanner.nextBoolean(); 
                
                if (respuesta == false) {
                    System.out.println("Ya vete w");
                    break; 
                }
            }
        }
    }
}