package modeloExamen1;

import java.util.ArrayList;

public class Profesor extends Persona {

	private ArrayList<Materias> Materias = new ArrayList<Materias>();

	public Profesor(String dni, String apellido, String nombre, int diaCumple, int mesCumple, String materia, String grupo) {
		super(dni, apellido, nombre, diaCumple, mesCumple);
		addMateria(grupo, materia);
	}

	public ArrayList<Materias> getMaterias() {
		return Materias;
	}

	public void setMaterias(ArrayList<Materias> materias) {
		Materias = materias;
	}

	public void addMateria(String grupo, String nombreMateria) {
		Materias.add(new Materias(grupo, nombreMateria));

	}

	@Override
	public String toString() {
		
		String materiasYgrupo = "";
		
		for (int i = 0; i < Materias.size(); i++) {
			
			materiasYgrupo.concat(Materias.get(i).toString());
		}
		
		return "PROFESOR - DNI: "+ super.getDni() + "\n Nombre: " + super.getNombre() + "\n Apellido: " + super.getApellido()
		+ "\n Materias que imparte:\n " +  materiasYgrupo; 
	}

}
