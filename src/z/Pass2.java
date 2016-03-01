package z;

public class Pass2
{
	public static void main(String[] args)
	{
		int x = 6;
		Pass2 p = new Pass2();
		p.doStuff(x);
		System.out.print(" main x = " + x);
		
//		System.out.println(Title.MR.format("Doe", "John"));
//		System.out.println(Title.MR);
	}

	void doStuff(int x)
	{	
		int i;
		for(i = 0; i < 100; i++){}
		System.out.println(i);
		
		System.out.print(" doStuff x = " + x++);
	}
}
