import java.util.Scanner;

public class HorasLabaradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("\nEmpleado " + i);

            System.out.print("Ingrese las horas laboradas en el mes: ");
            int horas = scanner.nextInt();

            System.out.print("Ingrese la tarifa por hora: ");
            double tarifa = scanner.nextDouble();

            double salario = horas * tarifa;
            System.out.println("El salario del empleado " + i + " es: $" + salario);
        }

        scanner.close();
    }
}