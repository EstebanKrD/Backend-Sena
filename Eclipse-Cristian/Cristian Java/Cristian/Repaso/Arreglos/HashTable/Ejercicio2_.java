package HashTable;
import java.util.Hashtable;

public class Ejercicio2_ {
    public static void main(String[] args) {

        Hashtable<Integer, String> productos = new Hashtable<>();

        productos.put(1, "Arroz");
        productos.put(2, "Azúcar");

        System.out.println(productos.get(2));
    }
}
