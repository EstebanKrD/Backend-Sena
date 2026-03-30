package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controlador.Coordinador;
import modelo.dto.PersonaDTO;

public class VentanaRegistro extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonRegistrar;
    private JTextField campoNombre;
    private JLabel etiquetaResultado;
    private JLabel etiquetaDocumento;
    private JTextField campoDocumento;
    private JLabel etiquetaEdad;
    private JTextField campoEdad;
    private JLabel etiquetaSueldo;
    private JTextField campoSueldo;
    private JLabel etiquetaAntiguedad;
    private JTextField campoAntiguedad;

    public VentanaRegistro(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Ventana Registro Persona");
        setSize(514, 408);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("REGISTRAR USUARIO");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiquetaTitulo.setBounds(0, 6, 394, 30);
        getContentPane().add(etiquetaTitulo);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(50, 50, 100, 30);
        getContentPane().add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(180, 51, 200, 30);
        getContentPane().add(campoNombre);

        etiquetaDocumento = new JLabel("Documento:");
        etiquetaDocumento.setBounds(50, 90, 100, 30);
        getContentPane().add(etiquetaDocumento);

        campoDocumento = new JTextField();
        campoDocumento.setBounds(180, 90, 200, 30);
        getContentPane().add(campoDocumento);

        etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setBounds(50, 130, 100, 30);
        getContentPane().add(etiquetaEdad);

        campoEdad = new JTextField();
        campoEdad.setBounds(180, 131, 200, 30);
        getContentPane().add(campoEdad);

        etiquetaSueldo = new JLabel("Sueldo:");
        etiquetaSueldo.setBounds(50, 170, 100, 30);
        getContentPane().add(etiquetaSueldo);

        campoSueldo = new JTextField();
        campoSueldo.setBounds(180, 171, 200, 30);
        getContentPane().add(campoSueldo);

        etiquetaAntiguedad = new JLabel("Años de antigüedad:");
        etiquetaAntiguedad.setBounds(25, 209, 145, 30);
        getContentPane().add(etiquetaAntiguedad);

        campoAntiguedad = new JTextField();
        campoAntiguedad.setBounds(180, 210, 200, 30);
        getContentPane().add(campoAntiguedad);

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(150, 255, 200, 30);
        botonRegistrar.addActionListener(this);
        getContentPane().add(botonRegistrar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(50, 295, 300, 30);
        getContentPane().add(etiquetaResultado);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void limpiarFormulario() {
        campoNombre.setText("");
        campoDocumento.setText("");
        campoEdad.setText("");
        campoSueldo.setText("");
        campoAntiguedad.setText("");
        etiquetaResultado.setText("");
    }

    private void validarYRegistrar() {
        boolean nombreValido = coordinador.validarNombre(campoNombre.getText());
        boolean documentoValido = coordinador.validarNumero(campoDocumento.getText());
        boolean edadValida = coordinador.validarNumero(campoEdad.getText());
        boolean sueldoValido = coordinador.validarNumero(campoSueldo.getText());
        boolean antiguedadValida = coordinador.validarNumero(campoAntiguedad.getText());

        verificarCampo(nombreValido, campoNombre);
        verificarCampo(documentoValido, campoDocumento);
        verificarCampo(edadValida, campoEdad);
        verificarCampo(sueldoValido, campoSueldo);
        verificarCampo(antiguedadValida, campoAntiguedad);

        if (nombreValido && documentoValido && edadValida && sueldoValido && antiguedadValida) {
            PersonaDTO miPersona = new PersonaDTO();
            miPersona.setDocumento(campoDocumento.getText());
            miPersona.setNombre(campoNombre.getText());
            miPersona.setEdad(Integer.parseInt(campoEdad.getText()));
            miPersona.setSueldo(Double.parseDouble(campoSueldo.getText()));
            miPersona.setAntiguedad(Integer.parseInt(campoAntiguedad.getText()));

            // Calcula el nuevo sueldo
            coordinador.calcularSueldoNuevo(miPersona);

            // Registra en la base de datos
            String respuesta = coordinador.registrarPersona(miPersona);

            if (respuesta.equals("si")) {
                etiquetaResultado.setForeground(Color.blue);
                etiquetaResultado.setText("Registro exitoso. Nuevo sueldo: " + miPersona.getSueldoNuevo());
            } else {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error: El documento ya existe");
            }
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Valide los datos ingresados");
        }
    }

    private void verificarCampo(boolean esValido, JTextField campo) {
        if (esValido) {
            campo.setBackground(Color.white);
        } else {
            campo.setBackground(Color.red);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonRegistrar) {
            validarYRegistrar();
        }
    }
}