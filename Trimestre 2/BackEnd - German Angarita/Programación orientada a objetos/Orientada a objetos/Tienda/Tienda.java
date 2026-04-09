package Tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario);
        System.out.println("¡Bienvenido a la tienda, " + usuario.nombre + "!");
        System.out.println("------------------------------------------");
        // creamos productos para la tienda
        // manzana es del tipo Producto o es una instancia de
        // Producto
        Producto manzana = new Producto("Manzana", 0.50, "12/10/2027");
        Producto leche = new Producto("Leche", 1.20, "12/11/2026");
        Producto pan = new Producto("Pan", 1.50, "12/12/2025");
        Producto papa = new Producto("Papa", 2, "12/12/2025");
        Producto vino = new Producto("Vino", 20000, "12/12/2028");
        Producto pescado = new Producto("Pecado", 25000, "12/01/2027");
        Producto carne = new Producto("Carne", 30000, "12/02/2027");
        Producto arroz = new Producto("Arroz", 5000, "12/03/2028");
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n===== MENÚ DE LA TIENDA =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3 Ver carrito");
            System.out.println("4. Vaciar carrito");
            System.out.println("5. Calcular total de la compra");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Productos disponibles:");
                    System.out.println("1. " + manzana.nombre + " $" + manzana.precio + " Vence: " + manzana.fechaVencimiento);
                    System.out.println("2. " + leche.nombre + " $" + leche.precio + " Vence: " + leche.fechaVencimiento);
                    System.out.println("3. " + pan.nombre + " $" + pan.precio + " Vence: " + pan.fechaVencimiento);
                    System.out.println("4. " + papa.nombre + " $" + papa.precio + " Vence: " + papa.fechaVencimiento);
                    System.out.println("5. " + vino.nombre + " $" + vino.precio + " Vence: " + vino.fechaVencimiento);
                    System.out.println("6. " + pescado.nombre + " $" + pescado.precio + " Vence: " + pescado.fechaVencimiento);
                    System.out.println("7. " + carne.nombre + " $" + carne.precio + " Vence: " + carne.fechaVencimiento);
                    System.out.println("8. " + arroz.nombre + " $" + arroz.precio + " Vence: " + arroz.fechaVencimiento);
                    break;
                case 2:
                    System.out.print("Ingrese el número del producto a agregar: ");
                    int opcionProducto = scanner.nextInt();
                    switch (opcionProducto) {
                        case 1 -> usuario.agregarProductoAlCarrito(manzana);
                        case 2 -> usuario.agregarProductoAlCarrito(leche);
                        case 3 -> usuario.agregarProductoAlCarrito(pan);
                        case 4 -> usuario.agregarProductoAlCarrito(papa);
                        case 5 -> usuario.agregarProductoAlCarrito(vino);
                        case 6 -> usuario.agregarProductoAlCarrito(pescado);
                        case 7 -> usuario.agregarProductoAlCarrito(carne);
                        case 8 -> usuario.agregarProductoAlCarrito(arroz);
                        default -> System.out.println("Producto inválido.");
                    }
                    break;
                case 3:
                    usuario.verCarrito();
                    break;
                case 4:
                    usuario.vaciarCarrito();
                    break;
                case 5:
                    System.out.println("Calculando total...");
                    double total = usuario.calcularTotal();
                    System.out.println("Total a pagar: $" + total);
                    break;
                case 6:
                    System.out.println("Gracias por visitar la tienda.");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}