class Shop 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		String result=fruits(90);
		System.out.println("You will get "+result);
		System.out.println("end of java code");
	}

	static String fruits(int rate)
	   {
		if(rate>=100)
		    {
			return "APPLE";
		    }
	    else if(rate>=80 && rate<100)
			{
				return "GRAPES";
			}
			else if (rate>=60 && rate<80)
			{
				return "WATER MELON";
			}
			else
			{
				return "GUAVA";
			}
		}
	
}