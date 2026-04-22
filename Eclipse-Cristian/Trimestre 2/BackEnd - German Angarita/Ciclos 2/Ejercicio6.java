public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            numero++;
        }
        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }
}
