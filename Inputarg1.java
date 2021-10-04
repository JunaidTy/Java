class Inputarg1
{
	static void punchin(int eid, String ename,int empage,char gender,boolean present)
	{
        System.out.println("employee id "+eid);
		System.out.println("employee name "+ename);
		System.out.println("employee age "+empage);
		System.out.println("employee gender "+gender);
		System.out.println("employee present "+present);
	}
	public static void main(String[] args) 
	{
		System.out.println("start of jave code");
		punchin(11178,"md junaid ansari",25,'m',true);
		System.out.println("end of jave code");
	}
}
