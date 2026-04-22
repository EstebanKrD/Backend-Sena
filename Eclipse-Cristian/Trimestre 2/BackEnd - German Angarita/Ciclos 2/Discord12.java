import java.util.Scanner;

public class Discord12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean documentoValido = false;
        String letras = "abcdefghijklmnopqrstuvwxyz";

        while (!documentoValido) {
            System.out.println("ingrese su numero de documento (de 5 a 8 digitos):");
            String documento = scanner.nextLine();

            if (documento.length() >= 5 && documento.length() <= 8) {
                boolean contieneLetras = false;

                for (int i = 0; i < documento.length(); i++) {
                    char c = documento.charAt(i);

                    if (letras.contains(c + "")) {
                        contieneLetras = true;
                        break;
                    }
                }
                // Un usuario se puede registrar si ingresa un documento válido(solo numeros ,
                // de longitud entre 5 y 8 caracteres)
                if (!contieneLetras) {
                    documentoValido = true;
                    System.out.println("El documento se registro correctamente!");
                } else {
                    System.out.println("El documento no debe tener letras(solo numeros)");
                }
            } else {
                System.out.println("El documento debe tener de 5 a 8 digitos");
            }
        }
        String email;
        boolean correoValido = false;

        while (!correoValido) {
            System.out.println("ingrese su correo electronico:");
            email = scanner.nextLine();
            if (email.contains("@") && email.contains(".com")) {
                correoValido = true;
                System.out.println("El correo se registro correctamente!");
            } else {
                System.out.println("El correo no es valido, debe contener '@' y '.com'");
            }
        }
        boolean contraseñaValida = false;
        String contraseña;
        //además si ingresa un email válido, y una contraseña que esté entre 8 y 15
        // caracteres de longitud.
        while (!contraseñaValida) {
            System.out.println("ingrese su contraseña");
            contraseña = scanner.nextLine();
            if (contraseña.length() >= 8 && contraseña.length() <= 15) {
                System.out.println("su contraseña es correcta");
                contraseñaValida = true;
            }else{
                System.out.println("la contraseña es incorrecta(es corta/o muy larga)");
            }
        }

        scanner.close();
    }
}