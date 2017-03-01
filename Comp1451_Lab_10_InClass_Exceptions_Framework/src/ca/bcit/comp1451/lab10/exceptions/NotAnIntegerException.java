package ca.bcit.comp1451.lab10.exceptions;

/**
 * A Class that holds exceptions for NumberReader
 * 
 * @author Ronnie Manitim
 * @version 1.0 15 Mar 2016
 */
@SuppressWarnings("serial")
public class NotAnIntegerException extends Exception {

	/**
	 * Constructor for objects of type NotAnIntegerException.
	 */
	public NotAnIntegerException() {
	}

	/**
	 * Constructor for objects of type NotAnIntegerException.
	 * 
	 * @param message
	 *            thrown if exception found
	 */
	public NotAnIntegerException(String message) {
		super(message);
	}

	/**
	 * Constructor for objects of type NotAnIntegerException.
	 * 
	 * @param cause
	 *            of exception
	 */
	public NotAnIntegerException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor for objects of type NotAnIntegerException.
	 *
	 * @param message
	 *            thrown if exception found
	 * @param cause
	 *            of exception
	 */
	public NotAnIntegerException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor for objects of type NotAnIntegerException.
	 *
	 * @param message
	 *            thrown if exception found
	 * @param cause
	 *            of exception
	 * @param enableSuppression
	 *            if exception found
	 * @param writableStackTrace
	 *            thrown if exception found
	 */
	public NotAnIntegerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
