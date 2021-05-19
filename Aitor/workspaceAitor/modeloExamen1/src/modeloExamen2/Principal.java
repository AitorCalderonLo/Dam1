package modeloExamen2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Principal {
	static Mascota[] arrayMascotas = new Mascota[10];
	static int ocupado = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// leer datosMascotas.txt y cargar array
		LeerMascotas();

		String menu = "1. Añadir mascota\r\n2. Mostrar datos\r\n3. Modificar mascota\r\n4. eliminar mascota \r\n5. Eliminar mascota por DNI del dueño \r\n6. Listar mascotas por DNI del dueño \r\n7. Salir";
		while (true) {
			int opcion = Reader.leerInt(menu, 1, 7);
			switch (opcion) {

			case 1:
				AniadirMascota();
				break;
			case 2:
				MostrarDatos();
				break;
			case 3:
				ModificarMascota();
				break;
			case 4:
				int iden = Reader.leerInt("Introduzca el identificador de la mascota");
				EliminarMascota(iden);
				break;
			case 5:
				String DNI = Reader.leerString("Introducir DNI");
				EliminarMascotaDNI(DNI);
				break;
			case 6:
				String DNI1 = Reader.leerString("Introducir DNI");
				ListarMascotaporDuenio(DNI1);
				break;
			case 7:
				Salir();
				System.exit(0);
				break;
			}
		}

	}

	public static void LeerMascotas() throws Exception {
		FileReader file = new FileReader("c:\\temporal\\datosMascotas.txt");
		BufferedReader buf = new BufferedReader(file);
		String linea;

		while ((linea = buf.readLine()) != null) {

			String[] datos = linea.split(",");

			if (datos[0].equalsIgnoreCase("P")) {
				boolean pulgas = false;
				if (datos[5].equalsIgnoreCase("S"))
					pulgas = true;

				Perro perro = new Perro(Integer.parseInt(datos[1]), datos[6], datos[2], Double.parseDouble(datos[3]),
						datos[4], pulgas);

				AniadirMascota(perro);
			}
			if (datos[0].equalsIgnoreCase("G")) {
				Gato gato = new Gato(Integer.parseInt(datos[1]), datos[2], Double.parseDouble(datos[3]), datos[6],
						datos[4], tipoPelo.valueOf(datos[5]));

				AniadirMascota(gato);
			}

		}
		buf.close();
		file.close();
	}

	public static void AniadirMascota() {

		int iden = Reader.leerInt("introducir el identificador");
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getIden() == iden) {
				System.out.println("Ese identificador ya existe");
				return;
			}
		}
		String nombre = Reader.leerString("introducir el nombre");
		String duenio = Reader.leerString("introducir el DNI del dueño");
		double edad = Reader.leerDouble("introducir la edad");

		Mascota mascota;
		int tipo = Reader.leerInt("introduzca 1 si es perro y 2 si es gato", 1, 2);
		if (tipo == 1) {
			String raza = Reader.leerString("introducir raza");
			boolean pulgas = Reader.leerBoolean("introducir S si tiene pulgas, N en caso contrario");
			Perro p = new Perro(iden, duenio, nombre, edad, raza, pulgas);
			mascota = p;
		} else {
			String color = Reader.leerString("introducir color");
			tipoPelo pelo = Reader.leerPelo("intro pelo");
			Gato g = new Gato(iden, nombre, edad, duenio, color, pelo);
			mascota = g;
		}

		AniadirMascota(mascota);

	}

	public static void MostrarDatos() {
		for (int ct0 = 0; ct0 < ocupado; ct0++)
			System.out.println(arrayMascotas[ct0].toString());
	}

	public static void ModificarMascota() {
		// modificar nombre y edad
		int iden = Reader.leerInt("Introduzca el identificador de la mascota");
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getIden() == iden) {
				String nombre = Reader.leerString("Introduzca nuevo nombre");
				int edad = Reader.leerInt("Introduzca edad de la mascota");
				arrayMascotas[ct0].setEdad(edad);
				arrayMascotas[ct0].setNombre(nombre);
				return;
			}
		}
		System.out.println("No existe esa mascota");

	}

	public static void EliminarMascota(int iden) {

		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getIden() == iden) {
				for (int ct1 = ct0; ct1 < ocupado; ct1++)
					arrayMascotas[ct1] = arrayMascotas[ct1 + 1];
				ocupado--;
				return;
			}
		}
		System.out.println("No existe esa mascota");

	}

	public static void EliminarMascotaDNI(String DNI) {
		boolean existeDuenio = false;
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getDuenio().equalsIgnoreCase(DNI)) {
				existeDuenio = true;
				for (int ct1 = ct0; ct1 < ocupado; ct1++)
					arrayMascotas[ct1] = arrayMascotas[ct1 + 1];
				ocupado--;
				ct0--;

			}
		}
		if (!existeDuenio)
			System.out.println("No existe esa mascota");

	}

	public static void ListarMascotaporDuenio(String DNI) {
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getDuenio().equalsIgnoreCase(DNI)) {
				System.out.println(arrayMascotas[ct0].toString());
			}
		}
	}

	public static void Salir() throws IOException {
		// volcar al fichero el ArrayList
		FileWriter fichero = new FileWriter("c:\\temporal\\datosMascotas22.txt");
		String linea = "";
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0] instanceof Gato) {
				linea = "G,";
				linea += arrayMascotas[ct0].getIden() + "," + arrayMascotas[ct0].getNombre() + ","
						+ arrayMascotas[ct0].getEdad() + ",";
				linea += ((Gato) arrayMascotas[ct0]).getColor() + "," + ((Gato) arrayMascotas[ct0]).getPelo().toString()
						+ ",";
				linea += arrayMascotas[ct0].getDuenio() + ";";
			}
			if (arrayMascotas[ct0] instanceof Perro) {
				linea = "P,";
				linea += arrayMascotas[ct0].getIden() + "," + arrayMascotas[ct0].getNombre() + ","
						+ arrayMascotas[ct0].getEdad() + ",";
				linea += ((Perro) arrayMascotas[ct0]).getRaza() + ","
						+ (((Perro) arrayMascotas[ct0]).isPulgas() ? "S" : "N") + ",";
				linea += arrayMascotas[ct0].getDuenio() + ";";
			}

			fichero.write(linea);
		}
		fichero.close();
	}

	public static void AniadirMascota(Mascota mascota) {
		for (int ct0 = 0; ct0 < ocupado; ct0++) {
			if (arrayMascotas[ct0].getIden() == mascota.getIden()) {
				System.out.println("Ese identificador ya existe");
				return;
			}
		}
		arrayMascotas[ocupado] = mascota;
		ocupado++;

	}

}