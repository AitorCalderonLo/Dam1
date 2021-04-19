package interfaces;

public class AdaptadorBrazoAcero implements Girable {
	
	private BrazoAcero brazoAcero;

	public BrazoAcero getBrazoAcero() {
		return brazoAcero;
	}

	public void setBrazoAcero(BrazoAcero ba) {
		this.brazoAcero = ba;
	}

	public AdaptadorBrazoAcero(BrazoAcero ba) {
		super();
		this.brazoAcero = ba;
	}

	@Override
	public void girar() {
		// este es el método que adapta el brazo de acero al robot
		//usando delegacion
		brazoAcero.rotar();
		
	}

	
}
