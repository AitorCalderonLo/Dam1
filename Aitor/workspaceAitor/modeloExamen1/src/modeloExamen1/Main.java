package modeloExamen1;

public class Main {

	static Persona[] arrayPersonas = new Persona[10];
	static int cantidad = 0;

	public static void main(String[] args) {

		System.out.println("Bienvenido al centro de estudios de elorrieta: \n");

		String menu = "** MENU **\n\n1. Añadir persona.\n" + "2. Mostrar datos\n" + "3. Modificar datos de alumno/profesor\n"
				+ "4. Eliminar alumno/profesor\n" + "5. Felicitar\n" + "6. Buscar alumno por grupo\n"
				+ "7. Buscar profesores por materia\n" + "8. Salir\n\nIndique su eleccion:";

		while (true) {

			int opcion = Reader.leerInt(menu, 1, 8);

			switch (opcion) {

			case 1:
				addPersona();
				break;
			case 2:
				mostrarDatos();
				break;
			case 3:
				break;
			case 4:
				eliminarDatos();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				// VOLCAR DATOS AL FICHERO
				System.exit(0);
				break;

			}

		}
	}

	private static void eliminarDatos() {
		System.out.println("\n** ELIMINAR DATOS **\n");
		
	}

	private static void mostrarDatos() {

		System.out.println("\n** DATOS DE PERSONAS **\n");

		if (cantidad == 0) {
			System.out.println("- No hay datos insertados aun, inserte datos.\n\n");
		} else {
			for (int i = 0; i < cantidad; i++) {
				System.out.println(i + " -  " +arrayPersonas[i].toString());
			}
		}

	}

	private static void addPersona() {

		int eleccion = Reader.leerInt("\nEscoja tipo de persona a crear:\n 1- Profesor\n 2- Alumno", 1, 2);

		if (eleccion == 1) {

			System.out.println("Insertar datos de profesor. \n");
			addArrProfesor();

		} else {
			System.out.println("Insertar datos de alumno. \n");
			addArrAlumno();

		}

		cantidad++;

	}

	private static void addArrAlumno() {

		String dni = Reader.leerdni("Inserte DNI con formato 12345678H: ");
		for (int i = 0; i < cantidad; i++) {
			if (dni.equalsIgnoreCase(arrayPersonas[i].getDni())) {
				System.out.println("Ya existe una persona con ese DNI.");
				addArrProfesor();
			}

		}

		String nombre = Reader.leerString("Inserte nombre: ");
		String apellido = Reader.leerString("Inserte Apellido: ");
		int diaCumple = Reader.leerInt("Inserte el dia de cumpleaños con numeros 1 - 31: ", 1, 31);
		;
		int mesCumple = Reader.leerInt("Inserte mes de cumpleaños con numeros 1 - 12: ", 1, 12);
		int matricula = arrayPersonas.length + 1;
		String grupo = Reader.leerString("Inserte grupo: ");

		arrayPersonas[cantidad] = new Alumno(dni, apellido, nombre, diaCumple, mesCumple, matricula, grupo);

	}

	private static void addArrProfesor() {

		String dni = Reader.leerdni("Inserte DNI con formato 12345678H: ");
		for (int i = 0; i < cantidad; i++) {
			if (dni.equalsIgnoreCase(arrayPersonas[i].getDni())) {
				System.out.println("Ya existe una persona con ese DNI.");
				addArrProfesor();
			}

		}

		String nombre = Reader.leerString("Inserte nombre: ");
		String apellido = Reader.leerString("Inserte Apellido: ");
		int diaCumple = Reader.leerInt("Inserte el dia de cumpleaños con numeros 1 - 31: ", 1, 31);
		int mesCumple = Reader.leerInt("Inserte mes de cumpleaños con numeros 1 - 12: ", 1, 12);
		String materia = Reader.leerString("Inserte materia 1 que imparte: ");
		String grupo = Reader.leerString("Inserte el grupo al que imparte la materia: " + materia);

		Profesor p = new Profesor(dni, apellido, nombre, diaCumple, mesCumple, materia, grupo);

		int eleccion = Reader.leerInt("¿Quiere añadir alguna materia mas para el profesor?:\n 1- Si\n 2- No", 1, 2);
		if (eleccion == 1) {
			p.addMateria(Reader.leerString("Inserte materia 1 que imparte: "),
					Reader.leerString("Inserte el grupo al que imparte la materia: "));
		}

		arrayPersonas[cantidad] = p;

	}

}
