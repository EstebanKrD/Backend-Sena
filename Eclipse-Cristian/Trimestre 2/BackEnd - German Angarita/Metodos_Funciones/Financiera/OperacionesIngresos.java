import java.util.Scanner;

public class OperacionesIngresos {

    public static void ingresarIngresos(int[] ingresos, Scanner scanner) {
        for (int i = 0; i < ingresos.length; i++) {
            System.out.println("Ingrese el ingreso del día " + (i + 1));
            ingresos[i] = scanner.nextInt();
        }
    }

    public static double calcularPromedio(int[] ingresos) {
        double suma = 0;
        for (int ingreso : ingresos) {
            suma += ingreso;
        }
        return suma / ingresos.length;
    }

    public static int obtenerMenor(int[] ingresos) {
        int menor = ingresos[0];
        for (int ingreso : ingresos) {
            if (ingreso < menor) {
                menor = ingreso;
            }
        }
        return menor;
    }

    public static int obtenerMayor(int[] ingresos) {
        int mayor = ingresos[0];
        for (int ingreso : ingresos) {
            if (ingreso > mayor) {
                mayor = ingreso;
            }
        }
        return mayor;
    }
}
