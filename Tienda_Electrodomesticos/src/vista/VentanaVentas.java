package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import controlador.Coordinador;
import modelo.dto.UsuarioDTO;
import modelo.dto.ProductoDTO;
import modelo.dto.VentasBO;

public class VentanaVentas extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonRealizarCompra;
    private JButton botonMostrarDatos;
    private JButton botonLimpiar;
    private JTextField campoCedulaUsuario;
    private JTextField campoCantidad;
    private JComboBox<String> comboProductos;
    private ArrayList<ProductoDTO> listaProductos;
    private JLabel etiquetaNombreUsuario;
    private JLabel etiquetaTipoUsuario;
    private JLabel etiquetaNombreProducto;
    private JLabel etiquetaValorUnitario;
    private JLabel etiquetaTotalCompra;
    private JLabel etiquetaDescuento;
    private JLabel etiquetaTotalPagar;
    private JLabel etiquetaResultado;

    public VentanaVentas(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Realizar Venta");
        setSize(500, 560);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("REALIZAR VENTA");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        etiquetaTitulo.setBounds(0, 10, 494, 30);
        getContentPane().add(etiquetaTitulo);

        JLabel lblCedula = new JLabel("Cédula Usuario:");
        lblCedula.setBounds(20, 55, 120, 25);
        getContentPane().add(lblCedula);
        campoCedulaUsuario = new JTextField();
        campoCedulaUsuario.setBounds(145, 55, 150, 25);
        getContentPane().add(campoCedulaUsuario);

        JLabel lblProducto = new JLabel("Producto:");
        lblProducto.setBounds(20, 90, 120, 25);
        getContentPane().add(lblProducto);
        comboProductos = new JComboBox<>();
        comboProductos.setBounds(145, 90, 300, 25);
        getContentPane().add(comboProductos);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 125, 120, 25);
        getContentPane().add(lblCantidad);
        campoCantidad = new JTextField();
        campoCantidad.setBounds(145, 125, 150, 25);
        getContentPane().add(campoCantidad);

        botonRealizarCompra = new JButton("Realizar Compra");
        botonRealizarCompra.setBounds(20, 165, 150, 30);
        botonRealizarCompra.addActionListener(this);
        getContentPane().add(botonRealizarCompra);

        botonMostrarDatos = new JButton("Mostrar Datos");
        botonMostrarDatos.setBounds(180, 165, 150, 30);
        botonMostrarDatos.addActionListener(this);
        getContentPane().add(botonMostrarDatos);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(340, 165, 100, 30);
        botonLimpiar.addActionListener(this);
        getContentPane().add(botonLimpiar);

        JSeparator separador = new JSeparator();
        separador.setBounds(20, 210, 450, 10);
        getContentPane().add(separador);

        JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
        lblNombreUsuario.setBounds(20, 225, 130, 25);
        getContentPane().add(lblNombreUsuario);
        etiquetaNombreUsuario = new JLabel("");
        etiquetaNombreUsuario.setBounds(155, 225, 200, 25);
        getContentPane().add(etiquetaNombreUsuario);

        JLabel lblTipo = new JLabel("Tipo Usuario:");
        lblTipo.setBounds(20, 260, 130, 25);
        getContentPane().add(lblTipo);
        etiquetaTipoUsuario = new JLabel("");
        etiquetaTipoUsuario.setBounds(155, 260, 200, 25);
        getContentPane().add(etiquetaTipoUsuario);

        JLabel lblNombreProducto = new JLabel("Nombre Producto:");
        lblNombreProducto.setBounds(20, 295, 130, 25);
        getContentPane().add(lblNombreProducto);
        etiquetaNombreProducto = new JLabel("");
        etiquetaNombreProducto.setBounds(155, 295, 200, 25);
        getContentPane().add(etiquetaNombreProducto);

        JLabel lblValorUnitario = new JLabel("Valor Unitario:");
        lblValorUnitario.setBounds(20, 330, 130, 25);
        getContentPane().add(lblValorUnitario);
        etiquetaValorUnitario = new JLabel("");
        etiquetaValorUnitario.setBounds(155, 330, 200, 25);
        getContentPane().add(etiquetaValorUnitario);

        JLabel lblTotalCompra = new JLabel("Total Compra:");
        lblTotalCompra.setBounds(20, 365, 130, 25);
        getContentPane().add(lblTotalCompra);
        etiquetaTotalCompra = new JLabel("");
        etiquetaTotalCompra.setBounds(155, 365, 200, 25);
        getContentPane().add(etiquetaTotalCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(20, 400, 130, 25);
        getContentPane().add(lblDescuento);
        etiquetaDescuento = new JLabel("");
        etiquetaDescuento.setBounds(155, 400, 200, 25);
        getContentPane().add(etiquetaDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblTotalPagar.setBounds(20, 435, 130, 25);
        getContentPane().add(lblTotalPagar);
        etiquetaTotalPagar = new JLabel("");
        etiquetaTotalPagar.setFont(new Font("Tahoma", Font.BOLD, 13));
        etiquetaTotalPagar.setForeground(Color.blue);
        etiquetaTotalPagar.setBounds(155, 435, 200, 25);
        getContentPane().add(etiquetaTotalPagar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 475, 450, 25);
        getContentPane().add(etiquetaResultado);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void cargarProductos() {
        comboProductos.removeAllItems();
        listaProductos = coordinador.consultarListaProductos();
        for (ProductoDTO producto : listaProductos) {
            comboProductos.addItem(producto.getId() + " - " + 
                producto.getNombre() + " ($" + producto.getValorUnitario() + ")");
        }
    }

    private ProductoDTO obtenerProductoSeleccionado() {
        int indice = comboProductos.getSelectedIndex();
        if (indice >= 0 && listaProductos != null) {
            return listaProductos.get(indice);
        }
        return null;
    }

    private void realizarCompra() {
        try {
            String cedula = campoCedulaUsuario.getText();
            int cantidad = Integer.parseInt(campoCantidad.getText());

            UsuarioDTO usuario = coordinador.consultarUsuarioPorCedula(cedula);
            ProductoDTO producto = obtenerProductoSeleccionado();

            if (usuario == null) {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error: Usuario no encontrado");
                return;
            }

            if (producto == null) {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error: Seleccione un producto");
                return;
            }

            // Calcular total
            double totalCompra = coordinador.calcularTotal(
                producto.getValorUnitario(), cantidad);

            // Asignar descuento automáticamente según cantidad
            String tipoDescuento = coordinador.obtenerTipoDescuento(cantidad);
            double descuento = coordinador.calcularDescuento(cantidad, totalCompra);
            double totalPagar = totalCompra - descuento;

            // Mensaje de descuento
            String mensajeDescuento = "";
            if (tipoDescuento.equals("Sin tipo")) {
                mensajeDescuento = "No se le realiza descuento";
            } else {
                mensajeDescuento = "Tipo " + tipoDescuento + ": $" + descuento;
            }

            etiquetaNombreUsuario.setText(usuario.getNombre() + " " +
                usuario.getApellido());
            etiquetaTipoUsuario.setText(tipoDescuento);
            etiquetaNombreProducto.setText(producto.getNombre());
            etiquetaValorUnitario.setText("$" + producto.getValorUnitario());
            etiquetaTotalCompra.setText(cantidad + " x $" +
                producto.getValorUnitario() + " = $" + totalCompra);
            etiquetaDescuento.setText(mensajeDescuento);
            etiquetaTotalPagar.setText("$" + totalPagar);

            VentasBO venta = new VentasBO();
            venta.setId(0);
            venta.setIdUsuario(usuario.getId());
            venta.setIdProducto(producto.getId());
            venta.setCantidadComprada(cantidad);
            venta.setTotal(totalPagar);
            venta.setDescuento(descuento);

            String respuesta = coordinador.registrarVenta(venta);
            if (respuesta.equals("si")) {
                etiquetaResultado.setForeground(Color.blue);
                etiquetaResultado.setText("Venta registrada. Total: $" + 
                    totalPagar + " | Descuento tipo " + tipoDescuento);
            } else {
                etiquetaResultado.setForeground(Color.red);
                etiquetaResultado.setText("Error al registrar la venta");
            }

        } catch (Exception error) {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Error: Verifique los datos ingresados");
        }
    }

    private void mostrarDatosUsuario() {
        UsuarioDTO usuario = coordinador.consultarUsuarioPorCedula(
            campoCedulaUsuario.getText());
        if (usuario != null) {
            etiquetaNombreUsuario.setText(usuario.getNombre() + " " +
                usuario.getApellido());
            etiquetaTipoUsuario.setText(usuario.getTipo() != null ?
                usuario.getTipo() : "Sin tipo");
            etiquetaResultado.setForeground(Color.blue);
            etiquetaResultado.setText("Usuario: " + usuario.getNombre() +
                " | Cédula: " + usuario.getCedula() +
                " | Tipo: " + usuario.getTipo());
        } else {
            etiquetaResultado.setForeground(Color.red);
            etiquetaResultado.setText("Usuario no encontrado");
        }
    }

    private void limpiarFormulario() {
        campoCedulaUsuario.setText("");
        campoCantidad.setText("");
        etiquetaNombreUsuario.setText("");
        etiquetaTipoUsuario.setText("");
        etiquetaNombreProducto.setText("");
        etiquetaValorUnitario.setText("");
        etiquetaTotalCompra.setText("");
        etiquetaDescuento.setText("");
        etiquetaTotalPagar.setText("");
        etiquetaResultado.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonRealizarCompra) {
            realizarCompra();
        } else if (evento.getSource() == botonMostrarDatos) {
            mostrarDatosUsuario();
        } else if (evento.getSource() == botonLimpiar) {
            limpiarFormulario();
        }
    }
}
