package examenEntornos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import static org.mockito.Mockito.mock;


public class TestProductos {
	
	private Productos productos = new Productos();
	private CarroCompra carroCompraMock = mock(CarroCompra.class);

	
	@Test
	public void testBorrarCarro() {
		productos.borrarCarro();
		assertEquals(0.0, productos.getTotal(),0);
	}

	@Test
	public void testGetArr() {
		CarroCompra[] productosDisponibles = new CarroCompra[5];
		assertArrayEquals(productosDisponibles,productos.getArr());
	}
	
	@Test
	public void testAddProducto() {
		productos.addProducto(carroCompraMock, 0);
		assertEquals(productos.getArr()[0], carroCompraMock);
	}
	
	@Test
	public void testExisteCodProdFALSE() {
		productos.addProducto(carroCompraMock, 0);
		assertFalse(productos.existeCodProd(0, 0));
	}
	
	@Test
	public void testExisteCodProdtrue() {
		productos.addProducto(new CarroCompra(10, "patatas", 1.99) , 1);
		assertFalse(productos.existeCodProd(10, 0));
	}
	
}
