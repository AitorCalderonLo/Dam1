
public class Perecedero extends Producto {
    private int diasCaducar;
    
    
    public Perecedero()
    {
    	
    }

	public Perecedero(String nombre, double precio,int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}


	public int getDiasCaducar() {
		return diasCaducar;
	}


	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	@Override
	public double Calcular(int cantidad)
    {
		double precioFinal=0;
    	switch(this.diasCaducar)
    	{
    		case 1:
    		  precioFinal = this.getPrecio() / 4;
    		  break;
    		case 2:
      		  precioFinal = this.getPrecio() / 3;
      		  break;
    		case 3:
      		  precioFinal = this.getPrecio() / 2;
      		  break;
      		 default:
      			  precioFinal = this.getPrecio();
      		  
    	}
    	return precioFinal * cantidad;
    }
    
}
