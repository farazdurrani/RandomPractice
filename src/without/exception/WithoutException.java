package without.exception;

public class WithoutException {
	public static void main(String[] args) {
		try {
			method1();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
	}

	private static void method1() throws Exception {
		throw new Exception("");
	}
}
