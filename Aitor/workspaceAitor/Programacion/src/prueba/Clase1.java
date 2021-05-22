package prueba;

public class Clase1 {
	int p1, p2;

	public Clase1(int i, int j) {
		p1 = i;
		p2 = j;
	}

	public int modificar(int i) {
		p1 = p1 + i;
		p2 = p2 + i;
		System.out.print(p2 + " ");
		return p1;
	}
}