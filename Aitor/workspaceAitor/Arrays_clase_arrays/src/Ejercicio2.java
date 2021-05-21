import java.util.Arrays;

public class Ejercicio2 {
public static void main(String[] args) {
        
        // Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for (int i = 1; i <= 10; i++) {
            cuantos += i;
        }

        // Creamos el vector
        int valores[] = new int[cuantos];

        // Posición donde insertar los números
        int pos = 0;
        
        // Para cada número n del 1 al 10
        for (int n = 1; n <= 10; n++) {
            
            // Introducimos n veces 'n' en la posición 'pos'
            Arrays.fill(valores, pos, pos + n, n);
            
            // Actualizamos pos
            pos += n;
        }

        // Mostramos el array
        String arrayStr = Arrays.toString(valores);
        System.out.println("Array: " + arrayStr);
    }
}
