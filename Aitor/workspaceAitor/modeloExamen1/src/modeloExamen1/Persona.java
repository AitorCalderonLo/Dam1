package modeloExamen1;

public abstract class Persona {
	
	private String dni,apellido,nombre;
	private int diaCumple,mesCumple;
	
	public Persona(String dni, String apellido, String nombre, int diaCumple, int mesCumple) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.diaCumple = diaCumple;
		this.mesCumple = mesCumple;		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiaCumple() {
		return diaCumple;
	}
	public void setDiaCumple(int diaCumple) {
		this.diaCumple = diaCumple;
	}
	public int getMesCumple() {
		return mesCumple;
	}
	public void setMesCumple(int mesCumple) {
		this.mesCumple = mesCumple;
	}
	
	

}
