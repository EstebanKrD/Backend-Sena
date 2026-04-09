import java.util.Scanner;

public class OfertaTelefono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Meses: ");
        int meses = scanner.nextInt();
        System.out.println("Datos: ");
        int datos = scanner.nextInt();

        scanner.close();

        if ( (meses >12 && datos > 10) || (meses > 24)) {
            System.out.println("Aplica para plan de datos");
        } else {
            System.out.println("No aplica para plan de datos");
        }
    }
}