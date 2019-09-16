package exception.supertype.subtype;

public class Driver1 {
	public static void main(String[] args) {
		Driver1 driver = new Driver1();
		try {
			driver.method1();
		}
		catch (SuperException e) { // even though in the method method1(), we throw subclass exception, we can still
									// catch it as superclass exception.
			e.printStackTrace();
		}
		catch (SubException e) { // Unreachable catch block for SubException. It is already handled by the catch block
									// for SuperException

		}
	}

	public void method1() throws SubException {
		throw new SubException();
	}
}
