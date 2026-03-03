import java.util.HashMap;

import javax.swing.JOptionPane;

public class Operario {
	private HashMap<String, Object> datos;
	
	public Operario(String documento, String nombre, double sueldo, int antiguedad) {
		datos = new HashMap<>();
		datos.put("documento", documento);
		datos.put("nombre", nombre);
		datos.put("sueldo", sueldo);
		datos.put("antiguedad", antiguedad);
	}
	
	public double CalcularSueldo() {
		double sueldo = (double) datos.get("sueldo");
		int antiguedad = (int) datos.get("antiguedad");
		
		if(sueldo < 500 && antiguedad >= 10) {
			return sueldo + (sueldo * 0.20);
		} else if (sueldo < 500 && antiguedad < 10) {
			return sueldo + (sueldo * 0.05);
		} else {
			return sueldo;
		}
		
	}
	
	public void MostrarDatos() {
		JOptionPane.showInputDialog(null, "Documento " + datos.get("documento"));
		JOptionPane.showInputDialog(null, "Nombre " + datos.get("nombre"));
		JOptionPane.showInputDialog(null, "Sueldo final " + CalcularSueldo());
	}
	
}
