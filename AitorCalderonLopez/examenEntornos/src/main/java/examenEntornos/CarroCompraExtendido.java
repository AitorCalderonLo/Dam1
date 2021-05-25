package examenEntornos;

public class CarroCompraExtendido extends CarroCompra {
	
	private int cantidad;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public CarroCompraExtendido(int codigoProducto, String descripcionProducto, Double precioUnitario, int cantidad) {
		super(codigoProducto, descripcionProducto, precioUnitario);
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return this.getDescripcionProducto() + " " + this.getCantidad() + " " + this.getPrecioUnitario() + "€ " + this.getPrecioUnitario()*cantidad+"€";
	}
	

}
