package principal;

public class Mezcla {
	
	private String s1;
	private String s2;
	private String s3;
	
	public Mezcla(String[] s) {
		s1 = s[0];
		s2 = s[1];
		s3 = s[2];
	}
	
	@Override
	public String toString() {
		return this.s1.concat(" ").concat(s2).concat(" ").concat(s3);
	}
	
}
