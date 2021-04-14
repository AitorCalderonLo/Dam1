package main;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Apertura del escaner
		
		Random rn = new Random(); //Se crea el objeto random
		
		int aleatorio = rn.nextInt(100)+1; //Entero generado aleatoriamente
		int enteroTec = 0; //Entero introducido por teclado
		boolean ok = true; //Booleano para controlar excepciones
		int intentos = 0;
		
		while(aleatorio!=enteroTec) { //Mientras que no acierte el numero, el juego seguira
			do {
				try { //Atrapamos la posible NumberFormatException generada por intentar darle un valor no válido a una variable de tipo int
					ok = true;
					System.out.println("Introduce un numero entero");
					enteroTec = Integer.parseInt(sc.nextLine());
				}
				catch(Exception e) {
					ok = false;
					System.out.println("Por favor introduce un numero entero");
				}

				
			}while(ok==false);
			
			if(aleatorio == enteroTec) { //Comprobamos el numero para saber que mensaje mostrar por pantalla. En cualquier caso, aumentamos el numero de intentos utilizados
				intentos++;
				System.out.println("Felicidades has acertado. Has necesitado " + intentos + " intentos");
			}
			else if(aleatorio>enteroTec){
				intentos++;
				System.out.println("Te has quedado corto");
			}
			else {
				intentos++;
				System.out.println("Te has pasado");
			}
		}
		
		sc.close();//Cierre del teclado
	}

}
