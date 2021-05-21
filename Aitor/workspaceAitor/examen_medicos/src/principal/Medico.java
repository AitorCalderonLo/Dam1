package principal;

public class Medico extends Profesional{
	
	private boolean publico;
	private int anoMir;
	
	public Medico (String nombreCompleto, int numColegiado, int edad, int anoMir, boolean publico) //Constructor por defecto
	{
		super(nombreCompleto, numColegiado, edad);
		this.setAnoMir(anoMir);
		this.publico = publico;
	}
	
	public Medico() {} //Constructor por defecto


	
	public int getAnoMir() {
		return anoMir;
	}

	public void setAnoMir(int anoMir) {
		if(anoMir >= 1900 && anoMir <=2100) {
			this.anoMir = anoMir;
		}
		else {
			System.out.println("Anno de obtencion del MIR erroneo, debe estar entre 1900 y 2100");
		}
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Anno de obtencion del MIR: " + this.anoMir + " Es un trabajador publico: " + this.publico;
	}
	
}
