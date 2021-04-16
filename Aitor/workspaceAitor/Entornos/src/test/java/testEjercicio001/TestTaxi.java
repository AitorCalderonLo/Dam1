package testEjercicio001;

import static org.junit.Assert.*;
import org.junit.Test;
import ejercicio001.Taxi;

public class TestTaxi {

	private Taxi t1 = new Taxi("BI7800CC", "Bizkaia", "Bilbao");

	@Test
	public void testConstructorParametros() {
		assertEquals("BI7800CC", t1.getMatricula());
		assertEquals("Bizkaia", t1.getProvincia());
		assertEquals("Bilbao", t1.getMunicipio());
	}

	@Test
	public void testConstructorVacio() {
		t1 = new Taxi();
		assertEquals(null, t1.getMatricula());
		assertEquals(null, t1.getProvincia());
		assertEquals(null, t1.getMunicipio());

	}

	@Test
	public void testMatricula() {
		assertEquals("BI7800CC", t1.getMatricula());

		t1.setMatricula("1234HJZ");
		assertEquals("1234HJZ", t1.getMatricula());
	}

	@Test
	public void testProvincia() {
		assertEquals("Bizkaia", t1.getProvincia());

		t1.setProvincia("Basauri");
		assertEquals("Basauri", t1.getProvincia());
	}

	@Test
	public void testMunicipio() {
		assertEquals("Bilbao", t1.getMunicipio());

		t1.setMunicipio("Montevideo");
		assertEquals("Montevideo", t1.getMunicipio());
	}

}
