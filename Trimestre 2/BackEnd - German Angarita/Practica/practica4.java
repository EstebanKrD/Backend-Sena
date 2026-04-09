import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la nota del estudiante ");
        int nota  = scanner.nextInt();

        if( nota>=60 && nota <= 74) {
            System.out.println("El estudiante aprueba");
        } else if (nota >= 75 && nota <=89) {
            System.out.println("Buen trabajo");
        } else if (nota >= 90 && nota<=100) {
            System.out.println("Excelente trabajo");
        } else {
            System.out.println("Reprobado por put@");
        }
        scanner.close();
    }
}
