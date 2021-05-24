package principal;

public class ListaComparableNoAmpliable2 {
	
	private int[] lista;
	private int puntero;
	private int tamano;
	
	public ListaComparableNoAmpliable2(int tamano) {
		this.tamano = tamano;
		lista = new int [tamano];
		puntero = 0;
	}
	
	public void addElemento(int elemento) { //Annade un elemento en la primera posicion vacia (0 en el caso de enteros)
		if(puntero != tamano) {
			lista[puntero] = elemento;
			puntero++;
		}
		else {
			System.out.println("Ya estan ocupados todos los huecos de la lista");
		}
	}
	
	public void eliminarElemento(int pos) {
		for(int i = pos; i<puntero-1;i++) {
			lista[i] = lista[i+1];
		}
		lista[puntero] = 0; //null si es un objeto
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
