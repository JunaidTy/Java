class CoreJava
{
	void knowlegdeOncoreJava()
	{
		System.out.println("core java............");
	}
}
class Advancejava extends CoreJava
{
	void knowlegdeOnadvancejava()
	{
		System.out.println("j2ee............");
	}
}
class Frameworks extends Advancejava
{
	void knowlegdeOnframeworks()
	{
		System.out.println("hibernate and springs");
	}
}
class Company
{
	void requirement(CoreJava c1)
	{
		c1.knowlegdeOncoreJava();
	}

	void requirement2(Advancejava c2)
	{
		c2.knowlegdeOncoreJava();
		c2.knowlegdeOnadvancejava();
	}

	void requirement3(Frameworks fw)
	{
		fw.knowlegdeOncoreJava();
		fw.knowlegdeOnadvancejava();
		fw.knowlegdeOnframeworks();
	}
}
class  MainClass8
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Company ref=new Company();					
		ref.requirement(new CoreJava());//same class type matching statement
		ref.requirement(new Advancejava());//sub class Object upcasting
		ref.requirement(new Frameworks());//sub class Object upcasting

		//ref.requirement2(new CoreJava());//super class Object //not possible 
		ref.requirement2(new Advancejava());//same class type matching statement
		ref.requirement2(new Frameworks());//sub class Object upcasting


		//ref.requirement3(new CoreJava());//super class Object //not possible 
		//ref.requirement3(new Advancejava());//super class Object //not possible 
		ref.requirement3(new Frameworks());//same class type matching statement
		System.out.println("end of java code");
	}
}
