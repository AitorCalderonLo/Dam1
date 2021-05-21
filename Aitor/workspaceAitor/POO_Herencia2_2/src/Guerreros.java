
public class Guerreros extends Personaje {
   
    private String arma;
    
    public Guerreros()
    {
      this.arma="";
    }
    
    public Guerreros(String nom,double energia , String arma)
    {
    	super(nom,energia);
    	this.arma = arma;
    }
    public void setArma(String arma)
    {
    	this.arma = arma;
    }
    public String getArma()
    {
    	return this.arma;
    }
    
    public String combatir(double energia)
    {
       // super.setEnergia(	super.getEnergia() - energia);
    	super.ConsumirEnergia(energia);
    	return arma + "-" + super.getEnergia();
    }
    
}
