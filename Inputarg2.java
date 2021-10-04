class Inputarg2 
{
	static void bookatraintkt(int tno,String seatno,long pid,String padd,int page,
		String dot,String startingplace,String destination)
	{
	
		System.out.println("train no "+tno);
		System.out.println("seat no "+seatno);
		System.out.println("passenger id "+pid);
		System.out.println("passenger address "+padd);
		System.out.println("passenger age "+page);
		System.out.println("date of travel "+dot);
		System.out.println("starting of journey "+startingplace);
		System.out.println("destination "+destination);
	}
	public static void main(String[] args) 
	{
	System.out.println("start of java code");
	bookatraintkt(15689,"d1-a59",562212345678L,"basvangudi bengaluru",25,"15-sept-2021","ranchi","bengaluru");
	System.out.println("end of java code");
}
}
