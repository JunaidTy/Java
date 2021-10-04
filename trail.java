class Program13 
{

	static String buyProduct(int c)//shop keeper //called method
	{
		int c=100;
		int p=50;
		if(c>p)
		{
			return "choclate";
		}
		else if(c>10 && c<=25)
		{
			return "biscuit";
		}
		else
		{
			return "cake";
		}
	}
	static int mr(int r)
	{
		int r,c,p;
		r=c-p;
	}
	public static void main(String[] args) //you //calling method 
	{
		System.out.println("start of java code");
		String pro = buyProduct(c);
		System.out.println("pro="+pro);
		 mr();
		System.out.println(p);

		System.out.println("end of java code");
	}
}
