package HashTable;

import java.util.Hashtable;

public class Ejercicio1_ {
    public static void main(String[] args) {

        Hashtable<String, String> datos = new Hashtable<>();

        datos.put("nombre", "Juan");
        datos.put("ciudad", "Armenia");

        System.out.println(datos.get("nombre"));
    }
}
