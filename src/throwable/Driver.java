package throwable;

public class Driver {
	public static void main(String[] args) throws Throwable {
		Driver driver = new Driver();
		try {
			driver.test();
		}
		catch (Throwable e) {
			throw e;
		}
	}

	public void test() throws Throwable {
		throw new Throwable("hol'up");
	}
}
