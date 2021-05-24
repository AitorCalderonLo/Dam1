
enum tipoPelo{
	L,M,C
}
public class Gato extends Mascota{
	private String color;
	private tipoPelo pelo;
	public Gato(int iden,String nombre, double edad, String duenio,String color,tipoPelo pelo) {
		super(iden,nombre, edad, duenio);
		this.color=color;
		this.pelo=pelo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String linea=super.toString();
		linea+=" Gato [color=" + color + ", pelo=" + pelo + "]";
		return linea;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public tipoPelo getPelo() {
		return pelo;
	}
	public void setPelo(tipoPelo pelo) {
		this.pelo = pelo;
	}
	
}
