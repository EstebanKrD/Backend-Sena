package logica;

public class Operario {
    
    private String documento;
    private String nombre;
    private double sueldo;
    private int antigüedad;
    private double sueldoNuevo;
    private double aumento;
    
    public Operario() {
    }
    
    public Operario(String documento, String nombre, double sueldo, int antigüedad) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antigüedad = antigüedad;
    }
    
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
    
    public int getAntigüedad() { return antigüedad; }
    public void setAntigüedad(int antigüedad) { this.antigüedad = antigüedad; }
    
    public double getSueldoNuevo() { return sueldoNuevo; }
    public void setSueldoNuevo(double sueldoNuevo) { this.sueldoNuevo = sueldoNuevo; }
    
    public double getAumento() { return aumento; }
    public void setAumento(double aumento) { this.aumento = aumento; }

	@Override
	public String toString() {
		return "Operario [documento=" + documento + ", nombre=" + nombre + ", sueldo=" + sueldo + ", antigüedad="
				+ antigüedad + ", sueldoNuevo=" + sueldoNuevo + ", aumento=" + aumento + "]";
	}
    
}