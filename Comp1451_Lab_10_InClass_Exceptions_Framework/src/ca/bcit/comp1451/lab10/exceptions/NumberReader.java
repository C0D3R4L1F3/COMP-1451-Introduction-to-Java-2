package ca.bcit.comp1451.lab10.exceptions;

import java.util.Scanner;

/**
 * A Class that adds up numbers that have been entered
 * 
 * @author Ronnie Manitim
 * @version 1.0 15 Mar 2016
 */
public class NumberReader {

	private static final int INTEGER_ZERO = 0;
	private InputReader reader;

	/**
	 * Default Constructor
	 */
	public NumberReader() {

		reader = new InputReader();
	}

	/**
	 * Adds up all the numbers that you have entered once 0 is entered, throws
	 * NotAnIntegerException when a non Integer is entered
	 * 
	 * @throws NotAnIntegerException
	 *             throws a message if a non Integer value is entered
	 */
	public void guessNumber() throws NotAnIntegerException {

		@SuppressWarnings("resource")
		Scanner digit = new Scanner(System.in);
		int sumOfNumbers = INTEGER_ZERO;
		int numbers = INTEGER_ZERO;

		do {
			try {
				System.out.println("Enter a number, 0 to stop: " + numbers);
				System.out.println("---------------------------------");
				sumOfNumbers += numbers;
				numbers = reader.getNumber();
			} catch (NotAnIntegerException e) {
				System.out.println("You entered an invalid Integer");
				System.out.println("Enter a number, 0 to stop: ");
				System.out.println("---------------------------------");
				numbers = digit.nextInt();
			}
		} while (numbers != INTEGER_ZERO);
		if (numbers == INTEGER_ZERO) {
			System.out.println("You entered 0 this will now stop: ");
			System.out.println("The sum of all numbers: " + sumOfNumbers);
			System.out.println("---------------------------------");
		}
	}

	/**
	 * @return the reader
	 */
	public InputReader getReader() {

		return reader;
	}

	/**
	 * @param reader
	 *            the reader to set for NumberReader
	 */
	public void setReader(InputReader reader) {

		this.reader = reader;
	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		NumberReader number = new NumberReader();

		try {
			number.guessNumber();
		} catch (NotAnIntegerException e) {
			e.printStackTrace();
		}
	}
}