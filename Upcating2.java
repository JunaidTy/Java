class Localplayer
{
	void locallevelplayer()
	{
		System.out.println("Local player......");
	}
}
class Districtplayer extends Localplayer
{
	void districtlevelplayer()
	{
		System.out.println("District player........");
	}
}
class Stateplayer extends Districtplayer
{
	void statelevelplayer()
	{
		System.out.println("State level player........");
	}
}
class Nationalplayer extends Stateplayer
{
	void nationallevelplayer()
	{
		System.out.println("National level player........");
	}
}
class Internationalplayer extends Nationalplayer
{
	void internationallevelplayer()
	{
		System.out.println("International level player........");
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

		ind.localtournament(new locallevelplayer());
		ind.localtournament(new districtlevelplayer());
		ind.localtournament(new statelevelplayer());
		ind.localtournament(new nationallevelplayer());
		ind.localtournament(new internationallevelplayer());

		//ind.districttournament(new locallevelplayer());
		ind.districttournament(new districtlevelplayer());
		ind.districttournament(new statelevelplayer());
		ind.districttournament(new nationallevelplayer());
		ind.districttournament(new internationallevelplayer());

		//ind.statetournament(new locallevelplayer());
		//ind.statetournament(new districtlevelplayer());
		ind.statetournament(new statelevelplayer());
		ind.statetournament(new nationallevelplayer());
		ind.statetournament(new internationallevelplayer());

		//ind.nationaltournament(new locallevelplayer());
		//ind.nationaltournament(new districtlevelplayer());
		//ind.nationaltournament(new statelevelplayer());
		ind.nationaltournament(new nationallevelplayer());
		ind.nationaltournament(new internationallevelplayer());

		//ind.internationaltournament(new locallevelplayer());
		//ind.internationaltournament(new districtlevelplayer());
		//ind.internationaltournament(new statelevelplayer());
		//ind.internationaltournament(new nationallevelplayer());
		ind.internationaltournament(new internationallevelplayer());

		

		
		
		
		System.out.println("end of java code");
	}
}
