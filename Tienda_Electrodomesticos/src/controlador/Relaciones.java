package controlador;

import modeloo.Procesos;
import modelo.conexion.ConexionBD;
import modelo.dao.UsuarioDAO;
import modelo.dao.ProductoDAO;
import modelo.dao.VentasDAO;
import vista.VentanaPrincipal;
import vista.VentanaUsuarios;
import vista.VentanaProductos;
import vista.VentanaVentas;
import vista.VentanaReportes;

public class Relaciones {

    public Relaciones() {

        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        VentanaUsuarios ventanaUsuarios = new VentanaUsuarios(ventanaPrincipal, true);
        VentanaProductos ventanaProductos = new VentanaProductos(ventanaPrincipal, true);
        VentanaVentas ventanaVentas = new VentanaVentas(ventanaPrincipal, true);
        VentanaReportes ventanaReportes = new VentanaReportes(ventanaPrincipal, true);
        Procesos misProcesos = new Procesos();
        UsuarioDAO miUsuarioDAO = new UsuarioDAO();
        ProductoDAO miProductoDAO = new ProductoDAO();
        VentasDAO miVentasDAO = new VentasDAO();
        ConexionBD miConexionBD = new ConexionBD();
        Coordinador miCoordinador = new Coordinador();

        ventanaPrincipal.setCoordinador(miCoordinador);
        ventanaUsuarios.setCoordinador(miCoordinador);
        ventanaProductos.setCoordinador(miCoordinador);
        ventanaVentas.setCoordinador(miCoordinador);
        ventanaReportes.setCoordinador(miCoordinador);

        misProcesos.setCoordinador(miCoordinador);
        miConexionBD.setCoordinador(miCoordinador);

        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setVentanaUsuarios(ventanaUsuarios);
        miCoordinador.setVentanaProductos(ventanaProductos);
        miCoordinador.setVentanaVentas(ventanaVentas);
        miCoordinador.setVentanaReportes(ventanaReportes);
        miCoordinador.setProcesos(misProcesos);
        miCoordinador.setMiUsuarioDAO(miUsuarioDAO);
        miCoordinador.setMiProductoDAO(miProductoDAO);
        miCoordinador.setMiVentasDAO(miVentasDAO);
        miCoordinador.setMiConexionBD(miConexionBD);

        miCoordinador.mostrarVentanaPrincipal();
    }
}