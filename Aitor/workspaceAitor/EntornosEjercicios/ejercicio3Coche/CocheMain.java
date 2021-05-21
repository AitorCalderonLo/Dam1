package ejercicio3Coche;

import java.util.Random;

public class CocheMain {

	public static void main(String[] args) {
		Coche c=new Coche();
		Random objetoRandom = new Random();
		int enteroAleatorio = objetoRandom.nextInt(10)+1;
		c.acelera(enteroAleatorio);

		enteroAleatorio = objetoRandom.nextInt(10)+1;
		c.frena(enteroAleatorio);

		int velo1=c.getVelocidad();

		enteroAleatorio = objetoRandom.nextInt(10)+1;
		c.acelera(enteroAleatorio);

		enteroAleatorio = objetoRandom.nextInt(10)+1;
		c.frena(enteroAleatorio);

		int velo2=c.getVelocidad();

		System.out.println("La velocidad del primer coche es "+velo1+" km/h.");
		System.out.println("La velocidad del segundo coche es "+velo2+" km/h.");

		if(velo1>velo2) {
			System.out.println("El primer coche es más rapido que el segundo.");
		}else if(velo2>velo1) {
			System.out.println("El segundo coche es más rapido que el primero.");
		}else {
			System.out.println("Empate.");
		}

	}

}