import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorrecto = "admin";
        String passwordCorrecta = "1234";
        
        
        boolean accesoExitoso = false;
        int intentos = 3;
        
        while (intentos > 0 && !accesoExitoso) {
            System.out.println("\nIntentos restantes: " + intentos);
            
            System.out.print("Ingrese usuario: ");
            String usuario = scanner.nextLine();
            
            System.out.print("Ingrese contraseña: ");
            String password = scanner.nextLine();
            
            if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta)) {
                accesoExitoso = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                intentos--;
            }
        }
        
        if (accesoExitoso) {
            System.out.println("¡Bienvenido al sistema!");
        } else {
            System.out.println("Cuenta bloqueada. Ha excedido el número de intentos.");
        }
        
        scanner.close();
    }
}
