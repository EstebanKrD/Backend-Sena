import java.util.Scanner;

public class Discord4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 1;
        
        System.out.println("Ingrese 10 números para calcular su promedio:");
        
        while (contador <= 10) {
            System.out.print("Ingrese el número " + contador + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
            contador++;
        }
        
        double promedio = suma / 10;
        
        System.out.println("El promedio de los números ingresados es: " + promedio);
        
        scanner.close();
    }
}
