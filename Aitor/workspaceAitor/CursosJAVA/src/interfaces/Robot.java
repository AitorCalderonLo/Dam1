package interfaces;

public class Robot {

	// composicion
	// se apoya en polimorfismo
	private Girable brazo;
	

	public Girable getBrazo() {
		return brazo;
	}

	public void setBrazo(Girable brazo) {
		this.brazo = brazo;
	}
	
	public void girarBrazo() {
		
		brazo.girar();
	}
	
	
}
