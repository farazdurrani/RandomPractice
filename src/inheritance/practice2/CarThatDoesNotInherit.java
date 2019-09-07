package inheritance.practice2;

import inheritance.practice.Vehicle;

public class CarThatDoesNotInherit {
	public CarThatDoesNotInherit() {
		Vehicle v = new Vehicle();
//		v.color; //not available because it is protected in Vehicle class in a different package.
	}
}
