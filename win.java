class Program13 
{

	static String win(int run)//shop keeper //called method
	{
		if(run<=350)
		{
			return "team a win the match";
		}
		else
		{
			return "team b win the match";
		}
	}
	public static void main(String[] args) //you //calling method 
	{
		System.out.println("start of java code");
		int tr = win(280);
		System.out.println("pro="+tr);
		System.out.println("end of java code");
	}
}
