package principal;

public class ListaComparableNoAmpliable {
	
	private int[] lista;
	private int tamano;
	
	public ListaComparableNoAmpliable(int tamano) {
		this.tamano = tamano;
		lista = new int [tamano];
	}
	
	public void addPosicion(int pos, int elemento) {
		if(pos<tamano) {
			lista[pos] = elemento;
		}
		else {
			System.out.println("Tienes que colocar el elemento en una posicion valida, de 0 a " + (tamano-1));
		}
	}
	
	public void addElemento(int elemento) { //Annade un elemento en la primera posicion vacia (0 en el caso de enteros)
		int pos = 0;
		for(int i = 0; lista[i]!=0 && i<tamano;i++) { //Con un objeto la comparativa seria si es null
			pos = i;
		}
		if(pos != tamano) {
			pos = pos+1;
			addPosicion(pos, elemento);
		}
		else {
			System.out.println("Ya estan ocupados todos los huecos de la lista");
		}
	}
	
	public void eliminarElemento(int pos) {
		lista[pos] = 0; //O null
	}
	
	public void ordenarLista() {
		boolean ok = false;
		boolean cambio = false;
		int aux = 0;
		while(!ok) {
			for(int i = 0;i< lista.length-1;i++) {
				if(lista[i] > lista[i+1]) { //Aquí va la comparativa
					aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = aux;
					cambio = true;
				}
			}
			if(!cambio) {
				ok = true;
			}
			cambio = false;
		}
	}
	
	public void ordenarListaMasAMenos() {
		boolean ok = false;
		boolean cambio = false;
		int aux = 0;
		while(!ok) {
			for(int i = 0;i< lista.length-1;i++) {
				if(lista[i] < lista[i+1]) { //Aquí va la comparativa
					aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = aux;
					cambio = true;
				}
			}
			if(!cambio) {
				ok = true;
			}
			cambio = false;
		}
	}

}
