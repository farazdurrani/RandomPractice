package inheritance.practice.method.calls;

public class Test {
	public static void main(String[] args) {
		Vehicle car = new Car("Totota", 4);
		System.out.println(car);
		((Car) car).changeName("Honda"); //downcast to call a child method on an object of parent class.
		System.out.println(car);

		Car car2 = new Car("Suzuki", 3);
		System.out.println(car2); // even though there is no toString method overridden in child class Car, still
									// parents toString method will be invoked.
	}
}
