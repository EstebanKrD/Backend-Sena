import java.util.Scanner;

public class NumeroValido {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = sc.nextInt();

        if (numero >= 50 && numero <= 100){
            System.out.println("El número es válido");
        } else {
            System.out.println("El número no es válido");
        }
    }
}