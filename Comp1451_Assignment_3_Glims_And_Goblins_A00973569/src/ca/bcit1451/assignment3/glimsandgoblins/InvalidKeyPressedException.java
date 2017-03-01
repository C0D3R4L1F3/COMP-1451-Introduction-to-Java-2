package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores that throws exceptions when an invalid key is pressed
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
@SuppressWarnings("serial")
public class InvalidKeyPressedException extends Exception {

	/**
	 * 
	 */
	public InvalidKeyPressedException() {

	}

	/**
	 * 
	 * @param message
	 *            displayed at exception
	 */
	public InvalidKeyPressedException(String message) {

		super(message);
	}

	/**
	 * 
	 * @param cause
	 *            of exception
	 */
	public InvalidKeyPressedException(Throwable cause) {

		super(cause);
	}

	/**
	 * 
	 * @param message
	 *            displayed at exception
	 * @param cause
	 */
	public InvalidKeyPressedException(String message, Throwable cause) {

		super(message, cause);
	}

	/**
	 * 
	 * @param message
	 *            displayed at exception
	 * @param cause
	 *            cause of exception
	 * @param enableSuppression
	 *            for exception
	 * @param writableStackTrace
	 *            for exception
	 */
	public InvalidKeyPressedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {

		super(message, cause, enableSuppression, writableStackTrace);
	}
}