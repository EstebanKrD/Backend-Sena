import java.util.Scanner;

public class UniQuindio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un numero entre 0 y 999: ");
            numero = scanner.nextInt();

            if (numero < 0 || numero > 999) {
                System.out.println("Intente de nuevo, número inválido");
            }

        } while (numero < 0 || numero > 999);

        int invertido = 0;
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            invertido = invertido * 10 + digito;
            temp = temp / 10;
        }

        int suma = numero + invertido;

        boolean impares = true;
        int revisar = suma;

        while (revisar > 0) {
            int digito = revisar % 10;
            if (digito % 2 == 0) {
                impares = false;
                break;
            }
            revisar = revisar / 10;
        }

        if (impares) {
            System.out.println("El numero " + numero + " es reversible");
            System.out.println(numero + " + " + invertido + " = " + suma);
        } else {
            System.out.println("El numero " + numero + " no es reversible");
            System.out.println(numero + " + " + invertido + " = " + suma);
        }

        scanner.close();
    }
}
