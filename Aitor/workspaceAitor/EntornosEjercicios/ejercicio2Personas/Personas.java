package ejercicio2Personas;

public class Personas {
	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numeroDocumentoIdentidad;
	//metodos
	public Personas() {}

	public Personas(String nombre, String apellidos, String numeroDocumentoIdentidad, int edad, boolean casado) {
		setNombre(nombre);
		setApellidos(apellidos);
		setNumeroDocumentoIdentidad(numeroDocumentoIdentidad);
		setEdad(edad);
		setCasado(casado);
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}
	public String getApellidos()
	{
		return this.apellidos;
	}
	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad)
	{
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
	}
	public String getNumeroDocumentoIdentidad()
	{
		return this.numeroDocumentoIdentidad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public void setCasado(boolean casado)
	{
		this.casado = casado;
	}
	public boolean getCasado()
	{
		return this.casado;
	}

}