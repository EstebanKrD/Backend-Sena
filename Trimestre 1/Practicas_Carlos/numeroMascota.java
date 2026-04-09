import java.util.Scanner;
import java.util.Arrays;

public class numeroMascota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        scanner.nextLine();

        System.out.println("Numero de mascota: ");
        int tamaño = scanner.nextInt();
        String[] arrayMascota = new String[tamaño];
        scanner.nextLine();
        for (int i = 0; i < arrayMascota.length; i++) {
            System.out.println("Ingrese el nombre de la mascota: ");
            String dato = scanner.nextLine();
            arrayMascota[i] = dato;
        }

        for(int k = 0; k<arrayMascota.length; k++) {
            System.out.println(arrayMascota[k]);
        }
        System.out.println(Arrays.toString(arrayMascota));
        scanner.close();
    }
}
