//Player eligible for which tournament
class Localplayer
{
	void locallevelplayer()
	{
		System.out.println("Local Tournament......");
	}
}
class Districtplayer extends Localplayer
{
	void districtlevelplayer()
	{
		System.out.println("District Tournament........");
	}
}
class Stateplayer extends Districtplayer
{
	void statelevelplayer()
	{
		System.out.println("State Tournament........");
	}
}
class Nationalplayer extends Stateplayer
{
	void nationallevelplayer()
	{
		System.out.println("National Tournament........");
	}
}
class Internationalplayer extends Nationalplayer
{
	void internationallevelplayer()
	{
		System.out.println("International Tournament........");
	}
}

class India
{
	void localtournament(Localplayer l1)
	{
		l1.locallevelplayer();
	}
	void districttournament(Districtplayer d1)
	{
		d1.locallevelplayer();
		d1.districtlevelplayer();
	}
	void statetournament(Stateplayer s1)
	{
		s1.locallevelplayer();
		s1.districtlevelplayer();
		s1.statelevelplayer();
	}
	void nationaltournament(Nationalplayer n1)
	{
		n1.locallevelplayer();
		n1.districtlevelplayer();
		n1.statelevelplayer();
		n1.nationallevelplayer();
	}
	void internationaltournament(Internationalplayer i1)
	{
		i1.locallevelplayer();
		i1.districtlevelplayer();
		i1.statelevelplayer();
		i1.nationallevelplayer();
		i1.internationallevelplayer();
	}
}
class  Upcasting2

{
  public static void main(String[] args) 
	{
		System.out.println("start of java code");
		India ind=new India();

        System.out.println("Local player eligible");
		ind.localtournament(new Localplayer());//same class type matching statement
		System.out.println("District player eligible");
		ind.localtournament(new Districtplayer());//sub class Object upcasting
		System.out.println("State player eligible");
		ind.localtournament(new Stateplayer());//sub class Object upcasting
		System.out.println("National player eligible");
		ind.localtournament(new Nationalplayer());//sub class Object upcasting
		System.out.println("InterNational player eligible");
		ind.localtournament(new Internationalplayer());//sub class Object upcasting

		//ind.districttournament(new Localplayer());//super class Object //not possible 
		System.out.println("District player eligible");
		ind.districttournament(new Districtplayer());//same class type matching statement
		System.out.println("State player eligible");
		ind.districttournament(new Stateplayer());//sub class Object upcasting
		System.out.println("National player eligible");
		ind.districttournament(new Nationalplayer());//sub class Object upcasting
		System.out.println("InterNational player eligible");
		ind.districttournament(new Internationalplayer());//sub class Object upcasting

		//ind.statetournament(new Localplayer());//super class Object //not possible 
		//ind.statetournament(new Districtplayer());//super class Object //not possible
		System.out.println("State player eligible");
		ind.statetournament(new Stateplayer());//same class type matching statement
		System.out.println("National player eligible");
		ind.statetournament(new Nationalplayer());//sub class Object upcasting
		System.out.println("InterNational player eligible");
		ind.statetournament(new Internationalplayer());//sub class Object upcasting

		//ind.nationaltournament(new Localplayer());//super class Object //not possible 
		//ind.nationaltournament(new Districtplayer());//super class Object //not possible 
		//ind.nationaltournament(new Stateplayer());//super class Object //not possible 
		System.out.println("National player eligible");
		ind.nationaltournament(new Nationalplayer());//same class type matching statement
		System.out.println("InterNational player eligible");
		ind.nationaltournament(new Internationalplayer());//sub class Object upcasting

		//ind.internationaltournament(new Localplayer());//super class Object //not possible 
		//ind.internationaltournament(new Districtplayer());//super class Object //not possible 
		//ind.internationaltournament(new Stateplayer());//super class Object //not possible 
		//ind.internationaltournament(new Nationalplayer());//super class Object //not possible 
		System.out.println("InterNational player eligible");
		ind.internationaltournament(new Internationalplayer());//same class type matching statement
		
		System.out.println("end of java code");
	}
}
