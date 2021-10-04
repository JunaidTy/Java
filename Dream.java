class Onedaykart
{
	int noofproducts=8;
	int devilerytime=2;
	String paymentmode="card";
	void products()
	{
		System.out.println("Products are listed bellow");
		System.out.println("FISH");
		System.out.println("MEAT");
		System.out.println("EGG");
		
	}
	void vegetables()
	{
		System.out.println("POTATO");
		System.out.println("TOMATO");
		System.out.println("BRINJAL");

	}
}
class Dream11v2 extends Dream11
{
	
	void teamsadded()
	{
			System.out.println("PAKISTAN");
			System.out.println("NEWZELAND");
			System.out.println("AFGANISTAN");
			System.out.println("SOUTH AFRICA");
	
	}	
}

class  Dream
{
	public static void main(String[] args) 
	{
		System.out.println("download application and create account");
		Dream11v2 dr=new Dream11v2();
		
		dr.teams();
		
		dr.teamsadded();
		System.out.println("noofteamsmade= "+dr.noofteamsmade);
		System.out.println("noofcontestjoined= "+dr.noofcontestjoined);
		System.out.println("paymentmode="+dr.paymentmode);
		
		dr.winner();
	}
}
