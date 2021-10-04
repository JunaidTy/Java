class company
{
	void hod()
	{
		System.out.println("HOD-saibal sarkar");
	}
}
class employee1 extends  company
{
	void instrument()
	{
		System.out.println("Instrument department");
	}
}
class employee2 extends company 
{
void electrical()
	{
	System.out.println("Electrical department");
	}
}
class  Hindalco
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		employee1 ref=new employee1();
		ref.instrument();
		ref.hod();

		employee2 e2=new employee2();
		e2.electrical();
		e2.hod();
		
		System.out.println("end of java code");
	}
}
