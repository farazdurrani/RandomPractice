package inheritance.practice;

public class Toyota extends Car {
	public Toyota() {
		// implicit super class constructor called
		System.out.println("From Toyota " + getTyres()); //Instance methods (albeit superclass's) shouldn't be called in a constructor.
	}
}
