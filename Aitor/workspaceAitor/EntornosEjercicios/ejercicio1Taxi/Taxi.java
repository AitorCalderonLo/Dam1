package ejercicio1Taxi;

public class Taxi {
	//atributos
	private String provincia;
	private String matricula;
	private String municipio;
	private int motor;

	//metodos
	public Taxi() {}

	public Taxi(String provincia, String matricula, String municipio, int motor)
	{
		setProvincia(provincia);
		setMatricula(matricula);
		setMunicipio(municipio);
		setTipoMotor(motor);
	}

	public String getProvincia()
	{
		return this.provincia;
	}
	public void setProvincia(String provincia)
	{
		this.provincia = provincia;
	}
	public String getMatricula()
	{
		return this.matricula;
	}
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	public String getMunicipio()
	{
		return this.municipio;
	}
	public void setMunicipio(String municipio)
	{
		this.municipio = municipio;
	}
	public int getTipoMotor()
	{
		return this.motor;
	}
	public void setTipoMotor(int motor)
	{
		this.motor = motor;
	}

}
