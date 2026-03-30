package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controlador.Coordinador;
import modelo.dto.PersonaDTO;

public class VentanaConsultaIndividual extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonConsultar;
    private JButton botonActualizar;
    private JButton botonEliminar;
    private JTextField campoNombre;
    private JTextField campoDocumento;
    private JTextField campoEdad;
    private JTextField campoSueldo;
    private JTextField campoAntiguedad;
    private JLabel etiquetaSueldoNuevo;
    private JLabel etiquetaAumento;

    public VentanaConsultaIndividual(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Consulta Individual");
        setSize(420, 420);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("CONSULTA DE USUARIOS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiquetaTitulo.setBounds(0, 6, 414, 30);
        getContentPane().add(etiquetaTitulo);

        JLabel etiquetaDocumento = new JLabel("Documento:");
        etiquetaDocumento.setBounds(50, 50, 100, 30);
        getContentPane().add(etiquetaDocumento);

        campoDocumento = new JTextField();
        campoDocumento.setBounds(150, 50, 150, 30);
        getContentPane().add(campoDocumento);

        botonConsultar = new JButton("...");
        botonConsultar.setBounds(310, 50, 60, 30);
        botonConsultar.addActionListener(this);
        getContentPane().add(botonConsultar);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(50, 90, 100, 30);
        getContentPane().add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(150, 90, 200, 30);
        getContentPane().add(campoNombre);

        JLabel etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setBounds(50, 130, 100, 30);
        getContentPane().add(etiquetaEdad);

        campoEdad = new JTextField();
        campoEdad.setBounds(150, 130, 200, 30);
        getContentPane().add(campoEdad);

        JLabel etiquetaSueldo = new JLabel("Sueldo:");
        etiquetaSueldo.setBounds(50, 170, 100, 30);
        getContentPane().add(etiquetaSueldo);

        campoSueldo = new JTextField();
        campoSueldo.setBounds(150, 170, 200, 30);
        getContentPane().add(campoSueldo);

        JLabel etiquetaAntiguedad = new JLabel("Antigüedad:");
        etiquetaAntiguedad.setBounds(50, 210, 100, 30);
        getContentPane().add(etiquetaAntiguedad);

        campoAntiguedad = new JTextField();
        campoAntiguedad.setBounds(150, 210, 200, 30);
        getContentPane().add(campoAntiguedad);

        JLabel etiquetaSueldoNuevoLabel = new JLabel("Sueldo Nuevo:");
        etiquetaSueldoNuevoLabel.setBounds(50, 250, 100, 30);
        getContentPane().add(etiquetaSueldoNuevoLabel);

        etiquetaSueldoNuevo = new JLabel("");
        etiquetaSueldoNuevo.setBounds(150, 250, 200, 30);
        getContentPane().add(etiquetaSueldoNuevo);

        JLabel etiquetaAumentoLabel = new JLabel("Aumento:");
        etiquetaAumentoLabel.setBounds(50, 285, 100, 30);
        getContentPane().add(etiquetaAumentoLabel);

        etiquetaAumento = new JLabel("");
        etiquetaAumento.setBounds(150, 285, 200, 30);
        getContentPane().add(etiquetaAumento);

        botonActualizar = new JButton("Actualizar");
        botonActualizar.setBounds(50, 330, 150, 30);
        botonActualizar.addActionListener(this);
        getContentPane().add(botonActualizar);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(210, 330, 150, 30);
        botonEliminar.addActionListener(this);
        getContentPane().add(botonEliminar);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    private void consultarPersona() {
        PersonaDTO persona = coordinador.consultarPersona(campoDocumento.getText());
        if (persona != null) {
            campoNombre.setText(persona.getNombre());
            campoEdad.setText(persona.getEdad() + "");
            campoSueldo.setText(persona.getSueldo() + "");
            campoAntiguedad.setText(persona.getAntiguedad() + "");
            etiquetaSueldoNuevo.setText(persona.getSueldoNuevo() + "");
            etiquetaAumento.setText(persona.getAumento() + "");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la persona",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarPersona() {
        PersonaDTO persona = coordinador.consultarPersona(campoDocumento.getText());
        if (persona != null) {
            persona.setNombre(campoNombre.getText());
            persona.setEdad(Integer.parseInt(campoEdad.getText()));
            persona.setSueldo(Double.parseDouble(campoSueldo.getText()));
            persona.setAntiguedad(Integer.parseInt(campoAntiguedad.getText()));
            coordinador.calcularSueldoNuevo(persona);
            String respuesta = coordinador.actualizarPersona(persona);
            if (respuesta.equals("ok")) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente",
                        "Actualizado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void eliminarPersona() {
        String respuesta = coordinador.eliminarPersona(campoDocumento.getText());
        if (respuesta.equals("ok")) {
            JOptionPane.showMessageDialog(null, "Eliminado exitosamente",
                    "Eliminado", JOptionPane.WARNING_MESSAGE);
            campoNombre.setText("");
            campoEdad.setText("");
            campoSueldo.setText("");
            campoAntiguedad.setText("");
            etiquetaSueldoNuevo.setText("");
            etiquetaAumento.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonConsultar) {
            consultarPersona();
        } else if (evento.getSource() == botonActualizar) {
            actualizarPersona();
        } else if (evento.getSource() == botonEliminar) {
            eliminarPersona();
        }
    }
}