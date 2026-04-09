import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.println("------Bienvenido al conversor de temperaturas------ \n");
            System.out.println("1.) Kelvin \n");
            System.out.println("2.) Fahrenheit \n");
            System.out.println("3.) Salir \n");
            System.out.println("--------------------------");

            int opcion = scanner.nextInt();
            if (opcion == 3) {
                repetir = false;
                System.out.println("Gracias por usar el conversor");
            }
            System.out.println("Ingrese la temperatura en Celsius");
            double Celsius = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    double resultado = Temperatura.convertirAKelvin(Celsius);
                    String mensajeFinal = Temperatura.mensajeFinal(resultado);
                    Temperatura.mostrarMensaje(mensajeFinal);
                    break;

                    case 2:
                    resultado = Temperatura.convertirFahremheit(Celsius);
                    mensajeFinal = Temperatura.mensajeFinal(resultado);
                    Temperatura.mostrarMensaje(mensajeFinal);

                    break;

            
                default:

                    break;
            }

        }

        scanner.close();

    }
}
