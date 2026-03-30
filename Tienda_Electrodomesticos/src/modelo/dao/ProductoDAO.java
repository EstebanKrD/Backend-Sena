package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.conexion.ConexionBD;
import modelo.dto.ProductoDTO;

public class ProductoDAO {

	public String registrarProducto(ProductoDTO producto) {
	    try {
	        Connection conexion = ConexionBD.obtenerConexion();
	        String sentenciaSQL = "INSERT INTO producto (nombre, valor_unitario, cantidad) VALUES (?,?,?)";
	        PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
	        sentenciaPreparada.setString(1, producto.getNombre());
	        sentenciaPreparada.setDouble(2, producto.getValorUnitario());
	        sentenciaPreparada.setInt(3, producto.getCantidad());
	        sentenciaPreparada.executeUpdate();
	        conexion.close();
	        return "si";
	    } catch (Exception error) {
	        System.out.println("Error: " + error.getMessage());
	        return "no";
	    }
	}
    public ProductoDTO consultarProductoPorId(int id) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM producto WHERE id=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setInt(1, id);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                ProductoDTO producto = new ProductoDTO();
                producto.setId(resultado.getInt("id"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setValorUnitario(resultado.getDouble("valor_unitario"));
                producto.setCantidad(resultado.getInt("cantidad"));
                conexion.close();
                return producto;
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return null;
    }

    public ArrayList<ProductoDTO> consultarListaProductos() {
        ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM producto";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            while (resultado.next()) {
                ProductoDTO producto = new ProductoDTO();
                producto.setId(resultado.getInt("id"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setValorUnitario(resultado.getDouble("valor_unitario"));
                producto.setCantidad(resultado.getInt("cantidad"));
                listaProductos.add(producto);
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return listaProductos;
    }

    public String actualizarProducto(ProductoDTO producto) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "UPDATE producto SET nombre=?, valor_unitario=?, cantidad=? WHERE id=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setString(1, producto.getNombre());
            sentenciaPreparada.setDouble(2, producto.getValorUnitario());
            sentenciaPreparada.setInt(3, producto.getCantidad());
            sentenciaPreparada.setInt(4, producto.getId());
            sentenciaPreparada.executeUpdate();
            conexion.close();
            return "ok";
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
            return "error";
        }
    }

    public String eliminarProducto(int id) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "DELETE FROM producto WHERE id=?";
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