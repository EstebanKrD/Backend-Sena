import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {
	
	Paciente miPaciente;
	final double COSTO_DIAS=100000;
	
	public Procesos() {

		
		int x=0;
		
		do {
			
			registrarPaciente();
			calcularTotalTratamiento();
			imprimirPaciente();
			
			x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 0 para salir,"
					+ "de lo contrario registra otro paciente"));
		} while (x!=0);
		
		
		
	}
	
	private void imprimirPaciente() {
		System.out.println("_____________________");
		System.out.println(miPaciente);
		System.out.println("_____________________");
	}

	public void registrarPaciente() {
		miPaciente =new Paciente();
		miPaciente.setDocumento(JOptionPane.showInputDialog("Ingrese el doc"));
		miPaciente.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
		miPaciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
		imprimirPaciente();

		
	}
	
	public void calcularTotalTratamiento() {
		double costoTratamiento=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
		int diasHospital=Integer.parseInt(JOptionPane.showInputDialog("Numero de dias de hospitalizacion"));
		double costoMedicamentos=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los medicamentos"));
		double costoDias=diasHospital*COSTO_DIAS;
		
		double costoTotalTratamiento=costoTratamiento+costoMedicamentos+costoDias;
		
		miPaciente.setValorPagar(costoTotalTratamiento);
	}
	
	public void validarDatos() {
		
	}

}