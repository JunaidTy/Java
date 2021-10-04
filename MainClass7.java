class StudentV1
{
	void module1()
	{
		System.out.println("basics of programing............");
	}
}
class StudentV2 extends StudentV1
{
	void module2()
	{
		System.out.println("oops.........");
	}
}
class StudentV3 extends StudentV2 
{
	void module3()
	{
		System.out.println("libraries...........");
	}
}

class Trainer
{
	void firstMockInterview(StudentV1 v1)
	{
		v1.module1();
	}

	void secondMock(StudentV2 v2)
	{
		v2.module1();
		v2.module2();
	}


	void FinalMock(StudentV3 v3)
	{
		v3.module1();
		v3.module2();
		v3.module3();
	}
}

class  MainClass7
{
	public static void main(String[] args) 
	{
		Trainer ref=new Trainer();
		//ref.FinalMock(new StudnetV1());//super class Object not possible
		//ref.FinalMock(new StudnetV2());//super class Object not possible
		ref.FinalMock(new StudentV3());//same class Object type matching statement	
		

		//ref.sendMock(new StudentV1());//super class Object //not possible
		ref.secondMock(new StudentV2());//same class Object type matching statement	
		ref.secondMock(new StudentV3());//sub class Object upcasting	
		
		
		ref.firstMockInterview(new StudentV1());//same class object //type matching statement
		ref.firstMockInterview(new StudentV2());//sub class Object// upcasting
		ref.firstMockInterview(new StudentV3());//sub class Object// upcasting
	}
}
