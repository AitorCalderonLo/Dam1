import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Producto[] aProd = new Producto[4];
		for (int i=0;i<2;i++)
		{
			aProd[i] = CrearPerecedero(teclado);
		}
		for (int i=2;i<aProd.length;i++)
		{
			aProd[i] = CrearnOPerecedero(teclado);
		}
		for (int i=0;i<aProd.length;i++)
		{
			if(aProd[i].getClass() == Perecedero.class)
			{
				System.out.println("Perecedero: " + aProd[i].getNombre() + ", precio:" + aProd[i].getPrecio() + ", caducar:" + ((Perecedero)aProd[i]).getDiasCaducar());
				 System.out.println("CALCULAR PRECIO FINAL->" + aProd[i].Calcular(1));
			}
			else if(aProd[i].getClass() == NoPerecedero.class)
			{
				System.out.println("No Perecedero 2: " + aProd[i].getNombre() + ", precio:" + aProd[i].getPrecio() + ", tipo:" + ((NoPerecedero)aProd[i]).getTipo());
				System.out.println("CALCULAR PRECIO FINAL->" + aProd[i].Calcular(1));
			}
		}
		
       
            
	}
	
	public static Perecedero CrearPerecedero(Scanner teclado)
	{
		Perecedero p = new Perecedero();
		double precio = 0;
    	int diasCaducar =0;
    	
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el precio");
		precio = cogerNumeroDouble(teclado);
		System.out.println("Introduce los días a caducar");
		diasCaducar = cogerNumero(teclado);
		p = new Perecedero (nombre,precio,diasCaducar);
		return p;
	}
	public static NoPerecedero CrearnOPerecedero(Scanner teclado)
	{
		NoPerecedero p = new NoPerecedero();
		double precio = 0;
    	String tipo ="";
    	
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el precio");
		precio = cogerNumeroDouble(teclado);
		System.out.println("Introduce el tipo");
		tipo = teclado.nextLine();
		p = new NoPerecedero(nombre,precio,tipo);
		
		return p;
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
