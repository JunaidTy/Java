abstract class Demo1
{
	abstract void disp();
}
abstract class Demo2
{
	void test()
	{
		System.out.println("executing test method.......");
	}
}
abstract class Demo3
{
	void start()
	{
		System.out.println("executing start method...");
	}
	abstract void end();
}
abstract class Demo4
{
}

class Sample1
{
}

class  MainClass111
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Demo3 d1=new Demo3();
		d1.start();
		System.out.println("end of java code");
	}
}
