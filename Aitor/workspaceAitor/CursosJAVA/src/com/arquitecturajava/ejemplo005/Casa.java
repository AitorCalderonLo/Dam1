package com.arquitecturajava.ejemplo005;

import java.util.ArrayList;

public class Casa {

	private String direccion;
	private ArrayList<Persona> personas;
	
	
	// generacion de metodos delegados 
	public boolean add(Persona arg0) {
		return personas.add(arg0);
	}

	public boolean contains(Object arg0) {
		return personas.contains(arg0);
	}

	public Casa(String direccion) {
		super();
		this.direccion = direccion;
		this.personas= new ArrayList<Persona>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int totalPersonas() {
		
		return personas.size();
	}
	
}
