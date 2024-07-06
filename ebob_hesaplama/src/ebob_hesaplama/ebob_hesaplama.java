package ebob_hesaplama;
import java.util.Scanner;

public class ebob_hesaplama {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	// En Büyük Ortak Bölen (EBOB) hesaplama
    System.out.print("Birinci sayiyi giriniz: ");
    int n = scan.nextInt();
    System.out.print("Ikinci sayiyi giriniz: ");
    int m = scan.nextInt();
    int a = n, b = m;

    while (n != m) {
        if (m > n) {
            m = m - n;
        } else {
            n = n - m;
        }
    }
    System.out.println(a + " ve " + b + " sayilarinin EBOB'u = " + m);
}
}
