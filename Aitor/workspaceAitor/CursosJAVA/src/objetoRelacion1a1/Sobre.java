package objetoRelacion1a1;

public class Sobre {

	private String color;
	
	private Galleta galleta; 
	
	
	public Sobre(String color, String sabor, double precio) {
		super();
		this.color = color;
		this.galleta = new Galleta(sabor,precio);
	}

	
	
	public String getSabor() {
		return galleta.getSabor();
	}

	public void setSabor(String sabor) {
		galleta.setSabor(sabor);
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		//usado delegacion
		return 0.1+galleta.getPrecio();
	}
	
	
	
}
