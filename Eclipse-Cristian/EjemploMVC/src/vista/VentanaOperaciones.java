package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controlador.Coordinador;

public class VentanaOperaciones extends JDialog implements ActionListener {

    private Coordinador coordinador;
    private JButton botonCalcular;
    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JRadioButton radioSuma;
    private JRadioButton radioResta;
    private JRadioButton radioMultiplicacion;
    private JRadioButton radioDivision;
    private JTextArea areaResultado;

    public VentanaOperaciones(VentanaRegistro ventanaRegistro, boolean modal) {
        super(ventanaRegistro, modal);
        setTitle("Ventana de Operaciones");
        setSize(400, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("OPERACIONES MATEMATICAS");
        etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setBounds(6, 6, 388, 30);
        getContentPane().add(etiquetaTitulo);

        JLabel etiquetaNumero1 = new JLabel("Numero 1:");
        etiquetaNumero1.setBounds(50, 50, 80, 26);
        getContentPane().add(etiquetaNumero1);

        campoNumero1 = new JTextField();
        campoNumero1.setBounds(130, 50, 86, 26);
        getContentPane().add(campoNumero1);

        JLabel etiquetaNumero2 = new JLabel("Numero 2:");
        etiquetaNumero2.setBounds(50, 85, 80, 26);
        getContentPane().add(etiquetaNumero2);

        campoNumero2 = new JTextField();
        campoNumero2.setBounds(130, 85, 86, 26);
        getContentPane().add(campoNumero2);

        // Botones de radio para operaciones
        radioSuma = new JRadioButton("+");
        radioSuma.setBounds(47, 120, 56, 23);
        getContentPane().add(radioSuma);

        radioResta = new JRadioButton("-");
        radioResta.setBounds(113, 120, 56, 23);
        getContentPane().add(radioResta);

        radioMultiplicacion = new JRadioButton("*");
        radioMultiplicacion.setBounds(180, 120, 56, 23);
        getContentPane().add(radioMultiplicacion);

        radioDivision = new JRadioButton("/");
        radioDivision.setBounds(247, 120, 56, 23);
        getContentPane().add(radioDivision);

        // Agrupa los botones de radio
        ButtonGroup grupoOperaciones = new ButtonGroup();
        grupoOperaciones.add(radioSuma);
        grupoOperaciones.add(radioResta);
        grupoOperaciones.add(radioMultiplicacion);
        grupoOperaciones.add(radioDivision);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(130, 155, 100, 30);
        botonCalcular.addActionListener(this);
        getContentPane().add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setBounds(50, 195, 300, 50);
        areaResultado.setEditable(false);
        getContentPane().add(areaResultado);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    private void calcular() {
        String operacion = "";

        if (radioSuma.isSelected()) {
            operacion = "suma";
        } else if (radioResta.isSelected()) {
            operacion = "resta";
        } else if (radioMultiplicacion.isSelected()) {
            operacion = "multiplicacion";
        } else if (radioDivision.isSelected()) {
            operacion = "division";
        }

        boolean numero1Valido = coordinador.validarNumero(campoNumero1.getText());
        boolean numero2Valido = coordinador.validarNumero(campoNumero2.getText());

        verificarCampo(numero1Valido, campoNumero1);
        verificarCampo(numero2Valido, campoNumero2);

        if (numero1Valido && numero2Valido && !operacion.equals("")) {
            // Delega el cálculo al coordinador
            String resultado = coordinador.calcularOperacion(
                operacion,
                campoNumero1.getText(),
                campoNumero2.getText()
            );
            areaResultado.setText(resultado);
        } else {
            areaResultado.setText("Valide los datos ingresados");
        }
    }

    private void verificarCampo(boolean esValido, JTextField campo) {
        if (esValido) {
            campo.setBackground(Color.white);
        } else {
            campo.setBackground(Color.red);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonCalcular) {
            calcular();
        }
    }
}