import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero N: ");

        int n = scanner.nextInt();

        scanner.close();

        String resultado = " ";

        int acumulador = 1;

        for (int i = 1; i <= n; i++) {
            
            acumulador *= i;

            if (i==1) {
                resultado = resultado += i;

            } else {
                resultado += " * " + i;
            }

        }

        System.out.println("Acumlador: " + acumulador);
        System.out.println("resultado es: " + resultado);

    }

}
