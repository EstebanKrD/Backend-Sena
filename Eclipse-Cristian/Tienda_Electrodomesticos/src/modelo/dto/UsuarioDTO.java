package modelo.dto;

public class UsuarioDTO {

	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String tipo;

	public UsuarioDTO() {
	}

	public UsuarioDTO(int id, String cedula, String nombre, String apellido, int edad, String telefono, String tipo) {
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", telefono=" + telefono + ", tipo=" + tipo + "]";
	}
}