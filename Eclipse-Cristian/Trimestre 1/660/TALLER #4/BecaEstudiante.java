import java.util.Scanner;

public class BecaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el promedio: ");
        int promedio = scanner.nextInt();
        System.out.println("Ingrese su estrato");
        int estrato = scanner.nextInt();

        scanner.close();

        if ((promedio >= 90 && estrato <=2) ||  promedio >=95 ) {
            System.out.println("Obtiene Beca");
        } else {
            System.err.println("No obtiene beca");
        }

    }
}