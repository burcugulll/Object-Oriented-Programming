package nesne_lab_haftaa3_ornek3;

import java.util.Scanner;

public class ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2=0,kalan;
        
        System.out.print("Bir sayi giriniz: ");
        sayi1=scan.nextInt();
        
       
        while(sayi1 > 0) {
            kalan=sayi1%10;
            sayi2=sayi2*10+kalan;
            sayi1=sayi1/10;
        }
        System.out.print("Girdiğiniz sayinin tersten yazılısı = "+sayi2);

	}

}
