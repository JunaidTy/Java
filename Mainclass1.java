class train 
{
	void train()
	{
		System.out.println("express train.......");
	}
	void train(String name)
	{
		System.out.println("Train name "+name);
	}
	void train(int capacity)
	{
		System.out.println("The capacity of train is "+capacity);
	}
	void train(int noofdriver,double traintime)
	{
		System.out.println("No of driver "+noofdriver);
		System.out.println("Express train time "+traintime);
	}
}
		class Mainclass1
{
		
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		train ref=new train();
		ref.train();
		ref.train("satabdhi");
		ref.train(1500);
		ref.train(2,10.30);

		System.out.println("end of java code");
	}
}
