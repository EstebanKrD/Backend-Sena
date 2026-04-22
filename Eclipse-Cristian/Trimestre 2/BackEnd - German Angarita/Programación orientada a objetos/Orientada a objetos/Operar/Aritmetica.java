/* Crear una aplicación con una clase principal Operar, la cual use dos clases, Aritmetica y Mensajeria
La clase Aritmetica debe tener métodos para las operaciones básicas.
La clase Mensajeria debe tener métodos para mostrar resultados de operaciones, bienvenida al usuario y despedida del usuario. Las impresiones deben ser manejadas únicamente por esta clase.
Debe existir un menú en la clase principal que le pregunte al usuario qué operación desea hacer. */

package Operar;

public class Aritmetica {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return a / b;
    }

}
