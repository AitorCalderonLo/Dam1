import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	 public static void main(String[] args) {

	        // Creamos el vector con las puntuaciones
	        int p[] = new int[10];

	        // Pedimos por teclado las puntuaciones
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Introduzca 10 números enteros");
	        for (int i = 0; i < p.length; i++) {
	            p[i] = entrada.nextInt();
	        }

	        System.out.print("Introduzca posición N");
	        int N =  entrada.nextInt();
	        
	        System.out.print("Introduzca posición N");
	        int M =  entrada.nextInt();
	        
	        System.out.println("Array 1 :" + Arrays.toString(p));
	        // Mostramos el array (de mayoir a menor)
	        
	        int[] p2 = Arrays.copyOfRange(p, N, M);
	        
	        System.out.println("Array 2 :" + Arrays.toString(p2));
	    }
}
