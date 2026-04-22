import java.util.Scanner;
public class AproboNoAprobo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota del estudiante (0 a 10): ");
        int nota = scanner.nextInt();

        if (nota >= 6 && nota <= 10) {
            System.out.println("Aprobó."); 
        } else if (nota >= 0 && nota < 6) {
            System.out.println("No aprobó.");
        }
        scanner.close();
    }
}