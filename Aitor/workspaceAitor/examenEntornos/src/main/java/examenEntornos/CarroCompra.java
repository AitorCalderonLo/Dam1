package examenEntornos;

public class CarroCompra {
	
	private int codigoProducto;
	private String descripcionProducto;
	private Double precioUnitario;
	
	public CarroCompra(int codigoProducto, String descripcionProducto, Double precioUnitario) {
		this.codigoProducto = codigoProducto;
		this.descripcionProducto = descripcionProducto;
		this.precioUnitario = precioUnitario;
	}
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	@Override
	public String toString() {
		return this.getCodigoProducto() + ". " + this.getDescripcionProducto();
	}
	
}
