package ArrayList;

import java.util.ArrayList;

public class Ejercicio_1 {
    public static void main(String[] args) {

        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        int suma = 0;

        for (int i = 0; i < numero.size(); i++) {
            int elemento = numero.get(i);
            suma = suma + elemento;

        }
        System.out.println("Total "+ suma);
    }
}