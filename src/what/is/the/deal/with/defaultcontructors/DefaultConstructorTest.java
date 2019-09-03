package what.is.the.deal.with.defaultcontructors;

public class DefaultConstructorTest {

	/**
	 * The deal is, if a contructor with args is defined by you, Java will not create a no-args/default constuctor for you.
	 */
	public static void main(String[] args) {
		PersonWithNoDefaultConstructor p = new PersonWithNoDefaultConstructor();
	}

}
