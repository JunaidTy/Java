class  teama
{
	static String match(int run)
	{
		if(run==300)
		{
			return "Match Draw";
		}
	    else if(run>300)
			{
				return "WIN the match";
			}
			else
			{
				return "LOST the match";
			}
		}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		String result=match(322);
		System.out.println("the result of match is "+result);
        System.out.println("end of java code");
	}
}
