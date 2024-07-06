package aralik7;
import java.util.Scanner;
public class Anasayfa {
	
	public static void bilgilerilistele(Muhendis[] dizi) {
		
		//Gec baglama ozelligi (Hangisinin kullanilacagi henuz belli degil)
		for(int i=0;i<dizi.length;i++) {
			dizi[i].bilgileriyazdir();
		}
	}
	public static void puanlariyazdir(Muhendis muhendis) {
		
		System.out.println("Muhendisin puanı->"+muhendis.puanhesapla());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int bs,ms,es,toplam,yas;
		String ad;
		//Polimorfizm kuralı burada geçerli alt sınıf old için muhedis dizisine ekleme yapılabılıyor
		
		System.out.print("Kac adet bilgisayar muh. olacak->");
		bs=scan.nextInt();
		System.out.print("Kac adet elektric muh. olacak->");
		es=scan.nextInt();
		System.out.print("Kac adet makine muh. olacak->");
		ms=scan.nextInt();
		
		toplam=bs+ms+es;
		
		Muhendis[] dizi=new Muhendis[toplam];
		
		for(int i=0;i<bs;i++) {
			System.out.print("Bilgisayar muh adini giriniz->");
			ad=scan.next();
			System.out.print("Bilgisayar muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new BilgisayarMuhendisi(ad,yas);
		}
		for(int i=bs;i<es+bs;i++) {
			System.out.print("Elektric muh adini giriniz->");
			ad=scan.next();
			System.out.print("Electric muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new ElektrikMuhendisi(ad,yas);
		}
		for(int i=bs+es;i<toplam;i++) {
			System.out.print("Makine muh adini giriniz->");
			ad=scan.next();
			System.out.print("Makine muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new MakineMuhendisi(ad,yas);
		}
		System.out.println();
		for(int i =0;i<dizi.length;i++) {
			puanlariyazdir(dizi[i]);
			
		}
		bilgilerilistele(dizi);
	}
	}


