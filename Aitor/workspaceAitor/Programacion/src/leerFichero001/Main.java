package leerFichero001;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {

			// Lectura línea a línea
			String filePath = new File("").getAbsolutePath();

			FileReader fichero2 = new FileReader(filePath.concat("\\src\\leerFichero001\\prueba.txt"));

			BufferedReader buf = new BufferedReader(fichero2);
			String linea;
			int pares = 0;
			String printear = "";

			while ((linea = buf.readLine()) != null) {
				if (pares % 2 == 0) {
					printear += linea + "\n";

				}
				pares++;

			}
			buf.close();
			fichero2.close();

			System.out.println(printear);

			// Para abrir el fichero sobreescribiendo
			FileWriter fich = new FileWriter(filePath.concat("\\src\\leerFichero001\\resultado.txt"));

			fich.write(printear);

			fich.close();
			
			System.out.println("\n *** ARCHIVO ESCRITO CORRECTAMENTE ***");

		} catch (IOException ex) {
			System.err.println("No se puede leer del archivo: " + ex);
			System.exit(-1);
		}

	}

}
