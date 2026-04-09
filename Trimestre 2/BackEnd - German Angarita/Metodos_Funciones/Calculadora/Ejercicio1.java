// Estudiar métodos(funiones), parámetros y retornos. Hacer una app que tenga métodos de sumar, restar, multiplicar, dividir, y calcular porcentaje. La app debe recibir una solicitud del usuario, si éste quiere sumar, entonces se le deben pedir los números a sumar y llamar al método de sumar, si quiere dividir se aplica la misma mecánica.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("---------Bienvenido a la calculadora----------");
            System.out.println("Ingrese su nombre ");
            String nombre = scanner.nextLine();
            System.out.println("Seleccione la operación que deseé realizar");
            System.out.println("1). Suma");
            System.out.println("2). Multiplicación");
            System.out.println("3). Resta ");
            System.out.println("4). División ");
            System.out.println("5). Potencia ");
            System.out.println("6). Modulo");
            System.out.println("7). Salir ");
            System.out.println("----------------------------------------------");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                repetir = false;
                System.out.println("Gracias por usa la caluladora ");
                continue;
            }
            System.out.println("Ingrese el primer numero: ");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            double num2 = scanner.nextDouble();

            Operacion1 operacion1 = new Operacion1();

            switch (opcion) {
                case 1:
                    double resultado = operacion1.sumar(num1, num2);
                    String mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;
                case 2:
                    resultado = operacion1.multiplicar(num1, num2);
                    mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;

                case 3:
                    resultado = operacion1.resta(num1, num2);
                    mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;

                case 4:
                    resultado = operacion1.division(num1, num2);
                    mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;

                case 5:
                    resultado = operacion1.potencia(num1, num2);
                    mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;

                case 6:
                    resultado = operacion1.modulo(num1, num2);
                    mensajeFinal = operacion1.formatearMensaje(nombre, resultado);
                    operacion1.mostrarMensaje(mensajeFinal);
                    break;

                default:
                    System.out.println("Opción no permitida");
                    break;
            }
        }

        scanner.close();
    }

}