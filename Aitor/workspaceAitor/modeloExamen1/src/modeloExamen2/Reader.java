package modeloExamen2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reader {

	private static Scanner in = new Scanner(System.in);

	public static int leerEnum(String texto, int a, int b) {
		int i = 0;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				i = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número comprendido entre " + a + " y " + b + ": ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return i;
	}

	public static int leerInt(String texto) {
		int i = 0;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				i = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return i;
	}

	public static int leerInt(String texto, int a, int b) {
		int i = 0;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				i = Integer.parseInt(in.nextLine());
				if (i < a || i > b) {
					error = true;
					System.out.print("Error. Debes introducir un número entre " + a + " y " + b + ": ");
				}
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return i;
	}

	public static float leerFloat(String texto) {
		float f = 0;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				f = Float.parseFloat(in.nextLine());
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return f;
	}

	public static float leerFloat(int a, int b) {
		float f = 0;
		boolean error;
		do {
			try {
				error = false;
				f = Float.parseFloat(in.nextLine());
				if (f < a || f > b) {
					error = true;
					System.out.print("Error. Debes introducir un número entre " + a + " y " + b + ": ");
				}
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return f;
	}

	public static double leerDouble(String texto) {
		double d = 0;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				d = Double.parseDouble(in.nextLine());
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return d;
	}

	public static double leerDouble(int a, int b) {
		double d = 0;
		boolean error;
		do {
			try {
				error = false;
				d = Double.parseDouble(in.nextLine());
				if (d < a || d > b) {
					error = true;
					System.out.print("Error. Debes introducir un número entre " + a + " y " + b + ": ");
				}
			} catch (NumberFormatException e) {
				error = true;
				System.out.print("Error. Debes introducir un número: ");
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el número otra vez: ");
			}
		} while (error == true);
		return d;
	}

	public static String leerString(String texto) {
		String s = "";
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				s = in.nextLine();
				if (s.length() < 1) {
					error = true;
					System.out.print("Error. Introduce un string: ");
				}
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce un string de nuevo: ");
			}
		} while (error == true);
		return s;
	}

	public static Date leerFecha(SimpleDateFormat formato_fecha, String texto) {
		Date fecha = null;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				String s = in.nextLine();
				fecha = formato_fecha.parse(s);
				if (s.length() < 1) {
					error = true;
					System.out.print("Error. Introduce una fecha: ");
				}
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce una fecha: ");
			}
		} while (error == true);

		return fecha;
	}

	public static String leerString(int maxLength, String texto) {
		String s = "";
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				s = in.nextLine();
				if (s.length() < 1) {
					error = true;
					System.out.print("Error. Introduce un string: ");
				} else if (s.length() > maxLength) {
					error = true;
					System.out.print("Error. Introduce un string de tamaño " + maxLength + " como máximo: ");
				}
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce un string de nuevo: ");
			}
		} while (error == true);
		return s;
	}

	// metodo dni
	public static String leerdni(String texto) {
		String dni = null;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				dni = in.nextLine();
				if (comprobarDni(dni) == false) {
					error = true;
					System.out.print("Error. Debes introducir el DNI correctamente:########L");
				}
			} catch (Exception e) {
				error = true;
				System.out.print("Error. " + e.getMessage() + ". Introduce el dni otra vez: ");
			}
		} while (error == true);
		return dni;
	}

	public static boolean comprobarDni(String dni) {

		if (dni.length() > 9 || dni.length() < 9) {
			return false;

		} else {
			boolean comprobacionDigitos = comprobardniDigitos(dni);
			boolean comprobacionCaracterfinal = Character.isAlphabetic(dni.charAt(dni.length() - 1));
			if (comprobacionDigitos == true && comprobacionCaracterfinal == true) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean comprobardniDigitos(String dni) {

		for (int i = 0; i < dni.length() - 1; i++) {
			if (!Character.isDigit(dni.charAt(i))) {// si encuentro con un caracter que no es digito me devuelve false
				return false;
			}
		}
		return true;
	}

	// fin metodo dni
	// ,char valor1, char valor2, char valor3
	public static tipoPelo leerPelo(String texto) {
		String s = "";
		tipoPelo pelo = null;
		boolean error;
		do {
			System.out.println(texto);
			try {
				error = false;
				s = in.nextLine();
				if (s.length() != 1) {
					error = true;
					System.out.println("Error. Introduce un carácter: ");
				}
				pelo = tipoPelo.valueOf(s);
			} catch (Exception e) {
				error = true;
				System.out.println("Error. " + e.getMessage() + ". Introduce un carácter de nuevo: ");
			}
		} while (error == true);

		return pelo;
	}

	public static char leerChar(char[] chars) {
		char c = ' ';
		boolean error = false;
		do {
			try {
				error = false;
				String str = in.nextLine();
				if (str.length() != 1) {
					error = true;
					System.out.print("Error. Introduce un carácter: ");
				} else {
					c = str.charAt(0);
					boolean exists = false;
					for (char elem : chars) {
						if (Character.toUpperCase(elem) == Character.toUpperCase(c)) {
							exists = true;
							break;
						}
					}
					if (!exists) {
						error = true;
						System.out.print("Error. Introduce un carácter (" + chars[0]);
						for (int i = 0; i < chars.length; i++)
							System.out.print("/" + chars[i]);
						System.out.print("): ");
					}
				}
			} catch (Exception e) {
				error = true;
				System.out.println("Error: " + e.getMessage() + " Introduce un carácter (" + chars[0]);
				for (int i = 0; i < chars.length; i++)
					System.out.print("/" + chars[i]);
				System.out.print("): ");
			}
		} while (error);
		return c;
	}

	public static boolean leerBoolean(String texto) {
		boolean error;
		String s = "";
		do {
			System.out.println(texto);
			try {
				error = false;
				s = in.nextLine();
				if (!s.equalsIgnoreCase("S") && !s.equalsIgnoreCase("N")) {
					error = true;
					System.out.print("Error. Introduce 'S' o 'N': ");
				}
			} catch (Exception e) {
				error = true;
				System.out.println("Error: " + e.getMessage() + ". Introduce 'S' or 'N' de nuevo : ");
			}
		} while (error);
		if (s.equalsIgnoreCase("S"))
			return true;
		else
			return false;
	}
}
