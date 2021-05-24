package principal;

import java.util.Scanner;

public class Teclado {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int cogerInt() {
		boolean ok = false;
		int devolver = 0;
		while(!ok) {
			try {
				devolver = Integer.parseInt(sc.nextLine());
				ok = true;
			}
			catch(Exception e) {
				System.out.println("Introduce un entero");
			}
		}
		return devolver;
	}
	
	public static String cogerString() {
		return sc.nextLine();
	}
	
	public static boolean cogerBoolean() {
		int devolver = -1;
		while(devolver != 1 && devolver !=0) {
			System.out.println("1 para true, 0 para false");
			devolver = cogerInt();
		}
		if(devolver == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double cogerDouble() {
		boolean ok = false;
		double devolver = 0;
		while(!ok) {
			try {
				devolver = Double.parseDouble(sc.nextLine());
				ok = true;
			}
			catch(Exception e) {
				System.out.println("Introduce un numero real");
			}
		}
		return devolver;
	}
	
}
