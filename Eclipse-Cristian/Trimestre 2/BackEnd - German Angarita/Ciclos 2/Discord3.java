import java.util.Scanner;

public class Discord3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        int inicio = scanner.nextInt();

        System.out.println("Ingrese el valor de B: ");
        int numeroFinal = scanner.nextInt();
        scanner.nextLine();

        int i = inicio;

        while ( i <= inicio && i >= numeroFinal ) {
            if ( i % 2 != 0){
                System.out.println(i);
            }
            i--;
        }
        scanner.close();
    }
}
