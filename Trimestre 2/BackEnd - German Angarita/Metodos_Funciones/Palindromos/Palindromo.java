package Palindromos;

public class Palindromo {
    public static boolean esPolindromo(String palabra) {
        String invertida = new StringBuilder(palabra).reverse().toString();

        return palabra.equals(invertida);
    }
}
 // new StringBuilder(palabra) crea un constructor de texto con tu palabra
 // .reverse() le da la vuelta (invierte el texto)
 // .toString() lo convierte de nuevo a una cadena normal