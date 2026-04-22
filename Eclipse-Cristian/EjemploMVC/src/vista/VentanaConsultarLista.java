package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import controlador.Coordinador;
import modelo.dto.PersonaDTO;

public class VentanaConsultarLista extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Coordinador miCoordinador;
    private JTable tablaPersonas;
    private DefaultTableModel modeloTabla;

    public VentanaConsultarLista(VentanaPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal, modal);
        setBounds(100, 100, 750, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel etiquetaTitulo = new JLabel("CONSULTA LISTA PERSONAS");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        etiquetaTitulo.setBounds(33, 6, 688, 30);
        contentPane.add(etiquetaTitulo);

        // Columnas de la tabla
        String[] columnas = {"Documento", "Nombre", "Edad", "Sueldo", 
                             "Antigüedad", "Sueldo Nuevo", "Aumento"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaPersonas = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaPersonas);
        scrollPane.setBounds(21, 48, 700, 280);
        contentPane.add(scrollPane);
    }

    public void consultarListaPersonas() {
        // Limpia la tabla antes de cargar datos
        modeloTabla.setRowCount(0);

        ArrayList<PersonaDTO> listaPersonas = miCoordinador.consultarListaPersonas();

        if (listaPersonas.size() > 0) {
            for (PersonaDTO persona : listaPersonas) {
                Object[] fila = {
                    persona.getDocumento(),
                    persona.getNombre(),
                    persona.getEdad(),
                    persona.getSueldo(),
                    persona.getAntiguedad(),
                    persona.getSueldoNuevo(),
                    persona.getAumento()
                };
                modeloTabla.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay personas registradas",
                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
    }
}