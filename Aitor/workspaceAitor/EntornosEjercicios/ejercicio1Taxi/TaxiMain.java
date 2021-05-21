package ejercicio1Taxi;

public class TaxiMain {

	public static void main(String[] args) {
		TaxiApp();
	}

	public static void TaxiApp() {
		Taxi t= new Taxi();
		t.setProvincia("Vizcaya");
		t.setMatricula("459sdf45");
		t.setMunicipio("Bilbao");
		t.setTipoMotor(1);
		String prov=t.getProvincia();
		String matri=t.getMatricula();
		String muni=t.getMunicipio();
		int moto=t.getTipoMotor();

		System.out.println("La provincia es "+prov);
		System.out.println("La matricula es "+matri);
		System.out.println("El municipio es "+muni);

		if(moto==0) {
			System.out.println("El motor es de tipo desconocido");
		}else if(moto==1) {
			System.out.println("El motor es de tipo diesel");
		}else if(moto==2) {
			System.out.println("El motor es de tipo gasolina");
		}

	}


}
