package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import logica.ModelData;

public class VentanaConsultar extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnPromedio;
    private JButton btnLista;
    private JButton btnInformacion;

    ModelData modelData = new ModelData();

    public VentanaConsultar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 566, 353);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBienvenido = new JLabel("Bienvenido Usuario");
        lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
        lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBienvenido.setBounds(66, 10, 430, 40);
        contentPane.add(lblBienvenido);

        btnPromedio = new JButton("Consultar el promedio");
        btnPromedio.setBounds(66, 105, 160, 46);
        btnPromedio.addActionListener(this);
        contentPane.add(btnPromedio);

        btnLista = new JButton("Mostrar la lista");
        btnLista.setBounds(330, 105, 160, 46);
        btnLista.addActionListener(this);
        contentPane.add(btnLista);

        btnInformacion = new JButton("Información");
        btnInformacion.setBounds(196, 194, 160, 46);
        btnInformacion.addActionListener(this);
        contentPane.add(btnInformacion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnPromedio) {
            VentanaPromedio vp = new VentanaPromedio(this, true, modelData);
            vp.setVisible(true);
        }

        else if (e.getSource() == btnLista) {
            VentanaMostrarLista vl = new VentanaMostrarLista(this, true, modelData);
            vl.setVisible(true);
        }

        else if (e.getSource() == btnInformacion) {
            VentanaInformacion vi = new VentanaInformacion(this, true);
            vi.setVisible(true);
        }
    }
}