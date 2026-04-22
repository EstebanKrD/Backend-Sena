import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n (1 a 9): ");
        int n = sc.nextInt();

        for (int tabla = 1; tabla <= n; tabla++) {
            System.out.println(tabla + " X " + n + " = " + tabla*n);
        }

        sc.close();
    }
}

