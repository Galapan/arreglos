public class EjemploFor{
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
        //No se necesita una llave si hay solo una acción dentro del For, si hay más de una, entonces sí w
        //Con punto y coma hace l ciclo sin hacer nada, nunca la pongas nmms
        //Se puede declarara a la variable de contronl demtro del ciclo, pero solo vive dentro de él
        //Se puede declarar la variable de control fuera del ciclo, pero vive en todo el programa
        System.out.println("Dentro del For");
            System.out.println("i = " + i);
        }
        System.out.println("Se acabó el for");
        System.out.println("i = " + i);

    }
}