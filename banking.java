class hod
{
	String name1;
	emp1()
	{
		System.out.println("calling employee 1...");
		name1="rahul";
	}
}
class srhod extends hod
{
	String hod1;
	srhod()
	{
		//super();
		System.out.println("calling hod...");
		hod1="sailbal sarkar";
	}
}
class  Mistake
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		srhod sh2=new srhod();
		System.out.println("employee name= "+sh2.name1);
		System.out.println("head of department = "+sh2.hod1);
		System.out.println("end of java code");
	}
}
