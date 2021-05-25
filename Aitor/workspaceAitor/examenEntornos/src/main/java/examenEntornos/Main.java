package examenEntornos;

public class Main {

	private static int cantArt = 0;
	private static int cantArtSeleccionados = 0;

	public static void main(String[] args) {

		Productos productos = new Productos();

		System.out.println(
				"*** Bienvenido al examen de Aitor Calderon ***\n\nCargue 5 productos para comenzar con el supermercado.");

		crearProductos(productos);

		String menu = "** Compra Supermercado **\n 1. Añadir a la cesta\n 2.Mostrar cesta de la compra\n 3.Finalizar Compra\n 4.Salir";

		while (true) {

			int opcion = Reader.leerInt(menu, 1, 4);

			switch (opcion) {

			case 1:
				System.out.println("\nProductos disponibles(Codigo de producto. Nombre)\n\n");
				System.out.println(productos.mostrarProductosDisp());
				int eleccion = Reader.leerInt("- Seleccione un producto por posicion: ", 0, (cantArt - 1));
				int cantidad = Reader.leerInt("Introduce la cantidad: ", 1, 9999);
				
				String anadido = productos.addProductoSeleccionado(
						new CarroCompraExtendido(productos.getArr()[eleccion].getCodigoProducto(), productos.getArr()[eleccion].getDescripcionProducto(), productos.getArr()[eleccion].getPrecioUnitario(), cantidad)
						, cantidad, cantArtSeleccionados);
				System.out.println(
						anadido);
				
				if(anadido.equalsIgnoreCase("Producto anadido")) {
					cantArtSeleccionados++;
				}
				
				
				

				break;
			case 2:
				System.out.println("\n *** CESTA *** \n");
				System.out.println(productos.mostrarCesta(cantArtSeleccionados));
				break;
			case 3:
				String nombre = Reader.leerString("*** CAJA ***\nPara finalizar la compra inserte su nombre:");
				System.out.println("Cliente: " + nombre + "\n");
				System.out.println(productos.mostrarCesta(cantArtSeleccionados));
				System.out.println("\n Total: " +productos.getTotal()+"€\n");
				cantArtSeleccionados = 0;
				productos.borrarCarro();

				break;
			case 4:
				System.exit(0);
				break;

			}
		}

	}

	private static void crearProductos(Productos productos) {

		while (cantArt < 5) {
			System.out.println("\nIntroduzca el producto numero " + cantArt);
			boolean error = true;
			int codProd = 0;
			while (error) {
				codProd = Reader.leerInt("- Codigo de producto (1-9999): ", 1, 9999);
				if (productos.existeCodProd(codProd, cantArt)) {
					System.out.println("\nERROR: YA EXISTE UN PRODUCTO CON ESE CODIGO, INTENTELO DE NUEVO \n");
				} else {
					error = false;
				}

			}
			String nomProd = Reader.leerString("- Nombre del producto: ");
			System.out.println("- Precio unitario: ");
			Double pvpUni = Reader.leerDouble(0, 99999);

			productos.addProducto(new CarroCompra(codProd, nomProd, pvpUni), cantArt);

			cantArt++;

		}
	}

}
