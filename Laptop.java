class Hplaptop
{
	int ram=2;
	void Browser()
	{
		System.out.println("Browsing......");
	}
}
class Laptop 
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Hplaptop ref=new Hplaptop();
		System.out.println("Laptop used for="+ref.Browser);
		ref.Browser();
		System.out.println("end of java code");
	}
}
