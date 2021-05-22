package TestUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEjercicios1 {

	private Ejercicios1 ejercicios1 = new Ejercicios1();
	private double altura;
	private double diametro;
	private double resultado;
	private String resultadoString; 
	private double resultadoEsperado;
	private String resultadoEsperadoString;
	private double precio1;
	private double precio2;
	private double precio3;
	private int caudal;
	private int entrega;
	private int precioAnt;
	private int inflacion;
	
	@Test
	public void testVolumenCilindro() {
		diametro = 14;
		altura = 10;
		resultadoEsperado = 1539.38;
		resultado = ejercicios1.volumenCilindro(altura, diametro);
		
		assertEquals(resultadoEsperado, resultado, 0.001);
	}
	
	@Test
	public void testPrecioMedio() {
		precio1=10;
		precio2=50;
		precio3=90;
		resultado=ejercicios1.precioMedio3Valores(precio1, precio2, precio3);
		
		assertEquals(50, resultado, 0);
	}
	
	@Test
	public void testTiempoLlenadoDeposito() {
		diametro = 14;
		altura = 10;
		caudal = 2;
		resultado = ejercicios1.tiempoLlenadoDeposito(altura, diametro, caudal);
		
		assertEquals(769.69, resultado, 0.001);
	}
	
	@Test
	public void testRepartoVacunasAlerta() {
		entrega = 815;
		resultadoString = ejercicios1.repartoVacunas(entrega);  
		resultadoEsperadoString = "Alerta menos de 200!!!";
		
		assertEquals(resultadoString, resultadoEsperadoString);
	}
	
	@Test
	public void testRepartoVacunasCorrecto() {
		entrega = 300;
		resultadoString = ejercicios1.repartoVacunas(entrega);  
		resultadoEsperadoString = "Vacunas entregadas correctamente";
		
		assertEquals(resultadoString, resultadoEsperadoString);
	}
	
	@Test
	public void testPrecioActual() {
		
		precioAnt= 10;
		inflacion = 1500;
		resultado = ejercicios1.PrecioActual(precioAnt, inflacion);
		
		assertEquals(resultado, 160, 0);
	}

}
	
	
	
	


