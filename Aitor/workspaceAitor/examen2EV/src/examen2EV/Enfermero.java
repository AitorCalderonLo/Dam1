package examen2EV;

public class Enfermero extends Profesional {

	private String especialidad;
	private int anyoFinCarrera;

	public Enfermero(String nomApe, int numeroColegiado, int edad, String especialidad, int anyoFinCarrera) {

		super(nomApe, numeroColegiado, edad);
		this.especialidad = especialidad;
		this.anyoFinCarrera = anyoFinCarrera;

	}

	public Enfermero() {

	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getAnyoFinCarrera() {
		return anyoFinCarrera;
	}

	public void setAnyoFinCarrera(int anyoFinCarrera) {
		this.anyoFinCarrera = anyoFinCarrera;
	}

	@Override
	public String toString() {

		return "*** ENFERMERO ***" + "Numero de colegiado: " + super.getNumeroColegiado() + " Nombre y apellidos: "
				+ super.getNomApe() + " Edad :" + super.getEdad() + " Especialidad :" + especialidad
				+ " Año fin de carrera :" + anyoFinCarrera;

	}

}
