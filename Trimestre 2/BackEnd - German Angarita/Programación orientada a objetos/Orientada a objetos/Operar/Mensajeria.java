/* Crear una aplicación con una clase principal Operar, la cual use dos clases, Aritmetica y Mensajeria
La clase Aritmetica debe tener métodos para las operaciones básicas.
La clase Mensajeria debe tener métodos para mostrar resultados de operaciones, bienvenida al usuario y despedida del usuario. Las impresiones deben ser manejadas únicamente por esta clase.
Debe existir un menú en la clase principal que le pregunte al usuario qué operación desea hacer. */

package Operar;

public class Mensajeria {

    public void darBienvenida() {
        System.out.println("Bienvenido a la app de aritmetica");
    }

    public void mostrarMenu() {
        System.out.println("Seleccione la operación que desea realizar");

        System.out.println("1.) Sumar");
        System.out.println("2.) Restar");
        System.out.println("3.) Multiplicar");
        System.out.println("4.) Dividir");
        System.out.println("5.) Salir");

    }

    public void mostrarResultados(double respuesta) {
        System.out.println("El resultado de la operación es " + respuesta);
    }

    public void mostrarDespedida() {
        System.out.println("Gracias por usar la app de aritmetica :) ");

    }

}
