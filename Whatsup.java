class whatsup
{
	void features(String chatsv0)
	{
		System.out.println("chats started....");
	}
}
class whatsupv2 extends whatsup
{
	void features(String chatsv1,String audiocallv1)
	{
		
		System.out.println("chats= "+chatsv1);
		System.out.println("pic liked= "+audiocallv1);
		
	}
}
class whatsupv3 extends whatsupv2
{
	void features(String chatsv2,String audiocallv2,String videocallv2)
	{
		
		System.out.println("chats= "+chatsv2);
		System.out.println("pic liked= "+audiocallv2);
        System.out.println("videocall= "+videocallv2);
		
	}
}
class  Whatsups
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		whatsupv3 wh=new whatsupv3();
		wh.features("chats","audio call","video call");
		System.out.println("end of java code");
	}
}
