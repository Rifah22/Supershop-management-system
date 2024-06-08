

public class MobileMain extends Mobile
{
	public static void main(String[] args)
	{
		Mobile m=new Mobile("WWWWW","01983972874",123.12,"Android",false);
		m.callSomeone(20);
		m.recharge(109);
		m.showInfo();
		Mobile m1=new Mobile("tttt","090853367",200,"Analog",false);
		m1.callSomeone(10);
		m1.showInfo();
		
	}
}