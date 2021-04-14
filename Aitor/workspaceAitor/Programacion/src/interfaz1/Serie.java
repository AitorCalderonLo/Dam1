package interfaz1;

public class Serie implements Entregable{

	private String titulo = "";
	private String genero = "";
	private String creador = "";
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	
	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, String creador, int numeroTemporadas) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = numeroTemporadas;
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
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	@Override
	public String toString() {
		return "** SERIE ** \n"
				+ " Titulo: " + this.getTitulo()
				+ "\n Genero: " + this.getGenero()
				+ "\n Creador: " + this.getCreador()
				+ "\n Numero de temporadas: " + this.getNumeroTemporadas()
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
