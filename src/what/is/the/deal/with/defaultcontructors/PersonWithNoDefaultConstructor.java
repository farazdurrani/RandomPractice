package what.is.the.deal.with.defaultcontructors;

public class PersonWithNoDefaultConstructor {

	private int age;

	private String name;
	
	public PersonWithNoDefaultConstructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public PersonWithNoDefaultConstructor(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "PersonWithNoDefaultConstructor [age=" + age + ", name=" + name
			+ "]";
	}
}
