import java.util.Scanner;
public class NumeroCorrecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de respuestas correctas: ");
        int correctas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int incorrectas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas en blanco: ");
        int enBlanco = scanner.nextInt();

        scanner.close();

        int puntajeFinal = (correctas * 4) + (incorrectas * -1) + (enBlanco * 0);

        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        System.out.println("Respuestas en blanco: " + enBlanco);
        System.out.println("Puntaje final: " + puntajeFinal);
    }
}