package controlador;

import java.util.ArrayList;
import modelo.Procesos;
import modelo.conexion.ConexionBD;
import modelo.dao.PersonaDAO;
import modelo.dto.PersonaDTO;
import vista.VentanaConsultaIndividual;
import vista.VentanaConsultarLista;
import vista.VentanaOperaciones;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Coordinador {

    // Referencias a todas las ventanas
    private VentanaPrincipal ventanaPrincipal;
    private VentanaRegistro ventanaRegistro;
    private VentanaOperaciones ventanaOperaciones;
    private VentanaConsultaIndividual ventanaConsultaIndividual;
    private VentanaConsultarLista ventanaConsultarLista;

    // Referencias a las clases del modelo
    private Procesos procesos;
    private PersonaDAO miPersonaDAO;
    private ConexionBD miConexionBD;

    // Setters para conectar las ventanas
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void setVentanaRegistro(VentanaRegistro ventanaRegistro) {
        this.ventanaRegistro = ventanaRegistro;
    }

    public void setVentanaOperaciones(VentanaOperaciones ventanaOperaciones) {
        this.ventanaOperaciones = ventanaOperaciones;
    }

    public void setVentanaConsultaIndividual(VentanaConsultaIndividual ventanaConsultaIndividual) {
        this.ventanaConsultaIndividual = ventanaConsultaIndividual;
    }

    public void setVentanaConsultarLista(VentanaConsultarLista ventanaConsultarLista) {
        this.ventanaConsultarLista = ventanaConsultarLista;
    }

    // Setters para conectar el modelo
    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }

    public void setMiPersonaDAO(PersonaDAO miPersonaDAO) {
        this.miPersonaDAO = miPersonaDAO;
    }

    public void setMiConexionBD(ConexionBD miConexionBD) {
        this.miConexionBD = miConexionBD;
    }

    // Métodos para mostrar ventanas
    public void mostrarVentanaPrincipal() {
        ventanaPrincipal.setVisible(true);
    }

    public void mostrarVentanaRegistro() {
        ventanaRegistro.limpiarFormulario();
        ventanaRegistro.setVisible(true);
    }

    public void mostrarVentanaConsultaIndividual() {
        ventanaConsultaIndividual.setVisible(true);
    }

    public void mostrarVentanaConsultarLista() {
        ventanaConsultarLista.consultarListaPersonas();
        ventanaConsultarLista.setVisible(true);
    }

    public void mostrarVentanaOperaciones() {
        ventanaOperaciones.setVisible(true);
    }

    // Métodos que delegan al modelo
    public boolean validarNombre(String valor) {
        return procesos.validarNombre(valor);
    }

    public boolean validarNumero(String valor) {
        return procesos.validarNumero(valor);
    }

    public void calcularSueldoNuevo(PersonaDTO persona) {
        procesos.calcularSueldoNuevo(persona);
    }

    // Métodos que delegan al DAO
    public String registrarPersona(PersonaDTO persona) {
        return miPersonaDAO.registrarPersona(persona);
    }

    public PersonaDTO consultarPersona(String documento) {
        return miPersonaDAO.consultarPersonaPorDocumento(documento);
    }

    public ArrayList<PersonaDTO> consultarListaPersonas() {
        return miPersonaDAO.consultarListaPersonas();
    }

    public String actualizarPersona(PersonaDTO persona) {
        return miPersonaDAO.actualizarPersona(persona);
    }

    public String eliminarPersona(String documento) {
        return miPersonaDAO.eliminarPersona(documento);
    }
    
    public String calcularOperacion(String seleccion, String numero1, String numero2) {
        return procesos.calcularOperaciones(seleccion, numero1, numero2);
    }
}