import java.util.Scanner;

// 1 + 2 - 3 - 4 + 5 + 6 - 7 - 8...N

public class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de N: ");

        int n = scanner.nextInt();
        int resultadoSuma = 0;

        int limitePositivo = 2;
        int limiteNegativo = 2;

        int contadorPositivo = 0;
        int contadorNegativo = 0;

        String numeroTexto = "";

        for (int i = 1; i <= n; i = i + 1) {

            if(contadorPositivo < limitePositivo) {
                numeroTexto = numeroTexto + " + " + i;
                resultadoSuma = resultadoSuma + i;
                contadorPositivo = contadorPositivo + 1;
            } else {
                numeroTexto = numeroTexto + " - " + i;
                resultadoSuma = resultadoSuma - i;
                contadorNegativo = contadorNegativo + 1;
                if(contadorNegativo == limiteNegativo) {
                    
                    contadorNegativo = 0;
                    contadorPositivo = 0;

                }
            }

        }

        System.out.println("La serie de S es: " + numeroTexto + " = " + resultadoSuma);
        scanner.close();

    }
}