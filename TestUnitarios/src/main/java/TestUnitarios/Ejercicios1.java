package TestUnitarios;

public class Ejercicios1 {

	public double volumenCilindro(double altura, double diametro)
	{
		return Math.PI*(diametro/2)*(diametro/2)*altura;
	}
	
	public double precioMedio3Valores(double precio1, double precio2, double precio3)
	{
		return (precio1+precio2+precio3)/3;
	}
	
	public double tiempoLlenadoDeposito(double altura, double diametro, double caudal) 
	{
		return (Math.PI*((diametro/2)*(diametro/2))*altura)/caudal;
	}
	
	
	public String repartoVacunas(int entrega) {
	    	
		int Existencias=1000; 
	    Existencias = Existencias-entrega;
	                   
	    if(Existencias<200) {
	    	return "Alerta menos de 200!!!";
	    }
	    else {
	    	return "Vacunas entregadas correctamente";
	    }
	    	
	}
	
	public double PrecioActual(int precioAnt,int inflacion) 
	{
		
		return precioAnt*(inflacion/100)+precioAnt;
	
	}
	
}
