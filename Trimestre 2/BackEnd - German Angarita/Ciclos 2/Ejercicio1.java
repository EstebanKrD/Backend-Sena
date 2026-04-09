import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        while (contador <=10 ){
            System.out.println(" " + contador);
            contador++;
        }
        scanner.close();

    }
}
