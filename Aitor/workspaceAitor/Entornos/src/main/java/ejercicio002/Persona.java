package ejercicio002;

public class Persona {

	private String nombre, apellidos, dni;
	private int edad;
	private boolean casado;

	public Persona(String nombre, String apellidos, String dni, int edad, boolean casado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;

	}
	
	public Persona() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	@Override
	public String toString() {
		return "Soy " + this.nombre + " " + this.apellidos + " con dni: " + this.dni + " tengo " + this.getEdad()
				+ " años ¿Estoy casado?" + this.isCasado();
	}

}
