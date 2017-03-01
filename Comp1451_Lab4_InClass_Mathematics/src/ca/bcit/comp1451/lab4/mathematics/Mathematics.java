package ca.bcit.comp1451.lab4.mathematics;

import java.util.Random;

/**
 * Mathematics.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 31 Jan 2016
 */
public class Mathematics {

	public static final double PI = 3.14159;
	public static final double ONE_FOOT_TO_KILOMETER_RATIO = 0.0003048;

	/**
	 * Constructor for objects of type Mathematics.
	 */
	public Mathematics() {

	}

	/**
	 * @param radius
	 *            value given
	 * @return calculation to find the area of a circle
	 */
	public double getCircleArea(double radius) {

		double circleArea = PI * radius * radius;
		return circleArea;
	}

	/**
	 * @param area
	 *            value given
	 * @return calculation to find the area of a square
	 */
	public double getSquareArea(double area) {

		double squareArea = area * area;
		return squareArea;
	}

	/**
	 * @param valueA
	 *            value given
	 * @param valueB
	 *            value given
	 * @return addition of the values given in param
	 */
	public double add(double valueA, double valueB) {

		double sum = valueA + valueB;
		return sum;
	}

	/**
	 * @param valueA
	 *            value given
	 * @param valueB
	 *            value given
	 * @return multiplication of the values given in param
	 */
	public double times(double valueA, double valueB) {

		double times = valueA * valueB;
		return times;
	}

	/**
	 * @param valueA
	 *            value given
	 * @param valueB
	 *            value given
	 * @return subtraction of the values given in param
	 */
	public double subtract(double valueA, double valueB) {

		double subtract = valueA - valueB;
		return subtract;
	}

	/**
	 * @param valueA
	 *            value given
	 * @param valueB
	 *            value given
	 * @return division of the values given in param
	 */
	public int divide(int valueA, int valueB) {

		int divide = 0;

		if (valueB == 0) {
			divide = 0;
		} else if (valueB != 0) {
			divide = valueA / valueB;
		}
		return divide;
	}

	/**
	 * @param value
	 *            given
	 * @return absolute value of the value given in param
	 */
	public int absoluteValue(int value) {

		int absoluteValue = Math.abs(value);
		return absoluteValue;
	}

	/**
	 * @return a random number between ten and twenty but not fifteen
	 */
	public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {

		Random rand = new Random();
		int randomNumber = 0;

		do {
			randomNumber = rand.nextInt(21);
		} while (randomNumber < 10 || randomNumber > 20 || randomNumber == 15);

		return randomNumber;
	}

	/**
	 * @param feet
	 *            value given
	 * @return conversion of feet to kilometers from the value given in param
	 */
	public double convertFeetToKilometers(double feet) {

		double feetInKilometres = feet * ONE_FOOT_TO_KILOMETER_RATIO;
		return feetInKilometres;
	}
}
