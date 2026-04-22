package modelo.dto;

public class VentasBO {

	private int id;
	private int idUsuario;
	private int idProducto;
	private int cantidadComprada;
	private double total;
	private double descuento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public VentasBO() {
	}

	public VentasBO(int id, int idUsuario, int idProducto, int cantidadComprada, double total, double descuento) {
	    super();
	    this.id = id;
	    this.idUsuario = idUsuario;
	    this.idProducto = idProducto;
	    this.cantidadComprada = cantidadComprada;
	    this.total = total;
	    this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "VentasBO [id=" + id + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", cantidadComprada="
				+ cantidadComprada + ", total=" + total + ", descuento=" + descuento + "]";
	}

}