package controlador;

import java.util.ArrayList;
import modeloo.Procesos;
import modelo.conexion.ConexionBD;
import modelo.dao.UsuarioDAO;
import modelo.dao.ProductoDAO;
import modelo.dao.VentasDAO;
import modelo.dto.UsuarioDTO;
import modelo.dto.ProductoDTO;
import modelo.dto.VentasBO;
import vista.VentanaPrincipal;
import vista.VentanaUsuarios;
import vista.VentanaProductos;
import vista.VentanaVentas;
import vista.VentanaReportes;

public class Coordinador {

    private VentanaPrincipal ventanaPrincipal;
    private VentanaUsuarios ventanaUsuarios;
    private VentanaProductos ventanaProductos;
    private VentanaVentas ventanaVentas;
    private VentanaReportes ventanaReportes;

    private Procesos procesos;
    private UsuarioDAO miUsuarioDAO;
    private ProductoDAO miProductoDAO;
    private VentasDAO miVentasDAO;
    private ConexionBD miConexionBD;

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void setVentanaUsuarios(VentanaUsuarios ventanaUsuarios) {
        this.ventanaUsuarios = ventanaUsuarios;
    }

    public void setVentanaProductos(VentanaProductos ventanaProductos) {
        this.ventanaProductos = ventanaProductos;
    }

    public void setVentanaVentas(VentanaVentas ventanaVentas) {
        this.ventanaVentas = ventanaVentas;
    }

    public void setVentanaReportes(VentanaReportes ventanaReportes) {
        this.ventanaReportes = ventanaReportes;
    }

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }

    public void setMiUsuarioDAO(UsuarioDAO miUsuarioDAO) {
        this.miUsuarioDAO = miUsuarioDAO;
    }

    public void setMiProductoDAO(ProductoDAO miProductoDAO) {
        this.miProductoDAO = miProductoDAO;
    }

    public void setMiVentasDAO(VentasDAO miVentasDAO) {
        this.miVentasDAO = miVentasDAO;
    }

    public void setMiConexionBD(ConexionBD miConexionBD) {
        this.miConexionBD = miConexionBD;
    }

    public void mostrarVentanaPrincipal() {
        ventanaPrincipal.setVisible(true);
    }

    public void mostrarVentanaUsuarios() {
        ventanaUsuarios.setVisible(true);
    }

    public void mostrarVentanaProductos() {
        ventanaProductos.setVisible(true);
    }

    public void mostrarVentanaVentas() {
        ventanaVentas.cargarProductos();
        ventanaVentas.setVisible(true);
    }

    public void mostrarVentanaReportes() {
        ventanaReportes.cargarVentas();
        ventanaReportes.setVisible(true);
    }

    public boolean validarNombre(String valor) {
        return procesos.validarNombre(valor);
    }

    public boolean validarNumero(String valor) {
        return procesos.validarNumero(valor);
    }

    public double calcularTotal(double valorUnitario, int cantidad) {
        return procesos.calcularTotal(valorUnitario, cantidad);
    }

    public double calcularDescuento(int cantidad, double totalCompra) {
        return procesos.calcularDescuento(cantidad, totalCompra);
    }
    
    public String obtenerTipoDescuento(int cantidad) {
        return procesos.obtenerTipoDescuento(cantidad);
    }


    public String registrarUsuario(UsuarioDTO usuario) {
        return miUsuarioDAO.registrarUsuario(usuario);
    }

    public UsuarioDTO consultarUsuarioPorCedula(String cedula) {
        return miUsuarioDAO.consultarUsuarioPorCedula(cedula);
    }

    public ArrayList<UsuarioDTO> consultarListaUsuarios() {
        return miUsuarioDAO.consultarListaUsuarios();
    }

    public String actualizarUsuario(UsuarioDTO usuario) {
        return miUsuarioDAO.actualizarUsuario(usuario);
    }

    public String eliminarUsuario(int id) {
        return miUsuarioDAO.eliminarUsuario(id);
    }

    public String registrarProducto(ProductoDTO producto) {
        return miProductoDAO.registrarProducto(producto);
    }

    public ProductoDTO consultarProductoPorId(int id) {
        return miProductoDAO.consultarProductoPorId(id);
    }

    public ArrayList<ProductoDTO> consultarListaProductos() {
        return miProductoDAO.consultarListaProductos();
    }

    public String actualizarProducto(ProductoDTO producto) {
        return miProductoDAO.actualizarProducto(producto);
    }

    public String eliminarProducto(int id) {
        return miProductoDAO.eliminarProducto(id);
    }

    public String registrarVenta(VentasBO venta) {
        return miVentasDAO.registrarVenta(venta);
    }

    public ArrayList<VentasBO> consultarListaVentas() {
        return miVentasDAO.consultarListaVentas();
    }
}