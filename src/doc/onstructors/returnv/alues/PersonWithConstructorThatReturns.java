package doc.onstructors.returnv.alues;

public class PersonWithConstructorThatReturns {

	private int age;

	private String name;

	public PersonWithConstructorThatReturns(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public PersonWithConstructorThatReturns PersonWithConstructorThatReturns(
		int age, String name) {
		this.age = age;
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "PersonWithNoDefaultConstructor [age=" + age + ", name=" + name
			+ "]";
	}
}
