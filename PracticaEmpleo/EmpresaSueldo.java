import java.util.Scanner;

public class EmpresaSueldo {

    public static int HorasValidas(int horasT){
        if(horasT < 40){
            System.out.println("Las horas trabajadas son invalidas"); /*/Crear un metodo para verificar las horas y si son correctas, ahora si pasa de 40 horas se convierten a horas extras y esas pagan al doble*/ 
            return -1;
        }
        if (horasT > 40  && horasT <= 52){
            int horasExtras = horasT - 40;
            horasT += horasExtras;
        }
        return horasT;
    }
     public static int horasExtras(int horasT){
        if(horasT > 40){
            return horasT - 40;
        }
        return 0;
    }
    


    public static void main(String[] args) {
        int horasT, años, area, retrasos;
        double pago = 0, bono, sueldoTotal;

        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.println("Cuantas horas ha trabajado: ");
            horasT = miScanner.nextInt();
            horasT = HorasValidas(horasT);

            //Area de trabajo
            System.out.println("Seleccione el area de trabajo: ");
            System.out.println("1. Produccion");
            System.out.println("2. Mantenimiento");
            System.out.println("3. TI");
            System.out.println("4. Administracion");
            area = miScanner.nextInt();

            switch(area){
                case 1:
                    pago = 100;
                    break;
                case 2:
                    pago = 120;
                    break;
                case 3:
                    pago = 150;
                    break;
                case 4:
                    pago = 80;
                    break;
                default:
                    System.out.println("Area invalida");
                    System.exit(1);
            }

            System.out.println("Cuantas años ha trabajado: ");  /*  */
            años = miScanner.nextInt();

            System.out.println("El empleado tiene retrasos: "); /* Se aplica un bono de puntualidad sobre el 10% de su sueldo si no tiene retrasos, o le quitamoos 10% si tuvo 3 o más */
            retrasos = miScanner.nextInt();

            if(años >= 5)
                bono = 200;
            else
                bono = 0;
            
            sueldoTotal = (horasT * pago) + bono;
            if(retrasos == 0)
                sueldoTotal += sueldoTotal * 0.10;
            else if(retrasos >= 3)
                sueldoTotal -= sueldoTotal * 0.10;
            
            System.out.println("El sueldo total es: " + sueldoTotal);
        }
    }
}