package principal;

public class Profesional {
	
	protected String nombreCompleto;
	protected int numColegiado;
	protected int edad;
	
	public Profesional(String nombreCompleto, int numColegiado, int edad) { //Constructor con todos los parametros
		this.nombreCompleto = nombreCompleto;
		this.numColegiado = numColegiado;
		this.edad = edad;
	}
	
	public Profesional() {} //Constructor por defecto

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombreCompleto + " Numero de colegiado: " + this.numColegiado + " Edad: " + this.edad;
	}
	
	
}
