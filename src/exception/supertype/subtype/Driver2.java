package exception.supertype.subtype;

public class Driver2 {
	public static void main(String[] args) {
		Driver2 driver = new Driver2();
		try {
			driver.method1();
		}
		catch (SubException e) {
			e.printStackTrace();
		}
		catch (SuperException e) { // This is perfectly legal as first we are catching sub exception, and then super
									// exception. the other way around wouldn't have worked.

		}
	}

	public void method1() throws SuperException {
		throw new SubException();
	}
}
