class carV1
{
	String dezire="Dezire";
	void dezire1()
	{
		System.out.println("LXI...");
	}
}
class carV2 extends carV1
{
	void dezire2()
	{
		System.out.println("VXI...........");
	}
}
class carV3 extends carV2
{
	void dezire3()
	{
		System.out.println("ZXI......");
	}
}
class car extends carV3
{
	void drive()
	{
		System.out.println("Drive Slow");
	}
}

class  Dezirecar
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		car ref=new car();
		System.out.println("MARUTI SUZUKI = "+ref.dezire);
		ref.dezire1();
		ref.dezire2();
		ref.dezire3();
		ref.drive();
		System.out.println("end of java code");
	}
}
