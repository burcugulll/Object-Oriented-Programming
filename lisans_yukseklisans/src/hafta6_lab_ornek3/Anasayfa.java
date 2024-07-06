package hafta6_lab_ornek3;
import java.util.Scanner;
public class Anasayfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lisans Ogrenci Sayisi: ");
		int lisans_ogr_sayi = scan.nextInt();
		LisansOgrencisi[] lisans = new LisansOgrencisi[lisans_ogr_sayi];
				
		for(int i=0; i<lisans_ogr_sayi; i++) {
			String ad, soyad;
			int vize_not, final_not, sinif;
			System.out.print("\nAd: ");
			ad = scan.next();
			System.out.print("Soyad: ");
			soyad = scan.next();
			System.out.print("Sinif: ");
			sinif = scan.nextInt();
			System.out.print("Vize Notu:");
			vize_not = scan.nextInt();
			System.out.print("Final Notu:");
			final_not = scan.nextInt();
			
			lisans[i] = new LisansOgrencisi(ad, soyad, sinif, vize_not, final_not); 
		}
		
		for(int i=0; i<lisans_ogr_sayi; i++) {
			System.out.println("");
			lisans[i].bilgileri_yazdir();
			lisans[i].mezuniyet_yili_hesapla();
			lisans[i].gecme_notu_hesapla();
			System.out.println("");
		}
		
		
		System.out.println("Yuksek Lisans Ogrenci Sayisi: ");
		int yuksek_lisans_ogr_sayi = scan.nextInt();
		YuksekLisansOgrencisi[] y_lisans = new YuksekLisansOgrencisi[yuksek_lisans_ogr_sayi];
		
		for(int i=0; i<yuksek_lisans_ogr_sayi; i++) {
			String ad, soyad, asama;
			int final_not, sinif;
			System.out.print("\nAd: ");
			ad = scan.next();
			System.out.print("Soyad: ");
			soyad = scan.next();
			System.out.print("Asama (Tez - Ders): ");
			asama = scan.next();
			System.out.print("Final Notu:");
			final_not = scan.nextInt();
			
			y_lisans[i] = new YuksekLisansOgrencisi(ad, soyad, asama, final_not);
		}
		
		for(int i=0; i<yuksek_lisans_ogr_sayi; i++) {
			System.out.println("");
			y_lisans[i].bilgileri_yazdir();
			y_lisans[i].mezuniyet_yili_hesapla();
			y_lisans[i].harf_hesapla();
			System.out.println("");
		}
 
/*
		LisansOgrencisi lo = new LisansOgrencisi("Ali", "Kara", "Lisans", 2, 60, 85);
		System.out.println("");
		LisansOgrencisi lo2 = new LisansOgrencisi("Faruk", "Can", "Lisans", 1, 40, 65);
		System.out.println("");
		YuksekLisans ylo = new YuksekLisans("Sena", "DEMİR", "tez", "Yuksek Lisans", 78);

		lo1.bilgileri_yazdir();
		System.out.println("");
		lo1.mezuniyet_yili_hesapla();

		ylo.bilgileri_yazdir();
		System.out.println("");
		ylo.mezuniyet_yili_hesapla();
*/
	}

}
	


