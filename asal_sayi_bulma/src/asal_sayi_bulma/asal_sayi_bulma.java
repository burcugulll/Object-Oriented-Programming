package asal_sayi_bulma;
import java.util.Scanner;

public class asal_sayi_bulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + " Asal bir sayi degildir.");
            return;
        }

        int sayac = 0;
        int i = 2;

        while(i < sayi ) {
            if(sayi % i == 0 ) {
                sayac++;
            }
            i++;
        }
        
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        } else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}
