package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.conexion.ConexionBD;
import modelo.dto.VentasBO;

public class VentasDAO {

    public String registrarVenta(VentasBO venta) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "INSERT INTO venta VALUES (?,?,?,?,?,?)";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setInt(1, venta.getId());
            sentenciaPreparada.setInt(2, venta.getIdUsuario());
            sentenciaPreparada.setInt(3, venta.getIdProducto());
            sentenciaPreparada.setInt(4, venta.getCantidadComprada());
            sentenciaPreparada.setDouble(5, venta.getTotal());
            sentenciaPreparada.setDouble(6, venta.getDescuento());
            sentenciaPreparada.executeUpdate();
            conexion.close();
            return "si";
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
            return "no";
        }
    }

    public ArrayList<VentasBO> consultarListaVentas() {
        ArrayList<VentasBO> listaVentas = new ArrayList<>();
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM venta";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            while (resultado.next()) {
                VentasBO venta = new VentasBO();
                venta.setId(resultado.getInt("id"));
                venta.setIdUsuario(resultado.getInt("id_usuario"));
                venta.setIdProducto(resultado.getInt("id_producto"));
                venta.setCantidadComprada(resultado.getInt("cantidad_comprada"));
                venta.setTotal(resultado.getDouble("total"));
                venta.setDescuento(resultado.getDouble("descuento"));
                listaVentas.add(venta);
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return listaVentas;
    }

    public VentasBO consultarVentaPorId(int id) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sentenciaSQL = "SELECT * FROM venta WHERE id=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(sentenciaSQL);
            sentenciaPreparada.setInt(1, id);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                VentasBO venta = new VentasBO();
                venta.setId(resultado.getInt("id"));
                venta.setIdUsuario(resultado.getInt("id_usuario"));
                venta.setIdProducto(resultado.getInt("id_producto"));
                venta.setCantidadComprada(resultado.getInt("cantidad_comprada"));
                venta.setTotal(resultado.getDouble("total"));
                venta.setDescuento(resultado.getDouble("descuento"));
                conexion.close();
                return venta;
            }
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        return null;
    }
}