package bucleForEach;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
	
		ArrayList<String> milista= new ArrayList<String>();
		
		milista.add("hola");
			
		milista.add("que");
		
		milista.add("tal");
		
		milista.add("estas");
		
		for(int i=0;i<milista.size();i++) {
			
			System.out.println(milista.get(i));
		}
		
		// bucle for each
		for(String cadena:milista) {
			
			System.out.println(cadena);
		}
		
		boolean mivariable=milista.contains("adios");
		System.out.println(mivariable);
		
		milista.clear();
		milista.add("tal");
		
		System.out.println("*************************");
		milista.remove("tal");
		
		for(String cadena:milista) {
			
			System.out.println(cadena);
		}
		
	}

}
