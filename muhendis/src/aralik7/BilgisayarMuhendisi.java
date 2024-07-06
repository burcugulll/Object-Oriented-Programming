package aralik7;

public class BilgisayarMuhendisi extends Muhendis {
	public BilgisayarMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans="Bilgisayar";
	}

	@Override
	public void bilgileriyazdir() {
		super.bilgileriyazdir();
	}

	@Override
	public int puanhesapla() {
		this.puan=this.yas*4;
		return this.puan;
	}
}
