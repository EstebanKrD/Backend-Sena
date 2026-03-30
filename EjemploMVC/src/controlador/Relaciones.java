package controlador;

import modelo.Procesos;
import modelo.conexion.ConexionBD;
import modelo.dao.PersonaDAO;
import vista.VentanaConsultaIndividual;
import vista.VentanaConsultarLista;
import vista.VentanaOperaciones;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Relaciones {

    public Relaciones() {

        // 1. Se instancian todas las clases
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        VentanaRegistro ventanaRegistro = new VentanaRegistro(ventanaPrincipal, true);
        VentanaOperaciones ventanaOperaciones = new VentanaOperaciones(ventanaRegistro, true);
        VentanaConsultaIndividual ventanaConsultaIndividual = new VentanaConsultaIndividual(ventanaPrincipal, true);
        VentanaConsultarLista ventanaConsultarLista = new VentanaConsultarLista(ventanaPrincipal, true);
        Procesos misProcesos = new Procesos();
        PersonaDAO miPersonaDAO = new PersonaDAO();
        ConexionBD miConexionBD = new ConexionBD();
        Coordinador miCoordinador = new Coordinador();

        // 2. Se conectan las ventanas con el coordinador
        ventanaPrincipal.setCoordinador(miCoordinador);
        ventanaRegistro.setCoordinador(miCoordinador);
        ventanaOperaciones.setCoordinador(miCoordinador);
        ventanaConsultaIndividual.setCoordinador(miCoordinador);
        ventanaConsultarLista.setCoordinador(miCoordinador);

        // 3. Se conecta el modelo con el coordinador
        misProcesos.setCoordinador(miCoordinador);
        miPersonaDAO.setCoordinador(miCoordinador);
        miConexionBD.setCoordinador(miCoordinador);

        // 4. Se conecta el coordinador con todas las clases
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setVentanaRegistro(ventanaRegistro);
        miCoordinador.setVentanaOperaciones(ventanaOperaciones);
        miCoordinador.setVentanaConsultaIndividual(ventanaConsultaIndividual);
        miCoordinador.setVentanaConsultarLista(ventanaConsultarLista);
        miCoordinador.setProcesos(misProcesos);
        miCoordinador.setMiPersonaDAO(miPersonaDAO);
        miCoordinador.setMiConexionBD(miConexionBD);

        // 5. Muestra la ventana principal
        miCoordinador.mostrarVentanaPrincipal();
    }
}