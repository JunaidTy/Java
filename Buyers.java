class Dream11
{
	int noofteamsmade=10;
	int noofcontestjoined=2;
	String paymentmode="card";
	void teams()
	{
		System.out.println("Products are listed bellow");
		System.out.println("INDIA");
		System.out.println("AUSTRALIA");
		System.out.println("BANGLADESH");
		
	}
	void winner()
	{
		System.out.println("winner will get full amount");
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
		Dream11v2 dr=new Dreamv2();
		
		dr.teams();
		
		on.teamsadded();
		System.out.println("noofteamsmade= "+dr.noofteamsmade);
		System.out.println("noofcontestjoined= "+dr.noofcontestjoined);
		System.out.println("paymentmode="+dr.paymentmode);
		
		on.winner();
	}
}
