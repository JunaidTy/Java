abstract class qspider
{
	abstract void engg(String rating,int attendance,boolean assignment);
}
class job extends  qspider
{
	void engg(String rating,int attendance,boolean assignment)
	{
		System.out.println("got a job");
	}
}
class  Companyentry
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		job j1=new job();
		j1.engg("star",95,true);
		System.out.println("end of java code");
	}
}
