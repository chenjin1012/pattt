package pat;

public class Cat extends Pat {
	public void catchMouse()
	{
		System.out.println(getName()+"is catching mouse```");
	}
	
	public String bark()
	{
		System.out.println(getName()+"：喵喵");
		return "喵喵";
	}
}
