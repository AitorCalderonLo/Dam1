package examenEntornos;


public class Productos {
	
	private CarroCompra[] productosDisponibles = new CarroCompra[5];
	private CarroCompraExtendido[] productosSeleccionados = new CarroCompraExtendido[5];
	private double total = 0.0;


	public void borrarCarro() {
		productosSeleccionados = new CarroCompraExtendido[5];
		this.total = 0.0;
	}
	
	public double getTotal() {
		return total;
	}

	public CarroCompra[] getArr() {
		return productosDisponibles;
	}
	
	public void addProducto(CarroCompra producto, int posicion) {
		productosDisponibles[posicion] = producto;
	}
	
	public String addProductoSeleccionado(CarroCompraExtendido producto,int cantidad, int posicion) {
		boolean err = true;
		for (int i = 0; i < posicion; i++) {
			if (producto.getCodigoProducto() == productosSeleccionados[i].getCodigoProducto()) {
				productosSeleccionados[i].setCantidad(productosSeleccionados[i].getCantidad() + cantidad);
				err = false;
				System.out.println("***********************");

				return "Se modifica cantidad de producto.";
			}
		}
		if(err) {
			productosSeleccionados[posicion] = producto;
		}
		return "Producto anadido";

	}
	
	public String mostrarProductosDisp() {
		String devolver = "";
		for (int i = 0; i < productosDisponibles.length; i++) {
			devolver+= i + " - " +productosDisponibles[i].toString() +"\n";
		}
		
		return devolver;
	}
	
	public String mostrarCesta(int cantArtSeleccionados) {
		String devolver = "PRODUCTO CANTIDAD PRECIO UNIT. IMPORTE\n ---------------------------------------\n";
		this.total = 0;
		for (int i = 0; i < cantArtSeleccionados; i++) {
			devolver+= productosSeleccionados[i].toString() +"\n";
			this.total += productosSeleccionados[i].getPrecioUnitario()*productosSeleccionados[i].getCantidad();
			
		}
		
		return devolver;
	}
	
	public boolean existeCodProd(int codigoProducto, int cantArt) {
		for (int i = 0; i < cantArt; i++) {
			if(codigoProducto == productosDisponibles[i].getCodigoProducto()) {
				return true;
			}
		}
		return false;
	}


}
