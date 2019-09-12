package inheritance.practice3;

public class Invoice implements MyInterface {

	@Override
	public void pay() {
		System.out.println("pay from Invoice");
	}

}
