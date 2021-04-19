package delegacionConstructor;

public class Coche {

	private String marca;
	private String modelo;
	// variable pertenece a la clase no al objeto
	private static int contador;
	
	
	//metodos de instancia
	public static int getContador() {
		return contador;
	}

	public Coche() {
		
		//delegacion de constructores
		this("yaris","toyota");
	
	}
	
	public Coche(String modelo,String marca) {
		
		this.modelo=modelo;
		this.marca=marca;
		//incrementamos el contador
		contador++;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
