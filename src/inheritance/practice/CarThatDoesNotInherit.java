package inheritance.practice;

public class CarThatDoesNotInherit {
	public CarThatDoesNotInherit() {
		Vehicle v = new Vehicle();
		System.out.println(v.color); // available because it is protected in Vehicle class in the same package.
	}
}
