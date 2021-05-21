
public abstract class Persona {
	String DNI;
	String nombre;
	int dia;
	int mes;
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return DNI + " "  + nombre + ", " + dia + " del " + mes;
	}
	public Persona(String dNI, String nombre, int dia, int mes) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.dia = dia;
		this.mes = mes;
	}
	
	
	
	
}
