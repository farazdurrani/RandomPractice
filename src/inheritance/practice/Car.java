package inheritance.practice;

public class Car extends Vehicle {
	public Car() {
		super();
		System.out.println("From Car " + getColor());// Instance methods (albeit superclass's) shouldn't be called in a
														// constructor.
		System.out.println("From Car " + getTyres());// Instance methods (albeit superclass's) shouldn't be called in a
														// constructor.
	}

	/**
	 * Instance methods (albeit superclass's) shouldn't be called in a constructor.
	 */

	@Override
	public String toString() {
		System.out.println("calling super.toString");
		super.toString();
		return "Car [getTyres()=" + getTyres() + ", getColor()=" + getColor()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
	}

}
