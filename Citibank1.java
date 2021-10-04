class Citibank
{
	int noOfAccounts=1000;
	void motoOfBank()
	{
		System.out.println("Safe Bank Citi Bank");
	}
}
class Citibank1 
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Citibank ref=new Citibank();
		System.out.println("No of Accounts="+ref.noOfAccounts);
		ref.motoOfBank();
		System.out.println("end of java code");
	}
}
