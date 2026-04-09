import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tareas = new String[10];
        tareas[0] = "Barrer";
        tareas[1] = "Cocinar";
        tareas[2] = "Lavar";
        tareas[3] = "Planchar";
        tareas[4] = "Comprar";
        tareas[5] = "Estudiar";
        tareas[6] = "Trabajar";
        tareas[7] = "Pasear";
        tareas[8] = "Leer";
        tareas[9] = "Escribir";
        System.out.println(Arrays.toString(tareas));
        scanner.close();

    }

}
