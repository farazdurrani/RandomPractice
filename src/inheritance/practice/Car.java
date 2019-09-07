package inheritance.practice;

public class Car extends Vehicle {
	public Car() {
		super();
		System.out.println("From Car " + getColor());
		System.out.println("From Car " + getTyres());
	}

	@Override
	public String toString() {
		System.out.println("calling super.toString");
		super.toString();
		return "Car [getTyres()=" + getTyres() + ", getColor()=" + getColor()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
