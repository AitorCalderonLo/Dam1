
public class Magos extends Personaje {
   
    private String poder;
    public Magos()
    {
      this.poder="";
      this.setEnergia(100);
    }
    
    public Magos(String nom, String poder)
    {
    	super(nom,100);
    	this.poder = poder;
    	
    }
    public void setpoder(String poder)
    {
    	this.poder = poder;
    }
    public String getpoder()
    {
    	return this.poder;
    }
    
    public String Encantar()
    {
    	super.ConsumirEnergia(2);
    	return this.poder + "-" + super.getEnergia();
    }
    
}
