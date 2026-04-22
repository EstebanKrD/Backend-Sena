import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int i = 0;
        int contador = 0;
        String vocales = "";

        while (i < frase.length()) {

            String letra = frase.substring(i, i + 1);

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                contador++; 
                vocales += letra + " ";
            }

            i++;

        }

        System.out.println("La frase tiene " + contador + " vocal(es)");
        System.out.println("Vocales encontrada:" + vocales);
        scanner.close();
    }
}
