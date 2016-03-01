package z;

import java.awt.event.MouseListener;

import javax.management.ListenerNotFoundException;

public class Bat
{
	int squares = 81;
	Integer a = 82;

	public static void main(String[] args)
	{
		// new Bat().go();
		// if (new Boolean("true") == new Boolean("true"))
		// {
		// System.out.println("true");
		// }
		// else
		// {
		// System.out.println("false");
		// }

		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("true");
		// System.out.println(b1);
		// System.out.println(b2);
		// System.out.println(b1 == b2);
		// System.out.println(true == true);
		System.out.println(new Boolean("true") == true);
		// System.out.println(new Boolean("true") == new Boolean("true"));
		// System.out.println(b1 == true);
		// System.out.println(b2 == true);
		// System.out.println(b2 == true == true == b1);
		// System.out.println(b2 == true == b1);
		// System.out.println(b2 == b2 == b1);
		System.out.println(b2 == b1);
		System.out.println(1 == 1);
		System.out.println(new Integer(1) == 1);
		System.out.println(new Integer(1) == new Integer(1));
	}

	void go()
	{
		incr(++a);
		System.out.println(a);
	}

	void incr(int squares)
	{
		squares += 10;
	}

	public static void test(String str)
	{
		int check = 4;
//		if (check = str.length())
//		{
//			System.out.print(str.charAt(check -= 1) + ", ");
//		} else
//		{
//			System.out.print(str.charAt(0) + ", ");
//		}
	}
}
