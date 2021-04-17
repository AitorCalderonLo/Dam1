package objetoRelacion1a1;

public class SobreDoble {

	private Galleta galleta1;
	private Galleta galleta2;
	
	public SobreDoble(String color,String sabor, double precio) {
		
		this.galleta1= new Galleta(sabor,precio/2);
		this.galleta2= new Galleta(sabor,precio/2);
		
	}
	
	public String getSabor() {
		
	return this.galleta1.getSabor();
	}
	
	public double getPrecio() {
		
		return 0.1 + this.galleta1.getPrecio()*2;
	}
	
	
	
	
}
