package modeloExamen1;

public class Alumno extends Persona {
	
	
	private String nMatricula, grupo;
	
	public Alumno(String dni, String apellido, String nombre, int diaCumple, int mesCumple, int nMatricula, String grupo) {
		super(dni, apellido, nombre, diaCumple, mesCumple);
		this.nMatricula = "M" + Integer.toString(nMatricula);
		this.grupo = grupo;
	}
	
	public String getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "ALUMNO - DNI: "+ super.getDni() + "\n Nombre: " + super.getNombre() + "\n Apellido: " + super.getApellido()
		+ "\n Numero de matricula: " + this.getnMatricula() + "\n Grupo: " + this.getGrupo()+"\n";
	}

}
