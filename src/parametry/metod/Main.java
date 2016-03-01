package parametry.metod;

public class Main
{
	public static void main(String[] args)
	{
		Integer x = 2;
		triple(x);
		//System.out.println("x: " + x);
		SomeClass obj = new SomeClass();
		triple2(obj);
		//System.out.println("x: " + obj.getX());
		
		Integer[] arr = new Integer[0];
		boolean wynik = arr != null & arr.length > 0;
		System.out.println(wynik);
	}

	public static void triple(Integer x)
	{
		x *= 3;
	}

	public static void triple(SomeClass t)
	{
		t.setX(t.getX() * 3);
	}

	static void triple2(SomeClass obj)
	{
		SomeClass localObj = new SomeClass();
		localObj.setX(obj.getX() * 3);
		obj = localObj;
	}
}
