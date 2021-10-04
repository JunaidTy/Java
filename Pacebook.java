class picuploaded
{
	void pic(String picname,int memory,String resolution)
	{
		System.out.println("pic uploaded....");
	}
}
class likepic extends picuploaded
{
	void pic(int likes,String comment)
	{
		System.out.println("pic liked....");
		System.out.println("pic liked= "+likes);
		System.out.println("comments= "+comment);
	}
}
class  Pacebook
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		likepic pu=new likepic();
		pu.pic("JUNAID.JPG",5,"720*630");
		pu.pic(5,"lovely pic");
		System.out.println("end of java code");
	}
}
