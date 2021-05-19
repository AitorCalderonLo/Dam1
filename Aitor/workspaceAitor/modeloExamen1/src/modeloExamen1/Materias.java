package modeloExamen1;

public class Materias {

	private String grupo,materia;
	
	public Materias(String grupo, String materia) {
		this.grupo = grupo;
		this.materia = materia;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override 
	public String toString() {
		return "Materia: " + this.materia + "Grupo: " + this.grupo + "\n";
	}
	
}
