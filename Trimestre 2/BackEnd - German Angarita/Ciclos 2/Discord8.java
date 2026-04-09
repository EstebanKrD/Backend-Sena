import java.util.Scanner;

public class Discord8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        String numero = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            int digito = Character.getNumericValue(c);

            if (digito % 2 == 0) {
                contador++;
            }

        }
        System.out.println("El numero " + numero + " tiene " + contador + " digitos pares");
        scanner.close();

    }
}
