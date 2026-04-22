import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------!!BIENVENIDOS A LA CALCULADORA!!-----");
        System.out.println("Ingrese el operador 1: ");
        int operador1 = scanner.nextInt();
        System.out.println("ingrese el operador 2: ");
        int operador2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la operación que desea realizar: ");
        String operacion = scanner.nextLine();

        double resultado = 0;

        switch (operacion) {
            case "*":
                resultado = operador1 * operador2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "/":
                if (operador2 > 0) {
                    resultado = operador1 / operador2;
                    System.out.println("El resultado de la division es: " + resultado);
                } else {
                    System.out.println("No es posible dividir por cero (0)");
                }

                break;

            case "-":
                resultado = operador1 - operador2;
                System.out.println("El resultado de la resta es: " + resultado);

                break;

            case "+":
                resultado = operador1 + operador2;
                System.out.println("El resultado de la suma es: " + resultado);

                break;

            default:
                System.out.println("Operación invalida");
                break;
        }

        scanner.close();

    }
}
