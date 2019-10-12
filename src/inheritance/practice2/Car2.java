package inheritance.practice2;

import inheritance.practice.Vehicle;

public class Car2 extends Vehicle {
	public Car2() {
		System.out.println(color); // Even though Car2 class is in a different package than Vehicle, color is still
									// accessible here because color is protected
	}
}
