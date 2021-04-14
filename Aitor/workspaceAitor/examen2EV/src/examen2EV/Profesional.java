package examen2EV;

public class Profesional {

	private String nomApe;
	private int numeroColegiado, edad;
	
	public Profesional(String nomApe, int numeroColegiado, int edad) {
		
		this.nomApe = nomApe;
		this.numeroColegiado = numeroColegiado;
		this.edad = edad;
		
	}
	
	public Profesional() {
		
	}

	public String getNomApe() {
		return nomApe;
	}

	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {

		return "*** PROFESIONAL ***" + "Numero de colegiado: " + numeroColegiado + "\n + " + "Nombre y apellidos: "
				+ nomApe + "\n + " + "Edad :" + edad;

	}

}
