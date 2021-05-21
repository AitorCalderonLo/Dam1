import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
	static ArrayList <Persona> listapersonas =new ArrayList <Persona>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int opcion=0;
		do {
			opcion=Reader.leerInt("*********\nElija opción:\n1 añadir persona\n2 mostrar datos\n3 modificar datos\n4 eliminar\n5 felicitar\n6 buscar por grupo\n7 buscar profesor por materia\n8 salir\n");
		
			switch(opcion) {
				case 1:
					aniadirPersona();
					break;
				case 2:
					mostrar();
					break;
				case 3:
					modificar();
					break;
				case 4:
					eliminar();
					break;
				case 5:
					felicitar();
					break;
				case 6:
					mostrarAlumnosGrupo();
					break;
				case 7:
					mostrarProfesMateria();
					break;
				case 8:
				FileWriter fichP = null;
				FileWriter fichA = null;
				try {
					fichP = new FileWriter("Profesores.txt", false);
					fichA = new FileWriter("Alumnos.txt", false);
					for (int i = 0; i < listapersonas.size(); i++) 
					{
						if (listapersonas.get(i).getClass().equals(Profe.class)) 
							fichP.write(listapersonas.get(i).toString() + "\r\n");
						else if (listapersonas.get(i).getClass().equals(Alumno.class)) 
							fichA.write(listapersonas.get(i).toString() + "\r\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
				finally {
					if (fichA!=  null)	
						fichA.close();
					
					if (fichP!=null)
						fichP.close();
				}
				break;
				}
		}while (opcion!=8);
	}
	public static void mostrarAlumnosGrupo()
	{
		String grupo=Reader.leerString("Intro grupo");
		for(Persona p: listapersonas)
			if ((p instanceof Alumno) && (((Alumno)p).getGrupo().equalsIgnoreCase(grupo)))
					System.out.println(p.getNombre());
	}
	public static void mostrarProfesMateria()
	{
		String cadena="";
		String materia=Reader.leerString("Intro materia");
		for (Persona p: listapersonas)
			if (p instanceof Profe)
			{
				for (int ct0=0;ct0<((Profe)p).getMaterias().length;ct0++)
				{
					if (((Profe)p).getMaterias()[ct0][0]== null)
						break;
					if (((Profe)p).getMaterias()[ct0][0].equalsIgnoreCase(materia))
					{
						cadena+=p.getNombre()+" ";
					/*	for (int ct1=1;ct1<((Profe)p).getMaterias()[ct0].length;ct1++)
						{
							if (((Profe)p).getMaterias()[ct0][ct1]==null)
								break;
							System.out.print(((Profe)p).getMaterias()[ct0][ct1]+"\n");
						}*/
					}
				}
			}
		if (cadena.length()==0)
			cadena="No hay profesores que impartan esa materia";
		System.out.println(cadena);
	}
	public static void felicitar()
	{
		int mes=Reader.leerInt("Intro mes de cumple",1,12);
		int dia;
		while (true)
		{
			dia=Reader.leerInt("Intro dia de cumple",1,31);
			if (diaOk(dia,mes))
				break;
		}
		for (Persona p: listapersonas)
		{
			if ((p.getMes()==mes) && (p.getDia()==dia))
				System.out.println("Felicidades "+p.getNombre());
		}
	}
	public static Persona comprobarDNI()
	{
		String dni=Reader.leerdni("into DNI con letra");
		for(Persona p: listapersonas)
		{
			if (p.getDNI().equalsIgnoreCase(dni))
				return p;
		}
		return null;
	}
	public static void eliminar()
	{
		Persona p=comprobarDNI();
		if (p==null)
		{
			System.out.println("Ese DNI no existe");
			return;
		}
		listapersonas.remove(p);
	}
	public static void modificar()
	{
		Persona p=comprobarDNI();
		if (p==null)
		{
			System.out.println("Ese DNI no existe");
			return;
		}
		p.setDNI(Reader.leerString("Intro nuevo DNI"));
		p.setNombre(Reader.leerString("Intro nuevo nombre"));
		int mes=Reader.leerInt("Intro nuevo mes",1,12);
		p.setMes(mes);
		int dia;
		while (true)
		{
			dia=Reader.leerInt("Intro dia de cumple",1,31);
			if (diaOk(dia,mes))
				break;
		}
		p.setDia(dia);

		if (p instanceof Profe)
		{
			((Profe)p).pedirMaterias();
			return;
		}
		if (p instanceof Alumno)
		{
			((Alumno)p).setGrupo("Intro nuevo grupo");
			((Alumno)p).setMatricula("Intro nueva matricula");
		}
			
	}
	public static boolean diaOk(int dia,int mes) {
		switch (mes)
		{
			case 2:
				if (dia>29) return false;
				return true;
			case 4:
			case 6:
			case 9:			
			case 11:
				if (dia>30) return false;
		}
		return true;			
	}
	public static void mostrar()
	{
		String cadena="";
		for(Persona p:listapersonas)
			cadena+=p.toString();
		if (cadena.length()==0)
			cadena="No hay datos de alumnos ni de profes";
		System.out.println(cadena);
	}
	public static void aniadirPersona()
	{
		
		String nombre=Reader.leerString("Intro nombre");
		int mes=Reader.leerInt("Intro mes de cumple",1,12);
		int dia;
		while (true)
		{
			dia=Reader.leerInt("Intro dia de cumple",1,31);
			if (diaOk(dia,mes))
				break;
		}
		String dni=Reader.leerdni("into DNI con letra");
		char car=Reader.leerChar("intro P para añadir profesor, A para alumno");
		if ((car=='P') || (car=='p'))
		{	
			Profe profe=new Profe(dni,nombre,dia,mes);
			profe.pedirMaterias();
			listapersonas.add(profe);
			
		}
		else if ((car=='A') || (car=='a'))
		{	String grupo=Reader.leerString("intro grupo");
			Alumno al=new Alumno(dni,nombre,dia,mes,grupo);
			listapersonas.add(al);
		}
		else
			System.out.println("No se ha añadido ni profesor ni alumno porque el carácter introducido no es ni p ni a");
	}
}
