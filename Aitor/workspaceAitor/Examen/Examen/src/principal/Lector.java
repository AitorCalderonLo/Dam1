package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lector {
	
	public ArrayList<Mezcla> leer(String path) {
		ArrayList<Mezcla> lista = new ArrayList<Mezcla>();
		FileReader archivo = null;
		BufferedReader buf = null;
		try {
			archivo = new FileReader(path);
			
			buf = new BufferedReader(archivo);
			String linea;
			
			while((linea = buf.readLine()) != null) {
				String[] listaS = linea.split(",");
				Mezcla m = new Mezcla(listaS);
				lista.add(m);
			}
			for(int i = 0; lista.size() > i;i++) {
				System.out.println(lista.get(i).toString());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			try {
				archivo.close();
				buf.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return lista;
	}
	
}
