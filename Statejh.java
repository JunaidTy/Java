class state
{
	String district;
	state()
	{
		System.out.println("district of jharkhand...");
		district="ranchi";
	}
}
class village extends state
{
	String village1;
	village()
	{
		
		System.out.println("village of jharkhand...");
		village1="muri";
	}
}
class  Statejh
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		village v=new village();
		System.out.println("district name= "+v.district);
		System.out.println("village name = "+v.village1);
		System.out.println("end of java code");
	}
}
