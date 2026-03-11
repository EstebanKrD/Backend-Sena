package logica;

public class Procesos {

	public void calcularSueldoNuevo(Operario operario) {
	    
	    double sueldo = operario.getSueldo();
	    int antiguedad = operario.getAntigüedad();
	    
	    if (sueldo < 500 && antiguedad >= 10) {
	        double aumento = sueldo * 0.20;
	        operario.setAumento(aumento);
	        operario.setSueldoNuevo(sueldo + aumento);
	        
	    } else if (sueldo < 500 && antiguedad < 10) {
	        double aumento = sueldo * 0.05;
	        operario.setAumento(aumento);
	        operario.setSueldoNuevo(sueldo + aumento);
	        
	    } else {
	        operario.setAumento(0);
	        operario.setSueldoNuevo(sueldo);
	    }
	}
}
