import javax.swing.JOptionPane;

public class Procesos {
	
	Estudiante miEs;
	
	public Procesos() {
		
		for (int i = 0; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "ESTUDIANTE "+(i+1),
					"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			pedirDatos();
		}
		
	}
	
	public void pedirDatos() {
		miEs=new Estudiante();
		miEs.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
		miEs.setMateria(JOptionPane.showInputDialog("Ingrese la materia"));
		
		miEs.setNota1(validarNota("Ingrese la nota 1"));
		miEs.setNota2(validarNota("Ingrese la nota 2"));
		miEs.setNota3(validarNota("Ingrese la nota 3"));

		double promedio=calcularPromedio(miEs.getNota1(),miEs.getNota2(), miEs.getNota3());
		
		miEs.setPromedio(promedio);
		
		calcularResultado();
		
		imprimirResultados();
		
	}
	
	private void imprimirResultados() {
		
		System.out.println(miEs);
	}

	private void calcularResultado() {
		
		String resultado="";
		
		if (miEs.getPromedio()>=3.5) {
			resultado=miEs.getNombre()+" GANA LA MATERIA "+miEs.getMateria();
		}else {
			resultado=miEs.getNombre()+"PIERDE LA MATERIA "+miEs.getMateria();
			
			if (miEs.getPromedio()>2.5) {
				resultado+="PUEDE RECUPERALA";
			}else {
				resultado+="NO LA PUEDE RECUPER";
			}
			
		}
		
		miEs.setResultado(resultado);
	}

	public double calcularPromedio(double n1,double n2,double n3) {
		
		double prom=(n1+n2+n3)/3;
		
		return prom;
	}
	
	private double validarNota(String msj) {
		
		double nota;
		
		
		do {
			nota=Double.parseDouble(JOptionPane.showInputDialog(msj));
			
			if (nota<0 || nota>5) {
				JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 5",
						"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		while(!(nota>=0 && nota<=5));//
		
		
		
		return nota;
	}

}