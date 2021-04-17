package objetoRelacion1aN;

public class Principal {

	public static void main(String[] args) {
		
		
		CajaGalletas miCaja= new CajaGalletas();
		miCaja.addGalleta(new Galleta("chocolate",2));
		miCaja.addGalleta(new Galleta("chocolate",2));
		miCaja.addGalleta(new Galleta("chocolate",2));
		miCaja.addGalleta(new Galleta("chocolate",2));
		miCaja.addGalleta("chocolate", 2);
		
		System.out.println(miCaja.totalGalletas());
		System.out.println(miCaja.precioTotal());

	}

}
