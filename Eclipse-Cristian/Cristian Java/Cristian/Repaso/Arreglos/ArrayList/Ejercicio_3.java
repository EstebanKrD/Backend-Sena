package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista solo con vocales en MINÚSCULA
        ArrayList<Character> listaDeCaracteres = new ArrayList<>();
        listaDeCaracteres.add('a');
        listaDeCaracteres.add('e');
        listaDeCaracteres.add('i');
        listaDeCaracteres.add('o');
        listaDeCaracteres.add('u');

        System.out.println("Lista actual: " + listaDeCaracteres);

        System.out.print("Ingrese un SOLO carácter para contar: ");
        char caracterObjetivo = scanner.next().toLowerCase().charAt(0);

        int conteo = 0;

        for (char caracterActual : listaDeCaracteres) {
            if (caracterActual == caracterObjetivo) {
                conteo++;
            }
        }

        System.out.println("El carácter '" + caracterObjetivo + "' aparece " + conteo + " veces en la lista.");

        scanner.close();
    }
}
