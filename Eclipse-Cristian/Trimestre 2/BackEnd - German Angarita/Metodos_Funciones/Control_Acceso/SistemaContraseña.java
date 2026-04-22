package Control_Acceso;

public class SistemaContraseña {

    public static boolean valida(String contraseña) {
        String contraseñaCorrecta = "ADSO2025";
        return contraseña.equals(contraseñaCorrecta);
    }
    public static void mostrarMensaje(boolean acceso,int intento) {
        if (acceso) {
            System.out.println("Acceso concedido. ¡Bienvenido HPTA!");
        } else {
            System.out.println("Acceso denegado. Intento " + intento);
        }
    }

}