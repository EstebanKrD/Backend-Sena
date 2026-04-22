public class Validator {

    
    public static boolean validarCorreo(String correo) {
        boolean correoValido = correo.contains("@") && correo.contains(".");

        if (!correoValido) {
            System.out.println("Correo inválido. Debe contener '@' y '.'.\n");
            System.out.println("Intente de nuevo");
        }

        return correoValido;
    }

    
    public static boolean validarPassword(String password) {
        boolean passwordValido = password.length() >= 6 && password.length() <= 10;

        if (!passwordValido) {
            System.out.println("Contraseña inválida. Debe tener entre 6 y 10 caracteres.\n");
        }

        return passwordValido;
    }

    public static void registroExitoso(){ 
        System.out.println("\nBienvenido usuario ADSO, su registro fue exitoso");
    }
}
