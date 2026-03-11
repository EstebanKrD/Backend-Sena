package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import logica.Operario;

public class VentanaRigistroOperario extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTable table;
    private DefaultTableModel modelo; 

    public VentanaRigistroOperario(HashMap<String, Operario> datos) {
        setBounds(100, 100, 842, 500);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout());

        String[] columnas = {"Documento", "Nombre", "Sueldo Actual", "Antigüedad", "Aumento", "Sueldo Nuevo"};
        modelo = new DefaultTableModel(columnas, 0);
        table = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(table);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        cargarDatos(datos);

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> dispose());
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());
        buttonPane.add(cancelButton);
    }

    private void cargarDatos(HashMap<String, Operario> datos) {
        for (Operario op : datos.values()) {
            Object[] fila = {
                op.getDocumento(),
                op.getNombre(),
                op.getSueldo(),
                op.getAntigüedad(),
                op.getAumento(),
                op.getSueldoNuevo()
            };
            modelo.addRow(fila);
        }
    }
}