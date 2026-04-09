import java.util.Scanner;

public class PrestamoBancario {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo: ");
        double monto = scanner.nextDouble();
        System.out.println("ingrese el tiempo laboral: ");
        int tiempoLaboral = scanner.nextInt();

        scanner.close();

        if ( (monto >= 2000) && (tiempoLaboral >=2) || (monto >= 5000)) {
            System.out.println("Prestamo aprobado");
        } else {
            System.out.println("Prestamo denegado");
        }
    }
        
}