package ejercicio001;

public class Taxi {

	private String matricula, provincia, municipio;
	
	public Taxi(String matricula, String provincia, String municipio) {
		
		this.matricula = matricula;
		this.provincia = provincia;
		this.municipio = municipio;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	
	
}
