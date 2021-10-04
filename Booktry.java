class book
{
	int bookno;
	String bname;
	float price;
 
     book(int bn,String bna,float pr)
	{
		System.out.println("constructor called..........");
	    bookno=bn;
		bname=bna;
		price=pr;
     }
}
class Booktry
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		book b1=new book(123,"abc",78.50f);
		System.out.println("detail of first book");
	    System.out.println("book no= "+b1.bookno);
		System.out.println("book name= "+b1.bname);
		System.out.println("book price= "+b1.price);
		System.out.println("End of java code");

	}
}
