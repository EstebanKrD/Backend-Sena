package HashMap;

import java.util.HashMap;

public class Ejercicio1 {
    public static void main(String[] args) {

        HashMap<String, String> usuarios = new HashMap<>();

        usuarios.put("admin", "1234");
        usuarios.put("juan", "abcd");
        usuarios.put("maria", "pass");

        String buscarUsuario = "juan";

        if (usuarios.containsKey(buscarUsuario)) {
            System.out.println("Usuario encontrado");
            System.out.println("Contraseña: " + usuarios.get(buscarUsuario));
        } else {
            System.out.println("Usuario no existe");
        }

        for (String u : usuarios.keySet()) {
            System.out.println(u);
        }
    }
}
