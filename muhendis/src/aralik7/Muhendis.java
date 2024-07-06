package aralik7;

public abstract class Muhendis {
	private String ad;
	public int yas;
	public String brans;
	public int puan;
	
	public Muhendis(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
		
	}

	public void bilgileriyazdir() {
		System.out.println("\nad->"+ad+"\nyas->"+yas+"\nbrans->"+brans+"\npuan->"+puan);
		
	}
	public abstract int puanhesapla(); /*{
		return this.yas*3;
	}*/
	
}

