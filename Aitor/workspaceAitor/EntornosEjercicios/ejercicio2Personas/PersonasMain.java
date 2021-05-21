package ejercicio2Personas;

import java.util.Scanner;

public class PersonasMain {
	static Scanner entrada;

	public static void main(String[] args) {

		entrada=new Scanner(System.in);

		Personas p=new Personas();

		String nom="";
		String ape="";
		String dni="";
		int eda=0;
		boolean casao=false;

		for(int i=0;i<2;i++){

			System.out.println("Introduzca el nombre:");
			String dato=entrada.nextLine();
			p.setNombre(dato);

			System.out.println("Introduzca el apellido:");
			dato=entrada.nextLine();
			p.setApellidos(dato);

			System.out.println("Introduzca el DNI:");
			dato=entrada.nextLine();
			p.setNumeroDocumentoIdentidad(dato);

			System.out.println("Introduzca la edad:");
			int numero=0;
			boolean error=true;
			do
			{
				String cadena=entrada.nextLine();
				try {
					error=false;
					numero=Integer.parseInt(cadena);
				} catch(Exception e) {
					error=true;
					System.out.println("Debe introducir una opción válida");				
				}
			} while(error==true);
			p.setEdad(numero);

			error=true;
			while (error==true) {
				System.out.println("¿Esta casado? (S/N)");
				String eleccion=entrada.nextLine();
				if (eleccion.equals("s") || eleccion.equals("S")) {
					error=false;
					p.setCasado(true);
				}else if (eleccion.equals("n") || eleccion.equals("N")){
					error=false;
					p.setCasado(false);
				}else {
					System.out.println("Error!!! Introduzca una opción válida. (S/N)");
					error=true;
				}
			}

			if(numero>eda) {
				nom=p.getNombre();
				ape=p.getApellidos();
				dni=p.getNumeroDocumentoIdentidad();
				eda=p.getEdad();
				casao=p.getCasado();
			}

			System.out.println("Nombre: "+nom);
			System.out.println("Apellido: "+ape);
			System.out.println("DNI: "+dni);
			System.out.println("Edad: "+eda);
			System.out.println("Casado: "+casao);

		}


	}
}