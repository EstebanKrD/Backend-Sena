import java.util.Scanner;

public class Discord2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero A: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero B: ");
        int b = scanner.nextInt();

        while (a <= b) {
            System.out.println(a);

            a++;
        }

        scanner.close();
    }
}
