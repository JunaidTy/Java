class Starpattern2 
{
	public static void main(String[] args) 
	{ int n=15;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row==1 || row==n || col==1 || col==n ||row==(n/2)+1||col==(n/2)+1 || row==col || row+col==16)
				    {
				         System.out.print("* ");
				    }
			    else
				    {
                         System.out.print("  ");
		             }
			}
		     System.out.println();
	    } 
     }
}
