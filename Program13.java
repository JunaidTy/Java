class Program13 
{

	static String buyProduct(int money)//shop keeper //called method
	{
		if(money<=10)
		{
			return "choclate";
		}
		else if(money>10 && money<=25)
		{
			return "biscuit";
		}
		else
		{
			return "cake";
		}
	}
	public static void main(String[] args) //you //calling method 
	{
		System.out.println("start of java code");
		String pro = buyProduct(16);
		System.out.println("pro="+pro);
		System.out.println("end of java code");
	}
}
