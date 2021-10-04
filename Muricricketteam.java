abstract class cricket
{
	abstract void age18above();
	abstract void citizenofindia();
	abstract void validid();
}
abstract class cricketclub1 extends cricket
{
	void age18above()
	{
		System.out.println("yes i am adult");
	}
}
class cricketclub2 extends cricketclub1
{
	void citizenofindia()
	{
		System.out.println("yes i am citizen of india ");
	}
	void validid()
	{
		System.out.println("i am in the cricket club team.");
	}
}
class  Muricricketteam
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		cricketclub2 ref=new cricketclub2();
		ref.age18above();
		ref.citizenofindia();
		ref.validid();
		System.out.println("end of java code");
	}
}
