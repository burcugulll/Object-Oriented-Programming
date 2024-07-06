//Burcu Gül 20010011066
package odev_2;

import java.util.ArrayList;

public class Ogrenci {
	private int ogrId;
	private String ogradSoyad;
	private int ogrYas;
	public ArrayList<Ders> alinanDersler=new ArrayList<Ders>();
	public Ogrenci(int ogrId, String ogradSoyad, int ogrYas) {
		this.ogrId = ogrId;
		this.ogradSoyad = ogradSoyad;
		this.ogrYas = ogrYas;
	}
	public int getOgrId() {
		return ogrId;
	}
	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	public String getOgradSoyad() {
		return ogradSoyad;
	}
	public void setOgradSoyad(String ogradSoyad) {
		this.ogradSoyad = ogradSoyad;
	}
	public int getOgrYas() {
		return ogrYas;
	}
	public void setOgrYas(int ogrYas) {
		this.ogrYas = ogrYas;
	}
	
}
