package objetosIguales;

public class Principal {

	public static void main(String[] args) {
		
		// esto es una regla de negocio
		
		
		Persona p= new Persona("juan");
		Persona p1= new Persona("juan1");
		
		
		
		// forma rapida 
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		// forma directa 
		System.out.println(p.equals(p1));
		
		
		
		
		
		

	}

}
