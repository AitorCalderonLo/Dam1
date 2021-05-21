import Metodos.Metodos;

public class Principal {
	final static int numElementos=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[numElementos];
		array=Metodos.cargarTabla();
		burbuja(array);

	}
	public static void burbuja(int[] ArrayAOrdenar) {
        int contadorPrincipal, contadorSecundario, aux;
        String cadena="";
        String cadena2="Comparo ";
        
        for(int elemento: ArrayAOrdenar)
        	cadena+=elemento+"-";
        System.out.println("el Array Sin Ordenar-> "+cadena);
        
        for (contadorPrincipal = 0; contadorPrincipal < ArrayAOrdenar.length - 1; contadorPrincipal++) 
        {
        	// Comparo cada elemento del array con  los que est�n a su derecha en el array
        	// En la iteraci�n 0 comparo con todos
        	// En la iteraci�n 1 comparto con todos -1, porque el �ltimo elemento YA est� ordenado, es el MAYOR
        	// En la iteraci�n 2 comparto con todos -2, porque el �ltimo y el pen�ltimo elementos YA est�n ordenados 
            
        	for (contadorSecundario = 0; contadorSecundario < ArrayAOrdenar.length - contadorPrincipal - 1; contadorSecundario++) 
        	{
        		cadena2+=ArrayAOrdenar[contadorSecundario + 1]+" con "+ArrayAOrdenar[contadorSecundario]+", ";
                if (ArrayAOrdenar[contadorSecundario + 1] < ArrayAOrdenar[contadorSecundario]) {
                    aux = ArrayAOrdenar[contadorSecundario + 1];
                    ArrayAOrdenar[contadorSecundario + 1] = ArrayAOrdenar[contadorSecundario];
                    ArrayAOrdenar[contadorSecundario] = aux;
                    
                }
            }
            // Esto solo sirve para mostrar c�mo queda el array tras cada iteraci�n
            cadena="";
            for(int elemento: ArrayAOrdenar)
            {
            	cadena+=elemento+"-";
            	
            }
            System.out.println(cadena2);
            cadena2="Comparo ";
            System.out.println("el Array tras la iteraci�n "+contadorPrincipal+"-> "+cadena);
            System.out.println("----------------------------------------------");
            
            
        }
}
}
