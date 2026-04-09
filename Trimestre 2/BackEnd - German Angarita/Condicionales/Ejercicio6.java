import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el año: ");
         int year = scanner.nextInt();
         scanner.close();

         if( year % 4 == 0) {
            System.out.println("El año es bisiesto: " + year);
         } else {
            System.out.println("El año no es bisiesto: " + year);
         }
    }
    
}
