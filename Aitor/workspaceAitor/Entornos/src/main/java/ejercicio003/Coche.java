package ejercicio003;

public class Coche {

	private int velocidad;
	
	public Coche() {}
	
	public Coche(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelera(int velocidad) {
		this.velocidad += velocidad;
	}
	
	public void frena(int velocidad) {
		this.velocidad -= velocidad;
	}
	
}
