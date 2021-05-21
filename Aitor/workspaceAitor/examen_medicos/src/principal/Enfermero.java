package principal;

public class Enfermero extends Profesional{
	
	private int anoFinalizacion;
	private String especialidad;
	
	
	
	public Enfermero (String nombreCompleto, int numColegiado, int edad, String especialidad, int anoFinalizacion) //Constructor con todos los parametros
	{
		super(nombreCompleto, numColegiado, edad);
		this.especialidad = especialidad;
		this.setAnoFinalizacion(anoFinalizacion);
	}
	
	public Enfermero() {}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getAnoFinalizacion() {
		return anoFinalizacion;
	}

	public void setAnoFinalizacion(int anoFinalizacion) {
		if(anoFinalizacion >= 1900 && anoFinalizacion <=2100) {
			this.anoFinalizacion = anoFinalizacion;
		}
		else {
			System.out.println("Anno de finalizacion erroneo, debe estar entre 1900 y 2100");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Especialidad: " + especialidad + " Anno de finalizacion: " + anoFinalizacion;
	}

	
	
}
