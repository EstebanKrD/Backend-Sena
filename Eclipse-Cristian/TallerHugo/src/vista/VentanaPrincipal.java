package vista;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import conexion.bd.ConexionBD;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;    // Nombre
	private JTextField textField_1;  // Apellido
	private JTextField textField_3;  // Numero de documento

	// ENUM - ComboBox
	private JComboBox<String> cmbGenero;
	private JComboBox<String> cmbNivelAcademico;
	private JComboBox<String> cmbEstadoCivil;

	// SET - CheckBox Idiomas (ya los tenias)
	private JCheckBox chckbxEspaniol;
	private JCheckBox chckbxIngles;
	private JCheckBox chckbxPortugues;
	private JCheckBox chckbxItaliano;
	private JCheckBox chckbxOther;

	// SET - CheckBox Habilidades
	private JCheckBox chkLiderazgo;
	private JCheckBox chkComunicacion;
	private JCheckBox chkProgramacion;
	private JCheckBox chkDiseno;
	private JCheckBox chkOtraHabilidad;

	// SET - CheckBox Intereses
	private JCheckBox chkDeportes;
	private JCheckBox chkMusica;
	private JCheckBox chkTecnologia;
	private JCheckBox chkArte;
	private JCheckBox chkViajes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bienvenidos a la app ");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitulo.setBounds(281, 10, 226, 48);
		contentPane.add(lblTitulo);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(10, 65, 114, 21);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(84, 67, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(226, 68, 89, 18);
		contentPane.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(291, 66, 114, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGenero.setBounds(437, 68, 70, 18);
		contentPane.add(lblGenero);
		
		// CAMBIO: JTextField -> JComboBox
		cmbGenero = new JComboBox<>(new String[]{"Masculino", "Femenino", "Otro"});
		cmbGenero.setBounds(500, 64, 96, 22);
		contentPane.add(cmbGenero);
		
		JLabel lblCedula = new JLabel("Numero de documento:");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCedula.setBounds(10, 127, 155, 21);
		contentPane.add(lblCedula);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 127, 134, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNivelAcademico = new JLabel("Nivel Academico:");
		lblNivelAcademico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNivelAcademico.setBounds(317, 127, 127, 21);
		contentPane.add(lblNivelAcademico);
		
		// CAMBIO: JTextField -> JComboBox
		cmbNivelAcademico = new JComboBox<>(new String[]{"Primaria", "Secundaria", "Tecnico", "Universidad", "Posgrado"});
		cmbNivelAcademico.setBounds(423, 127, 127, 21);
		contentPane.add(cmbNivelAcademico);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstadoCivil.setBounds(581, 127, 114, 21);
		contentPane.add(lblEstadoCivil);
		
		// CAMBIO: JTextField -> JComboBox
		cmbEstadoCivil = new JComboBox<>(new String[]{"Soltero", "Casado", "Divorciado", "Viudo"});
		cmbEstadoCivil.setBounds(660, 127, 117, 20);
		contentPane.add(cmbEstadoCivil);
		
		JLabel lblIdiomas = new JLabel("Idiomas que habla:");
		lblIdiomas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdiomas.setBounds(10, 175, 114, 21);
		contentPane.add(lblIdiomas);
		
		chckbxEspaniol = new JCheckBox("Español");
		chckbxEspaniol.setBounds(118, 176, 92, 20);
		contentPane.add(chckbxEspaniol);
		
		chckbxIngles = new JCheckBox("Ingles");
		chckbxIngles.setBounds(223, 176, 92, 20);
		contentPane.add(chckbxIngles);
		
		chckbxPortugues = new JCheckBox("Portugues");
		chckbxPortugues.setBounds(313, 176, 92, 20);
		contentPane.add(chckbxPortugues);
		
		chckbxItaliano = new JCheckBox("Italiano");
		chckbxItaliano.setBounds(423, 176, 92, 20);
		contentPane.add(chckbxItaliano);
		
		chckbxOther = new JCheckBox("Otro");
		chckbxOther.setBounds(521, 176, 92, 20);
		contentPane.add(chckbxOther);

		// CAMBIO: JTextField -> JCheckBox para Habilidades
		JLabel lblHabilidades = new JLabel("Habilidades:");
		lblHabilidades.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHabilidades.setBounds(10, 242, 81, 21);
		contentPane.add(lblHabilidades);
		
		chkLiderazgo = new JCheckBox("Liderazgo");
		chkLiderazgo.setBounds(100, 240, 100, 20);
		contentPane.add(chkLiderazgo);
		
		chkComunicacion = new JCheckBox("Comunicacion");
		chkComunicacion.setBounds(205, 240, 120, 20);
		contentPane.add(chkComunicacion);
		
		chkProgramacion = new JCheckBox("Programacion");
		chkProgramacion.setBounds(330, 240, 120, 20);
		contentPane.add(chkProgramacion);
		
		chkDiseno = new JCheckBox("Diseño");
		chkDiseno.setBounds(455, 240, 80, 20);
		contentPane.add(chkDiseno);
		
		chkOtraHabilidad = new JCheckBox("Otro");
		chkOtraHabilidad.setBounds(540, 240, 70, 20);
		contentPane.add(chkOtraHabilidad);

		// CAMBIO: JTextField -> JCheckBox para Intereses
		JLabel lblIntereses = new JLabel("Intereses:");
		lblIntereses.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntereses.setBounds(10, 280, 70, 21);
		contentPane.add(lblIntereses);
		
		chkDeportes = new JCheckBox("Deportes");
		chkDeportes.setBounds(100, 278, 90, 20);
		contentPane.add(chkDeportes);
		
		chkMusica = new JCheckBox("Musica");
		chkMusica.setBounds(195, 278, 80, 20);
		contentPane.add(chkMusica);
		
		chkTecnologia = new JCheckBox("Tecnologia");
		chkTecnologia.setBounds(280, 278, 100, 20);
		contentPane.add(chkTecnologia);
		
		chkArte = new JCheckBox("Arte");
		chkArte.setBounds(385, 278, 70, 20);
		contentPane.add(chkArte);
		
		chkViajes = new JCheckBox("Viajes");
		chkViajes.setBounds(460, 278, 80, 20);
		contentPane.add(chkViajes);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardar.setBounds(133, 340, 144, 41);
		btnGuardar.addActionListener(e -> guardarDatos());
		contentPane.add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpiar.setBounds(334, 340, 127, 41);
		btnLimpiar.addActionListener(e -> limpiarFormulario());
		contentPane.add(btnLimpiar);
		
		JButton btnConsultar = new JButton("Consultar Registros");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConsultar.setBounds(500, 340, 179, 41);
		contentPane.add(btnConsultar);
	}

	private String getSetValue(JCheckBox... checks) {
		List<String> seleccionados = new ArrayList<>();
		for (JCheckBox chk : checks) {
			if (chk.isSelected()) {
				seleccionados.add(chk.getText());
			}
		}
		return String.join(",", seleccionados);
	}

	private void guardarDatos() {
		String nombre    = textField.getText().trim();
		String apellido  = textField_1.getText().trim();
		String documento = textField_3.getText().trim();
		String genero    = (String) cmbGenero.getSelectedItem();
		String nivel     = (String) cmbNivelAcademico.getSelectedItem();
		String estado    = (String) cmbEstadoCivil.getSelectedItem();
		String idiomas     = getSetValue(chckbxEspaniol, chckbxIngles, chckbxPortugues, chckbxItaliano, chckbxOther);
		String habilidades = getSetValue(chkLiderazgo, chkComunicacion, chkProgramacion, chkDiseno, chkOtraHabilidad);
		String intereses   = getSetValue(chkDeportes, chkMusica, chkTecnologia, chkArte, chkViajes);

		if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nombre, Apellido y Documento son obligatorios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if (idiomas.isEmpty() || habilidades.isEmpty() || intereses.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Selecciona al menos una opción en Idiomas, Habilidades e Intereses.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			return;
		}

		String sql = "INSERT INTO personas (nombre, apellido, numero_documento, genero, nivel_academico, estado_civil, idiomas, habilidades, intereses) "
				   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conexion = ConexionBD.obtenerConexion();
		try (PreparedStatement ps = conexion.prepareStatement(sql)) {
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, documento);
			ps.setString(4, genero);
			ps.setString(5, nivel);
			ps.setString(6, estado);
			ps.setString(7, idiomas);
			ps.setString(8, habilidades);
			ps.setString(9, intereses);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(this, "¡Registro guardado exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			limpiarFormulario();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			ConexionBD.cerrarConexion(conexion);
		}
	}

	private void limpiarFormulario() {
		textField.setText("");
		textField_1.setText("");
		textField_3.setText("");
		cmbGenero.setSelectedIndex(0);
		cmbNivelAcademico.setSelectedIndex(0);
		cmbEstadoCivil.setSelectedIndex(0);
		for (JCheckBox chk : new JCheckBox[]{chckbxEspaniol, chckbxIngles, chckbxPortugues, chckbxItaliano, chckbxOther,
				chkLiderazgo, chkComunicacion, chkProgramacion, chkDiseno, chkOtraHabilidad,
				chkDeportes, chkMusica, chkTecnologia, chkArte, chkViajes}) {
			chk.setSelected(false);
		}
	}
}
