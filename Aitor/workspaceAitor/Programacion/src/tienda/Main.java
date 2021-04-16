package tienda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	static String[] datosEmpresa = new String[3];
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static ArrayList<Producto> productosSeleccionados = new ArrayList<Producto>();
	static double total = 0;
	static double cambioUsuario, resto;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		try {

			String filePath = new File("").getAbsolutePath();

			// Extraer datos del archivo tienda a el array datosEmpresa
			cogerDatosEmpresa(filePath);

			// Insercion de productos en el arrayList Productos
			creacionProductos();

			// Seleccion de productos por parte del usuario SE ALMACENA EL TOTAL
			// CORRECTAMENTE
			seleccionDeProductos();

			// Mostrar total al usuario y pedirle el dinero
			calcularCambio();

			// Crear archivo resumen
			crearResumen(filePath);

		} catch (IOException ex) {
			System.err.println("No se puede leer del archivo: " + ex);
			System.exit(-1);
		}
	}

	private static void crearResumen(String filePath) throws IOException {
		Calendar fecha = Calendar.getInstance();

		String nombre = "Ticket" + fecha.get(Calendar.YEAR) + (fecha.get(Calendar.MONTH) + 1)
				+ fecha.get(Calendar.DAY_OF_MONTH) + fecha.get(Calendar.HOUR_OF_DAY) + fecha.get(Calendar.MINUTE)
				+ fecha.get(Calendar.SECOND);

		Path path = Paths.get(filePath.concat("\\src\\tienda\\" + nombre + ".txt"));

		if (!Files.exists(path))
			Files.createFile(path);

		FileWriter fich = new FileWriter(filePath.concat("\\src\\tienda\\" + nombre + ".txt"));

		fich.write("\t" + datosEmpresa[0] + "\n\t" + datosEmpresa[1] + "\n\t" + datosEmpresa[2]
				+ "\n\n ************************* \n\n \tCASH RECEIPT \n\n ************************* \n\n"
				+ "Description\t\tPrice");

		for (int i = 0; i < productosSeleccionados.size(); i++) {
			fich.write("\n" + productosSeleccionados.get(i).getNombre() + "\t\t"
					+ productosSeleccionados.get(i).getPrecio());
		}

		fich.write("\n\n ************************* \n\nTotal\t\t" + total + "\nCash\t\t" + cambioUsuario
				+ "\nChange\t\t" + resto);

		fich.close();

		System.out.println("\n *** ARCHIVO CREADO CORRECTAMENTE ***");
	}

	private static void calcularCambio() {
		System.out.print("\n Coste total de la operacion = " + total + "€ \n Inserte pago del usuario: ");
		cambioUsuario = leerDouble(total, 9999.99);
		resto = cambioUsuario - total;
	}

	public static double leerDouble(double a, double b) {
		double d = 0;
		boolean error;
		do {
			try {
				error = false;
				d = Double.parseDouble(in.nextLine());
				if (d < a || d > b) {
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
		return d;
	}

	private static void seleccionDeProductos() {
		System.out.println("*** COMERCIO " + datosEmpresa[0] + " ***\n");
		System.out.println("Menú de compra:\n");

		int eleccion = 0;

		while (eleccion != productos.size()) {
			int i = 0;
			System.out.println();
			for (; i < productos.size(); i++) {
				System.out.println(i + " - " + productos.get(i).toString());

			}
			System.out.println(i + " - Finalizar \n");

			System.out.print("- INSERTE ELECCION:");
			eleccion = leerInt(0, productos.size());

			if (eleccion != productos.size()) {
				productosSeleccionados.add(productos.get(eleccion));
				System.out.println("\n Producto: " + productos.get(eleccion).getNombre() + "Añadido correctamente");
				total += productos.get(eleccion).getPrecio();
			}
		}

	}

	private static void creacionProductos() {
		productos.add(new Producto("Coca Cola", 2.2));
		productos.add(new Producto("Pincho  ", 1.75));
		productos.add(new Producto("Botella ", 1));
		productos.add(new Producto("Patatas ", 2.2));
		productos.add(new Producto("Cerveza ", 1.50));
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

	private static void cogerDatosEmpresa(String filePath) throws FileNotFoundException, IOException {
		// Lectura línea a línea

		FileReader ficheroDatosEmpresa = new FileReader(filePath.concat("\\src\\tienda\\tienda.txt"));

		BufferedReader buf = new BufferedReader(ficheroDatosEmpresa);
		String linea;

		for (int i = 0; (linea = buf.readLine()) != null; i++) {
			datosEmpresa[i] = linea.split("=")[1];
			// System.out.println(i + " " + datosEmpresa[i]);
		}

		buf.close();
		ficheroDatosEmpresa.close();
	}

}
