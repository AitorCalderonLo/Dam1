import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

        // Creamos vector
        int vector[] = new int[1000];

        // Introducimos valores aleatorios en el rango [0,99]
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        // Pedimos valor N a buscar en el vector
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca valor entre 0 y 99 a buscar en el vector: ");
        int n = entrada.nextInt();

        // Buscamos la posición de N en el vector (primero debe estar ordenado)
        Arrays.sort(vector);
        int pos = Arrays.binarySearch(vector, n);
        
        // Si N existe
        if (pos >= 0) {
            // Buscamos cuantas veces aparece
            int veces = 0;
            for (int i = pos; i < vector.length; i++) {
                if (vector[i] == n) veces++;
                else break;
            }
            System.out.println("Sí existe en el vector. Aparece " + veces + " veces.");
        }
        // Si N no existe
        else {
            System.out.println("No existe en el vector.");
        }
    }
}
