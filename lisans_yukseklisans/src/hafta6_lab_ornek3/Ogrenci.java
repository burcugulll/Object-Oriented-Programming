package hafta6_lab_ornek3;

public class Ogrenci {
	private int id  = 1;
	public String ad, soyad;
	public static int count = 0;
	
	public Ogrenci(String ad, String soyad) {
		super();
		this.id = ++count;
		this.ad = ad;
		this.soyad = soyad;
	}
	

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	

	void bilgileri_yazdir(){
		System.out.println("Id: "+id+"\nAd: " +ad+"\nSoyad: "+soyad);
	}
	
	void mezuniyet_yili_hesapla() {
		
	}

}
