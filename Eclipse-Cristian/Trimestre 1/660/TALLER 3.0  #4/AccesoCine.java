import java.util.Scanner;

public class AccesoCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: " );
        int edad = scanner.nextInt();

        if (edad >=15 ) {
            System.out.println("¿Tiene dinero? (Si/No):");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                System.out.println("Puede comprar la entrada");  
            } else {
                System.out.println("No puede comprar la entrada");
            }
        } else {
            System.out.println("Debe de venir con un adulto");
        }

        scanner.close();
    }
}