class india
{
	void country()
	{
		System.out.println("India");
	}
}
class jharkhand extends  india
{
	void ranchi()
	{
		System.out.println("Ranchi");
	}
}
class maharastra extends india 
{
void bengaluru()
	{
	System.out.println("Bengaluru");
	}
}
class  Country1
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		jharkhand ref=new jharkhand();
		ref.country();
		ref.ranchi();
		

		maharastra e2=new maharastra();
		ref.country();
		e2.bengaluru();
	
		
		System.out.println("end of java code");
	}
}
