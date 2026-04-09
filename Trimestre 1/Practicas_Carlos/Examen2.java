import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
        // S = - 2 - 4 + 6 - 8 - 10 + 12 + 14 - 16 - 18 + 20 + 22 + 24
        Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el numero N: ");

        int n = scanner.nextInt();

        String numeroTexto = "";
        int limiteNegativo = 2;
        int limitePositivo = 1;

        int cantidadNegativa = 0;
        int cantidadPositivo = 0;

        for (int i = 2; i <=n; i = i + 2) {
            if(cantidadNegativa < limiteNegativo) {
                numeroTexto = numeroTexto + " - " + i;
                cantidadNegativa = cantidadNegativa + 1;
            } else {
                numeroTexto = numeroTexto + " + " + i;
                cantidadPositivo = cantidadPositivo + 1;
                if(cantidadPositivo == limitePositivo) {
                    cantidadPositivo = 0;
                    cantidadNegativa = 0;
                    limitePositivo = limitePositivo + 1;
                }
            }
        }
        System.out.println(numeroTexto);
        scanner.close();
    }
}
