class product1
{
	String house="Junaid house";
	void content1()
	{
		System.out.println("Bed...");
	}
}
class product2 extends product1
{
	void content2()
	{
		System.out.println("Sofa...........");
	}
}
class product3 extends product2
{
	void content3()
	{
		System.out.println("Table......");
	}
}
class room extends product3
{
	void room1()
	{
		System.out.println("Beatiful Room");
	}
}

class  Myhouse
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		room ref=new room();
		System.out.println(ref.house);
		ref.content1();
		ref.content2();
		ref.content3();
		ref.room1();
		System.out.println("end of java code");
	}
}
