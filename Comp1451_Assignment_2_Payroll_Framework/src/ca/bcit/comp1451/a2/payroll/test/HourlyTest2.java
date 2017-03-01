package ca.bcit.comp1451.a2.payroll.test;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Hourly;

/**
 * A Test2 Class for Hourly methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class HourlyTest2 {

	private static final int CONDOLEEZA_INSURANCE_NUMBER = 958473625;
	private static final int BASIL_SOCIAL_INSURANCE_NUMBER = 12345677;
	private static final double CONDOLEEZA_PAY_RATE = 18.50;
	private static final double BASIL_PAY_RATE = 20.10;
	private static final double HOURS_WORKED = 10;
	private static final double HOURS_RESET_ZERO = 0;
	private static final double DEFAULT_HOURS_WORKED = 40.0;
	private static final double ADDED_HOURS = 3;

	private static Hourly testHourly;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testHourly = new Hourly();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		testHourly = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		testHourly = null;
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#hashCode()}.
	 */
	@Test
	public final void testHashCode() {

		Hourly testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		assertTrue(one.hashCode() == testHourly.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#hashCode()}.
	 */
	@Test
	public final void testHashCodeFalse() {

		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly two = new Hourly("Basil", "111 Horseshoe Way", "935-8681", BASIL_SOCIAL_INSURANCE_NUMBER,
				BASIL_PAY_RATE);
		assertFalse(one.hashCode() == two.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#pay()}.
	 */
	@Test
	public final void testPay() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.setHoursWorked(DEFAULT_HOURS_WORKED);
		double testHourlyPay = CONDOLEEZA_PAY_RATE * DEFAULT_HOURS_WORKED;
		double actualHourlyPay = testHourly.pay();
		assertTrue(testHourlyPay == actualHourlyPay);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#pay()}.
	 */
	@Test
	public final void testPayOverTime() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.addHours(ADDED_HOURS);
		double testHourlyPayOverTime = CONDOLEEZA_PAY_RATE * DEFAULT_HOURS_WORKED + 1.5
				+ CONDOLEEZA_PAY_RATE * (testHourly.getHoursWorked() - 40);
		double actualHourlyPay = testHourly.pay();
		assertEquals(testHourlyPayOverTime, actualHourlyPay, testHourlyPayOverTime);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#toString()}.
	 */
	@Test
	public final void testToString() {

		NumberFormat regularFormatter = NumberFormat.getCurrencyInstance();
		double regularPay = CONDOLEEZA_PAY_RATE * DEFAULT_HOURS_WORKED;
		NumberFormat overFormatter = NumberFormat.getCurrencyInstance();
		double overTime = 1.5 * CONDOLEEZA_PAY_RATE * (DEFAULT_HOURS_WORKED - DEFAULT_HOURS_WORKED);
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = CONDOLEEZA_PAY_RATE;

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.setHoursWorked(DEFAULT_HOURS_WORKED);
		String testHourlyToString = "Employee Pay Rate: Hourly" + "\n";
		testHourlyToString += "Name: " + "Condoleeza" + "\n";
		testHourlyToString += "SIN: " + CONDOLEEZA_INSURANCE_NUMBER + "\n";
		testHourlyToString += "Address: " + "678 Fifth Ave." + "\n";
		testHourlyToString += "Phone Number: " + "905-0690" + "\n";
		testHourlyToString += "Hours Worked: " + DEFAULT_HOURS_WORKED + "\n";
		testHourlyToString += "Hourly Pay: " + currencyFormatter.format(pay) + "\n";
		testHourlyToString += "Regular Hours Pay: " + regularFormatter.format(regularPay) + "\n";
		testHourlyToString += "Over Time Pay: " + overFormatter.format(overTime);
		String actualHourlyToString = testHourly.toString();
		assertEquals(testHourlyToString, actualHourlyToString);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {

		Hourly testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		assertTrue(one.equals(testHourly) && testHourly.equals(one));
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectFalse() {

		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly two = new Hourly("Basil", "111 Horseshoe Way", "935-8681", BASIL_SOCIAL_INSURANCE_NUMBER,
				BASIL_PAY_RATE);
		assertFalse(one.equals(two) && two.equals(one));
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()}.
	 */
	@Test
	public final void testHourly() {

		assertTrue(testHourly instanceof Hourly);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public final void testHourlyStringStringStringIntDouble() {

		assertTrue(testHourly instanceof Hourly);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#addHours(double)}.
	 */
	@Test
	public final void testAddHours() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.addHours(HOURS_WORKED);
		double totalHours = HOURS_WORKED + DEFAULT_HOURS_WORKED;
		assertTrue(totalHours == testHourly.getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#addHours(double)}.
	 */
	@Test
	public final void testAddHoursResetToZero() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.addHours(HOURS_WORKED);
		double totalHours = DEFAULT_HOURS_WORKED + HOURS_WORKED;
		assertTrue(totalHours == testHourly.getHoursWorked());
		testHourly.pay();
		assertTrue(HOURS_RESET_ZERO == testHourly.getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#setHoursWorked(double)}.
	 */
	@Test
	public final void testSetHoursWorkedLessThanDefaultHoursWorked() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.setHoursWorked(HOURS_WORKED);
		assertTrue(DEFAULT_HOURS_WORKED == testHourly.getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#setHoursWorked(double)}.
	 */
	@Test
	public final void testSetHoursWorked() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		testHourly.setHoursWorked(DEFAULT_HOURS_WORKED);
		assertTrue(DEFAULT_HOURS_WORKED == testHourly.getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#getHoursWorked()}.
	 */
	@Test
	public final void testGetHoursWorked() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		double testHourlyGetHoursWorked = DEFAULT_HOURS_WORKED;
		double actualHourlyGetHoursWorked = testHourly.getHoursWorked();
		assertTrue(testHourlyGetHoursWorked == actualHourlyGetHoursWorked);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		Hourly testDefault = new Hourly();

		String name = "Enter a name";
		assertEquals(name, testDefault.getName());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * address)}.
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		Hourly testDefault = new Hourly();

		String address = "Enter an address";
		assertEquals(address, testDefault.getAddress());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		Hourly testDefault = new Hourly();

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testDefault.getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		assertEquals("Condoleeza", testHourly.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testHourly.setName("Ollie");
		assertEquals("Ollie", testHourly.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		assertEquals("678 Fifth Ave.", testHourly.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testHourly.setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testHourly.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testHourly = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		assertEquals("905-0690", testHourly.getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testHourly.setPhoneNumber("299-9000");
		assertEquals("299-9000", testHourly.getPhoneNumber());
	}
}