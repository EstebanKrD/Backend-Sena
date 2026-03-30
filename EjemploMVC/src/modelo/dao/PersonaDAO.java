package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import controlador.Coordinador;
import modelo.conexion.ConexionBD;
import modelo.dto.PersonaDTO;

public class PersonaDAO {

	private Coordinador miCoordinador;

	public String registrarPersona(PersonaDTO persona) {
		try {
			Connection conexion = ConexionBD.obtenerConexion();
			String sentenciaSQL = "INSERT INTO persona VALUES (?,?,?,?,?,?,?)";
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, persona.getDocumento());
			sentenciaPreparada.setString(2, persona.getNombre());
			sentenciaPreparada.setInt(3, persona.getEdad());
			sentenciaPreparada.setDouble(4, persona.getSueldo());
			sentenciaPreparada.setInt(5, persona.getAntiguedad());
			sentenciaPreparada.setDouble(6, persona.getSueldoNuevo());
			sentenciaPreparada.setDouble(7, persona.getAumento());
			sentenciaPreparada.executeUpdate();
			conexion.close();
			return "si";
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
			return "no";
		}
	}

	public PersonaDTO consultarPersonaPorDocumento(String documento) {
		try {
			Connection conexion = ConexionBD.obtenerConexion();
			String sentenciaSQL = "SELECT * FROM persona WHERE documento=?";
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, documento);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			if (resultado.next()) {
				PersonaDTO persona = new PersonaDTO();
				persona.setDocumento(resultado.getString("documento"));
				persona.setNombre(resultado.getString("nombre"));
				persona.setEdad(resultado.getInt("edad"));
				persona.setSueldo(resultado.getDouble("sueldo"));
				persona.setAntiguedad(resultado.getInt("antiguedad"));
				persona.setSueldoNuevo(resultado.getDouble("sueldo_nuevo"));
				persona.setAumento(resultado.getDouble("aumento"));
				conexion.close();
				return persona;
			}
			conexion.close();
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
		}
		return null;
	}

	public ArrayList<PersonaDTO> consultarListaPersonas() {
		ArrayList<PersonaDTO> listaPersonas = new ArrayList<>();
		try {
			Connection conexion = ConexionBD.obtenerConexion();
			String sentenciaSQL = "SELECT * FROM persona";
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				PersonaDTO persona = new PersonaDTO();
				persona.setDocumento(resultado.getString("documento"));
				persona.setNombre(resultado.getString("nombre"));
				persona.setEdad(resultado.getInt("edad"));
				persona.setSueldo(resultado.getDouble("sueldo"));
				persona.setAntiguedad(resultado.getInt("antiguedad"));
				persona.setSueldoNuevo(resultado.getDouble("sueldo_nuevo"));
				persona.setAumento(resultado.getDouble("aumento"));
				listaPersonas.add(persona);
			}
			conexion.close();
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
		}
		return listaPersonas;
	}

	public String eliminarPersona(String documento) {
		try {
			Connection conexion = ConexionBD.obtenerConexion();
			String sentenciaSQL = "DELETE FROM persona WHERE documento=?";
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, documento);
			sentenciaPreparada.executeUpdate();
			conexion.close();
			return "ok";
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
			return "error";
		}
	}

	public String actualizarPersona(PersonaDTO persona) {
		try {
			Connection conexion = ConexionBD.obtenerConexion();
			String sentenciaSQL = "UPDATE persona SET nombre=?, edad=?, sueldo=?, antiguedad=?, sueldo_nuevo=?, aumento=? WHERE documento=?";
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, persona.getNombre());
			sentenciaPreparada.setInt(2, persona.getEdad());
			sentenciaPreparada.setDouble(3, persona.getSueldo());
			sentenciaPreparada.setInt(4, persona.getAntiguedad());
			sentenciaPreparada.setDouble(5, persona.getSueldoNuevo());
			sentenciaPreparada.setDouble(6, persona.getAumento());
			sentenciaPreparada.setString(7, persona.getDocumento());
			sentenciaPreparada.executeUpdate();
			conexion.close();
			return "ok";
		} catch (Exception error) {
			System.out.println("Error: " + error.getMessage());
			return "error";
		}
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}