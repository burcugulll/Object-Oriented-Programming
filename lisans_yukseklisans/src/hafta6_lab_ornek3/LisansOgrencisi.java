package hafta6_lab_ornek3;

public class LisansOgrencisi extends Ogrenci{
	public String durum;
	public int sinif;
	public int vize_not;
	public int final_not;
	
	public LisansOgrencisi(String ad, String soyad, int sinif, int vize_not, int final_not) {
		super(ad, soyad);
		this.durum = "Lisans";
		this.sinif = sinif;
		this.vize_not = vize_not;
		this.final_not = final_not;
	}

	
	@Override
	void bilgileri_yazdir() {
		System.out.println("Durum: " +durum);
		super.bilgileri_yazdir();
		System.out.println("Sinif: " +sinif);
		// System.out.println("Gecme Notu: " +gecme_notu_hesapla());
	}
	
	
	@Override 
	void mezuniyet_yili_hesapla() {
		System.out.println("Mezuniyete " + (4-sinif)+ " yil kaldi.");
	}
	

	public void gecme_notu_hesapla() {
		double ortalamaNot =(vize_not * 0.4 + final_not * 0.6);
		if(ortalamaNot < 100 && ortalamaNot >= 60) {
			System.out.println("Not ortalaması: "+ortalamaNot+" Dersten Basarılı Oldu.");
		}
		else if(ortalamaNot < 60 && ortalamaNot >0) {
			System.out.println("Not ortalaması: "+ortalamaNot+" Dersten Basarısız Oldu.");
		}
		else {
			System.out.println("Gecersiz Deger!");
		}
	}
}
