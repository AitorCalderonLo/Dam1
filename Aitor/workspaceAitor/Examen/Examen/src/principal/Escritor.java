package principal;

import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
	
	public void escribir(String path, String[] listaObjetos) {
		FileWriter escritorArchivo = null;
		try {
			escritorArchivo = new FileWriter(path);
			for(int i = 0; i<listaObjetos.length;i++) {
				escritorArchivo.write(listaObjetos[i]+"\n");
			}
			escritorArchivo.close();
		}
		catch(Exception e) {
			try {
				e.printStackTrace();
				escritorArchivo.close();
			}
			catch(IOException ioex) {
				System.out.println("Ha habido un error al cerrar el archivo");
			}
		}
	}
	
	/*
	 * Ejemplo de llamada a escribir
	 * esc.escribir("u:\\fichero.txt", lista);
	 * 
	 * 
	 * Para los paths:
	 * Path path = Paths.get("c:\\ficheros");
	 * 
	 * if(!Files.exists(path)){
	 * 		Files.createDirectory(path);
	 * }
	 * */
	
}
