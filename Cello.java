class cellopen
{
	String pname;
	int price;
	double inkquantity;
	cellopen()
	{
		pname="CELLO FUSION";
		price=5;
		inkquantity=1.5f;
	}
}

class  Cello 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		cellopen c1=new cellopen();
		System.out.println("Name of pen ="+c1.pname);
		System.out.println("Price of pen ="+c1.price);
		System.out.println("Ink quantity="+c1.inkquantity);
		System.out.println("End of java code");
	}
}
