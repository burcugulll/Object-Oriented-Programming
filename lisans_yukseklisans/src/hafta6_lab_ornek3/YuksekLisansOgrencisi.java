package hafta6_lab_ornek3;

public class YuksekLisansOgrencisi extends Ogrenci {
	public String durum;
	public String asama;
	public int final_not;

	public YuksekLisansOgrencisi(String ad, String soyad, String asama, int final_not) {
		super(ad, soyad);
		this.durum = "Yuksek Lisans";
		this.asama = asama;
		this.final_not = final_not;
	}
	
	
	@Override
	void bilgileri_yazdir() {
		System.out.println("Durum: " +durum);
		super.bilgileri_yazdir();
		System.out.println("Sinif: " +asama);
		
		// System.out.println("Gecme Notu: " +harf_hesapla());
	}


	@Override
	void mezuniyet_yili_hesapla() {
		if(asama.equals("Tez") || asama.equals("tez")) {
			System.out.println("Mezuniyete 1 yildan az kaldi");
		}
		else if(asama.equals("Ders") || asama.equals("ders")) {
			System.out.println("Mezuniyete 1 yildan fazla kaldi");
		}
		else {
			System.out.println("Hatali Bilgi ! (Tez - tez , Ders - ders)");
		}
	}


	public void harf_hesapla() {
		if (final_not >= 90) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: AA");
		} 
		else if (final_not < 90 && final_not >= 80) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: BA");
		} 
		else if (final_not < 80 && final_not >= 70) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: BB");
		} 
		else if (final_not < 70 && final_not >= 65) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: CB");
		} 
		else if (final_not < 65 && final_not >= 60) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: CC");
		} 
		else if (final_not < 60 && final_not >= 50) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: DC");
		} 
		else if (final_not < 50 && final_not >= 35) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: DD");
		} 
		else if (final_not < 35) {
			System.out.println("Ortalama Not: " + final_not + " Harf Notu: FF");
		} 
		else {
			System.out.println("Girilen degerler yanlis!");
		}
	}
}
