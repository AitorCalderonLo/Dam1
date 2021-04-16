package testEjercicio001;

import static org.junit.Assert.*;
import org.junit.Test;
import ejercicio001.Taxi;

public class TestTaxi {

	private Taxi t1 = new Taxi("BI7800CC", "Bizkaia", "Bilbao");
	
	
	@Test
	public void testMatricula() {
		assertEquals(t1.getMatricula(), "BI7800CC");
		
		t1.setMatricula("1234HJZ");
		assertEquals(t1.getMatricula(), "1234HJZ");
	}
	
	@Test
	public void testProvincia() {
		assertEquals(t1.getProvincia(), "Bizkaia");
		
		t1.setProvincia("Basauri");
		assertEquals(t1.getProvincia(), "Basauri");
	}
	
	@Test
	public void testMunicipio() {
		assertEquals(t1.getMunicipio(), "Bilbao");
		
		t1.setMunicipio("Montevideo");
		assertEquals(t1.getMunicipio(), "Montevideo");
	}

}
