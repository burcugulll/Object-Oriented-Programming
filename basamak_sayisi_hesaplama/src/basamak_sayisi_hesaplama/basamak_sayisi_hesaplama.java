package basamak_sayisi_hesaplama;
import java.util.Scanner;

public class basamak_sayisi_hesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Basamak sayısı hesaplama
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int tempSayi = sayi;
        int sayac = 0;

        // Özel durum: 0 sayısı
        if (tempSayi == 0) {
            sayac = 1;
        } else {
            while (tempSayi > 0) {
                tempSayi /= 10; // tempSayi = tempSayi / 10;
                sayac++;
            }
        }
        
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
    }
}
