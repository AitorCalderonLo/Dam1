package abstractas1;

public abstract class Astros {

	private String nombre, rotacion;
	private double radioEquatorial, tempMedia, gravedad;
	
	public Astros(String nombre, double radioEquatorial, String rotacion, double tempMedia, double gravedad) {
		this.nombre = nombre;
		this.radioEquatorial = radioEquatorial;
		this.rotacion = rotacion;
		this.tempMedia = tempMedia;
		this.gravedad = gravedad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadioEquatorial() {
		return radioEquatorial;
	}

	public void setRadioEquatorial(double radioEquatorial) {
		this.radioEquatorial = radioEquatorial;
	}

	public String getRotacion() {
		return rotacion;
	}

	public void setRotacion(String rotacion) {
		this.rotacion = rotacion;
	}

	public double getTempMedia() {
		return tempMedia;
	}

	public void setTempMedia(double tempMedia) {
		this.tempMedia = tempMedia;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}
	
	public abstract String muestra();
	
}
