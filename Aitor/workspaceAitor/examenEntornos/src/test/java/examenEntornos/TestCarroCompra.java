package examenEntornos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarroCompra {

	private CarroCompra carroCompra = new CarroCompra(10, "patatas", 1.99); 
	
	@Test
	public void testConstructorParametros() {
		assertEquals(10, carroCompra.getCodigoProducto());
		assertEquals("patatas", carroCompra.getDescripcionProducto());
		assertEquals(1.99, carroCompra.getPrecioUnitario(),0);
	}
	
	@Test
	public void testCodigoProducto() {
		assertEquals(10, carroCompra.getCodigoProducto());

		carroCompra.setCodigoProducto(99);
		assertEquals(99, carroCompra.getCodigoProducto());
	}
	
	@Test
	public void testDescripcionProducto() {
		assertEquals("patatas", carroCompra.getDescripcionProducto());

		carroCompra.setDescripcionProducto("tornado");
		assertEquals("tornado", carroCompra.getDescripcionProducto());
	}
	
	@Test
	public void testPrecioUnitario() {
		assertEquals(1.99, carroCompra.getPrecioUnitario(),0);

		carroCompra.setPrecioUnitario(68.23);
		assertEquals(68.23, carroCompra.getPrecioUnitario(),0);
	}
	
	@Test
	public void testToString() {
		String resultadoString = carroCompra.toString();
		String resultadoEsperadoString = "10. patatas";
		
		assertEquals(resultadoEsperadoString, resultadoString);
	}
	
}
