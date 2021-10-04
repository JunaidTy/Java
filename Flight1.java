class flight
{
	String fname;
	int fprice;
	double ftime;
	String ceo;
	boolean flightscheduledtoday;

flight(String fname,int fprice,double ftime)
	{
	this();
	this.fname=fname;
	this.fprice=fprice;
	this.ftime=ftime;
	}
	flight()
	{
	
		ceo="Sunil Bhaskaran";
		flightscheduledtoday=true;

	}    
}

class Flight1
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		flight f9=new flight("Air Asia",3500,10.52);
		System.out.println("Flight name "+f9.fname);
        flight f1=new flight();
		System.out.println("Flight ceo "+f1.ceo);
		System.out.println("Flight scheduled today "+f1.flightscheduledtoday);
		System.out.println("Flight price "+f9.fprice);
		System.out.println("Flight time "+f9.ftime);
	    System.out.println("End of java code");
	}
}
