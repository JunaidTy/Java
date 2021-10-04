class NormalPass
{
	void visit()
	{
		System.out.println("visit the place");
	}
}
class SilverPass extends NormalPass
{
	void beakfast()
	{
		System.out.println("can have break fast");
	}
	void lunch()
	{
		System.out.println("can have lunch");
	}
}
class GoldenPass extends SilverPass
{
	void reservedSeats()
	{
		System.out.println("front rows seats are reserved");
	}
}

class Event1
{
	void entryGate1(NormalPass np)
	{
		np.visit();
	}
	void entryGate2(SilverPass sp)
	{
		sp.visit();
		sp.beakfast();
		sp.lunch();
	}
	void entryGate3(GoldenPass gp)
	{
		gp.visit();
		gp.beakfast();
		gp.lunch();
		gp.reservedSeats();
	}
}
class  MainClass9
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Event1 ref=new Event1();
		ref.entryGate1(new NormalPass());
		ref.entryGate1(new SilverPass());
		ref.entryGate1(new GoldenPass());

		//ref.entryGate2(new NormalPass());//super class Object //no possible
		ref.entryGate2(new SilverPass());
		ref.entryGate2(new GoldenPass());
		
		//ref.entryGate3(new NormalPass());
	//	ref.entryGate3(new SilverPass());
		ref.entryGate3(new GoldenPass());
		
		
		System.out.println("end of java code");
	}
}
