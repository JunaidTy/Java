class Inputarg3
{
	static void cv(String name,String dob,String languages,long contactno,String add,
		String college,String course,double percent,String skills)
	{
	
		System.out.println("Full name "+name);
		System.out.println("Date of birth "+dob);
		System.out.println("Languages "+languages);
		System.out.println("Contact no "+contactno);
		System.out.println("Present Address "+add);
		System.out.println("College of enggineering "+college);
		System.out.println("Course done "+course);
		System.out.println("Percentage obtain "+percent);
		System.out.println("Skills "+skills);
     }
	public static void main(String[] args) 
	{
	System.out.println("start of java code");
	cv("Md Junaid Ansari","07-10-1995","Hindi,English",7004845056l,"muri ranchi jharkhand",
		"techno india ramgarh","B.Tech ee",6.85,"Manual Testing,Sql,Java");
	System.out.println("end of java code");
}
}
