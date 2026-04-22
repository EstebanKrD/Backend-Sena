import java.util.Scanner;

public class practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String serie = " ";
        int acumulador = 0;
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Ingrese un numero: ");
                suma = suma + numero;
                serie += " + " + numero;
            }
            acumulador++;
        }

        System.out.println("Los numero son " + acumulador);
        System.out.println("El total es " + serie);
        scanner.close();
    }
}
