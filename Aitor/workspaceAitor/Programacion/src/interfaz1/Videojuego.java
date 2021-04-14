package interfaz1;

public class Videojuego implements Entregable{

	private String titulo = "";
	private String genero = "";
	private String compania = "";
	private int horasEstimadas = 10;
	private boolean entregado = false;

	public Videojuego() {

	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	@Override
	public String toString() {
		return "** VIDEOJUEGO ** \n"
				+ " Titulo: " + this.getTitulo()
				+ "\n Genero: " + this.getGenero()
				+ "\n Compañia: " + this.getCompania()
				+ "\n Horas estimadas: " + this.getHorasEstimadas()
				+ "\n\n";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;		
	}

	@Override
	public Boolean isEntregado() {
		return this.entregado;
	}


}
