package HashMap;

import java.util.HashMap;

public class Ejercicio2 {
    public static void main(String[] args) {

        HashMap<String, Integer> productos = new HashMap<>();

        productos.put("Pan", 2000);
        productos.put("Leche", 3500);
        productos.put("Huevos", 8000);

        int total = 0;
        for (String p : productos.keySet()) {
            total = total + productos.get(p);
        }

        System.out.println("Total a pagar: " + total);
    }
}
