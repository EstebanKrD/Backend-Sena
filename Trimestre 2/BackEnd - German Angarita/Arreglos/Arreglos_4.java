// Dado el arreglo [1,2,3,4,5,6]
// Mostrar todos los elementos dentro del arreglo sumándole uno a cada uno.

public class Arreglos_4 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6};

        for (int i : arreglo) {
            System.out.println(i + " = " + (i + 1));
        }
    }
}
