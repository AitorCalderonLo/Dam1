package ejercicio3Coche;

public class Coche {
	private int velocidad;

	public Coche() {
		velocidad=0;
	}

	public int getVelocidad()
	{
		return this.velocidad;
	}
	public void acelera(int mas)
	{
		this.velocidad = this.velocidad + mas;
	}
	public void frena(int menos)
	{
		this.velocidad = this.velocidad - menos;
	}

}