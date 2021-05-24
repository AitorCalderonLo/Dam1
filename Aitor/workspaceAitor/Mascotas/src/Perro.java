
public class Perro extends Mascota{

	private String raza;
	private boolean pulgas;
	
	public Perro(int iden,String duenio, String nombre, double edad,String raza, boolean pulgas) {
		super(iden, nombre, edad,duenio);
		// TODO Auto-generated constructor stub
		this.raza=raza;
		this.pulgas=pulgas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		String linea=super.toString();
		linea+=" Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
		return linea;
	}
	
}
