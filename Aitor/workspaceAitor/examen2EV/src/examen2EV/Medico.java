package examen2EV;

public class Medico extends Profesional {

	private int anyoObtencionMir;
	private boolean trabajadorPublico;

	public Medico(String nomApe, int numeroColegiado, int edad, int anyoObtencionMir, boolean trabajadorPublico) {
		super(nomApe, numeroColegiado, edad);
		this.anyoObtencionMir = anyoObtencionMir;
		this.trabajadorPublico = trabajadorPublico;
	}

	public Medico() {
	}

	public int getAnyoObtencionMir() {
		return anyoObtencionMir;
	}

	public void setAnyoObtencionMir(int anyoObtencionMir) {
		this.anyoObtencionMir = anyoObtencionMir;
	}

	public boolean isTrabajadorPublico() {
		return trabajadorPublico;
	}

	public void setTrabajadorPublico(boolean trabajadorPublico) {
		this.trabajadorPublico = trabajadorPublico;
	}

	@Override
	public String toString() {

		return "*** MEDICO ***" + "Numero de colegiado: " + super.getNumeroColegiado()  + " Nombre y apellidos: "
				+ super.getNomApe() +  " Edad : " + super.getEdad() + " Año obtencion MIR :"
				+ anyoObtencionMir + " ¿Trabajador publico? : " + trabajadorPublico;

	}

}
