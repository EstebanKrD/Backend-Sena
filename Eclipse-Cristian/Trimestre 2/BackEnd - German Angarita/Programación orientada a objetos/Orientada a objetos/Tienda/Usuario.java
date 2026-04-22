package Tienda;

import java.util.ArrayList;

public class Usuario { // <--- CLASE
    // ATRIBUTOS
    String nombre;
    ArrayList<Producto> carrito; // Un atributo complejo (unalista)
    // CONSTRUCTOR

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<Producto>(); //// Inicializa la lista vacía
    }

    // MÉTODO 1: Acción de comprar
    public void agregarProductoAlCarrito(Producto producto) {
        this.carrito.add(producto);
        System.out.println(producto.nombre + " ha sido agregado al carrito de " + this.nombre);
    }

    // vaciar carrito
    public void vaciarCarrito() {
        carrito.clear();
        System.out.println("El carrito ha sido vaciado.");
    }

    public double calcularTotal() {
        double total = 0.0;
        // Ciclo for-each para recorrer el atributo 'carrito'
        for (Producto producto : this.carrito) {
            total = total + producto.precio;

        }
        return total; // Devuelve un valor

        // AGREGAR UN METODO DE VACIAR CARRITO
        // AGREGAR A USUARIO UN METODO PARA MOSTRAR LOS PRODUCTOS DEL CARRITO
    }

    public void verCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (int i = 0; i < carrito.size(); i++) {
                Producto p = carrito.get(i);
                System.out.println((i + 1) + ". " + p.nombre + " - $" + p.precio);
            }
        }
    }
}