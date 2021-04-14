package abstractas1;

public class Main {

	public static void main(String[] args) {

		System.out.println("**** PLANETARIO ****");

		Astros arrayAstros[] = new Astros[6];
		arrayAstros[0] = new Planetas("Tierra", 6.371, "Sideral", 20, 9.807, true, 15000000, 8000);
		arrayAstros[1] = new Planetas("Marte", 345, "Mareante", 312, 9.807, false, 1212, 8000);
		arrayAstros[2] = new Planetas("Jupiter", 371, "Locura", 33, 9.807, true, 3120000, 8000);
		arrayAstros[3] = new Satelites("Luna", 123123, "No sé", 33, 9.807, "Tierra", 0, 0);
		arrayAstros[4] = new Satelites("Otra Luna", 123123, "No sé", 33, 9.807, "Jupiter", 0, 0);
		arrayAstros[5] = new Satelites("Luna2", 123123, "No sé", 33, 9.807, "Tierra", 0, 0);

		for (int i = 0; i < arrayAstros.length; i++) {
			
			System.out.println(i+1 + " - \n" + arrayAstros[i].muestra());

			if (arrayAstros[i] instanceof Planetas && ((Planetas) arrayAstros[i]).isTieneSatelites() == true) {
				System.out.println("\n** SATELITES **\n");
				for (int j = 0; j < arrayAstros.length; j++) {
					if (arrayAstros[j] instanceof Satelites) {
						String planetaPerteneciente = ((Satelites) arrayAstros[j]).getPlanetaPerteneciente();
						String planeta = arrayAstros[i].getNombre();

						if (planetaPerteneciente.equals(planeta))
						{
							System.out.println("Satelite: " + arrayAstros[j].getNombre());
						}
					}
				}
			}
			
			System.out.println("-----------------------------------------------");
		}

	}

}
