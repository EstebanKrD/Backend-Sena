package HashMap;

import java.util.HashMap;

public class Ejercicio {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Ana", 85);
        notas.put("Luis", 90);
        notas.put("Pedro", 70);

        System.out.println("Nota de Luis: " + notas.get("Luis"));

        notas.put("Pedro", 80);

        for (String nombre : notas.keySet()) {
            System.out.println(nombre + " → " + notas.get(nombre));
        }

        if (notas.containsKey("Ana")) {
            System.out.println("Ana está registrada");
        }

        System.out.println("Total estudiantes: " + notas.size());
    }
}
