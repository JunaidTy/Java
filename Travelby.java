class travel
{
	static void capacity(int c)
	{
		System.out.println("Travel by car");
		System.out.println("CAR Capacity= "+c);
	}
	static void capacity(long t)
	{
		System.out.println("Travel by train");
		System.out.println("Train= "+t);
	}
}
class  Travelby
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		travel.capacity(15000l);
        System.out.println("end of java code");
	}
}
