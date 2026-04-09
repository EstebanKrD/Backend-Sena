import java.util.Scanner;

public class Discord6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese un número n para calcular la suma de cuadrados desde 1 hasta n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }

        System.out.println("La suma de los cuadrados desde 1 hasta " + n + " es: " + suma);

        scanner.close();
    }
}
