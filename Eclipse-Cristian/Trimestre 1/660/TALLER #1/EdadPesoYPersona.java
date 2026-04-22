import java.util.Scanner;

public class EdadPesoYPersona {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la edad");
        String edad = scanner.nextLine();

        System.out.println("Ingrese el peso");
        String peso = scanner.nextLine();

        System.out.println("Digite el nombre");
        String nombre = scanner.nextLine();
        

        scanner.close();

        System.out.println("El nombre es " + nombre + " la edad es " + edad + " y el peso es " + peso);

    }
}
