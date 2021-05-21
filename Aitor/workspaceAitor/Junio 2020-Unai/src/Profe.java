
public class Profe extends Persona{
	final static int numMate=5;
	final static int numG=10;
	String[][] mateg=new String[numMate][numG];
	
	public Profe(String dNI, String nombre, int dia, int mes) {
		super(dNI, nombre, dia, mes);
		// TODO Auto-generated constructor stub
		
	}

	public String[][] getMaterias()
	{
		return mateg;
	}
	public void pedirMaterias()
	{
		boolean seguirMateria=true;
		boolean seguirGrupo=true;
		int numMat=0;
		int numGrupo=0;
		for (int ct0=0;ct0<numMate;ct0++)
			for (int ct1=0;ct1<numG;ct1++)
				mateg[ct0][ct1]="";
				
		while(seguirGrupo)
		{
			String materia=Reader.leerString("Intro materia: ");
			mateg[numMat][numGrupo]=materia;
			
			while (seguirGrupo)
			{
				numGrupo++;
				if (numGrupo==numG)
					break;
				String grupo=Reader.leerString("Intro grupo: ");
			
				mateg[numMat][numGrupo]=grupo;
				
				seguirGrupo=Reader.leerBoolean("Pulsa S para seguir intro grupo, N en caso contrario");
				
			}
			numMat++;
			if (numMat==numMate)
				break;
			seguirGrupo=Reader.leerBoolean("Pulsa S para seguir intro materia, N en caso contrario");
			
		}
	}
	public String mostrarMateriaG()
	{
		String cadena="";
		for (int ct0=0;ct0<numMate;ct0++)
		{
			for (int ct1=0;ct1<numG;ct1++)
			{
				if ((mateg[ct0][ct1]==null) ||(mateg[ct0][ct1]=="")) break;
				if (ct1==0) cadena+=", ";
				cadena+=mateg[ct0][ct1]+" ";
			}				
		}
		return cadena;
	}
	public String mostrarMaterias()
	{
		String cadena="";
		for (int ct0=0;ct0<numMate;ct0++)
			if (mateg[ct0][0]!=null)
				cadena+=mateg[ct0][0]+"\n";
		return cadena;
	}

	@Override
	public String toString() {
		String cadena="PROFESOR:";
		cadena+=super.toString()+mostrarMateriaG();
	
		return cadena;
	}
}
