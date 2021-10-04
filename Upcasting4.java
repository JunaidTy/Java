class Localshop
{
	void localshopproduct()
	{
		System.out.println("rice,wheat");
	}
}
class Minimall extends Localshop
{
	void minimallproduct()
	{
		System.out.println("cloths");
	}
}
class Mediummall extends Minimall
{
	void mediummallproduct()
	{
		System.out.println("utensils");
	}
}
class Bigmall extends Mediummall
{
	void bigmallproduct()
	{
		System.out.println("others");
	}
}
class Shop
{
	void requirement(Localshop ls1)
	{
		
		ls1.localshopproduct();
	}

	void requirement2(Minimall mm1)
	{
		
		mm1.localshopproduct();
		mm1.minimallproduct();
	}

	void requirement3(Mediummall mm2)
	{
		
		mm2.localshopproduct();
		mm2.minimallproduct();
		mm2.mediummallproduct();
	}

	void requirement4(Bigmall bm1)
	{
		
		bm1.localshopproduct();
		bm1.minimallproduct();
		bm1.mediummallproduct();
		bm1.bigmallproduct();
	}
}
class  Upcasting4
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Shop sh=new Shop();	
		System.out.println("Local shop");
		sh.requirement(new Localshop());//same class type matching statement
		System.out.println("Mini mall");
		sh.requirement(new Minimall());//sub class Object upcasting
		System.out.println("Medium mall");
		sh.requirement(new Mediummall());//sub class Object upcasting
		System.out.println("Big mall");
		sh.requirement(new Bigmall());//sub class Object upcasting

		//sh.requirement2(new Localshop());//super class Object //not possible 
		System.out.println("Mini mall");
		sh.requirement2(new Minimall());//same class type matching statement
		System.out.println("Medium mall");
		sh.requirement2(new Mediummall());//sub class Object upcasting
		System.out.println("Big mall");
		sh.requirement2(new Bigmall());//sub class Object upcasting


		//sh.requirement3(new Localshop());//super class Object //not possible 
		//sh.requirement3(new Minimall());//super class Object //not possible 
		System.out.println("Medium mall");
		sh.requirement3(new Mediummall());//same class type matching statement
		System.out.println("Big mall");
		sh.requirement3(new Bigmall());//sub class Object upcasting


		//sh.requirement4(new Localshop());//super class Object //not possible 
		//sh.requirement4(new Minimall());//super class Object //not possible 
		//sh.requirement4(new Mediummall());//super class Object //not possible 
		System.out.println("Big mall");
		sh.requirement4(new Bigmall());//same class type matching statement


		System.out.println("end of java code");
	}
}
