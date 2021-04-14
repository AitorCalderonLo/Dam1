package interfaz1;

public class Main {

	public static void main(String[] args) {

		Serie arrSerie[] = new Serie[5];

		arrSerie[0] = new Serie();
		arrSerie[1] = new Serie("Sky Rojo", "A saber quien es", 1);
		arrSerie[2] = new Serie("Spider man", "Perico el de los palotes");
		arrSerie[3] = new Serie("West Coast Customs", "Ryan", 5);
		arrSerie[4] = new Serie("Resdasda", "Jacinto");

		Videojuego arrVideojuego[] = new Videojuego[5];

		arrVideojuego[0] = new Videojuego();
		arrVideojuego[1] = new Videojuego("Escape room X", 1);
		arrVideojuego[2] = new Videojuego("Gta V", 0, "Accion", "Rockstar Games");
		arrVideojuego[3] = new Videojuego("Escape room X", 1);
		arrVideojuego[4] = new Videojuego("Wow", 0);

		arrSerie[0].entregar();
		arrVideojuego[3].entregar();
		arrVideojuego[2].entregar();
		arrSerie[1].entregar();

		arrSerie[0].devolver();

		printArrays(arrSerie, arrVideojuego);

		System.out.println("¿La primera posicion del array serie esta entregada? " + arrSerie[0].isEntregado());

	}

	private static void printArrays(Serie[] arrSerie, Videojuego[] arrVideojuego) {
		System.out.println("*** INTERFAZES 1 *** \n\n");
		int seriesEntregadas = 0;

		System.out.println("Series: \n");

		for (int i = 0; i < arrSerie.length; i++) {
			if (arrSerie[i].isEntregado()) {
				seriesEntregadas++;
				System.out.println(i + " - ENTREGADO - " + arrSerie[i].toString());
			} else {
				System.out.println(i + " - " + arrSerie[i].toString());

			}

		}
		System.out.println("**** Series entregadas: " + seriesEntregadas + "\n\n");

		int videojuegosEntregados = 0;

		System.out.println("Videojuegos: \n");

		for (int i = 0; i < arrVideojuego.length; i++) {
			if (arrVideojuego[i].isEntregado()) {
				videojuegosEntregados++;
				System.out.println(i + " - ENTREGADO - " + arrVideojuego[i].toString());
			} else {
				System.out.println(i + " - " + arrVideojuego[i].toString());

			}
		}
		System.out.println("**** Videojuegos entregados: " + videojuegosEntregados + "\n\n");
	}

}
