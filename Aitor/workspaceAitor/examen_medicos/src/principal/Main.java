package principal;

import java.util.Arrays;

public class Main {
	
	private static Profesional[] listaP = new Profesional[5];
	private static int puntero = -1;
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("-----Menu de profesionales de la medicina-----"
				+ "\n" + "1-Annadir Profesional"
				+ "\n" + "2-Borrar Profesinal"
				+ "\n" + "3-Mostrar Array"
				+ "\n" + "4-Copiar Array en otro"
				+ "\n" + "5-Salir");
		int opcion = Teclado.cogerInt();
		switch(opcion) {
		case 1:
			System.out.println("Elige el tipo de profesional" + "\n" + "1-Annadir enfermero" + "\n" + "2-Annadir Medico");
			int opcion2 = Teclado.cogerInt();
			switch(opcion2) {
			case 1:
				anadirEnfermero();
				break;
			case 2:
				anadirMedico();
				break;
			default:
				System.out.println("No se ha introducido un numero valido para el menu");
			}
			break;
		case 2:
			borrarProfesional();
			break;
		case 3:
			mostrarArray();
			break;
		case 4:
			copiar();
			break;
		case 5:
			System.out.println("Agur");
			System.exit(0);
			break;
		}
		}
	}
	
	//Los metodos deben ser estáticos para poder utilizarlos desde el main, si estuviesen en otra clase no haría falta pero por sencillez los dejaré aquí
	
	private static void anadirEnfermero() {
		System.out.println("Inserta el nombre");
		String nombre = Teclado.cogerString();
		System.out.println("Inserta el numero de colegiado");
		int numColegiado = Teclado.cogerInt();
		System.out.println("Inserta la edad");
		int edad = Teclado.cogerInt();
		System.out.println("Inserta la especialidad");
		String especialidad = Teclado.cogerString();
		int anoFinalizacion = 0;
		while(anoFinalizacion <1900 || anoFinalizacion > 2100) {
			System.out.println("Inserta el ano de finalizacion, entre 1900 y 2100 inclusive");
			anoFinalizacion = Teclado.cogerInt();
		}
		Enfermero enf = new Enfermero(nombre, numColegiado, edad, especialidad, anoFinalizacion);
		try {
			listaP[puntero+1] = enf;
			puntero++;
			System.out.println("Se ha annadido correctamente");
		}
		catch(Exception e) {
			System.out.println("La lista esta entera");
		}
	}
	
	private static void anadirMedico() {
		System.out.println("Inserta el nombre");
		String nombre = Teclado.cogerString();
		System.out.println("Inserta el numero de colegiado");
		int numColegiado = Teclado.cogerInt();
		System.out.println("Inserta la edad");
		int edad = Teclado.cogerInt();
		System.out.println("Indica si es publico");
		boolean publico = Teclado.cogerBoolean();
		int anoMir = 0;
		while(anoMir <1900 || anoMir > 2100) {
			System.out.println("Inserta el ano de finalizacion, entre 1900 y 2100 inclusive");
			anoMir = Teclado.cogerInt();
		}
		Medico med = new Medico(nombre, numColegiado, edad, anoMir, publico);
		try {
			listaP[puntero+1] = med;
			puntero++;
		}
		catch(Exception e) {
			System.out.println("La lista esta entera");
		}
	}
	
	//Para sencillez del usuario, se pide un numero de posicion del 1 al 5
	
	private static void borrarProfesional() {
		System.out.println("Introduce la posicion que deseas borrar, del 1 al 5");
		int pos = Teclado.cogerInt() - 1;
		if( pos < 0 || pos > 4) {
			System.out.println("No existe esa posicion");
		}
		else if(listaP[pos] == null){
			System.out.println("No existe un profesional en esa posicion");
		}
		else {
			for(int i = pos; listaP[i] != null && i<puntero; i++) {
				listaP[i] = listaP[i+1];
			}
			listaP[puntero] = null;
			puntero--;
			System.out.println("Profesional borrado correctamente");
		}
	}
	
	//El array se muestra enumerando cada profesional del 1 al 5 para sencillez del usuario
	
	private static void mostrarArray() {
		for(int i = 0; i<=puntero; i++) {
			System.out.println(i+1 + "- " + listaP[i].toString());
		}
	}
	
	private static void copiar() {
		System.out.println("Indica desde que posicion se copiara");
		int pos1 = Teclado.cogerInt()-1;
		if(pos1 < 0 || pos1 > 4) {
			System.out.println("Debe ser un numero entre 1 y 5");
			pos1 = Teclado.cogerInt()-1;
		}
		System.out.println("Indica hasta que posicion se copiara (NO INCLUIDO, 6 PARA COPIAR ENTERA)");
		int pos2 = Teclado.cogerInt()-1;
		if(pos2 < 0 || pos2 > 5 || pos2 < pos1) {
			System.out.println("Debe ser un numero entre 1 y 6");
			pos2 = Teclado.cogerInt()-1;
		}
		Profesional[] array2 = Arrays.copyOfRange(listaP, pos1, pos2);
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
	}
	
}
