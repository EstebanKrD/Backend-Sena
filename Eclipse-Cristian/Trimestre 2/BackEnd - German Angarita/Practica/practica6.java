import java.util.Scanner;

public class practica6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = scanner.nextInt();

        if( numero > 0 ){
            System.out.println("Es postivo");
        } else {
            System.out.println("Es negativo");
        }
        if (numero % 2 ==  0) {
            System.out.println("El numero es par");
        } else {
            System.out.println(" Es impar");
        }
        scanner.close(); 
    }
}