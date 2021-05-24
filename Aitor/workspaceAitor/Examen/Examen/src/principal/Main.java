package principal;

public class Main {
	
	public static void main(String[] args) {
		int opcion = 0; //Variable que cambia para elegir una opcion en el switch case
		int salida = 4; //Variable para salir del bucle
		while (opcion != salida) {
			System.out.println("Elige la opcion que desees");
			opcion = Teclado.cogerInt();
			switch(opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}
		}
	}
	
	public void crearObjeto() {
		System.out.println("Inserta x");
		String str = Teclado.cogerString();
		System.out.println("Inserta x");
		int i = Teclado.cogerInt();
		System.out.println("Inserta x");
		double dou = Teclado.cogerDouble();
		System.out.println("Inserta x");
		boolean bool = Teclado.cogerBoolean();
	}

}
