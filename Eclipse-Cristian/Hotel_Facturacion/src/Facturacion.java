import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Facturacion {

    private final int MAX_CUARTOS = 3;
    private HashMap<Integer, Huesped> registroHuespedes = new HashMap<>();

    public void iniciarProceso() {
        int contadorHabitacion = 101;

        while (registroHuespedes.size() < MAX_CUARTOS) {
            JOptionPane.showMessageDialog(null, "Registrando habitacion: " + contadorHabitacion);

            int noches = Integer.parseInt(JOptionPane.showInputDialog("Numero de noches:"));
            while (noches < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten valores negativos.");
                noches = Integer.parseInt(JOptionPane.showInputDialog("Numero de noches:"));
            }

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Valor por noche:"));
            while (precio < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten valores negativos.");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Valor por noche:"));
            }

            double extra = Double.parseDouble(JOptionPane.showInputDialog("Consumo adicional:"));
            while (extra < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten valores negativos.");
                extra = Double.parseDouble(JOptionPane.showInputDialog("Consumo adicional:"));
            }

            Huesped nuevoHuesped = new Huesped(noches, precio, extra);
            registroHuespedes.put(contadorHabitacion, nuevoHuesped);
            contadorHabitacion++;

            JOptionPane.showMessageDialog(null, "Huesped registrado con exito.");
        }

        mostrarReporteFinal();
    }

    private void mostrarReporteFinal() {
        String mensaje = "Reporte final del hotel \n";
        mensaje += "Total de huespedes procesados: " + registroHuespedes.size() + "\n\n";

        double granTotal = 0;

        for (Map.Entry<Integer, Huesped> entrada : registroHuespedes.entrySet()) {
            int habitacion = entrada.getKey();
            Huesped h = entrada.getValue();
            double total = h.calcularTotal();
            granTotal += total;

            mensaje += "Habitacion " + habitacion + ":\n";
            mensaje += "  Noches:            " + h.getNoches() + "\n";
            mensaje += "  Valor por noche:  $" + h.getValorNoche() + "\n";
            mensaje += "  Consumo adicional:$" + h.getConsumo() + "\n";
            mensaje += "  Total a pagar:    $" + total + "\n\n";
        }

        mensaje += "Ganancia total del hotel : $" + granTotal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}