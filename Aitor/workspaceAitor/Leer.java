package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Lectura caracter a caracter
			FileReader fichero = new FileReader("C:\\temporal\\resultados.txt");			
			
			int caracter=0;
			while (caracter!=-1) {
				caracter=fichero.read();
				if (caracter!=-1)
					System.out.print((char)caracter);
			}
			System.out.println("----------");
			fichero.close();

			//Lectura línea a línea
			FileReader fichero2 = new FileReader("C:\\temporal\\resultados.txt");
			
			BufferedReader buf = new BufferedReader(fichero2);
			String linea;
			
			
			while ((linea = buf.readLine()) != null)
				System.out.println(linea);
			buf.close();
			fichero2.close();

			
			
			
		} catch (IOException ex) {
			System.err.println("No se puede leer del archivo");
			System.exit(-1);
		}

	}

}
