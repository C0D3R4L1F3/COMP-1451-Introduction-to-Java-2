package ca.bcit.comp1451.lab10.exceptions;

import java.util.Scanner;

/**
 * InputReader.
 * 
 * @author BCIT
 * @version 2.0
 */
public class InputReader {

	private Scanner scanner;

	/**
	 * Constructor for objects of type InputReader.
	 */
	public InputReader() {
		scanner = new Scanner(System.in);
	}

	/**
	 * This method returns the number typed by the user. If the number is not an
	 * integer it throws a custom checked exception that will be caught by the
	 * calling method.
	 * 
	 * @return number an int
	 * @throws InputMismatchException,
	 *             NatAnIntegerException
	 */
	public int getNumber() throws NotAnIntegerException {
		int number = 0;

		try {
			number = scanner.nextInt();

		} // catch any non-integer input
		catch (java.util.InputMismatchException exc) {

			scanner.nextLine(); // clear the buffer
			throw new NotAnIntegerException("not a valid number!");
		}

		return number;
	}
}