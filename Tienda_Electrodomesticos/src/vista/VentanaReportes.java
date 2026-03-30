package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import controlador.Coordinador;
import modelo.dto.VentasBO;

public class VentanaReportes extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Coordinador miCoordinador;
    private JTable tablaVentas;
    private DefaultTableModel modeloTabla;
    private JButton botonCargar;
    private JButton botonLimpiar;

    public VentanaReportes(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setTitle("Reportes de Ventas");
        setBounds(100, 100, 750, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("REPORTE DE VENTAS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        etiquetaTitulo.setBounds(0, 10, 744, 30);
        contentPane.add(etiquetaTitulo);

        botonCargar = new JButton("Cargar Ventas");
        botonCargar.setBounds(20, 50, 150, 30);
        botonCargar.addActionListener(this);
        contentPane.add(botonCargar);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(180, 50, 100, 30);
        botonLimpiar.addActionListener(this);
        contentPane.add(botonLimpiar);

        // Tabla de ventas
        String[] columnas = {"ID Venta", "ID Usuario", "ID Producto",
                             "Cantidad", "Descuento", "Total"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaVentas = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaVentas);
        scrollPane.setBounds(20, 95, 700, 300);
        contentPane.add(scrollPane);
    }

    public void cargarVentas() {
        modeloTabla.setRowCount(0);
        ArrayList<VentasBO> listaVentas = miCoordinador.consultarListaVentas();
        if (listaVentas.size() > 0) {
            for (VentasBO venta : listaVentas) {
                Object[] fila = {
                    venta.getId(),
                    venta.getIdUsuario(),
                    venta.getIdProducto(),
                    venta.getCantidadComprada(),
                    venta.getDescuento(),
                    venta.getTotal()
                };
                modeloTabla.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas",
                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonCargar) {
            cargarVentas();
        } else if (evento.getSource() == botonLimpiar) {
            modeloTabla.setRowCount(0);
        }
    }
}