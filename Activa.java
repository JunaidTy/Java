class scooty
{
	String sname;
	double price;
	int noofwheels;
	float petroltankcapacity;
	String colour;
    int emiprice;

	scooty()
	{
		this(String colour,int emiprice);
		sname="Activa";
		price=50000.00;
		noofwheels=2;
		petroltankcapacity=3.5f;
	}
	scooty(String colour,int emiprice)
	{
		
		this.colour=colour;
		this.emiprice=emiprice;
	}
}

class  Activa 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
      
		scooty a1=new scooty();
		  scooty a2=new scooty("RED",11924);
		System.out.println("Name of scooty = "+a1.sname);
		System.out.println("Price of scooty = "+a1.price);
		System.out.println("Colour of scooty = "+a2.colour);
		System.out.println("Emi of scooty = "+a2.emiprice);
		System.out.println("No of wheels = "+a1.noofwheels);
		System.out.println("Petrol tank capacity= "+a1.petroltankcapacity +"l");
		System.out.println("End of java code");
	}
}
