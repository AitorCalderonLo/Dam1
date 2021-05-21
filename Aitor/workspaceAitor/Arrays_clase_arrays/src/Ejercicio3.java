import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	 public static void main(String[] args) {

	        // Creamos los vectores
	        int v1[] = new int[10];
	        int v2[] = new int[10];

	        // Pedimos los 20 valores y los guardamos
	        Scanner entrada = new Scanner(System.in);
	        for (int i = 0; i < v1.length; i++) {
	            System.out.print("Introduce valor: ");
	            v1[i] = entrada.nextInt();
	        }
	        for (int i = 0; i < v2.length; i++) {
	            System.out.print("Introduce valor: ");
	            v2[i] = entrada.nextInt();
	        }

	        // Comparamos si son iguales
	        if (Arrays.equals(v1, v2)) {
	            System.out.println("Son iguales");
	        } else {
	            System.out.println("No son iguales");
	        }

	    }
}
