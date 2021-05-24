package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		leer();
		
	}
	public static void  leer() throws Exception
	{
		FileReader file=new FileReader("c:\\temporal\\informacion.txt");
		BufferedReader buf = new BufferedReader(file);
		String linea;
		FileWriter fichero=new FileWriter("c:\\temporal\\informacion2.txt");

		while ((linea = buf.readLine()) != null)
		{
			String d = "";
			String[] datos=linea.split("--");
			for (int i = 0; i < datos.length; i++) {
				d+=datos[i];
				if(i==datos.length-1) {
					
				}
				else
				{
					d+=",";
				}
				
			}
			d+="\n";
			fichero.write(d);
			 
				
		}
		buf.close();
		file.close();
		fichero.close();
	}
	
}
