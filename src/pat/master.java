package pat;

public class master {
public static void main(String[] args) {
	Dog mydog = new Dog();
	Cat mycat = new Cat();
	mydog.setName("lulu");
	mycat.setName("momo");
	mydog.setType("hashiqi");
	mydog.setAge(1);
	mycat.setType("zheer");
	mycat.setAge(1);
	mycat.bark();
	mydog.bark();
}

	
}
