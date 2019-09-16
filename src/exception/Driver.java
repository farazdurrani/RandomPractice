package exception;

public class Driver {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.uncheckedExceptionWithoutTryStatement();
		try {
			driver.uncheckedExceptionWithCatchOrDeclareRequirement();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			driver.checkedExceptionWithCatchOrDeclareRequirement();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void uncheckedExceptionWithoutTryStatement() {
		if (true)
			throw new RuntimeException("Hol'up");
	}

	/**
	 * Even though it is a unchecked exception, I didn't have to put 'throws Exception' statement in method signature.
	 * But since I did, I must handle it in the calling method.
	 * @throws Exception
	 */
	public void uncheckedExceptionWithCatchOrDeclareRequirement()
		throws Exception {
		if (true)
			throw new RuntimeException("Hol'up");
	}

	public void checkedExceptionWithCatchOrDeclareRequirement() throws Exception {
		if (true)
			throw new Exception("Hol'up");
	}
	
	/** You must have Throwable with catch-or-declare requirement.
	 * @throws Throwable
	 */
	public void throwableWithCatchOrDeclareRequirement() throws Throwable {
		if (true)
			throw new Throwable("Hol'up");
	}
}
