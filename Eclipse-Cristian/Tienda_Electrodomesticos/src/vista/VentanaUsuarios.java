package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import controlador.Coordinador;
import modelo.dto.UsuarioDTO;

public class VentanaUsuarios extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonRegistrar;
    private JButton botonConsultar;
    private JButton botonActualizar;
    private JButton botonEliminar;
    private JButton botonListar;
    private JButton botonLimpiar;
    private JTextField campoCedula;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoTelefono;
    private JTextField campoTipo;
    private JLabel etiquetaId;
    private JTable tablaUsuarios;
    private DefaultTableModel modeloTabla;
    private JLabel etiquetaResultado;

    public VentanaUsuarios(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Gestión de Usuarios");
        setSize(750, 550);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("GESTIÓN DE USUARIOS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        etiquetaTitulo.setBounds(0, 10, 744, 30);
        getContentPane().add(etiquetaTitulo);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(20, 55, 80, 25);
        getContentPane().add(lblId);
        etiquetaId = new JLabel("");
        etiquetaId.setBounds(100, 55, 150, 25);
        getContentPane().add(etiquetaId);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setBounds(20, 90, 80, 25);
        getContentPane().add(lblCedula);
        campoCedula = new JTextField();
        campoCedula.setBounds(100, 90, 150, 25);
        getContentPane().add(campoCedula);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 125, 80, 25);
        getContentPane().add(lblNombre);
        campoNombre = new JTextField();
        campoNombre.setBounds(100, 125, 150, 25);
        getContentPane().add(campoNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(20, 160, 80, 25);
        getContentPane().add(lblApellido);
        campoApellido = new JTextField();
        campoApellido.setBounds(100, 160, 150, 25);
        getContentPane().add(campoApellido);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 195, 80, 25);
        getContentPane().add(lblEdad);
        campoEdad = new JTextField();
        campoEdad.setBounds(100, 195, 150, 25);
        getContentPane().add(campoEdad);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 230, 80, 25);
        getContentPane().add(lblTelefono);
        campoTelefono = new JTextField();
        campoTelefono.setBounds(100, 230, 150, 25);
        getContentPane().add(campoTelefono);

        JLabel lblTipo = new JLabel("Tipo Afiliación(A/B/C):");
        lblTipo.setBounds(20, 265, 131, 25);
        getContentPane().add(lblTipo);
        campoTipo = new JTextField();
        campoTipo.setBounds(151, 265, 109, 25);
        getContentPane().add(campoTipo);

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(20, 305, 100, 30);
        botonRegistrar.addActionListener(this);
        getContentPane().add(botonRegistrar);

        botonConsultar = new JButton("Consultar");
        botonConsultar.setBounds(130, 305, 100, 30);
        botonConsultar.addActionListener(this);
        getContentPane().add(botonConsultar);

        botonActualizar = new JButton("Actualizar");
        botonActualizar.setBounds(20, 345, 100, 30);
        botonActualizar.addActionListener(this);
        getContentPane().add(botonActualizar);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(130, 345, 100, 30);
        botonEliminar.addActionListener(this);
        getContentPane().add(botonEliminar);

        botonListar = new JButton("Listar");
        botonListar.setBounds(20, 385, 100, 30);
        botonListar.addActionListener(this);
        getContentPane().add(botonListar);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(130, 385, 100, 30);
        botonLimpiar.addActionListener(this);
        getContentPane().add(botonLimpiar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 425, 400, 25);
        getContentPane().add(etiquetaResultado);

        String[] columnas = {"ID", "Cédula", "Nombre", "Apellido", "Edad", "Teléfono", "Tipo"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaUsuarios = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        scrollPane.setBounds(270, 50, 460, 400);
        getContentPane().add(scrollPane);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    private void registrarUsuario() {
        boolean cedulaValida = coordinador.validarNumero(campoCedula.getText());
        boolean nombreValido = coordinador.validarNombre(campoNombre.getText());
        boolean apellidoValido = coordinador.validarNombre(campoApellido.getText());
        boolean edadValida = coordinador.validarNumero(campoEdad.getText());
        boolean telefonoValido = coordinador.validarNumero(campoTelefono.getText());

        if (cedulaValida && nombreValido && apellidoValido && edadValida && telefonoValido) {
            UsuarioDTO usuario = new UsuarioDTO();
            usuario.setCedula(campoCedula.getText());
            usuario.setNombre(campoNombre.getText());
            usuario.setApellido(campoApellido.getText());
            usuario.setEdad(Integer.parseInt(campoEdad.getText()));
            usuario.setTelefono(campoTelefono.getText());
            usuario.setTipo(campoTipo.getText().toUpperCase());

            String respuesta = coordinador.registrarUsuario(usuario);
            if (respuesta.equals("si")) {
                etiquetaResultado.setForeground(Color.blue);
                etiquetaResultado.setText("Usuario registrado exitosamente");
                listarUsuarios();
            } else {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error: No se pudo registrar el usuario");
            }
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Valide los datos ingresados");
        }
    }

    private void consultarUsuario() {
        UsuarioDTO usuario = coordinador.consultarUsuarioPorCedula(campoCedula.getText());
        if (usuario != null) {
            etiquetaId.setText(usuario.getId() + "");
            campoNombre.setText(usuario.getNombre());
            campoApellido.setText(usuario.getApellido());
            campoEdad.setText(usuario.getEdad() + "");
            campoTelefono.setText(usuario.getTelefono());
            campoTipo.setText(usuario.getTipo());
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Usuario encontrado");
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Usuario no encontrado");
        }
    }

    private void actualizarUsuario() {
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setId(Integer.parseInt(etiquetaId.getText()));
        usuario.setCedula(campoCedula.getText());
        usuario.setNombre(campoNombre.getText());
        usuario.setApellido(campoApellido.getText());
        usuario.setEdad(Integer.parseInt(campoEdad.getText()));
        usuario.setTelefono(campoTelefono.getText());
        usuario.setTipo(campoTipo.getText().toUpperCase());

        String respuesta = coordinador.actualizarUsuario(usuario);
        if (respuesta.equals("ok")) {
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Usuario actualizado exitosamente");
            listarUsuarios();
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Error al actualizar");
        }
    }

    private void eliminarUsuario() {
        String respuesta = coordinador.eliminarUsuario(
            Integer.parseInt(etiquetaId.getText()));
        if (respuesta.equals("ok")) {
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Usuario eliminado exitosamente");
            limpiarFormulario();
            listarUsuarios();
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Error al eliminar");
        }
    }

    private void listarUsuarios() {
        modeloTabla.setRowCount(0);
        ArrayList<UsuarioDTO> listaUsuarios = coordinador.consultarListaUsuarios();
        for (UsuarioDTO usuario : listaUsuarios) {
            Object[] fila = {
                usuario.getId(),
                usuario.getCedula(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEdad(),
                usuario.getTelefono(),
                usuario.getTipo()
            };
            modeloTabla.addRow(fila);
        }
    }

    private void limpiarFormulario() {
        etiquetaId.setText("");
        campoCedula.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoEdad.setText("");
        campoTelefono.setText("");
        campoTipo.setText("");
        etiquetaResultado.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonRegistrar) {
            registrarUsuario();
        } else if (evento.getSource() == botonConsultar) {
            consultarUsuario();
        } else if (evento.getSource() == botonActualizar) {
            actualizarUsuario();
        } else if (evento.getSource() == botonEliminar) {
            eliminarUsuario();
        } else if (evento.getSource() == botonListar) {
            listarUsuarios();
        } else if (evento.getSource() == botonLimpiar) {
            limpiarFormulario();
        }
    }
}
