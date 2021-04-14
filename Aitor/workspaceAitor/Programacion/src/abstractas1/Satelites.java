package abstractas1;

public class Satelites extends Astros {

	private String planetaPerteneciente;
	private double distanciaPlanetaria, orbitaPlanetaria;
	
	public Satelites(String nombre, double radioEquatorial, String rotacion, double tempMedia, double gravedad, String planetaPerteneciente, double distanciaPlanetaria, double orbitaPlanetaria) {
		super(nombre, radioEquatorial, rotacion, tempMedia, gravedad);
		this.planetaPerteneciente = planetaPerteneciente;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.distanciaPlanetaria = distanciaPlanetaria;
	}

	public String getPlanetaPerteneciente() {
		return planetaPerteneciente;
	}

	public void setPlanetaPerteneciente(String planetaPerteneciente) {
		this.planetaPerteneciente = planetaPerteneciente;
	}

	public double getDistanciaPlanetaria() {
		return distanciaPlanetaria;
	}

	public void setDistanciaPlanetaria(double distanciaPlanetaria) {
		this.distanciaPlanetaria = distanciaPlanetaria;
	}

	public double getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	public void setOrbitaPlanetaria(double orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	@Override
	public String muestra() {
		return "\nSatelite: " + super.getNombre() + "\n Radio equatorial: " + super.getRadioEquatorial()
				+ "\n Rotacion: " + super.getRotacion() + "\n Temperatura media: " + super.getTempMedia() + " Grados centigrados"
				+ "\n Gravedad: " + super.getGravedad() + "\n Pertenezco al planeta: " + this.getPlanetaPerteneciente()
				+ "\n Distancia planetaria: " + this.getDistanciaPlanetaria() + "\n Orbita planetaria: "
				+ this.getOrbitaPlanetaria();
	}
}
