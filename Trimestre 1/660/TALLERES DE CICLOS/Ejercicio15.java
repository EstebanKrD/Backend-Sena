import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int S = 0;               
        String serie = "";

        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {    
                S -= i;
                serie += " - " + i;
            } else {             
                S += i;
                if (i == 1) {
                    serie += i;  
                } else {
                    serie += " + " + i;
                }
            }
        }

        System.out.println("Serie: " + serie);
        System.out.println("El valor de S es: " + S);

        sc.close();
    }
}

// ¿Cuál es la regla?

// Cada múltiplo de 3 (3, 6, 9, 12, …) se resta.

// Todos los demás números se suman.
//Empiezo con S = 0.

//i = 1 → no es múltiplo de 3 → sumo → S = 0 + 1 = 1

// i = 2 → no es múltiplo de 3 → sumo → S = 1 + 2 = 3

// i = 3 → múltiplo de 3 → resto → S = 3 - 3 = 0

//i = 4 → sumo → S = 0 + 4 = 4

// i = 5 → sumo → S = 4 + 5 = 9

// i = 6 → múltiplo de 3 → resto → S = 9 - 6 = 3

//i = 7 → sumo → S = 3 + 7 = 10

//i = 8 → sumo → S = 10 + 8 = 18

// i = 9 → múltiplo de 3 → resto → S = 18 - 9 = 9