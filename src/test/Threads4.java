package test;

import static z.Geodetics.DIAMETER;;

public class Threads4
{

	public static void main(String[] args)
	{
		 new Threads4().go();
	}

	public void go()
	{
		double test = DIAMETER / 20;
		System.out.println("test to " + test);
		
		Runnable r = new Runnable()
		{
			public void run()
			{
				System.out.print("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
