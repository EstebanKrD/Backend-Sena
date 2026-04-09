package Tienda;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<Producto> listaCarrito;

    public Usuario () {
        this.listaCarrito = new ArrayList<>();
    }

    public ArrayList<Producto> getCarrito() {
        return this.listaCarrito;
    }

    public void agregarProductoAlCarrito(Producto Producto) {
        this.listaCarrito.add(Producto);
    }

}
