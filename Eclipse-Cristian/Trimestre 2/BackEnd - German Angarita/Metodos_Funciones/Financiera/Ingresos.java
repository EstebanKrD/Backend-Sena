import java.util.Scanner;

public class Ingresos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ingresosDia[] = new int[7];
        boolean menu = true;

        while (menu) {
            System.out.println("--------Bienvenidos a UlalaFind--------");
            System.out.println("1. Ingresar ingresos diarios");
            System.out.println("2. Mostrar promedio de ingresos");
            System.out.println("3. Mostrar ingreso menor");
            System.out.println("4. Mostrar ingreso mayor");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    OperacionesIngresos.ingresarIngresos(ingresosDia, scanner);
                    break;

                case 2:
                    double promedio = OperacionesIngresos.calcularPromedio(ingresosDia);
                    System.out.println("El promedio de ingresos es: " + promedio);
                    break;

                case 3:
                    int menor = OperacionesIngresos.obtenerMenor(ingresosDia);
                    System.out.println("El ingreso menor es: " + menor);
                    break;

                case 4:
                    int mayor = OperacionesIngresos.obtenerMayor(ingresosDia);
                    System.out.println("El ingreso mayor es: " + mayor);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    menu = false;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}
