import java.util.Scanner;

public class Discord9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cree un programa que calcule la suma de los cuadrados de los números entre 1 y n
        int i = 1;
        int suma = 0;
        System.out.println("ingrese un numero hasta donde desea terminar la suma:");
        int numero = scanner.nextInt();

        while (i <= numero) {
            i++;
            suma += i * i;
        }
        System.out.println("el resultado de la suma de los cuadrados de 1 hasta " + numero + " es: " + suma);
        scanner.close();
    }
}
