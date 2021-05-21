package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ejercicio2Personas.Personas;

public class PersonasTest {

	private Personas p1 = new Personas("Alastor", "Williams", "66642013A", 30, false);
	private Personas p2 = new Personas();
	private String nombre1="Alastor";
	private String apellidos1="Williams";
	private String numeroDocumentoIdentidad1="66642013A";
	private int edad1=30;
	private boolean casado1=false;
	private String nombre2="Angel";
	private String apellidos2="Dust";
	private String numeroDocumentoIdentidad2="12345678D";
	private int edad2=28;
	private boolean casado2=true;

	@Test
	public void testConstructorVacio() {
		assertEquals(null, p2.getNombre());
		assertEquals(null, p2.getApellidos());
		assertEquals(null, p2.getNumeroDocumentoIdentidad());
		assertEquals(0, p2.getEdad(), 0);
		assertEquals(false, p2.getCasado());
	}

	@Test
	public void testConstructorSobrecargado() {
		assertEquals(nombre1, p1.getNombre());
		assertEquals(apellidos1, p1.getApellidos());
		assertEquals(numeroDocumentoIdentidad1, p1.getNumeroDocumentoIdentidad());
		assertEquals(edad1, p1.getEdad(), 0);
		assertEquals(casado1, p1.getCasado());
	}

	@Test
	public void testSetNombre() {
		p2.setNombre(nombre2);
		assertEquals(nombre2, p2.getNombre());
	}

	@Test
	public void testSetApellidos() {
		p2.setApellidos(apellidos2);
		assertEquals(apellidos2, p2.getApellidos());
	}

	@Test
	public void testSetNumeroDocumentoIdentidad() {
		p2.setNumeroDocumentoIdentidad(numeroDocumentoIdentidad2);
		assertEquals(numeroDocumentoIdentidad2, p2.getNumeroDocumentoIdentidad());
	}

	@Test
	public void testSetEdad() {
		p2.setEdad(edad2);
		assertEquals(edad2, p2.getEdad(), 0);
	}

	@Test
	public void testSetCasado() {
		p2.setCasado(casado2);
		assertEquals(casado2, p2.getCasado());
	}
}
