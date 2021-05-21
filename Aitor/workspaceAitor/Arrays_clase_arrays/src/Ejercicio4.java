import java.util.Arrays;

public class Ejercicio4 {
	 public static void main(String[] args) {

	        // Creamos el vector
	        int vector[] = new int[30];

	        // Introducimos valores aleatorios en el rango [0,9]
	        for (int i = 0; i < vector.length; i++) {
	            vector[i] = (int) (Math.random() * 10);
	        }
	        
	        // Ordenamos el vector
	        Arrays.sort(vector);
	        
	        // Mostramos el vector
	        String vectorStr = Arrays.toString(vector);
	        System.out.println(vectorStr);

	    }
}
