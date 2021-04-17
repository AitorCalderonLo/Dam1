package objetoRelacion1aN;

import java.util.ArrayList;

public class CajaGalletas {

	
	private ArrayList<Galleta> galletas;
	
	public CajaGalletas() {
		
		galletas=new ArrayList<Galleta>();

	}

	public ArrayList<Galleta> getGalletas() {
		return galletas;
	}

	public void setGalletas(ArrayList<Galleta> galletas) {
		this.galletas = galletas;
	}
	
	public void addGalleta(Galleta galleta) {
		//delegando en el arraylist para añadir galletas
		galletas.add(galleta);
	}
	
	public void addGalleta(String sabor ,int precio) {
		
		galletas.add(new Galleta(sabor,precio));
	}
	
	public int totalGalletas() {
		
		return galletas.size();
	}
	
	public double precioTotal() {
		
		double total=0;
		// bucle for each y hemos delegado en el array y la galleta para hacer el calculo
		for(Galleta galleta: galletas) {
			
			total=total+galleta.getPrecio();
		}
		return total+1;
	}
	
	
	
	
	
	
}
