class Onedaykart
{
	int noofproducts=8;
	int devilerytime=2;
	String paymentmode="card";
	void products()
	{
		System.out.println("Products are listed bellow");
		System.out.println("FISH");
		System.out.println("MEAT");
		System.out.println("EGG");
		
	}
	void vegetables()
	{
		System.out.println("POTATO");
		System.out.println("TOMATO");
		System.out.println("BRINJAL");
		System.out.println("ONION");
	}
}
class Onedaykartv2 extends Onedaykart
{
	
	void fruits()
	{
			System.out.println("Apple");
			System.out.println("Grapes");
			System.out.println("Banana");
			System.out.println("Guava");
	
	}	
}

class  Shoping
{
	public static void main(String[] args) 
	{
		System.out.println("download application and create account");
		Onedaykartv2 on=new Onedaykartv2();
		
		on.products();
		
		on.vegetables();
		on.fruits();
		System.out.println("noofproducts= "+on.noofproducts);
		System.out.println("devilerytime= "+on.devilerytime);
		System.out.println("paymentmode="+on.paymentmode);
		
		
	}
}
