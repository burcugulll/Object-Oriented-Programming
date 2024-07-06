package aralik21;

public class Ogrenci {
	
	private int no;
	private String ad;
	private String soyad;
	private int vize_not;
	private int final_not;
	private double gecme_notu;
	private static int syc=1;
	
	
	public Ogrenci(String ad, String soyad, int vize_not, int final_not) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.vize_not = vize_not;
		this.final_not = final_not;
		this.gecme_notu=(vize_not*0.4)+(final_not*0.6);
		syc+=1;
		this.no=syc;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getVize_not() {
		return vize_not;
	}

	public void setVize_not(int vize_not) {
		this.vize_not = vize_not;
	}

	public int getFinal_not() {
		return final_not;
	}

	public void setFinal_not(int final_not) {
		this.final_not = final_not;
	}

	public double getGecme_notu() {
		return gecme_notu;
	}

	public void setGecme_notu(double gecme_notu) {
		this.gecme_notu = gecme_notu;
	}
	public static int getSyc() {
		return syc;
	}
	public static void setSyc(int syc) {
		Ogrenci.syc=syc;
	}

	
}
