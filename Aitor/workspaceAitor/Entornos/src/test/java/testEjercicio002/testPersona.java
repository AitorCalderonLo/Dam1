package testEjercicio002;

import static org.junit.Assert.*;

import org.junit.Test;

import ejercicio002.Persona;

public class testPersona {

	private Persona pedro = new Persona("Pedro", "Picapiedra", "12345678", 29, false);
	
	@Test
	public void testConstructorParametros() {
		assertEquals("Pedro", pedro.getNombre());
		assertEquals("Picapiedra", pedro.getApellidos());
		assertEquals("12345678", pedro.getDni());
		assertEquals(29, pedro.getEdad());
		assertEquals(false, pedro.isCasado());
	}
	
	@Test
	public void testConstructorVacio() {
		
		pedro = new Persona();
		
		assertEquals(null, pedro.getNombre());
		assertEquals(null, pedro.getApellidos());
		assertEquals(null, pedro.getDni());
		assertEquals(0, pedro.getEdad());
		assertEquals(false, pedro.isCasado());
	}
	
	@Test
	public void testNombre() {
		assertEquals("Pedro", pedro.getNombre());

		pedro.setNombre("Juan");
		assertEquals("Juan", pedro.getNombre());
	}
	
	@Test
	public void testApellido() {
		assertEquals("Picapiedra", pedro.getApellidos());

		pedro.setApellidos("YaNoPicaPiedra");
		assertEquals("YaNoPicaPiedra", pedro.getApellidos());
	}
	
	@Test
	public void testDni() {
		assertEquals("12345678", pedro.getDni());

		pedro.setDni("6548548544f");
		assertEquals("6548548544f", pedro.getDni());
	}
	
	@Test
	public void testEdad() {
		assertEquals(29, pedro.getEdad());

		pedro.setEdad(99);
		assertEquals(99, pedro.getEdad());
	}
	
	@Test
	public void testCasado() {
		assertEquals(false, pedro.isCasado());

		pedro.setCasado(true);
		assertEquals(true, pedro.isCasado());
	}
	
	@Test
	public void testToString() {
		String resultadoString = pedro.toString();
		String resultadoEsperadoString = "Soy Pedro Picapiedra con dni: 12345678 tengo 29 años ¿Estoy casado?false";
		
		assertEquals(resultadoEsperadoString, resultadoString);
	}
	
	
	

}
