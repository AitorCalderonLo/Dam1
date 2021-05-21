package Metodos;

import java.util.Random;

public class Metodos {
	final static int numElementos=5;
	public static int generarNumero() {
		Random objetoRandom = new Random(); 
		//int enteroAleatorio = objetoRandom.nextInt(limiteS)+limiteI;
		return objetoRandom.nextInt(100)+1;
	}
	public static int[] cargarTabla() {
		int[]	array=new int[numElementos];
		for (int contador=0;contador<numElementos;contador++)
			array[contador]=generarNumero();
		return array;
	}
	public static double prodImpares(int[] array) {
		double producto=1;
		for (int contador=0;contador<numElementos;contador++)
			if (contador%2!=0)
				producto*=array[contador];
		return producto;
	}
	public static double sumaPares(int[] array) {
		double suma=0;
		for (int contador=0;contador<numElementos;contador++)
			if (contador%2==0)
				suma+=array[contador];
		return suma;
	}
}
