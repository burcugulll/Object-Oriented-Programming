package nesne_lab_haftaa3;

import java.util.Scanner;

public class ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a;
		System.out.println("A sayisini giriniz:");
		a=input.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				System.out.print(i+" ");
		}
	}

}
