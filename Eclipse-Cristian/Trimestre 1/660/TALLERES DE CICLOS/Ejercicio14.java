import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero hasta donde desea llegar");
        int numero = scanner.nextInt();

        scanner.close();

        String numerosTexto = "";
        String resultado = "";
        float total = 0;
        for (int i = 1; i <= numero; i = i + 1) {
            if (i % 2 == 1) {
                numerosTexto = numerosTexto + "+ 1/" + i + "^2 ";
                int valor = (int) Math.pow(i, 2);
                resultado = resultado + "+ 1/" + valor + " ";
                total += (1.0 / valor);
            }
        }

        System.out.println("Secuencia: " + numerosTexto);
        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado total: "+ total);
    }
}