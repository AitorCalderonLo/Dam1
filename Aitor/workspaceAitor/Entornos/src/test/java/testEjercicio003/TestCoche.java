package testEjercicio003;

import static org.junit.Assert.*;

import org.junit.Test;

import ejercicio003.Coche;

public class TestCoche {

	private Coche tesla = new Coche(120);
	
	@Test
	public void testConstructorParametros() {
		tesla = new Coche(200);
		assertEquals(200, tesla.getVelocidad());
	}
	
	@Test
	public void testConstructosVacio() {
		tesla = new Coche();
		assertEquals(0, tesla.getVelocidad());
	}
	
	@Test
	public void testVelocidad() {
		assertEquals(120, tesla.getVelocidad());

		tesla.setVelocidad(16);
		assertEquals(16, tesla.getVelocidad());
	}
	
	@Test
	public void testAcelera() {
		tesla = new Coche(100);
		tesla.acelera(20);

		assertEquals(120, tesla.getVelocidad());
	}
	
	@Test
	public void testFrena() {
		tesla = new Coche(100);
		tesla.frena(20);

		assertEquals(80, tesla.getVelocidad());
	}

}
