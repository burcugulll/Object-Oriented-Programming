//Burcu Gül 20010011066
package odev_2;


public class Ders {
	private  int dersId;
	private String dersAd;
	static int syc=1100;
	

	public Ders(String dersAd) {
		syc+=10;
		this.dersId = syc;
		this.dersAd = dersAd;
		
	}
	
	
	public Ders(int dersId,String dersAd) {
		this.dersId = dersId;
		this.dersAd = dersAd;
	}
	

	public int getDersId() {
		return dersId;
	}

	public void setDersId(int dersId) {
		this.dersId = dersId;
	}

	public String getDersAd() {
		return dersAd;
	}

	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}

}
