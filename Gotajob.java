class  Gotajob
{
	static String rating(int rat)
	{
		if(rat==10)
		{
			return "Excellent star rating";
		}
	    else if(rat>8)
			{
				return "Average student";
			}
			else if (rat>=6 && rat<8)
			{
				return "medium student";
			}
			else
			{
				return "poor student";
			}
		}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		String result=rating(9);
		System.out.println("the student status is "+result);
        System.out.println("end of java code");
	}
}
