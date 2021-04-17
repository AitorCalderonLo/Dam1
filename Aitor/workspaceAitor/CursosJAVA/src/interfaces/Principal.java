package interfaces;

public class Principal {

	public static void main(String[] args) {
	
		// tenemos un problema 
		Girable b= new BrazoNormal();
		Girable b1= new BrazoRapido();
		Girable c= new Coctelera();
		
		Robot r= new Robot();
		r.setBrazo(b);
		r.girarBrazo();
		
		r.setBrazo(b1);
		r.girarBrazo();
		
		r.setBrazo(c);
		r.girarBrazo();
		
		BrazoAcero ba= new BrazoAcero();
		
		
		r.setBrazo(new AdaptadorBrazoAcero(ba));
		r.girarBrazo();
		
	
		
	}

}
