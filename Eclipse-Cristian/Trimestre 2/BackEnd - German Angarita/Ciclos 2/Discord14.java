import java.util.Scanner;

public class Discord14 {
    public static void main(String[] args) {
        String cadena;
        String acomulador = "";

        Scanner snr = new Scanner(System.in); 
        System.out.println("Ingrese una cadana de texto:");
        cadena = snr.nextLine();
        snr.close();

        for(int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == 'a') {
                acomulador += letra;
            }
        }
        System.out.println(acomulador);
    }
}