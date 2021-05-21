import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Magos m = new Magos("Mago 1","Telekinesis");
			Guerreros g = new Guerreros("Guerrero 1", 200,"Cuchillo");
			
			System.out.println("Energia mago : " + m.getNombre() + "->" +  m.getEnergia());
			System.out.println("Energia guerrero : " + g.getNombre() + "->" +  g.getEnergia());
			
			System.out.println("Energia acumulada : " + m.getEnergiaAcumulada());
					
			System.out.println("ALIMENTANDO");
			System.out.println("************");
			m.Alimentarse(GenerarNumero());
			g.Alimentarse(GenerarNumero());
			System.out.println("Energia acumulada : " + m.getEnergiaAcumulada());
			
			System.out.println("Energia mago : " + m.getNombre() + "->" +  m.getEnergia());
			System.out.println("Energia guerrero : " + g.getNombre() + "->" +  g.getEnergia());
			
			System.out.println("CONSUMIR");
			System.out.println("************");
			m.ConsumirEnergia(GenerarNumero());
			g.ConsumirEnergia(GenerarNumero());
			
			
			System.out.println("Energia mago : " + m.getNombre() + "->" +  m.getEnergia());
			System.out.println("Energia guerrero : " + g.getNombre() + "->" +  g.getEnergia());
			System.out.println("Energia acumulada : " + m.getEnergiaAcumulada());
			
			System.out.println("Encantar : " + m.Encantar());
			
			System.out.println("combatir : " + g.combatir(GenerarNumero()));
			
			System.out.println("Energia mago : " + m.getNombre() + "->" +  m.getEnergia());
			System.out.println("Energia guerrero : " + g.getNombre() + "->" +  g.getEnergia());
			System.out.println("Energia acumulada : " + m.getEnergiaAcumulada());
			
			
		/*	Personaje[] a= new Personaje[5];
			a[0] = new Guerreros();
		 ((Guerreros) a[0]).combatir(energia)();*/
			
			
	}
	public static int GenerarNumero()
	{
		Random r = new Random();
		return r.nextInt(9) +1;
	}
	
	
}
