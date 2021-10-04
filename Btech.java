abstract class school
{
	abstract void studentage(int age);
}
class college extends  school
{
	void studentage(int age)
	{
		System.out.println("Age criteria for college student="+age);
	}
}
class  Btech
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		college c1=new college();
		c1.studentage(19);
		System.out.println("end of java code");
	}
}
