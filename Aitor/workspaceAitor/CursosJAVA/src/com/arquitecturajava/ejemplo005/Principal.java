package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		
		Casa c= new Casa("santander");
		
		Persona p= new Persona("juan");
		Persona p1= new Persona("ana");
		
		c.add(p);
		c.add(p1);
		//??
		System.out.println(c.contains(new Persona("ana")));
		System.out.println(c.totalPersonas());
		
		p.add(c);
		
		// false porque no he sobrecargado el equals /no debiera
		System.out.println(p.contains(new Casa("santander")));

	}

}
