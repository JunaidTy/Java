class Whatsupv1
{
	void feature1()
	{
		System.out.println("Chats...");
	}
}
class Whatsupv2 extends Whatsupv1
{
	void feature2()
	{
		System.out.println("voice call");
	}
}
class Whatsupv3 extends Whatsupv2
{
	void feature3()
	{
		System.out.println("video calls");
	}
}
class Whatsupv4 extends Whatsupv3
{
	void feature4()
	{
		System.out.println("status..");
	}
}
class Whatsup
{
	void addedfeature1(Whatsupv1 w1)
	{
		w1.feature1();
	}

	void addedfeature2(Whatsupv2 w2)
	{
		w2.feature1();
		w2.feature2();
	}

	void addedfeature3(Whatsupv3 w3)
	{
		w3.feature1();
		w3.feature2();
		w3.feature3();
	}
	void addedfeature4(Whatsupv4 w4)
	{
		w4.feature1();
		w4.feature2();
		w4.feature3();
		w4.feature4();
	}
}
class  Upcasting5
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Whatsup wha=new Whatsup();
		System.out.println("whatsup version 1");
		wha.addedfeature1(new Whatsupv1());//same class type matching statement
		System.out.println("whatsup version 2");
		wha.addedfeature1(new Whatsupv2());//sub class Object upcasting
		System.out.println("whatsup version 3");
		wha.addedfeature1(new Whatsupv3());//sub class Object upcasting
		System.out.println("whatsup version 4");
		wha.addedfeature1(new Whatsupv4());//sub class Object upcasting

		//wha.addedfeature2(new Whatsupv1());//super class Object //not possible 
		System.out.println("whatsup version 2");
		wha.addedfeature2(new Whatsupv2());//same class type matching statement
		System.out.println("whatsup version 3");
		wha.addedfeature2(new Whatsupv3());//sub class Object upcasting
		System.out.println("whatsup version 4");
		wha.addedfeature2(new Whatsupv4());//sub class Object upcasting


		//wha.addedfeature3(new Whatsupv1());//super class Object //not possible 
		//wha.addedfeature3(new Whatsupv2());//super class Object //not possible 
		System.out.println("whatsup version 3");
		wha.addedfeature3(new Whatsupv3());//same class type matching statement
		System.out.println("whatsup version 4");
		wha.addedfeature3(new Whatsupv4());//sub class Object upcasting

		//wha.addedfeature4(new Whatsupv1());//super class Object //not possible 
		//wha.addedfeature4(new Whatsupv2());//super class Object //not possible 
		//wha.addedfeature4(new Whatsupv3());//super class Object //not possible 
		System.out.println("whatsup version 4");
		wha.addedfeature4(new Whatsupv4());//same class type matching statement


		System.out.println("end of java code");
	}
}
