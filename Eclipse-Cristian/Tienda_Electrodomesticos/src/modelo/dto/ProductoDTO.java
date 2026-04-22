package modelo.dto;

public class ProductoDTO {

	private int id;
	private String nombre;
	private double valorUnitario;
	private int cantidad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ProductoDTO(int id, String nombre, double valorUnitario, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}

	public ProductoDTO() {

	}

	@Override
	public String toString() {
		return "ProductoDTO [id=" + id + ", nombre=" + nombre + ", valorUnitario=" + valorUnitario + ", cantidad="
				+ cantidad + "]";
	}

}
