/* Crear una aplicación con una clase principal Operar, la cual use dos clases, Aritmetica y Mensajeria
La clase Aritmetica debe tener métodos para las operaciones básicas.
La clase Mensajeria debe tener métodos para mostrar resultados de operaciones, bienvenida al usuario y despedida del usuario. Las impresiones deben ser manejadas únicamente por esta clase.
Debe existir un menú en la clase principal que le pregunte al usuario qué operación desea hacer. */

package Operar;

import java.util.Scanner;

public class Operar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aritmetica calcular = new Aritmetica();
        Mensajeria mensaje = new Mensajeria();

        mensaje.darBienvenida();

        int opcion = 0;

        while (opcion != 5) {
            mensaje.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el primer número ");
                    double a = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número ");
                    double b = scanner.nextDouble();

                    double respuesta = calcular.sumar(a, b);

                    mensaje.mostrarResultados(respuesta);

                    break;
                }

                case 2: {
                    System.out.println("Ingrese el primer número ");
                    double a = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número ");
                    double b = scanner.nextDouble();

                    double respuesta = calcular.restar(a, b);
                    mensaje.mostrarResultados(respuesta);

                    break;
                }

                case 3: {
                    System.out.println("Ingrese el primer número ");
                    double a = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número ");
                    double b = scanner.nextDouble();

                    double respuesta = calcular.multiplicar(a, b);
                    mensaje.mostrarResultados(respuesta);


                    break;
                }

                case 4:{

                    System.out.println("Ingrese el primer número ");
                    double a = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número ");
                    double b = scanner.nextDouble();

                    double respuesta = calcular.dividir(a, b);
                    mensaje.mostrarResultados(respuesta);

                    break;
                }

                case 5:
                    mensaje.mostrarDespedida();
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }

        }
        scanner.close();
    }
}
