package pat;

public class Pat {
	private String name;
	private String type;
	private int age;
	
	public String bark()
	{
		System.out.println(name+" is barking:汪汪");
		return "汪汪";
	}
	
	public void eat(String food)
	{
		System.out.println(name+"is eating"+food);
	}
	
	public void sleep()
	{
		System.out.println(name+"is sleeping```");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
