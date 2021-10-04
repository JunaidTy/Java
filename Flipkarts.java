class Flipkart
{
	int noOforders=2;
	void products()
	{
		System.out.println("Products are on sale");
	}
}
class Flipkarts 
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Flipkart ref=new Flipkart();
		System.out.println("No of orders="+ref.noOforders);
		ref.products();
		System.out.println("end of java code");
	}
}
