
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Escribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// ruta relativa- buscar dónde deja el fichero
			//FileWriter fich = new FileWriter(".\\log.txt");

			// ruta absoluta - ¿qué pasa si no existe el directorio?
			//FileWriter fich = new FileWriter("C:\\temporal2\\log.txt");

			// nos aseguramos de que existe el directorio, si no es así
			// lo creamos
			Path path = Paths.get("c:\\temporal2");

		    if (!Files.exists(path)) 		           
		            Files.createDirectory(path);
		    
		    // Para abrir el fichero sobreescribiendo 
		    FileWriter fich = new FileWriter("C:\\temporal2\\log.txt");
		    
		    // Para abrir el fichero y añadir al final del mismo 
	//	    FileWriter fich = new FileWriter("C:\\temporal2\\log.txt",true);
	
					
			// ¿Qué pasa si ejecutamos dos veces seguida el mismo programa
			// Esto es: ¿Se añaden nuevas líneas?
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Calendar cal = Calendar.getInstance();
						
			fich.write("Escribir ejecutado "+ dateFormat.format(cal.getTime())+"\r\n");
			
			fich.close();

			
		} catch (IOException ex) {
			//ex.getMessage()
			
			System.err.println("No se puede escribir en el archivo porque  "
					+ "no existe y no puede ser creado o no puede ser abierto o es un directorio");
			System.exit(-1);
		}

	}

}
