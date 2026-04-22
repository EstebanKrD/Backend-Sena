public class Paciente {

	private String documento;
	private String nombre;
	private int edad;
	private double valorPagar;

	public Paciente() {
	}

	public Paciente(String documento, String nombre, int edad) {
		this.documento = documento;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	@Override
	public String toString() {
		return "Paciente [documento=" + documento + 
		       ", nombre=" + nombre + 
		       ", edad=" + edad + 
		       ", valorPagar=" + valorPagar + "]";
	}
}
