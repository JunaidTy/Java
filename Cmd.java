class Cmd
{
	int noOfquery=30;
	void query()
	{
		System.out.println("Executing Sql query.........");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of java code");
		System.out.println("No query executed in command promt="+new Cmd().noOfquery);
		new Cmd().query();
		System.out.println("noOftabes="+new Cmd().noOfquery);
		System.out.println("End of java code");
	}
}
