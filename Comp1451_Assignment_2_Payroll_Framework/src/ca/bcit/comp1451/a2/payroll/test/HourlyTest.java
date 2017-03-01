package ca.bcit.comp1451.a2.payroll.test;

import java.text.NumberFormat;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Hourly;
import junit.framework.TestCase;

/**
 * A Test Class for Hourly methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class HourlyTest extends TestCase {

	private static final int CONDOLEEZA_INSURANCE_NUMBER = 958473625;
	private static final int BASIL_SOCIAL_INSURANCE_NUMBER = 12345677;
	private static final double CONDOLEEZA_PAY_RATE = 18.50;
	private static final double BASIL_PAY_RATE = 20.10;
	private static final double TOTAL_PAY = 740.00;
	private static final double OVERTIME_PAY = 823.25;
	private static final double HOURS_WORKED = 10;
	private static final double ADDED_HOURS = 3;
	private static final double DEFAULT_HOURS_WORKED = 40.0;
	private static final int INDEX_ZERO = 0;

	private static ArrayList<Hourly> testHourly;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testHourly = new ArrayList<>();
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

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));

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

		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly two = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly three = new Hourly("Basil", "111 Horseshoe Way", "935-8681", BASIL_SOCIAL_INSURANCE_NUMBER,
				BASIL_PAY_RATE);
		assertTrue(one.hashCode() == two.hashCode());
		assertFalse(one.hashCode() == three.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#pay()}.
	 */
	@Test
	public final void testPay() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		testHourly.get(INDEX_ZERO).setHoursWorked(HOURS_WORKED);
		assertEquals(TOTAL_PAY, testHourly.get(INDEX_ZERO).pay());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#pay()}.
	 */
	@Test
	public final void testPayOverTime() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		testHourly.get(INDEX_ZERO).addHours(ADDED_HOURS);
		assertEquals(OVERTIME_PAY, testHourly.get(INDEX_ZERO).pay());
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

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		testHourly.get(INDEX_ZERO).setHoursWorked(DEFAULT_HOURS_WORKED);
		String results = "[Employee Pay Rate: Hourly" + "\n";
		results += "Name: " + "Condoleeza" + "\n";
		results += "SIN: " + CONDOLEEZA_INSURANCE_NUMBER + "\n";
		results += "Address: " + "678 Fifth Ave." + "\n";
		results += "Phone Number: " + "905-0690" + "\n";
		results += "Hours Worked: " + DEFAULT_HOURS_WORKED + "\n";
		results += "Hourly Pay: " + currencyFormatter.format(pay) + "\n";
		results += "Regular Hours Pay: " + regularFormatter.format(regularPay) + "\n";
		results += "Over Time Pay: " + overFormatter.format(overTime) + "]";
		assertEquals(results, testHourly.toString());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {

		Hourly one = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly two = new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE);
		Hourly three = new Hourly("Basil", "111 Horseshoe Way", "935-8681", BASIL_SOCIAL_INSURANCE_NUMBER,
				BASIL_PAY_RATE);
		assertTrue(one.equals(two) && two.equals(one));
		assertFalse(one.equals(three) && three.equals(one));
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()}.
	 */
	@Test
	public final void testHourly() {

		assertTrue(testHourly instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public final void testHourlyStringStringStringIntDouble() {

		assertTrue(testHourly instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#addHours(double)}.
	 */
	@Test
	public final void testAddHours() {

		testHourly.get(INDEX_ZERO).addHours(HOURS_WORKED);
		double totalHours = HOURS_WORKED + DEFAULT_HOURS_WORKED;
		assertEquals(totalHours, testHourly.get(INDEX_ZERO).getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#setHoursWorked(double)}.
	 */
	@Test
	public final void testSetHoursWorked() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		testHourly.get(INDEX_ZERO).setHoursWorked(DEFAULT_HOURS_WORKED);
		assertEquals(DEFAULT_HOURS_WORKED, testHourly.get(INDEX_ZERO).getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#setHoursWorked(double)}.
	 */
	@Test
	public final void testSetHoursWorkedLessThanDefaultHoursWorked() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		testHourly.get(INDEX_ZERO).setHoursWorked(HOURS_WORKED);
		assertEquals(DEFAULT_HOURS_WORKED, testHourly.get(INDEX_ZERO).getHoursWorked());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Hourly#getHoursWorked()}.
	 */
	@Test
	public final void testGetHoursWorked() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		assertEquals(DEFAULT_HOURS_WORKED, testHourly.get(INDEX_ZERO).getHoursWorked());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly());

		String name = "Enter a name";
		assertEquals(name, testHourly.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * address)}.
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly());

		String address = "Enter an address";
		assertEquals(address, testHourly.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Hourly#Hourly()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly());

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testHourly.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		assertEquals("Condoleeza", testHourly.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testHourly.get(INDEX_ZERO).setName("Ollie");
		assertEquals("Ollie", testHourly.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		assertEquals("678 Fifth Ave.", testHourly.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testHourly.get(INDEX_ZERO).setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testHourly.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testHourly = new ArrayList<>();
		testHourly.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_INSURANCE_NUMBER,
				CONDOLEEZA_PAY_RATE));
		assertEquals("905-0690", testHourly.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testHourly.get(INDEX_ZERO).setPhoneNumber("299-9000");
		assertEquals("299-9000", testHourly.get(INDEX_ZERO).getPhoneNumber());
	}
}