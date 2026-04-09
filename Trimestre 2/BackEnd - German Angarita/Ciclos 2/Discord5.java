import java.util.Scanner;

public class Discord5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;
        
        System.out.println("Ingrese números para calcular su promedio: ");
        
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextDouble();
            
            if (numero != 0) {
                suma += numero;
                contador++;
            }
        } while (numero != 0);
        
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de los " + contador + " números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números para calcular el promedio.");
        }
        
        scanner.close();
    }
}
