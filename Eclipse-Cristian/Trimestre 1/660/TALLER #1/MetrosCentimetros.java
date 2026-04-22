import java.util.Scanner;

public class MetrosCentimetros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los metros");
        int metros = scanner.nextInt();

        scanner.close();
        int centimetros = metros * 100;
        System.out.println("Los " + metros + " metros son " + centimetros + " centimetros");
    }
    
}