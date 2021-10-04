class Glucond
{
	static int weight=500;
	static void drink()
	{
		System.out.println("Glucon-d gives Instant Energy");
	}
}
class Nutritionalvalue 
{
	static int energyvalue=360;
	static int cab=90;
	static int cal=170;
	static int pho=100;
	static double vit=7.5;
	static void direction()
	{
		System.out.println("Add 4 teaspoonfull glucon d to one glass of water and stir.");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Glucond.drink();
		System.out.println("Weight of Glucon d="+Glucond.weight);
	    System.out.println("ENERGY VALUE= "+energyvalue+"Kcal");
		System.out.println("CARBOHYDRATE= "+cab+"g");
		System.out.println("CALCIUM= "+cal+"mg");
		System.out.println("PHOSPHORUS= "+pho+"mg");
		System.out.println("VITAMIN= "+vit+"mueg");
		direction();
		System.out.println("end of java code");
	}
}
