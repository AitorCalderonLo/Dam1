package tienda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static String[] datosEmpresa = new String[3];
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static ArrayList<Producto> productosSeleccionados = new ArrayList<Producto>();
	static double total = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		try {

			String filePath = new File("").getAbsolutePath();

			// Extraer datos del archivo tienda a el array datosEmpresa
			cogerDatosEmpresa(filePath);

			// Insercion de productos en el arrayList Productos
			creacionProductos();

			// Seleccion de productos por parte del usuario SE ALMACENA EL TOTAL CORRECTAMENTE
			seleccionDeProductos();

			
			
		} catch (IOException ex) {
			System.err.println("No se puede leer del archivo: " + ex);
			System.exit(-1);
		}
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
		productos.add(new Producto("Pincho ", 1.75));
		productos.add(new Producto("Botella ", 1));
		productos.add(new Producto("Patatas ", 2.2));
		productos.add(new Producto("Cerveza", 1.50));
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
