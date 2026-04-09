import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para calificación: ");
        double numero = scanner.nextDouble();

        if ( numero  >= 9 && numero <= 10) {
            System.out.println("Su calificación es A");
        } else {
            if ( numero >= 8 && numero <= 8.9) {
                System.out.println("Su calificación es B");
            } else {
                if ( numero >= 7 && numero <= 7.9) {
                    System.out.println("Su calificación es C");
                } else {
                    if (numero >= 6 && numero <=6.9) {
                        System.out.println("Su calificación es D");
                    } else {
                        if (numero>= 0 && numero <= 5.9 );
                        System.out.println("Su calificación es F");
                    }
                }
            }
        }
        scanner.close();

    }
}
