package abstractas1;

public class Planetas extends Astros {

	private boolean tieneSatelites;
	private double distanciaAlSol, orbitaAlSol;

	public Planetas(String nombre, double radioEquatorial, String rotacion, double tempMedia, double gravedad, boolean tieneSatelites, double distanciaAlSol, double orbitaAlSol) {
		super(nombre, radioEquatorial, rotacion, tempMedia, gravedad);
		this.tieneSatelites = tieneSatelites;
		this.distanciaAlSol = distanciaAlSol;
		this.orbitaAlSol = orbitaAlSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}

	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(double distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public double getOrbitaAlSol() {
		return orbitaAlSol;
	}

	public void setOrbitaAlSol(double orbitaAlSol) {
		this.orbitaAlSol = orbitaAlSol;
	}

	@Override
	public String muestra() {
		return "\nPlaneta: " + super.getNombre() + "\n Radio equatorial: " + super.getRadioEquatorial()
				+ "\n Rotacion: " + super.getRotacion() + "\n Temperatura media: " + super.getTempMedia() + " Grados centigrados"
				+ "\n Gravedad: " + super.getGravedad() + "\n ¿Tengo Satelites? " + this.isTieneSatelites()
				+ "\n Distancia al sol: " + this.getDistanciaAlSol() + "\n orbita al sol: " + this.getOrbitaAlSol();
	}

}
