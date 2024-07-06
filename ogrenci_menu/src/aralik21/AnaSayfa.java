package aralik21;
import java.util.ArrayList;
import java.util.Scanner;
public class AnaSayfa {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Ogrenci>Ogrenciler=new ArrayList<Ogrenci>();
		boolean kontrol=true;
		String ad,soyad;
		int vize_not,final_not,secim,no;
		
		while(kontrol)
		{
			System.out.println("1-Öğrenci Ekle: ");
			System.out.println("2-Öğrencileri Listele: ");
			System.out.println("3-Öğrenci Ara: ");
			System.out.println("4-Öğrenci Sil: ");
			System.out.println("5-Öğrenci Çıkış: ");
			System.out.println("Bir seçim yapınız: ");
			secim=scan.nextInt();
			
			switch(secim)
			{
			case 1:
				System.out.print("Öğrencinin adını giriniz: ");
				ad=scan.next();
				System.out.print("Öğrencinin soyadını giriniz: ");
				soyad=scan.next();
				System.out.print("Öğrencinin vize notunu giriniz: ");
				vize_not=scan.nextInt();
				System.out.print("Öğrencinin final notunu giriniz: ");
				final_not=scan.nextInt();
				Ogrenciler.add(new Ogrenci(ad,soyad,vize_not,final_not));
				System.out.println("Öğrenci eklendi");
				System.out.println(" ");
				break;
			case 2:
				for(Ogrenci ogr:Ogrenciler)
				{
					System.out.println("No:"+ogr.getNo());
					System.out.println("Ad:"+ogr.getAd());
					System.out.println("Soyad:"+ogr.getSoyad());
					System.out.println("Gecme Notu:"+ogr.getGecme_notu());
				}
				break;
			case 3:
				System.out.print("Aranacak öğrencinin nosunu giriniz:");
				no=scan.nextInt();
				boolean kontrol1=false;
				for(Ogrenci ogr:Ogrenciler)
				{
					if(no==ogr.getNo())
					{
						System.out.println("No:"+ogr.getNo());
						System.out.println("Ad:"+ogr.getAd());
						System.out.println("Soyad:"+ogr.getSoyad());
						System.out.println("Gecme Notu:"+ogr.getGecme_notu());
						kontrol1=true;
					}
				}
				if(!kontrol1)
				{
					System.out.println("Aranan öğrenci bulunamadı");
					System.out.println(" ");
				}
				break;
			case 4:
				System.out.print("Silinecek öğrencinin nosunu giriniz:");
				no=scan.nextInt();
				for(int i=0;i<Ogrenciler.size();i++)
				{
					if(Ogrenciler.get(i).getNo()==no)
					{
						Ogrenciler.remove(i);
						System.out.println("Öğrenci silindi");

					}
				}
				break;
			case 5:
				kontrol=false;
				break;
			default:
				System.out.println("1-5 arasında bir seçim yapınız");
				break;
				
			}
		}
	}
	                                     
}
