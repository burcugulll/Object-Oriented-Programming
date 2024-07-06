package aralik7;

public class MakineMuhendisi extends Muhendis {
	public MakineMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans="Makine";
	}

	@Override
	public void bilgileriyazdir() {
		super.bilgileriyazdir();
	}
	
	
	@Override
	public int puanhesapla() {
		this.puan=this.yas*3;
		return this.yas;
	}
}
