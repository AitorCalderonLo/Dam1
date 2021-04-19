package objetosIguales;

public class Persona{

	private String nombre;
	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void andar() {
		
		System.out.println(getNombre()+" camina a 5 km/h");
	}
	
	

	@Override
	public boolean equals(Object persona) {
		
		Persona nueva= (Persona) persona;
		
		//devuelvo true en el caso de que el nombre coindice
		return nueva.getNombre().equals(this.getNombre()); 
		
	}

	@Override
	public int hashCode() {
	
		return nombre.hashCode();
	}
	
	
	
	
	
	
}
