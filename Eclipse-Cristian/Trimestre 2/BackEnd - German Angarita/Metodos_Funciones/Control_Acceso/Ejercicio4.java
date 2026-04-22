package Control_Acceso;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean acceso = false;
        for( int i = 1; i <= 3; i++ ){

            System.out.println("Por favor ingrese su contraseña: ");
            String contraseña = scanner.nextLine();

            acceso = SistemaContraseña.valida(contraseña);
            SistemaContraseña.mostrarMensaje(acceso, i);
            if (acceso) {
                break;
            }
        }
        if (!acceso) {
            System.out.println("acceso no valido, muchos intentos fallidos...");
        }
        scanner.close();
    }
}