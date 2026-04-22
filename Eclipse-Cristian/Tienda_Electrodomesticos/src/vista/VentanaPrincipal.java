package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.Coordinador;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Coordinador miCoordinador;
    private JButton botonUsuarios;
    private JButton botonProductos;
    private JButton botonVentas;
    private JButton botonReportes;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Tienda Don Aparato");
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("TIENDA DON APARATO");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        etiquetaTitulo.setBounds(33, 20, 330, 30);
        contentPane.add(etiquetaTitulo);

        botonUsuarios = new JButton("Gestionar Usuarios");
        botonUsuarios.setBounds(80, 80, 230, 40);
        botonUsuarios.addActionListener(this);
        contentPane.add(botonUsuarios);

        botonProductos = new JButton("Gestionar Productos");
        botonProductos.setBounds(80, 135, 230, 40);
        botonProductos.addActionListener(this);
        contentPane.add(botonProductos);

        botonVentas = new JButton("Realizar Venta");
        botonVentas.setBounds(80, 190, 230, 40);
        botonVentas.addActionListener(this);
        contentPane.add(botonVentas);

        botonReportes = new JButton("Ver Reportes");
        botonReportes.setBounds(80, 245, 230, 40);
        botonReportes.addActionListener(this);
        contentPane.add(botonReportes);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonUsuarios) {
            miCoordinador.mostrarVentanaUsuarios();
        } else if (evento.getSource() == botonProductos) {
            miCoordinador.mostrarVentanaProductos();
        } else if (evento.getSource() == botonVentas) {
            miCoordinador.mostrarVentanaVentas();
        } else if (evento.getSource() == botonReportes) {
            miCoordinador.mostrarVentanaReportes();
        }
    }
}
