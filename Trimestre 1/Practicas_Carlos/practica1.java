import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de N: ");
        int numero = scanner.nextInt();
        scanner.close();

        int respuesta = 0;
        String serie = "";

        for (int i = 1; i <= numero; i++) {
            if (i % 4 == 0) {
                serie += " -" + i;
                respuesta -= i;
            } else { 
                serie += " +" + i;
                respuesta += i;
            }
        }

        System.out.println("La serie de S es:" + serie);
        System.out.println("Resultado = " + respuesta);
    }
}
