package Constructoeinjection;

public class Certificate {

	 private int id;
	 private String Certificatename;
	public Certificate(int id, String certificatename) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", Certificatename=" + Certificatename + "]";
	}
	
}
