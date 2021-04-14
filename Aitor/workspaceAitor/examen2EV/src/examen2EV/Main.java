package examen2EV;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);
	private static final int NUM = 5;
	private static Profesional[] arrProfesional = new Profesional[NUM];
	private static int cantProf = 0;
	//private static Enfermero a = new Enfermero();

	public static void main(String[] args) {

		
		 //Arrays.fill(arrProfesional, a);

		int eleccion = 0;

		while (eleccion != 5) {
			System.out.print("*** PANTALLA PRINCIPAL **\n\n" + "1 - Añadir profesional\n" + "2 - Borrar profesional\n"
					+ "3 - Mostrar Array\n" + "4 - Copiar Array en otro\n" + "5 - Salir\n\n" + "Introduce tu opcion:");
			eleccion = leerInt(1, 5);
			System.out.println();
			switch (eleccion) {
			case 1:
				annadirProfesional();
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
				break;
			default:
				System.out.println("Inserta un numero entre 1 y 5");
			}
		}

	}

	private static void copiar() {

		
		
		System.out.println("*** COPIAR ***");
		
		if(cantProf==0) {
			System.out.println("No hay profesionales metidos aun");
		}
		else
		{
			System.out.println("las posiciones del array seran las originales, es decir, la 0 es la primera posicion");

			System.out.print("\n Inserte posicion incial a copiar: ");
			int posicion1 = leerInt(0, cantProf);
			
			System.out.print("\n Inserte posicion final a copiar: ");
			int posicion2 = leerInt(posicion1, cantProf);

			int cantPosiciones = posicion2 - posicion1;

			Profesional[] arrayEspejo = new Profesional[cantPosiciones];

			System.arraycopy(arrProfesional, posicion1, arrayEspejo, 0, cantPosiciones);

			System.out.println("\n \n *** Mostrando array copiado *** \n\n");

			for (int i = 0; i < arrayEspejo.length; i++) {
				System.out.println(i + " - " + arrayEspejo[i].toString());
			}
			System.out.println();
		}
		
		

	}

	private static void mostrarArray() {

		System.out.println(" \n*** MOSTRAR ARRAY *** \n\n ");

		for (int i = 0; i < cantProf; i++) {
			System.out.println(i + " - " + arrProfesional[i].toString());
		}

	
	}

	private static void borrarProfesional() {

		System.out.println("*** BORRAR PROFESIONAL *** \n\n");

		if (cantProf > 0) {
			

			

			mostrarArray();
			
			System.out.print("\nInserte posicion a borrar: ");
			
			int eleccion = leerInt(0, cantProf - 1);

			// REORDENAR

			while (eleccion <= cantProf) {
				if (eleccion == arrProfesional.length - 1) {
					break;
				} else {
					arrProfesional[eleccion] = arrProfesional[eleccion + 1];
					eleccion++;
				}

			}
			cantProf--;
			System.out.println(" **** BORRADO CORRECTAMENTE");

		} else {
			System.out.println("\n\n NO EXISTEN PROFESIONALES EN EL SISTEM \n\n");
		}

	}

	private static void annadirProfesional() {
		int eleccion = 0;

		if (cantProf < NUM) {
			while (eleccion != 3) {
				System.out.println("*** AÑADIR PROFESIONAL ***\n\n" + "1 - Añadir enfermero\n" + "2 - Añadir Medico\n"
						+ "3 - Volver al menu principal\n" + "\n Introduce tu opcion:");
				eleccion = leerInt(1, 3);
				switch (eleccion) {
				case 1:

					Enfermero enf = anadirEnfermero();
					arrProfesional[cantProf] = enf;
					cantProf++;

					eleccion = 3;
					break;
				case 2:

					Medico med = anadirMedico();
					arrProfesional[cantProf] = med;
					cantProf++;

					eleccion = 3;
					break;
				case 3:
					System.out.println("Volviendo al menú principal");
					break;

				default:
					System.out.println("Inserta un numero entre 1 y 3");
				}
			}
		} else {
			System.out.println("Numero maximo de profesionales alcanzado, no se pueden añadir mas.");
		}

	}

	private static Medico anadirMedico() {
		System.out.println("\n\n***** AÑADIR MEDICO ******\n\n");
		System.out.print("Introduce el nombre completo: ");
		String nomApe = leerString();
		System.out.println("Introduce el numero de colegiado:");
		int numeroColegiado = leerInt(1, 999999999);
		System.out.println("Introduce la edad: ");
		int edad = leerInt(18, 130);
		System.out.println("Introduce el año de obtencion del mir");
		int anyoMir = leerInt(1900, 2100);
		System.out.println("¿Es un trabajador publico? Introduce S (SI) o N (NO)");
		boolean trabajadorPublico = leerBoolean();
		Medico m = new Medico(nomApe, numeroColegiado, edad, anyoMir, trabajadorPublico);
		return m;

	}

	private static Enfermero anadirEnfermero() {
		System.out.println("\n\n***** AÑADIR ENFERMERO ******\n\n");
		System.out.print("Introduce el nombre completo: ");
		String nomApe = leerString();
		System.out.println("Introduce el numero de colegiado:");
		int numeroColegiado = leerInt(1, 999999999);
		System.out.println("Introduce la edad: ");
		int edad = leerInt(18, 130);
		System.out.println("Introduce la especialidad");
		String especialidad = leerString();
		System.out.println("Introduce el año de fin de carrera: ");
		int anyoFinCarrera = leerInt(1900, 2100);
		Enfermero e = new Enfermero(nomApe, numeroColegiado, edad, especialidad, anyoFinCarrera);
		return e;

	}

	public static boolean leerBoolean() {
		boolean error;
		String s = "";
		do {
			try {
				error = false;
				s = in.nextLine();
				if (!s.equalsIgnoreCase("S") && !s.equalsIgnoreCase("N")) {
					error = true;
					System.out.print("Error. Introduce 'S' o 'N': ");
				}
			} catch (Exception e) {
				error = true;
				System.out.println("Error: " + e.getMessage() + ". Introduce 'S' or 'N' de nuevo : ");
			}
		} while (error);
		if (s.equalsIgnoreCase("S"))
			return true;
		else
			return false;
	}

	public static int leerInt(int a, int b) {
		int i = 0;
		boolean error;
		do {
			try {
				error = false;
				i = Integer.parseInt(in.nextLine());
				if (i < a || i > b) {
					error = true;
					System.out.print("Error. Debes introducir un número entre " + a + " y " + b + ": ");
				}
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);

		return i;
	}

	public static double leerDouble() {
		double d = 0;
		boolean error;
		do {
			try {
				error = false;
				d = Double.parseDouble(in.nextLine());
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return d;
	}

	public static String leerString() {
		String s = "";
		boolean error;
		do {
			try {
				error = false;
				s = in.nextLine();
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce un string de nuevo: ");
			}
		} while (error == true);
		return s;
	}

	public static char leerChar() {
		String s = "";
		boolean error;
		do {
			try {
				error = false;
				s = in.nextLine();
				if (s.length() != 1) {
					error = true;
					System.out.print("Error. Introduce un carácter: ");
				}
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce un carácter de nuevo: ");
			}
		} while (error == true);
		char c = s.charAt(0);
		return c;
	}

}
