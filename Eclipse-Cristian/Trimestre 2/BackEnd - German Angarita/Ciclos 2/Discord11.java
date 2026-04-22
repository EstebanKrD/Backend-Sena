import java.util.Scanner;

public class Discord11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un mensaje");
        String mensaje = sc.nextLine();

        int contadorS = 0;
        int contadorE = 0;
        int contadorN = 0;
        int contadorA = 0;

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            if (letra == 's') {
                contadorS++;
            } else if (letra == 'e') {
                contadorE++;
            } else if (letra == 'n') {
                contadorN++;
            } else if (letra == 'a') {
                contadorA++;
            }
        }

        if (contadorS > 0 && contadorE > 0 && contadorN > 0 && contadorA > 0) {
            System.out.println("Se puede formar la palabra SENA");
        } else {
            System.out.println("No se puede formar la palabra SENA");
        }
        sc.close();
    }
}
