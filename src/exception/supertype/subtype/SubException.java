package exception.supertype.subtype;

@SuppressWarnings("serial")
public class SubException extends SuperException {

	public SubException() {
		super();
	}

	public SubException(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SubException(String message, Throwable cause) {
		super(message, cause);
	}

	public SubException(String message) {
		super(message);
	}

	public SubException(Throwable cause) {
		super(cause);
	}

}
