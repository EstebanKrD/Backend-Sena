package modelo.conexion;

import java.sql.Connection;
import controlador.Coordinador;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/backend?serverTimezone=UTC";
    private static final String USUARIO = "backend";
    private static final String PASSWORD = "Colombia2024++";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa a MySQL");
        } catch (Exception error) {
            System.out.println("Error al conectar: " + error.getMessage());
        }
        return conexion;
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
    }
}