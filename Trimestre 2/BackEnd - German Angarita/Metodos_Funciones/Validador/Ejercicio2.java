// Crear un programa Java que valide el registro de un usuario. El usuario debe introducir un email y una contraseña. El sistema debe verificar que el email tenga formato de email(que tenga @ y un .), y la contraseña debe tener entre 6 y 10 caracteres. El sistema debe pedir los datos al usuario indefinidamente hasta que el registro se haga bien. Para la validación, use una función o método llamada Validator. Cuando el usuario se registre exitosamente, debe mostrase un mensaje que diga "Usuario ADSO, su registro ha sido exitoso", para mostrar este mensaje debe usar otra función(método)

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correo;
        String password;

        do {
            System.out.println("Ingrese su correo: ");
            correo = scanner.nextLine();
        } while (!Validator.validarCorreo(correo));

        do {
            System.out.println("Ingrese su contraseña: ");
            password = scanner.nextLine();
        } while (!Validator.validarPassword(password));

        Validator.registroExitoso();

        scanner.close();
    }
}
