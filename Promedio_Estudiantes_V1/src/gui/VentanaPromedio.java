package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import entidades.Estudiantes;
import logica.ModelData;

public class VentanaPromedio extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNombre, txtApellido, txtDocumento, txtMateria;
    private JTextField txtNota1, txtNota2, txtNota3;
    private JTextField txtPromedio, txtEstado;
    private JButton btnCalcular, btnLimpiar, btnGuardar;

    ModelData modelData;

    public VentanaPromedio(VentanaConsultar v, boolean b, ModelData modelData) {
        super(v, b);
        this.modelData = modelData;

        setBounds(100, 100, 784, 448);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Consulta el promedio del estudiante");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblTitulo.setBounds(232, 10, 358, 35);
        contentPane.add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(22, 89, 60, 20);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(85, 86, 130, 27);
        contentPane.add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(230, 89, 60, 20);
        contentPane.add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(295, 86, 130, 27);
        contentPane.add(txtApellido);

        JLabel lblDocumento = new JLabel("Documento:");
        lblDocumento.setBounds(445, 89, 80, 20);
        contentPane.add(lblDocumento);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(527, 86, 130, 27);
        contentPane.add(txtDocumento);

        JLabel lblMateria = new JLabel("Materia:");
        lblMateria.setBounds(22, 140, 60, 20);
        contentPane.add(lblMateria);

        txtMateria = new JTextField();
        txtMateria.setBounds(85, 137, 130, 27);
        contentPane.add(txtMateria);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(22, 200, 60, 20);
        contentPane.add(lblNota1);

        txtNota1 = new JTextField();
        txtNota1.setBounds(85, 197, 80, 27);
        contentPane.add(txtNota1);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(230, 200, 60, 20);
        contentPane.add(lblNota2);

        txtNota2 = new JTextField();
        txtNota2.setBounds(295, 197, 80, 27);
        contentPane.add(txtNota2);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(445, 200, 60, 20);
        contentPane.add(lblNota3);

        txtNota3 = new JTextField();
        txtNota3.setBounds(527, 197, 80, 27);
        contentPane.add(txtNota3);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(22, 270, 65, 20);
        contentPane.add(lblPromedio);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(90, 267, 100, 27);
        txtPromedio.setEditable(false);
        contentPane.add(txtPromedio);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(230, 270, 60, 20);
        contentPane.add(lblEstado);

        txtEstado = new JTextField();
        txtEstado.setBounds(295, 267, 362, 27);
        txtEstado.setEditable(false);
        contentPane.add(txtEstado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(75, 350, 120, 35);
        btnCalcular.addActionListener(this);
        contentPane.add(btnCalcular);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(330, 350, 120, 35);
        btnLimpiar.addActionListener(this);
        contentPane.add(btnLimpiar);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(574, 350, 120, 35);
        btnGuardar.addActionListener(this);
        contentPane.add(btnGuardar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCalcular) {

            double nota1 = Double.parseDouble(txtNota1.getText());
            double nota2 = Double.parseDouble(txtNota2.getText());
            double nota3 = Double.parseDouble(txtNota3.getText());

            double promedio = modelData.calcularPromedio(nota1, nota2, nota3);

            Estudiantes est = new Estudiantes();
            est.setNombre(txtNombre.getText());
            est.setApellido(txtApellido.getText());
            est.setDocumento(txtDocumento.getText());
            est.setMateria(txtMateria.getText());
            est.setNota1(nota1);
            est.setNota2(nota2);
            est.setNota3(nota3);
            est.setPromedio(promedio);
            modelData.calcularEstado(est);

            txtPromedio.setText(String.format("%.2f", promedio));
            txtEstado.setText(est.getEstado());
        }

        else if (e.getSource() == btnGuardar) {

            Estudiantes est = new Estudiantes();
            est.setNombre(txtNombre.getText());
            est.setApellido(txtApellido.getText());
            est.setDocumento(txtDocumento.getText());
            est.setMateria(txtMateria.getText());
            est.setNota1(Double.parseDouble(txtNota1.getText()));
            est.setNota2(Double.parseDouble(txtNota2.getText()));
            est.setNota3(Double.parseDouble(txtNota3.getText()));
            est.setPromedio(Double.parseDouble(txtPromedio.getText().replace(",", ".")));
            modelData.calcularEstado(est);

            String respuesta = modelData.guardarEstudiante(est);

            if (respuesta.equals("existente")) {
                int opcion = JOptionPane.showConfirmDialog(null,
                    "Este estudiante ya está registrado en esta materia.\n¿Desea actualizar?",
                    "Advertencia",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

                if (opcion == JOptionPane.YES_OPTION) {
                    modelData.actualizarEstudiante(est);
                    JOptionPane.showMessageDialog(null,
                        "Estudiante actualizado correctamente",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Estudiante guardado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }

        else if (e.getSource() == btnLimpiar) {
            txtNombre.setText("");
            txtApellido.setText("");
            txtDocumento.setText("");
            txtMateria.setText("");
            txtNota1.setText("");
            txtNota2.setText("");
            txtNota3.setText("");
            txtPromedio.setText("");
            txtEstado.setText("");
        }
    }
}