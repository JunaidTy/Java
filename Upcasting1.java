class Matriculation
{
	void Class10()
	{
		System.out.println("Matriculation completed..........");
	}
}
class Intermediate extends Matriculation
{
	void Class12()
	{
		System.out.println("Intermediate completed...........");
	}
}
class Btech extends Intermediate 
{
	void Bachelor()
	{
		System.out.println("Bachelor degree completed........");
	}
}
class Mtech extends Btech 
{
	void Master()
	{
		System.out.println("Master degree completed........");
	}
}
class Qualification
{
	void requirement(Matriculation m1)
	{
		m1.Class10();
	}

	void requirement2(Intermediate i1)
	{
		i1.Class10();
		i1.Class12();
	}

	void requirement3(Btech b1)
	{
		b1.Class10();
		b1.Class12();
		b1.Bachelor();
	}
	void requirement4(Mtech m2)
	{
		m2.Class10();
		m2.Class12();
		m2.Bachelor();
		m2.Master();
	}
}
class  Upcasting1
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Qualification q1=new Qualification();	
		System.out.println("For requirement 1 10th passout elegible");
		q1.requirement(new Matriculation());//same class type matching statement
		System.out.println("For requirement 1 12th passout elegible");
		q1.requirement(new Intermediate());//sub class Object upcasting
		System.out.println("For requirement 1 Btech passout elegible");
		q1.requirement(new Btech());//sub class Object upcasting
		System.out.println("For requirement 1 Mtech passout elegible");
		q1.requirement(new Mtech());//sub class Object upcasting

		//q1.requirement2(new Matriculation());//super class Object //not possible 
		System.out.println("For requirement 2 12th passout elegible");
		q1.requirement2(new Intermediate());//same class type matching statement
		System.out.println("For requirement 2 Btech passout elegible");
		q1.requirement2(new Btech());//sub class Object upcasting
		System.out.println("For requirement 2 Mtech passout elegible");
		q1.requirement2(new Mtech());//sub class Object upcasting



		//q1.requirement3(new Matriculation());//super class Object //not possible 
		//q1.requirement3(new Intermediate());//super class Object //not possible 
		System.out.println("For requirement 3 Btech passout elegible");
		q1.requirement3(new Btech());//same class type matching statement
		System.out.println("For requirement 3 Mtech passout elegible");
		q1.requirement3(new Mtech());//sub class Object upcasting


		//q1.requirement4(new Matriculation());//super class Object //not possible 
		//q1.requirement4(new Intermediate());//super class Object //not possible 
		//q1.requirement4(new Btech());//super class Object //not possible
		System.out.println("For requirement 4 Mtech passout elegible");
		q1.requirement4(new Mtech());//same class type matching statement
		System.out.println("end of java code");
	}
}
