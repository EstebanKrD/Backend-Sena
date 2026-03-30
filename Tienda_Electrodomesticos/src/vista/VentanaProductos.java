package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import controlador.Coordinador;
import modelo.dto.ProductoDTO;

public class VentanaProductos extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonRegistrar;
    private JButton botonConsultar;
    private JButton botonActualizar;
    private JButton botonEliminar;
    private JButton botonListar;
    private JButton botonLimpiar;
    private JTextField campoNombre;
    private JTextField campoValorUnitario;
    private JTextField campoCantidad;
    private JTextField campoBuscarId;
    private JLabel etiquetaId;
    private JTable tablaProductos;
    private DefaultTableModel modeloTabla;
    private JLabel etiquetaResultado;

    public VentanaProductos(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Gestión de Productos");
        setSize(750, 450);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("GESTIÓN DE PRODUCTOS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        etiquetaTitulo.setBounds(0, 10, 744, 30);
        getContentPane().add(etiquetaTitulo);

        // ID solo se muestra, no se ingresa
        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(20, 55, 80, 25);
        getContentPane().add(lblId);
        etiquetaId = new JLabel("");
        etiquetaId.setBounds(100, 55, 150, 25);
        getContentPane().add(etiquetaId);

        // Campo para buscar por ID
        JLabel lblBuscar = new JLabel("Buscar ID:");
        lblBuscar.setBounds(20, 90, 80, 25);
        getContentPane().add(lblBuscar);
        campoBuscarId = new JTextField();
        campoBuscarId.setBounds(100, 90, 150, 25);
        getContentPane().add(campoBuscarId);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 125, 80, 25);
        getContentPane().add(lblNombre);
        campoNombre = new JTextField();
        campoNombre.setBounds(100, 125, 150, 25);
        getContentPane().add(campoNombre);

        JLabel lblValor = new JLabel("Valor Unit:");
        lblValor.setBounds(20, 160, 80, 25);
        getContentPane().add(lblValor);
        campoValorUnitario = new JTextField();
        campoValorUnitario.setBounds(100, 160, 150, 25);
        getContentPane().add(campoValorUnitario);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 195, 80, 25);
        getContentPane().add(lblCantidad);
        campoCantidad = new JTextField();
        campoCantidad.setBounds(100, 195, 150, 25);
        getContentPane().add(campoCantidad);

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(20, 235, 100, 30);
        botonRegistrar.addActionListener(this);
        getContentPane().add(botonRegistrar);

        botonConsultar = new JButton("Consultar");
        botonConsultar.setBounds(130, 235, 100, 30);
        botonConsultar.addActionListener(this);
        getContentPane().add(botonConsultar);

        botonActualizar = new JButton("Actualizar");
        botonActualizar.setBounds(20, 275, 100, 30);
        botonActualizar.addActionListener(this);
        getContentPane().add(botonActualizar);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(130, 275, 100, 30);
        botonEliminar.addActionListener(this);
        getContentPane().add(botonEliminar);

        botonListar = new JButton("Listar");
        botonListar.setBounds(20, 315, 100, 30);
        botonListar.addActionListener(this);
        getContentPane().add(botonListar);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(130, 315, 100, 30);
        botonLimpiar.addActionListener(this);
        getContentPane().add(botonLimpiar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 360, 400, 25);
        getContentPane().add(etiquetaResultado);

        String[] columnas = {"ID", "Nombre", "Valor Unitario", "Cantidad"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        scrollPane.setBounds(270, 50, 460, 340);
        getContentPane().add(scrollPane);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    private void registrarProducto() {
        boolean nombreValido = coordinador.validarNombre(campoNombre.getText());
        boolean valorValido = coordinador.validarNumero(campoValorUnitario.getText());
        boolean cantidadValida = coordinador.validarNumero(campoCantidad.getText());

        if (nombreValido && valorValido && cantidadValida) {
            ProductoDTO producto = new ProductoDTO();
            producto.setNombre(campoNombre.getText());
            producto.setValorUnitario(Double.parseDouble(campoValorUnitario.getText()));
            producto.setCantidad(Integer.parseInt(campoCantidad.getText()));

            String respuesta = coordinador.registrarProducto(producto);
            if (respuesta.equals("si")) {
                etiquetaResultado.setForeground(Color.blue);
                etiquetaResultado.setText("Producto registrado exitosamente");
                listarProductos();
            } else {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error: No se pudo registrar el producto");
            }
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Valide los datos ingresados");
        }
    }

    private void consultarProducto() {
        ProductoDTO producto = coordinador.consultarProductoPorId(
            Integer.parseInt(campoBuscarId.getText()));
        if (producto != null) {
            etiquetaId.setText(producto.getId() + "");
            campoNombre.setText(producto.getNombre());
            campoValorUnitario.setText(producto.getValorUnitario() + "");
            campoCantidad.setText(producto.getCantidad() + "");
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Producto encontrado");
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Producto no encontrado");
        }
    }

    private void actualizarProducto() {
        ProductoDTO producto = new ProductoDTO();
        producto.setId(Integer.parseInt(etiquetaId.getText()));
        producto.setNombre(campoNombre.getText());
        producto.setValorUnitario(Double.parseDouble(campoValorUnitario.getText()));
        producto.setCantidad(Integer.parseInt(campoCantidad.getText()));

        String respuesta = coordinador.actualizarProducto(producto);
        if (respuesta.equals("ok")) {
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Producto actualizado exitosamente");
            listarProductos();
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Error al actualizar");
        }
    }

    private void eliminarProducto() {
        String respuesta = coordinador.eliminarProducto(
            Integer.parseInt(etiquetaId.getText()));
        if (respuesta.equals("ok")) {
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Producto eliminado exitosamente");
            limpiarFormulario();
            listarProductos();
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Error al eliminar");
        }
    }

    private void listarProductos() {
        modeloTabla.setRowCount(0);
        ArrayList<ProductoDTO> listaProductos = coordinador.consultarListaProductos();
        for (ProductoDTO producto : listaProductos) {
            Object[] fila = {
                producto.getId(),
                producto.getNombre(),
                producto.getValorUnitario(),
                producto.getCantidad()
            };
            modeloTabla.addRow(fila);
        }
    }

    private void limpiarFormulario() {
        etiquetaId.setText("");
        campoBuscarId.setText("");
        campoNombre.setText("");
        campoValorUnitario.setText("");
        campoCantidad.setText("");
        etiquetaResultado.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonRegistrar) {
            registrarProducto();
        } else if (evento.getSource() == botonConsultar) {
            consultarProducto();
        } else if (evento.getSource() == botonActualizar) {
            actualizarProducto();
        } else if (evento.getSource() == botonEliminar) {
            eliminarProducto();
        } else if (evento.getSource() == botonListar) {
            listarProductos();
        } else if (evento.getSource() == botonLimpiar) {
            limpiarFormulario();
        }
    }
}