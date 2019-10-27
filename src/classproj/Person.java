package classproj;

public class Person {
	// field
	private String name;
	private int age;
		
	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	// Method
	void output() {
		System.out.println("이름=" + name);
		System.out.println("나이=" + age);
}
}
