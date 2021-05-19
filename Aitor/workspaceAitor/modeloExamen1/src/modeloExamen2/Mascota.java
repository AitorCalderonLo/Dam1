package modeloExamen2;

public class Mascota {
	private int iden;
	private String nombre;
	private String duenio;
	private double edad;

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Mascota(int iden, String nombre, double edad, String duenio) {

		this.iden = iden;
		this.nombre = nombre;
		this.edad = edad;
		this.duenio = duenio;
	}

	public int getIden() {
		return iden;
	}

	public void setIden(int iden) {
		this.iden = iden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

}
