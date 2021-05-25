package examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	private static Reserva[] arrReserva = new Reserva[10];
	private static int puntero = -1;
	private static int identificador = 1;

	public static void main(String[] args) throws Exception {
		System.out.println(" -------- BIENVENIDO -------- \n");

		leerArchivo();

		while (true) {

			String menuHotel = "\nOpciones para hoteles\n 1- Cama y desayuno (40€ persona y dia)\n 2- Media pension (60€ persona y dia)"
					+ "\n 3- Pension completa (75€ persona y dia)\nInserte eleccion: ";

			String menuApartamento = "\nOpciones para apartamentos\n 1- Estudio (50€ dia)\n 2- Dos dormitorios (70€ dia)"
					+ "\n 3- Duplex (100€ Dia)\nInserte eleccion: ";

			String menu = "Menú\n 1 - Realizar reserva\n 2- Mostrar lista de reservas "
					+ "(Ord. mayor a menor segun dias)\n 3- Cancelar reserva en base al Identificador\n 4- Salir\n\nInserte elección:";

			int opcion = Reader.leerInt(menu, 1, 5);
			switch (opcion) {
			case 1:
				System.out.println("\n *** Realizar reserva ***\n\nIntroducir datos.\n");
				addReserva(menuHotel, menuApartamento);

				break;
			case 2:
				System.out.println("\n *** Mostrar reservas ordenadas ***\n");
				mostrarOrdenado();

				break;
			case 3:
				System.out.println("\n *** Cancelar reserva ***\n");

				int iden = Reader.leerInt("Introduzca el identificador de la reserva: ");
				eliminar(iden);

				break;
			case 4:
				System.out.println("Agur");
				Salir();
				System.exit(0);
				break;
			}

		}
	}

	public static void leerArchivo() throws Exception {
		FileReader file = new FileReader("c:\\examen25\\reservas.txt");
		BufferedReader buf = new BufferedReader(file);
		String linea;

		while ((linea = buf.readLine()) != null) {

			String[] datos = linea.split(";");
			String[] d2 = datos[5].split(" ");
			

			Reserva res = new Reserva(datos[0], datos[1], datos[2], datos[3], datos[4], d2[0]);

			try {
				arrReserva[puntero + 1] = res;
				puntero++;
			} catch (Exception e) {
				System.out.println("La lista esta entera");
			}

			if (identificador < Integer.parseInt(datos[0])) {
				identificador = Integer.parseInt(datos[0]) + 2;
			}

		}
		buf.close();
		file.close();
	}

	private static void addReserva(String menuHotel, String menuApartamento) {
		String dni = Reader.leerdni(" - Introduzca DNI:");
		int numeroPersonas = Reader.leerInt(" - Introduzca Numero de personas:", 1, 99);
		int numeroDias = Reader.leerInt(" - Introduzca Numero de dias para la estancia:", 1, 365);
		int tipoReserva = Reader.leerInt(" - Introduzca 1 para HOTEL o 2 para APARTAMENTO: ", 1, 2);
		int eleccionHabitacion;
		if (tipoReserva == 1) {
			eleccionHabitacion = Reader.leerInt(menuHotel, 1, 3);

			try {
				arrReserva[puntero + 1] = new Reserva(identificador, dni, numeroDias, numeroPersonas, "hotel",
						eleccionHabitacion);
				puntero++;
				System.out.println("Se ha annadido correctamente");
			} catch (Exception e) {
				System.out.println("La lista esta entera");
			}

		} else {
			eleccionHabitacion = Reader.leerInt(menuApartamento, 1, 3);

			try {
				arrReserva[puntero + 1] = new Reserva(identificador, dni, numeroDias, numeroPersonas, "apartamento",
						eleccionHabitacion);
				puntero++;
				System.out.println("Se ha annadido correctamente");
			} catch (Exception e) {
				System.out.println("La lista esta entera");
			}

		}
		identificador++;
	}

	private static void mostrarOrdenado() {
		System.out.println(
				"ID ------- DNI ------- NUM DIAS ------- NUM PERSONAS ------- TIPO SERVICIO ------- PRECIO TOTAL\n");

		ordenarLista();
		if (puntero < 0) {
			System.out.println("\n ERROR: NO HAY DATOS PARA ORDENAR \n");
		} else {
			for (int i = 0; i <= puntero; i++) {
				System.out.println(arrReserva[i].toString());
			}
			System.out.println();
		}
	}

	public static void ordenarLista() {
		boolean ok = false;
		boolean cambio = false;
		Reserva aux;
		while (!ok) {
			for (int i = 0; i < puntero; i++) {
				if (arrReserva[i].getNumeroPersonas() > arrReserva[i + 1].getNumeroPersonas()) { // Aquí va la
																									// comparativa
					aux = arrReserva[i];
					arrReserva[i] = arrReserva[i + 1];
					arrReserva[i + 1] = aux;
					cambio = true;
				}
			}
			if (!cambio) {
				ok = true;
			}
			cambio = false;
		}
	}

	public static void eliminar(int iden) {

		for (int ct0 = 0; ct0 <= puntero; ct0++) {
			System.out.println(arrReserva[ct0].getIdentificador());
			if (arrReserva[ct0].getIdentificador() == iden) {
				for (int ct1 = ct0; ct1 <= puntero; ct1++)
					arrReserva[ct1] = arrReserva[ct1 + 1];
				puntero--;
				System.out.println(iden + " Eliminada correctamente");
				return;
			}
		}
		System.out.println("No existe esa reserva");

	}

	public static void Salir() throws IOException {
		// volcar al fichero el ArrayList
		FileWriter fichero = new FileWriter("c:\\examen25\\reservas.txt");
		String linea = "";
		for (int ct0 = 0; ct0 <= puntero; ct0++) {
			linea = arrReserva[ct0].getIdentificador() +";" +arrReserva[ct0].getDni() + ";" + arrReserva[ct0].getNumeroDias() + ";"
					+ arrReserva[ct0].getNumeroPersonas() + ";" + arrReserva[ct0].getTipoAlojamiento() + ";" + arrReserva[ct0].getPrecioTotal()+ " euros\n";

			fichero.write(linea);
		}
		fichero.close();
	}

}
