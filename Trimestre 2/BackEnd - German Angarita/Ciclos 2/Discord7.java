import java.util.Scanner;

public class Discord7 {

    public static void main(String[] args) {
        System.out.println("Programa que muestra promedio de n numeros");

        Scanner entrada = new Scanner(System.in);
        double acumuladora = 0;
        int numero;
        int contadora = 0;

        entrada.close();

        do {
            System.out.println("Ingrese un numero natural");
            numero = entrada.nextInt();
            if (numero != 0) {
                contadora = contadora + 1;
                acumuladora = acumuladora + numero;
            }

        } while (numero != 0);
        System.out.println("acmuladora valió: " + acumuladora);
        System.out.println("Gracias por usar mi programa");
        double promedio = acumuladora / contadora;
        System.out.println("Promedio " + promedio);
    }
}
