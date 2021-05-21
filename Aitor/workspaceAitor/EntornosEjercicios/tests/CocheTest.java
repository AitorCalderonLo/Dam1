package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ejercicio3Coche.Coche;

public class CocheTest {

	private Coche c1 = new Coche();

	@Test
	public void testConstructor() {
		assertEquals(0, c1.getVelocidad(), 0);
	}

	@Test
	public void testAcelera() {
		c1.acelera(50);
		assertEquals(50, c1.getVelocidad(), 0);
	}

	@Test
	public void testFrena() {
		c1.frena(25);
		assertEquals(-25, c1.getVelocidad(), 0);
	}
}