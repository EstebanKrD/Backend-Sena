import java.util.Scanner;

public class examenCarlos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de N: ");

        int numero, respuesta = 0;
        int numeroPositivo = 0, cantidadPositivo = 3;
        int numeroNegatio = 0, cantidadNegativa = 1;
        String serie = "";

        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numeroPositivo < cantidadPositivo) {
                serie = serie + " " + i;
                respuesta = respuesta + i;
                numeroPositivo++;

            } else if ( numeroNegatio < cantidadNegativa) {
                serie = serie + " " + (-i);
                respuesta = respuesta - i;
                numeroNegatio++;

            } if (numeroPositivo == cantidadPositivo && numeroNegatio == cantidadNegativa) {
                numeroPositivo = 0;
                numeroNegatio = 0;
            }
        }
        System.out.println("La serie de S es: " + serie);
        System.out.println("Resultado = " + respuesta);
        scanner.close();
    }
}