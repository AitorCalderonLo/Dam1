
public class Alumno extends Persona{
	@Override
	public String toString() {
		String cadena="ALUMNO:";
		cadena+=super.toString()+", "+matricula+","+grupo;
		return  cadena;
	}
	static int numMatri=1;

	public Alumno(String dNI, String nombre, int dia, int mes,String grupo) {
		super(dNI, nombre, dia, mes);
		// TODO Auto-generated constructor stub
		this.matricula="M"+String.valueOf(numMatri);
		numMatri++;
		this.grupo=grupo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	String matricula;
	String grupo;
}
