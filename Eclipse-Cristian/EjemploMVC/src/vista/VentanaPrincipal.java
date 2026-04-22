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
    private JButton botonRegistrar;
    private JButton botonConsultarPersona;
    private JButton botonConsultarLista;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 673, 388);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("SISTEMA GESTION USUARIOS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiquetaTitulo.setBounds(136, 10, 415, 30);
        contentPane.add(etiquetaTitulo);

        botonRegistrar = new JButton("Registrar Persona");
        botonRegistrar.setBounds(136, 90, 415, 29);
        botonRegistrar.addActionListener(this);
        contentPane.add(botonRegistrar);

        botonConsultarPersona = new JButton("Consultar Persona");
        botonConsultarPersona.setBounds(136, 152, 415, 29);
        botonConsultarPersona.addActionListener(this);
        contentPane.add(botonConsultarPersona);

        botonConsultarLista = new JButton("Consultar Lista de Personas");
        botonConsultarLista.setBounds(136, 212, 415, 29);
        botonConsultarLista.addActionListener(this);
        contentPane.add(botonConsultarLista);
    }

	public void setCoordinador(Coordinador miCoordinador) {
    this.miCoordinador = miCoordinador;
}

	@Override
	public void actionPerformed(ActionEvent evento) {
	    if (evento.getSource() == botonRegistrar) {
	        miCoordinador.mostrarVentanaRegistro();
	    } else if (evento.getSource() == botonConsultarPersona) {
	        miCoordinador.mostrarVentanaConsultaIndividual();
	    } else if (evento.getSource() == botonConsultarLista) {
	        miCoordinador.mostrarVentanaConsultarLista();
	    }
	}
    
}