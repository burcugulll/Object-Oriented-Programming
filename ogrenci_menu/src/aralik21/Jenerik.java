package aralik21;

public class Jenerik <T> {
	T type_t;

	public Jenerik(T type_t) {
		this.type_t = type_t;
	}
	
	public void NesneBilgileriniYazdir()
	{
		System.out.println("Class name:"+type_t.getClass().getName());
	}
}
