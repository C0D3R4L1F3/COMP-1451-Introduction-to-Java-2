package ca.bcit.comp1451.lab4.mathematics.test;

import ca.bcit.comp1451.lab4.mathematics.Mathematics;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

/**
 * MathematicsTest.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 31 Jan 2016
 */
public class MathematicsTest {

	private Mathematics math;

	/**
	 * Generates new Mathematics object
	 */
	public MathematicsTest() {
		math = new Mathematics();
	}

	/**
	 * Test method for the value of PI
	 */
	@Test
	public void testPIValue() {
		assertEquals(3.14159, Mathematics.PI, 0.1);
	}

	/**
	 * Test method for the value of PI
	 */
	@Test
	public void testFeetToKMRatioValue() {
		assertEquals(0.0003048, Mathematics.ONE_FOOT_TO_KILOMETER_RATIO, 0.1);
	}

	/**
	 * Test the area of a circle
	 */
	@Test
	public void testGetCircleArea1() {
		double area = math.getCircleArea(1.0);
		assertEquals(3.14159, area, 0.1);
	}

	/**
	 * Test the area of a circle
	 */
	@Test
	public void testGetCircleArea2() {
		double area = math.getCircleArea(15.0);
		assertEquals(706.85775, area, 0.1);
	}

	/**
	 * Test the area of a square
	 */
	@Test
	public void testGetSquareArea1() {
		double area = math.getSquareArea(2.0);
		assertEquals(4.0, area, 0.1);
	}

	/**
	 * Test the area of a square
	 */
	@Test
	public void testGetSquareArea2() {
		double area = math.getSquareArea(32.0);
		assertEquals(1024.0, area, 0.1);
	}

	/**
	 * Test addition
	 */
	@Test
	public void testAdd1() {
		double sum = math.add(6.0, 7.0);
		assertEquals(13.0, sum, 0.1);
	}

	/**
	 * Test addition
	 */
	@Test
	public void testAdd2() {
		double sum = math.add(-6.0, 6.0);
		assertEquals(0.0, sum, 0.1);
	}

	/**
	 * Test multiplication
	 */
	@Test
	public void testTimes1() {
		double product = math.times(1.0, 5.0);
		assertEquals(5.0, product, 0.1);
	}

	/**
	 * Test multiplication
	 */
	@Test
	public void testTimes2() {
		double product = math.times(20.0, 20.0);
		assertEquals(400.0, product, 0.1);
	}

	/**
	 * Test subtraction
	 */
	@Test
	public void testSubtract1() {
		double difference = math.subtract(0.0, 20.0);
		assertEquals(-20.0, difference, 0.1);
	}

	/**
	 * Test subtraction
	 */
	@Test
	public void testSubtract2() {
		double difference = math.subtract(20.0, 20.0);
		assertEquals(0.0, difference, 0.1);
	}

	/**
	 * Test division
	 */
	@Test
	public void testDivide1() {
		int division = math.divide(20, 10);
		assertEquals(2, division);
	}

	/**
	 * Test division
	 */
	@Test
	public void testDivide2() {
		int division = math.divide(20, 0);
		assertEquals(0, division);
	}

	/**
	 * Test absolute value
	 */
	@Test
	public void testAbsolute1() {
		int abs = math.absoluteValue(1);
		assertEquals(1, abs);
	}

	/**
	 * Test absolute value
	 */
	@Test
	public void testAbsolute2() {
		int abs = math.absoluteValue(-5000);
		assertEquals(5000, abs);
	}

	/**
	 * Test random number between ten and twenty but not fifteen
	 */
	@Test
	public void testRandomNumberBetweenTenAndTwentyButNotFifteen() {
		HashSet<Integer> values = new HashSet<Integer>();

		for (int i = 0; i < 10000; i++) {
			int number = math.getRandomNumberBetweenTenAndTwentyButNotFifteen();
			boolean lessThanTen = number < 10;
			boolean greaterThanTwenty = number > 20;
			boolean notFifteen = number == 15;

			assertFalse(lessThanTen);
			assertFalse(greaterThanTwenty);
			assertFalse(notFifteen);
			values.add(number);
		}

		assertEquals(10, values.size());
	}

	/**
	 * Test feet to kilometers
	 */
	@Test
	public void testFootToKM1() {
		double km = math.convertFeetToKilometers(1.0);
		assertEquals(0.0003048, km, 0.1);
	}

	/**
	 * Test feet to kilometers
	 */
	@Test
	public void testFootToKM2() {
		double km = math.convertFeetToKilometers(892.0);
		assertEquals(0.272186, km, 0.1);
	}
}
