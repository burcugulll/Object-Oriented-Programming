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

//Burcu Gül 20010011066
package odev_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Anasayfa {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		ArrayList<Ogrenci> Ogrenciler=new ArrayList<Ogrenci>();
		ArrayList<Ders> Dersler=new ArrayList<Ders>();
		String[] okunanparcala;
		boolean kontrol= true;
		String okunan,ad,soyad;
		int secim;
		int adet=-1;
		boolean gecici = true;
		File ogrencidosya=new File ("ogrenci.txt");
		if(!ogrencidosya.exists()) {
			ogrencidosya.createNewFile();
		}
		else
		{
			
			FileReader fr=new FileReader(ogrencidosya);
			BufferedReader br=new BufferedReader(fr);
			
			while((okunan=br.readLine())!=null)
			{
				
				if(okunan.charAt(0)=='+') {
					okunanparcala=okunan.substring(1).split("%");

					Ogrenciler.add(new Ogrenci(Integer.parseInt(okunanparcala[0]),okunanparcala[1],Integer.parseInt(okunanparcala[2])));
					adet+=1;
				}
				else if(okunan.charAt(0)=='*') {
					okunanparcala=okunan.substring(1).split("%");
					Ogrenci temp = Ogrenciler.get(adet);
					temp.alinanDersler.add(new Ders(Integer.parseInt(okunanparcala[0]),okunanparcala[1]));
				}
				
			}
			fr.close();
			br.close();
			
		}
		
		File dersdosya=new File ("ders.txt");
		if(!dersdosya.exists()) {
			dersdosya.createNewFile();
		}
		else
		{
			FileReader fr2=new FileReader(dersdosya);
			BufferedReader br2=new BufferedReader(fr2); 
			
			while((okunan=br2.readLine())!=null)
			{
				okunanparcala=okunan.split("%");
				Dersler.add(new Ders(Integer.parseInt(okunanparcala[0]),okunanparcala[1]));
			}
			fr2.close();
			br2.close();
		}
		
		while(kontrol)
		{
			System.out.println("1-Ders Ekle");
			System.out.println("2-Ders Listele");
			System.out.println("3-Ders Ara");
			System.out.println("4-Ders Sil");
			System.out.println("5-Ogrenci Ekle");
			System.out.println("6-Öğrenci Ara");
			System.out.println("7–Öğrenci Sil");
			System.out.println("8–Öğrenci Listele");
			System.out.println("9–Öğrencileri Ayrıntılı Listele");
			System.out.println("10–Öğrencilerin Ödeyeceği Tutarı Hesapla");
			System.out.println("11-Çıkış");
			System.out.println("Seçim yapınız: ");
			secim=scan.nextInt();
			switch(secim) {
			case 1:
				System.out.print("Eklenecek ders adını giriniz: ");
				ad = scan.next();
				Dersler.add(new Ders(ad));
				System.out.println("");
				break;
				
				
			case 2:
				System.out.println("Tüm Dersler");
				System.out.println("Ders Id Ders Adı");
				for(Ders temp:Dersler)
				{
					System.out.println(temp.getDersId()+"\t"+temp.getDersAd());
					
				}
				break;
				
			case 3:
				scan.nextLine();
				System.out.print("Aranacak ders adi: ");
				ad =scan.nextLine();
				boolean index=false;
				
				for(Ders temp:Dersler)
				{
					if(temp.getDersAd().equals(ad))
					{
						index=true;
						System.out.println("Ders Id\tDers Adı");
						System.out.println(temp.getDersId()+" \t"+temp.getDersAd());
						
					}
				}
				if(index==false)
				{
					System.out.println("Aranan ders bulunamadı.");
				}
				System.out.println("");
				index=false;
				break;
			case 4:
				System.out.print("Silinecek ders adı:");
				int tempid=scan.nextInt();
				index=false;
			
				
				for(Ders temp:Dersler)
				{
				
					if(tempid==temp.getDersId())
					{
						index=true;
						Dersler.remove(temp);
						System.out.println("Basariyla silindi");
						
						break;
					}
				}
				
				if(index==false)
				{
					System.out.println("Silinecek ders id bulunamadı");
				}
				System.out.println("");
				index=false;
				break;
				
			case 5:
				
				System.out.print("Eklenecek öğrenci id sini giriniz:");
				int id=scan.nextInt();
				System.out.print("Eklenecek öğrenci adı giriniz:");
				ad=scan.next();
				System.out.print("Eklenecek öğrenci soyadı giriniz:");
				soyad=scan.next();
				System.out.print("Eklenecek öğrenci yas giriniz:");
				int yas=scan.nextInt();
				System.out.print("Kac ders eklenecek");
				int sayac=scan.nextInt();
				int kontrl=0;
				for(Ogrenci temp: Ogrenciler )
				{
					if (temp.getOgrId()==id) {
						System.out.println("Ayni id değerine sahip öğrenci bulundu.farkli id girin");
						kontrl=1;
						break;
					}
				}
				if(kontrl==0) {
					Ogrenci tmp=new Ogrenci(id,ad+soyad,yas);
					for(int j=0;j<sayac;j++)
					{
						System.out.println("Tüm Dersler");
						for(Ders temp:Dersler)
						{
							System.out.println("Ders Id:"+temp.getDersId());
							System.out.println("Ders Adı:"+temp.getDersAd());
							System.out.println(" ");
						}
						
						System.out.print("Öğrencinin eklenecek ders id'sini giriniz->");
						int dersid = scan.nextInt();
						scan.nextLine();
						System.out.print("Öğrencinin eklenecek ders adini giriniz->");
						String dersad = scan.nextLine();
						Ders tmpDers = new Ders(dersid,dersad);
						
						int dersKontrol = 0;
						for(Ders gDers:Dersler) {
							if(gDers.getDersId() == tmpDers.getDersId()) {
								dersKontrol = 1;
							}
							
							
						}
						if(dersKontrol==0) {
							Dersler.add(tmpDers);
						}
						tmp.alinanDersler.add(tmpDers);
					}
				
					Ogrenciler.add(tmp);
				}
				System.out.println("");
				break;
				
				
			case 6:
				scan.nextLine();
				System.out.print("Aranacak öğrenci adi soyadi->");
				String adsoyad =scan.nextLine();
				index=false;
				
				for(Ogrenci temp: Ogrenciler)
				{
					if(temp.getOgradSoyad().equals(adsoyad))
					{
						index=true;
						System.out.println("Id:"+temp.getOgrId()+"Ad:"+temp.getOgradSoyad()+"Yas: "+temp.getOgrYas());
						break;
					}
				}
				
				if(!index)
				{
					System.out.println("aranan öğrenci bulunamadı");
					
				}
				index=false;
				break;
				
			case 7:
				
				scan.nextLine();
				System.out.print("Silinecek öğrenci idsi->");
				id =scan.nextInt();
				index=false;
				
				for(Ogrenci temp: Ogrenciler)
				{
					if(temp.getOgrId() == id)
					{
						index=true;
						Ogrenciler.remove(temp);
						System.out.println("Öğrenci başarıyla silindi");
						break;
					}
				}
				
				if(!index)
				{
					System.out.println("aranan öğrenci bulunamadı");
					
				}
				index=false;
				break;
				
			case 8:
				System.out.println("Tüm Öğrenciler");
				for(Ogrenci temp:Ogrenciler)
				{
					System.out.println(temp.getOgrId()+" "+temp.getOgradSoyad()+" "+temp.getOgrYas());
					
				}
				break;
				
			case 9:
				System.out.println("Tüm Öğrenciler ve Aldıkları Dersler");
				for(Ogrenci temp:Ogrenciler)
				{
					System.out.println(temp.getOgrId()+" "+temp.getOgradSoyad()+" "+temp.getOgrYas());
					for(Ders ogrDers:temp.alinanDersler) {
						System.out.println("\t"+ogrDers.getDersId()+" "+ogrDers.getDersAd());
					}
					
				}
				break;
				
			case 10:
				Scanner girdi = new Scanner(System.in);
				int counter = 0;
				System.out.print("Oğrencinin Idsini Giriniz: ");
				int ogrId = girdi.nextInt();
				System.out.println("");
				for(Ogrenci temp:Ogrenciler)
				{
					if(ogrId == temp.getOgrId())
					{
						counter++;
						int derssay = temp.alinanDersler.size();
						int dersfiyat = 400;
						switch(derssay)
						{
						case 1:
							System.out.println("Tek ders aldığınız için kampanyanız bulunmamaktadır");
							break;
						case 2:
							System.out.println("Kampanya 1\nÜcretiniz haftalık 780TL");
							break;
						case 3:
							System.out.println("Kampanya 2\nÜcretiniz haftalık 1140TL");
							break;
						default:
							System.out.println("Kampanya 3\nÜcretiniz haftalık "+((dersfiyat*derssay)-(dersfiyat*0.1)*derssay));
							break;
						}
					}
				}
				if(counter == 0)
				{
					System.out.println("Kursiyer Bulunamadi\n");
				}
				break;
				
			case 11:
				File ders = new File("ders.txt");
				File ogrenci = new File("ogrenci.txt");
				if(!ders.exists()) {
					ders.createNewFile();
				}
				
				 FileWriter fileWriter = new FileWriter(ders, false);
			     BufferedWriter dersw = new BufferedWriter(fileWriter);
			     
			     FileWriter fileWriter2 = new FileWriter(ogrenci, false);
			     BufferedWriter ogrenciw = new BufferedWriter(fileWriter2);
			     
				 
			     try
			     {
			     	for(Ders tmpders:Dersler)
			     	{
			     		dersw.write(tmpders.getDersId()+"%"+tmpders.getDersAd()+"\n");
			     	}
			     	
			     	for(Ogrenci tmpogrenci:Ogrenciler)
						{
							ogrenciw.write("+"+tmpogrenci.getOgrId()+"%"+tmpogrenci.getOgradSoyad()+"%"+tmpogrenci.getOgrYas()+"\n");
							
							for(Ders tmpders:tmpogrenci.alinanDersler)
					     	{
					     		ogrenciw.write("*"+tmpders.getDersId()+"%"+tmpders.getDersAd()+"\n");
					     	}
						}
			     }
			     finally
			     {
			     	
			     	dersw.close();
			     	ogrenciw.close();
			     }
			   
		     
		     
			     System.out.println("Basariyla Cikis Yapildi\n");
			     kontrol=false;
			     break;
				
				default:
					System.out.println("1-11 arasında seçim yapınız");
					break;
			}
		}
	}
}