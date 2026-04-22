package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.conexion.ConexionBD;
import modelo.dto.UsuarioDTO;

public class UsuarioDAO {

	public String registrarUsuario(UsuarioDTO usuario) {
	    try {
	        Connection conexion = ConexionBD.obtenerConexion();
	        String sentenciaSQL = "INSERT INTO usuario (cedula, nombre, apellido, edad, telefono, tipo) VALUES (?,?,?,?,?,?)";
	        PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
	        sentenciaPreparada.setString(1, usuario.getCedula());
	        sentenciaPreparada.setString(2, usuario.getNombre());
	        sentenciaPreparada.setString(3, usuario.getApellido());
	        sentenciaPreparada.setInt(4, usuario.getEdad());
	        sentenciaPreparada.setString(5, usuario.getTelefono());
	        sentenciaPreparada.setString(6, usuario.getTipo());
	        sentenciaPreparada.executeUpdate();
	        conexion.close();
	        return "si";
	    } catch (Exception error) {
	        System.out.println("Error: " + error.getMessage());
	        return "no";
	    }
	}
    public UsuarioDTO consultarUsuarioPorCedula(String cedula) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM usuario WHERE cedula=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setString(1, cedula);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setId(resultado.getInt("id"));
                usuario.setCedula(resultado.getString("cedula"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setApellido(resultado.getString("apellido"));
                usuario.setEdad(resultado.getInt("edad"));
                usuario.setTelefono(resultado.getString("telefono"));
                usuario.setTipo(resultado.getString("tipo"));
                conexion.close();
                return usuario;
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return null;
    }

    public ArrayList<UsuarioDTO> consultarListaUsuarios() {
        ArrayList<UsuarioDTO> listaUsuarios = new ArrayList<>();
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM usuario";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            while (resultado.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setId(resultado.getInt("id"));
                usuario.setCedula(resultado.getString("cedula"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setApellido(resultado.getString("apellido"));
                usuario.setEdad(resultado.getInt("edad"));
                usuario.setTelefono(resultado.getString("telefono"));
                usuario.setTipo(resultado.getString("tipo"));
                listaUsuarios.add(usuario);
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return listaUsuarios;
    }

    public String actualizarUsuario(UsuarioDTO usuario) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "UPDATE usuario SET cedula=?, nombre=?, apellido=?, edad=?, telefono=?, tipo=? WHERE id=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setString(1, usuario.getCedula());
            sentenciaPreparada.setString(2, usuario.getNombre());
            sentenciaPreparada.setString(3, usuario.getApellido());
            sentenciaPreparada.setInt(4, usuario.getEdad());
            sentenciaPreparada.setString(5, usuario.getTelefono());
            sentenciaPreparada.setString(6, usuario.getTipo());
            sentenciaPreparada.setInt(7, usuario.getId());
            sentenciaPreparada.executeUpdate();
            conexion.close();
            return "ok";
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
            return "error";
        }
    }

    public String eliminarUsuario(int id) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "DELETE FROM usuario WHERE id=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setInt(1, id);
            sentenciaPreparada.executeUpdate();
            conexion.close();
            return "ok";
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
            return "error";
        }
    }
}