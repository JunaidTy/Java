class Mails
{
	int noOfmails=150;
	void sentitems()
	{
		System.out.println("57 sent mails are there in gmail account.........");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		System.out.println("All mails in Gmail="+new Mails().noOfmails);
		new Mails().sentitems();
		System.out.println("End of java code");
	}
}
