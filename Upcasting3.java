class Dezirev1
{
	void product()
	{
		System.out.println("music system");
	}
}
class Dezirev2 extends Dezirev1
{
	void product1()
	{
		System.out.println("camera");
	}
}
class Dezirev3 extends Dezirev2
{
	void product2()
	{
		System.out.println("alloy wheels");
	}
}
class Dezirev4 extends Dezirev3
{
	void product3()
	{
		System.out.println("back side ac vent");
	}
}
class Dezirelatestversion
{
	void model1(Dezirev1 dv1)
	{
		dv1.product();
	}

	void model2(Dezirev2 dv2)
	{
		dv2.product();
		dv2.product1();
	}

	void model3(Dezirev3 dv3)
	{
		dv3.product();
		dv3.product1();
		dv3.product2();
	}
	void model4(Dezirev4 dv4)
	{
		dv4.product();
		dv4.product1();
		dv4.product2();
		dv4.product3();
	}
}
class  Upcasting3
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Dezirelatestversion dlv=new Dezirelatestversion();
		
		System.out.println("Feature of dezire version 1");
		dlv.model1(new Dezirev1());//same class type matching statement
		System.out.println("Feature of dezire version 2");
		dlv.model1(new Dezirev2());//sub class Object upcasting
		System.out.println("Feature of dezire version 3");
		dlv.model1(new Dezirev3());//sub class Object upcasting
		System.out.println("Feature of dezire version 4");
		dlv.model1(new Dezirev4());//sub class Object upcasting

		//dlv.model2(new Dezirev1());//super class Object //not possible
		System.out.println("Feature of dezire version 2");
		dlv.model2(new Dezirev2());//same class type matching statement
		System.out.println("Feature of dezire version 3");
		dlv.model2(new Dezirev3());//sub class Object upcasting
		System.out.println("Feature of dezire version 4");
		dlv.model2(new Dezirev4());//sub class Object upcasting


		//dlv.model3(new Dezirev1());//super class Object //not possible 
		//dlv.model3(new Dezirev2());//super class Object //not possible 
		System.out.println("Feature of dezire version 3");
		dlv.model3(new Dezirev3());//same class type matching statement
		System.out.println("Feature of dezire version 4");
		dlv.model3(new Dezirev4());//sub class Object upcasting

		//dlv.model4(new Dezirev1());//super class Object //not possible 
		//dlv.model4(new Dezirev2());//super class Object //not possible 
		//dlv.model4(new Dezirev3());//super class Object //not possible
		System.out.println("Feature of dezire version 4");
        dlv.model4(new Dezirev4());//same class type matching statement

		System.out.println("end of java code");
	}
}
