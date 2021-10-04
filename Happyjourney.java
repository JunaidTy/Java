abstract class travel
{
	abstract void tkt();
	abstract void ntpcrreport();
	abstract void validid();
}
abstract class traintravel extends travel
{
	void tkt()
	{
		System.out.println("get train ticket............");
	}
}
class traintravel2 extends traintravel
{
	void ntpcrreport()
	{
		System.out.println("get ntpcr report...... ");
	}
	void validid()
	{
		System.out.println("happy journey......");
	}
}
class  Happyjourney
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		traintravel2 ref=new traintravel2();
		ref.tkt();
		ref.ntpcrreport();
		ref.validid();
		System.out.println("end of java code");
	}
}
