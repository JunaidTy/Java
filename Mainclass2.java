class statebankofindia 
{
	void statebankofindia()
	{
		System.out.println("STATE BANK OF INDIA");
	}
	void statebankofindia(String name)
	{
		System.out.println("Account Holder Name "+name);
	}
	void statebankofindia(int accountno)
	{
		System.out.println("Account No "+accountno);
	}
	void statebankofindia(int baranchcode,double amtbalance)
	{
		System.out.println("Branch Code "+baranchcode);
		System.out.println("Amount Balance "+amtbalance);
	}
	void statebankofindia(String ifsc,boolean activeacc,String jointacc)
	{
		System.out.println("Ifsc code "+ifsc);
		System.out.println("Account Status "+activeacc);
		System.out.println("Joint Account "+jointacc);
	}
}
		class Mainclass2
{
		
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		statebankofindia ref=new statebankofindia();
		ref.statebankofindia();
		ref.statebankofindia("Junaid ansari");
		ref.statebankofindia(1234567890);
		ref.statebankofindia(1234,50000.0);
		ref.statebankofindia("sbinooo3457",true,"junaid and arshad");

		System.out.println("end of java code");
	}
}
