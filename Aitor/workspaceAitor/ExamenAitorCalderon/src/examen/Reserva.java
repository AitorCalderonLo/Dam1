package examen;

public class Reserva {

	private int identificador;
	private String dni, tipoAlojamiento;
	private int numeroDias, numeroPersonas, tipoReserva;
	private double precioTotal,tasa;
	
	public Reserva(String id,String dni,String numdias,String numeroPersonas, String tipoAloj, String precioTotal) {
		this.identificador = Integer.parseInt(id);
		this.dni = dni;
		this.numeroPersonas = Integer.parseInt(numeroPersonas);
		this.numeroDias = Integer.parseInt(numdias);
		this.precioTotal = Double.parseDouble(precioTotal);
		this.tipoAlojamiento = tipoAloj;
		
	}

	public Reserva(int identificador,String dni, int numeroDias, int numeroPersonas, String tipoAlojamiento, int tipoReserva) {
		this.identificador = identificador;
		this.dni = dni;
		this.numeroDias = numeroDias;
		this.numeroPersonas = numeroPersonas;
		this.tasa = numeroDias*2.5*numeroPersonas;
		this.tipoAlojamiento = tipoAlojamiento;
		this.tipoReserva = tipoReserva;
		int pvp;
		
		if(tipoAlojamiento.equalsIgnoreCase("hotel"))
		{
			if (tipoReserva == 1) {
				/* CAMA Y DESAYUNO */
				pvp = 40;
			} else if (tipoReserva == 2) {
				/* MEDIA PENSION */
				pvp = 60;
			} else {
				/* PENSION COMPLETA */
				pvp = 75;
			}
			this.precioTotal = pvp*numeroPersonas*numeroDias+this.tasa;

		}
		else {
			if (tipoReserva == 1) {
				/* ESTUDIO*/
				pvp = 40;
			} else if (tipoReserva == 2) {
				/* DOS DORMITORIOS */
				pvp = 60;
			} else {
				/* DUPLEX */
				pvp = 75;
			}
			// no multiplicamos el numero de dias ya que el precio es independiente de ello
			this.precioTotal = pvp*numeroPersonas+this.tasa;
		}
				
		
	}
	
	public String getTipoAlojamiento() {
		return tipoAlojamiento;
	}

	public void setTipoAlojamiento(String tipoAlojamiento) {
		this.tipoAlojamiento = tipoAlojamiento;
	}

	public int getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(int tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}


	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}
	public int getNumeroPersonas() {
		return numeroPersonas;
	}
	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	@Override 
	public String toString(){
		return this.getIdentificador()+"\t" + this.getDni()+"\t " + this.getNumeroDias()+"\t\t " + this.getNumeroPersonas() +"\t\t " + this.getTipoAlojamiento() +"\t\t\t " + this.getPrecioTotal();
	}
	
	
	
}
