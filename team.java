class Program14
{
	static String team(int run) //HR
	{
		if(run==300)
		{
			return "win the match";
		}
		
		else
		{
			return "lost the match";
		}
	}	
	public static void main(String[] args) //Employee
	{
		System.out.println("start of java code");
		String arun=team(300);
		System.out.println(arun);
		
		System.out.println("end of java code");
	}
}
