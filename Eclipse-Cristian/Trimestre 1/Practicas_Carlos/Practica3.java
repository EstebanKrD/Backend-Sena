import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de N: ");
        int s = scanner.nextInt();
        scanner.close();

        double suma = 0;
        String serie = "";

        for (int i = 1; i <= s; i++) {
            if (i % 2 == 0) { 
                suma -= 1.0 / i;
                serie += " - 1/" + i;
            } else { 
                if (i == 1) {
                    serie += "1/" + i; 
                } else {
                    serie += " + 1/" + i;
                }
                suma += 1.0 / i;
            }
        }

        System.out.println("Serie: " + serie);
        System.out.println("Resultado: " + suma);
    }
}
