import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        int horasT, años;
        boolean retrasos, area;
        double pago, bono, bonoP, sueldoTotal;

        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.println("Cuantas horas ha trabajado: ");
            horasT = miScanner.nextInt();
            if(horasT < 20 || horasT > 40){
                System.out.println("Las horas trabajadas son invalidas");
                miScanner.close();
                return;
            }
            System.out.println("El trabajador es de producción: ");
            area = miScanner.nextBoolean();
            System.out.println("Cuantas años ha trabajado: ");
            años = miScanner.nextInt();
            System.out.println("El empleado tiene retrasos: ");
            retrasos = miScanner.nextBoolean();
        }
        if(area == true){
            pago = 100;
        } else {
            pago = 60;
        }

        if(años >= 5){
            bono = 500;
        } else {
            bono = 0;
        }

        if(retrasos == false){
            bonoP = 100;
        } else {
            bonoP = 0;
        }

        sueldoTotal = (horasT * pago) + bono + bonoP;
        System.out.println("El sueldo total es de: " + sueldoTotal);
    }
}
