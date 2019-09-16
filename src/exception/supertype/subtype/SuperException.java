package exception.supertype.subtype;

@SuppressWarnings("serial")
public class SuperException extends Exception {

	public SuperException() {
		super();
	}

	public SuperException(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SuperException(String message, Throwable cause) {
		super(message, cause);
	}

	public SuperException(String message) {
		super(message);
	}

	public SuperException(Throwable cause) {
		super(cause);
	}

}
