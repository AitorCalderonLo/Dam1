package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ejercicio1Taxi.Taxi;

public class TaxiTest {

	private Taxi t1 = new Taxi("Bizkaia","22475","Bilbao",2);
	private Taxi t2 = new Taxi();

	@Test
	public void testConstructorVacio() {
		assertEquals(null, t2.getProvincia());
		assertEquals(null, t2.getMatricula());
		assertEquals(null, t2.getMunicipio());
		assertEquals(0, t2.getTipoMotor(), 0);
	}

	@Test
	public void testConstructorSobrecargado() {
		assertEquals("Bizkaia", t1.getProvincia());
		assertEquals("22475", t1.getMatricula());
		assertEquals("Bilbao", t1.getMunicipio());
		assertEquals(2, t1.getTipoMotor(), 0);
	}

	@Test
	public void testSetProvincia() {
		t2.setProvincia("Gipuzkoa");
		assertEquals("Gipuzkoa", t2.getProvincia());
	}

	@Test
	public void testSetMatricula() {
		t2.setMatricula("873h26g");
		assertEquals("873h26g", t2.getMatricula());
	}

	@Test
	public void testSetMunicipio() {
		t2.setMunicipio("Donosti");
		assertEquals("Donosti", t2.getMunicipio());
	}

	@Test
	public void testSetTipoMotor() {
		t2.setTipoMotor(1);
		assertEquals(1, t2.getTipoMotor(), 0);
	}
}
