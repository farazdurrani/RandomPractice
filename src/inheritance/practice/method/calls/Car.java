package inheritance.practice.method.calls;

public class Car extends Vehicle {

	public Car(String name, int tyre) {
		super(name, tyre);
	}

	public void changeName(String color) {
		super.setName(color);
	}

}
