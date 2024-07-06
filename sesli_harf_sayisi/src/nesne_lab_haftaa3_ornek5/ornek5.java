package nesne_lab_haftaa3_ornek5;

import java.util.Scanner;

public class ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String kelime;
		int sayac=0;
		
		System.out.print("Bir metin giriniz:");
		kelime=scan.nextLine();
		
		for(int i=0; i<kelime.length(); i++)
		{
			if (kelime.charAt(i)=='a' || kelime.charAt(i)=='e' || kelime.charAt(i)=='ı' || kelime.charAt(i)=='i' || kelime.charAt(i)=='o' || kelime.charAt(i)=='ö' || kelime.charAt(i)=='u' || kelime.charAt(i)=='ü')
					{
						sayac++;
					}
		}
		System.out.println("Girilen kelimede "+sayac+" adet sesli harf bulunmaktadır");
	}

}
