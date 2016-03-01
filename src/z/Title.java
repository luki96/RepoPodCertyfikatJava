package z;

public enum Title
{
	MR("Mr."), MRS("Mrs."), MS("Ms.");
	
	private String title;

	private Title(String t)
	{
		title = t;
	}

	public String format(String last, String first)
	{
		return title + " " + first + " " + last;
	}
}