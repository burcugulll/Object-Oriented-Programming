package aralik21;

public class Anasayfa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jenerik<Integer> nesne1=new Jenerik <Integer>(10);
		Jenerik <String> nesne2= new Jenerik <String>("Burcu Gül");
		Jenerik<Double> nesne3= new Jenerik <Double>(5.2);
		
		nesne1.NesneBilgileriniYazdir();
		nesne2.NesneBilgileriniYazdir();
		nesne3.NesneBilgileriniYazdir();
	}

}
