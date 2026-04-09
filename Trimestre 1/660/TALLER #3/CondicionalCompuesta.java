import java.util.Scanner;

public class CondicionalCompuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 100) {
            System.out.println("Fuera de rango");
        } else {
            System.out.println("Dentro del rango");
        }

        sc.close();
    }
}
