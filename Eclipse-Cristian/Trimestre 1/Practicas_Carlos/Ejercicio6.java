import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero N");

        int n = scanner.nextInt();
        String numeroTexto = "";
        int limitePositivo = 3 ;
        int limiteNegativo = 2;

        int cantidadPositivo = 0;
        int cantidadNegativa = 0;

        scanner.close();

        for(int i = 4; i<=n; i = i + 4) {
            if(cantidadPositivo < limitePositivo) {
                numeroTexto = numeroTexto + " + " + i;
                cantidadPositivo = cantidadPositivo + 1;
                
            } else {
                numeroTexto = numeroTexto + " - " + i;
                cantidadNegativa = cantidadNegativa + 1;
                if(cantidadNegativa == limiteNegativo){
                    cantidadNegativa = 0;
                    cantidadPositivo = 0;
                }
            }
            
        }

        System.out.println(numeroTexto);


    }
}