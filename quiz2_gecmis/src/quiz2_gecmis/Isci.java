package quiz2_gecmis;

public class Isci extends Calisan implements Maas {
    public String gorev;
	
	public Isci(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.gorev="Isci";
	}

	@Override
	public double maashesapla() {
		
		return 3000+zamoranihesapla();
	}

	@Override
	public double zamoranihesapla() {
		double zammik=(cs*100)+(yas*2/3);
		return zammik;
	}


}
