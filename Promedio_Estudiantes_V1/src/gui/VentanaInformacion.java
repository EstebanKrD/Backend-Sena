package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class VentanaInformacion extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JButton btnOk;

    public VentanaInformacion(VentanaConsultar v, boolean b) {
        super(v, b);

        setBounds(100, 100, 400, 300);
        setTitle("Información");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Información de la Aplicación");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(50, 20, 300, 30);
        contentPane.add(lblTitulo);

        JLabel lblCreador = new JLabel("Creado por:");
        lblCreador.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCreador.setBounds(50, 80, 100, 25);
        contentPane.add(lblCreador);

        JLabel lblNombre = new JLabel("Juan Esteban Cardona Batero");
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNombre.setBounds(50, 110, 300, 25);
        contentPane.add(lblNombre);

        JLabel lblPrograma = new JLabel("Programa: ADSO - SENA");
        lblPrograma.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblPrograma.setBounds(50, 145, 300, 25);
        contentPane.add(lblPrograma);

        JLabel lblAño = new JLabel("Año: 2025");
        lblAño.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblAño.setBounds(50, 175, 300, 25);
        contentPane.add(lblAño);

        btnOk = new JButton("OK");
        btnOk.setBounds(150, 220, 100, 30);
        btnOk.addActionListener(this);
        contentPane.add(btnOk);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            dispose();
        }
    }
}