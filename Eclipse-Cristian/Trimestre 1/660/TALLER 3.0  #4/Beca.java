import java.util.Scanner;

public class Beca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su promedio: ");
        int promedio = scanner.nextInt();
        System.out.print("Ingrese su estrato: ");
        int estrato = scanner.nextInt();

        scanner.close();
        
        if (promedio >= 9) {
            if (estrato <= 2) {
                System.out.print("Beca del 100%");
            } else {
                if (estrato == 3) {
                    System.out.print("Beca del 50%");
                } else {
                    System.out.print("No aplica para beca");
                }
            }
        }
    }
}
