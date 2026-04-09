import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        
        int impar = 1;   
        int suma = 0;    

        for (int i = 1; i <= n; i++) {
            suma = suma + impar;       
            System.out.println(i + "^2 = " + suma);
            impar = impar + 2; 
        }
        System.out.println();
        sc.close();
    }
}
