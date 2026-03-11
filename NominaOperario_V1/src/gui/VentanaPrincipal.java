package gui;

import java.awt.EventQueue;
import logica.Operario;
import logica.Procesos;
import capadatos.ModelDatos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private Procesos procesos = new Procesos();
	private ModelDatos modeloDatos = new ModelDatos();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textDocument;
	private JTextField textAntiguedad;
	private JTextField textSueldoActual;
	private JButton btnVerRegistros;
	private JButton btnConsultar;
	private JLabel lblNewSalario;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitel = new JLabel("Incremento Salarial");
		lblTitel.setBounds(152, 10, 367, 42);
		lblTitel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitel);

		JLabel lblNewLabel = new JLabel("Nombre Del Colaborador:");
		lblNewLabel.setBounds(10, 66, 167, 48);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(174, 76, 207, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblDocument = new JLabel("Número del Documento:");
		lblDocument.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocument.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDocument.setBounds(20, 116, 157, 31);
		contentPane.add(lblDocument);

		textDocument = new JTextField();
		textDocument.setBounds(174, 117, 207, 31);
		contentPane.add(textDocument);
		textDocument.setColumns(10);

		JLabel lblAntiguedad = new JLabel("Ingrese su antigüedad:");
		lblAntiguedad.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAntiguedad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAntiguedad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAntiguedad.setBounds(16, 157, 161, 36);
		contentPane.add(lblAntiguedad);

		textAntiguedad = new JTextField();
		textAntiguedad.setBounds(174, 161, 210, 32);
		contentPane.add(textAntiguedad);
		textAntiguedad.setColumns(10);

		JLabel lblSueldoActual = new JLabel("Ingrese su sueldo actual:");
		lblSueldoActual.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldoActual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSueldoActual.setBounds(10, 208, 157, 31);
		contentPane.add(lblSueldoActual);

		textSueldoActual = new JTextField();
		textSueldoActual.setColumns(10);
		textSueldoActual.setBounds(174, 209, 210, 32);
		contentPane.add(textSueldoActual);

		btnConsultar = new JButton("Consultar nuevo sueldo");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConsultar.setBounds(174, 266, 207, 42);
		btnConsultar.addActionListener(this);
		contentPane.add(btnConsultar);

		btnVerRegistros = new JButton("Ver Registros");
		btnVerRegistros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerRegistros.setBounds(416, 266, 207, 42);
		btnVerRegistros.addActionListener(this);
		contentPane.add(btnVerRegistros);

		JLabel lblNewLabel_1 = new JLabel("Su nuevo sueldo es de:");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(0, 326, 167, 48);
		contentPane.add(lblNewLabel_1);

		lblNewSalario = new JLabel("");
		lblNewSalario.setBounds(162, 336, 126, 31);
		contentPane.add(lblNewSalario);
	}

	private void consultarSueldo() {
		try {
			String nombre = textField.getText();
			String documento = textDocument.getText();
			int antiguedad = Integer.parseInt(textAntiguedad.getText());
			double sueldo = Double.parseDouble(textSueldoActual.getText());

			Operario operario = new Operario(documento, nombre, sueldo, antiguedad);
			procesos.calcularSueldoNuevo(operario);

			String resultado = modeloDatos.registrar(operario);

			if (resultado.equals("Si")) {
				lblNewSalario.setText(operario.getSueldoNuevo() + "");
				JOptionPane.showMessageDialog(this, "Operario registrado exitosamente");
			} else {
				JOptionPane.showMessageDialog(this, "El operario ya existe");
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "El documento, antigüedad y sueldo deben ser numéricos",
					"Error de formato", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConsultar) {
			consultarSueldo();
		} else if (e.getSource() == btnVerRegistros) {
			VentanaRigistroOperario ventanaRegistro = new VentanaRigistroOperario(modeloDatos.getMapaOperarios());
			ventanaRegistro.setVisible(true);
		}
	}
}