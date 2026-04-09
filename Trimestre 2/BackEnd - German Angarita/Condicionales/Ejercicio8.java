import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite el tercer número: ");
        int numero3 = scanner.nextInt();
        
        int menor, medio, mayor;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                medio = numero2;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                medio = numero1;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                medio = numero1;
                mayor = numero2;
            } else {
                medio = numero2;
                mayor = numero1;
            }
        }

        System.out.println("Este sería el orden de los números de menor a mayor: " 
                           + menor + ", " + medio + ", " + mayor);

        scanner.close();
    }
}
