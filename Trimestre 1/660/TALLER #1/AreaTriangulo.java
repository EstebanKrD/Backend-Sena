import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base");
        int  base = scanner.nextInt();

        System.out.println("Ingrese la altura");
        int altura = scanner.nextInt();

        scanner.close();
        int resultado = (base * altura) / 2;
        System.out.println(" El resultado de base " + base + " y la altura es " + altura + " el resultado es " + resultado);        
    }
    
}