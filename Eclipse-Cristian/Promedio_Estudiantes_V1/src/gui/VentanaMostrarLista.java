package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;
import java.awt.*;
import java.util.HashMap;
import entidades.Estudiantes;
import logica.ModelData;

public class VentanaMostrarLista extends JDialog {

    private static final long serialVersionUID = 1L;
    private JTable tabla;
    private DefaultTableModel modelo;

    public VentanaMostrarLista(VentanaConsultar v, boolean b, ModelData modelData) {
        super(v, b);

        setBounds(100, 100, 800, 400);
        setTitle("Lista de Estudiantes");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        String[] columnas = {"Nombre", "Apellido", "Documento", "Materia", "Promedio", "Estado"};
        modelo = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modelo) {

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                String estado = (String) getValueAt(row, 5);

                if (estado != null && estado.contains("Gana")) {
                    c.setForeground(Color.BLUE);
                } else {
                    c.setForeground(Color.RED);
                }
                return c;
            }
        };
  
        HashMap<String, Estudiantes> lista = modelData.obtenerLista();
        for (Estudiantes e : lista.values()) {
            modelo.addRow(new Object[]{
                e.getNombre(),
                e.getApellido(),
                e.getDocumento(),
                e.getMateria(),
                String.format("%.2f", e.getPromedio()),
                e.getEstado()
            });
        }

        JScrollPane scroll = new JScrollPane(tabla);
        contentPane.add(scroll, BorderLayout.CENTER);
    }
}