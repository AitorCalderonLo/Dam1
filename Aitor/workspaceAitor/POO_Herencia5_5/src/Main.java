import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner teclado = new Scanner(System.in);
		    
		    Electrodomestico[] elec = new Electrodomestico[4];
		    for (int i=0; i<elec.length;i++)
		    {
		    	System.out.println("Desea crear una televisión (1) o una lavadora(2)");
		    	int num = cogerNumero(teclado);
		    	if(num==1)
		    	{
		    		elec[i] =  CrearTelevision(teclado);
		    	}
		    	else 
		    	{
		    		elec[i] = CrearLavadora(teclado);
		    	}
		    }
		    	int IndiceLavador = 0;
		    	int IndiceTV = 0;
		    for (int i=0;i<elec.length;i++)
			{
				if(elec[i].getClass() == Television.class)
				{
					System.out.println("TELEVISIÓN precio final :" + ((Television)elec[i]).precioFinal());
					IndiceTV = i;
				}
				else if(elec[i].getClass() == Lavadora.class)
				{
					System.out.println("LAVADORA precio final :" + ((Lavadora)elec[i]).precioFinal());
					IndiceLavador = i;
				}
			}
		    System.out.println("*****precio TOTAL Televisiones:" + ((Television)elec[IndiceTV]).getPrecioAcumulado());
		    System.out.println("*****precio TOTAL lavadoras:" + ((Lavadora)elec[IndiceLavador]).getPrecioAcum());
		    double total = ((Television)elec[IndiceTV]).getPrecioAcum() + ((Lavadora)elec[IndiceLavador]).getPrecioAcum();
		    System.out.println("*****precio TOTAL electrodomesticos:" + total);
		    
		    /*System.out.println("TELEVISIONES");
		    
		    Television t1= CrearTelevision(teclado);
		    Television t2= CrearTelevision(teclado);
		  //  Television t3= CrearTelevision(teclado);
		  //  Television t4= CrearTelevision(teclado);
		  // t5= CrearTelevision(teclado);
		    System.out.println("precio final TV1:" + t1.precioFinal());
		    System.out.println("precio final TV2:" + t2.precioFinal());
		  //  System.out.println("precio final TV3:" + t3.precioFinal());
		  // System.out.println("precio final TV4:" + t4.precioFinal());
		  //  System.out.println("precio final TV5:" + t5.precioFinal());
		    
		    System.out.println("LAVADORAS");
		    Lavadora l1 = CrearLavadora(teclado);
		    Lavadora l2 = CrearLavadora(teclado);
		    //Lavadora l3 = CrearLavadora(teclado);
		   // Lavadora l4 = CrearLavadora(teclado);
		   // Lavadora l5 = CrearLavadora(teclado);
		    
		    System.out.println("precio final lavadora1:" + l1.precioFinal());
		    System.out.println("precio final lavadora2:" + l2.precioFinal());
		   // System.out.println("precio final lavadora3:" + l3.precioFinal());
		   // System.out.println("precio final lavadora4:" + l4.precioFinal());
		   // System.out.println("precio final lavadora5:" + l5.precioFinal());
		    
		    
		    System.out.println("*****precio TOTAL Televisiones:" + t1.getPrecioAcumulado());
		    System.out.println("*****precio TOTAL lavadoras:" + l1.getPrecioAcum());
		    System.out.println("*****precio TOTAL electrodomesticos:" + (l1.getPrecioAcum() + t1.getPrecioAcumulado()));
		    */
	}

	public static Television CrearTelevision(Scanner teclado)
	{
		Television t = new Television();
		System.out.println("Introduce el precio base ");	
		double precioBase = cogerNumeroDouble(teclado);
		System.out.println("Introduce el peso ");	
		double peso = cogerNumeroDouble(teclado);
		
		System.out.println("Introduce el consumo energetico ");	
		String consumo = teclado.nextLine();
		
		System.out.println("Introduce el Color ");	
		String color = teclado.nextLine();
		
		System.out.println("Introduce la resolución ");	
		int res =cogerNumero(teclado);
		
				
		System.out.println("¿Tiene sintonizador TDT? (S/N) ");	
		boolean tdt = cogerBoolean(teclado);
		t = new Television (precioBase,peso,consumo,color,res,tdt);
		return t;
	}
	public static Lavadora CrearLavadora(Scanner teclado)
	{
		Lavadora t = new Lavadora();
		System.out.println("Introduce el precio base ");	
		double precioBase = cogerNumeroDouble(teclado);
		System.out.println("Introduce el peso ");	
		double peso = cogerNumeroDouble(teclado);
		
		System.out.println("Introduce el consumo energetico ");	
		String consumo = teclado.nextLine();
		
		System.out.println("Introduce el Color ");	
		String color = teclado.nextLine();
		
		System.out.println("Introduce la carga ");	
		int carga =cogerNumero(teclado);
		
	
		t = new Lavadora (precioBase,peso,consumo,color,carga);
		return t;
	}
	public static int cogerNumero(Scanner sc) {		
		int num = 0;
		boolean ok = true;
		do {
			try {
				ok = false;
				num = Integer.parseInt(sc.nextLine());
				
			}
			catch(Exception e) {
				ok = true;
				System.out.println("Solo se aceptan valores númericos");
			}
		}while(ok==true);
		return num;
	}
	public static boolean cogerBoolean(Scanner sc) {		
		boolean num = false;
		boolean ok = true;
		do {
			String Valor = sc.nextLine();
			ok=false;
			if(Valor.equals("S") || Valor.equals("N"))
			{
				ok=false;
				if(Valor=="S")
					num = true;
			}
			else
			{
				System.out.println("Debe introducir un valor valido (S/N)");
				ok=true;
				
			}
		}while(ok==true);
		return num;
	}
	public static double cogerNumeroDouble(Scanner sc) {		
		double num = 0;
		boolean ok = true;
		do {
			try {
				ok = false;
				num = Double.parseDouble(sc.nextLine());
				
			}
			catch(Exception e) {
				ok = true;
				System.out.println("Solo se aceptan valores númericos");
			}
		}while(ok==true);
		return num;
	}
	
	
}
