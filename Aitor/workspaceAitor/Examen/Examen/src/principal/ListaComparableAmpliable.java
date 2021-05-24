package principal;

public class ListaComparableAmpliable {
	
	private int[] lista;
	
	public ListaComparableAmpliable() {
		lista = new int[0];
	}
	
	public void addElemento(int elemento) {
		if(lista.length == 0) {
			int[] listaNueva = new int[lista.length +1];
			for(int i = 0; i<lista.length;i++) {
				listaNueva[i] = lista[i];
			}
			listaNueva[listaNueva.length -1] = elemento;
			lista = listaNueva;
		}
		else {
			int pos = buscarElemento(elemento);
			if (pos != -1) {
				int[] listaNueva = new int[lista.length +1];
				listaNueva[listaNueva.length -1] = elemento;
				lista = listaNueva;
			}
		}
	}
	
	public int buscarElemento(int elemento) {
		int pos = -1;
		for(int i = 0; i<lista.length;i++) {
			if(lista[i] == elemento) {
				pos = i;
			}
		}
		return pos;
	}
	
	public int cogerElementoPosicion(int pos) {
		return lista[pos];
	}
	
	public void cambiarElementoPos(int pos, int elemento) {
		lista[pos] = elemento;
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
