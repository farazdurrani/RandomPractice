package inheritance.practice;

public class Toyota extends Car {
	public Toyota() {
		// implicit super class constructor called
		System.out.println("From Toyota " + getTyres());
	}
}
