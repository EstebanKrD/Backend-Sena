import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la serie de S: ");

        int S = scanner.nextInt();
        int numeroPostivo = 0;
        int limiteNumero = 1;
        int total = 0;

        scanner.close();

        String numeroTexto = " ";

        for (int i = 1; i <= S; i++) {
            if (numeroPostivo < limiteNumero) {

                numeroPostivo += 1;
                numeroTexto += " + " + i;
                total += i;

            } else {
                limiteNumero += 1;
                numeroPostivo = 0;
                numeroTexto += (-1 * i);
                total += (-1 * i);

            }
        }

        System.out.println("Ingrese el numero de la serie S: " + numeroTexto);
        System.out.println("Ingrese el numero de la serie S: " + total);

    }
}