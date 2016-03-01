package polimorfizm;

public class PolimorfizmTest
{
	public static void main(String[] args)
	{
		PolimorfizmA var = new PolimorfizmA();
		var.test();
		var = new PolimorfizmB();
		var.test();
	}
}
