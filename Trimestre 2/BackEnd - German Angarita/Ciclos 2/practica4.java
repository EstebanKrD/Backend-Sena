import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String serie = " ";
        System.out.println("Ingrese el numero a sumar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
            serie += " + " + i;
    
        }
        System.out.println("El resultado es " + suma );
        System.out.println("La serie es " + serie);
        scanner.close();
    }
}
