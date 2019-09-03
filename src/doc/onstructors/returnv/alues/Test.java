package doc.onstructors.returnv.alues;

public class Test {

	public static void main(String[] args) {
		PersonWithConstructorThatReturns p = new PersonWithConstructorThatReturns(
			5, "faraz");
		System.out.println(p);
		p.PersonWithConstructorThatReturns(6, "saad");
		System.out.println(p);
	}
}
