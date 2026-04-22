import java.util.Scanner;

public class HolaMundo {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese valor 2");
        int numero2 = scanner.nextInt();

        scanner.close();
        int resultado = numero1 + numero2;
        System.out.println("el resultado es: " + resultado);

    }
}