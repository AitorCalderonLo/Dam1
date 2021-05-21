
public class Personaje {
    private String nombre;
    private double energia;
    private static double energiaAcumulada;
    
    public Personaje()
    {
    	this.nombre="";
    	this.energia=0;
    	this.energiaAcumulada=0;
    }
    public Personaje(String nom)
    {
    	this.nombre=nom;
    	
    }
    public Personaje(String nom, double ene)
    {
    	this.nombre=nom;
    	this.energia=ene;
    	this.energiaAcumulada += ene;
    }
    public void Alimentarse(double energia)
    {
    	this.energia+=energia;
    	this.energiaAcumulada+=energia;
    }
    public void ConsumirEnergia(double energia)
    {
    	this.energia-=energia;
    	this.energiaAcumulada-=energia;
    }
    public void setEnergia(double energia)
    {
    	this.energia = energia;
    }
    public double getEnergia()
    {
    	return energia;
    }
    public static double getEnergiaAcumulada()
    {
    	
    	return energiaAcumulada;
    }
    public void setNombre(String nom)
    {
    	this.nombre = nom;
    }
    public String getNombre()
    {
    	return nombre;
    }
}
