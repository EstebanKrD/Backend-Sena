import java.util.Scanner;

// S = 1 + 3 + 5 - 7 - 9 + 11 + 13 + 15 - 17 - 19...N

public class examenCarlos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero N");

        int numero, respuesta = 0;
        int numeroPositivo = 0, cantidadPositivo = 3; // numeroPositivo va a contar cuantos positivos se van agregar 
                                                      // cantidadPositivo va a indicar cuantos positivos  debe salir antes de pasar por los negativos

        int numeroNegatio = 0, cantidadNegativa = 2; // numeroNegativo va a contar cuantos negativos se han agregado
                                                     // va a indicar cuantos negativos se deben de agrega
        String serie = "";
        numero = scanner.nextInt();

        for(int i = 1; i <= numero; i++) {
            if ( numeroPositivo < cantidadPositivo){ 
                serie = serie + " " + i;
                respuesta = respuesta + i;
                numeroPositivo++;
            } else if (numeroNegatio < cantidadNegativa) {
                 {
                    serie = serie + " " + (-i); // aqui se resta el numero en respuesta porque es negativo
                    cantidadNegativa++;
                }
                if (numeroPositivo == cantidadPositivo && numeroNegatio == cantidadNegativa) {
                    cantidadPositivo = 0;
                    cantidadNegativa = 0;
                }
            }
        }
        System.out.println("La serie es: " + serie);
        System.out.println("R = " + respuesta);
        scanner.close();
    }
}
