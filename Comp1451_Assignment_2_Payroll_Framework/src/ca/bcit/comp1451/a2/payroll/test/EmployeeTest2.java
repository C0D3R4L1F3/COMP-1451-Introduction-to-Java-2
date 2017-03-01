package ca.bcit.comp1451.a2.payroll.test;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Employee;

/**
 * A Test2 Class for Employee methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class EmployeeTest2 {

	private static final int JUSTIN_SOCIAL_INSURANCE_NUMBER = 987654321;
	private static final int THOMAS_SOCIAL_INSURANCE_NUMBER = 010203040;
	private static final int RICHARD_SOCIAL_INSURANCE_NUMBER = 12345688;
	private static final double JUSTIN_PAY_RATE = 2000.00;
	private static final double THOMAS_PAY_RATE = 1500.00;
	private static final double RICHARD_PAY_RATE = 1600.00;
	private static final int SET_SOCIAL_INSURANCE_NUMBER = 123456789;
	private static final int DEFAULT_SIN = 0;
	private static final int SIN_LESS_THAN_ZERO = -1;
	private static final double SET_PAY_RATE = 5000.00;
	private static final double MINIMUM_WAGE = 10.50;
	private static final double LESS_MINIMUM_WAGE = 9.00;

	private static Employee testEmployee;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testEmployee = new Employee();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		testEmployee = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		testEmployee = null;
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#hashCode()}.
	 */
	@Test
	public final void testHashCode() {

		testEmployee = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		assertTrue(one.hashCode() == testEmployee.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#hashCode()}.
	 */
	@Test
	public final void testHashCodeFalse() {

		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		Employee two = new Employee("Richard", "11121 Horseshoe Way", "604-1234", RICHARD_SOCIAL_INSURANCE_NUMBER,
				RICHARD_PAY_RATE);
		assertFalse(one.hashCode() == two.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#pay()}.
	 */
	@Test
	public final void testPay() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		double testPay = JUSTIN_PAY_RATE;
		double actualPay = testEmployee.pay();
		assertTrue(testPay == actualPay);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#toString()}.
	 */
	@Test
	public final void testToString() {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = THOMAS_PAY_RATE;

		testEmployee = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		String testEmployee = "Employee Pay Rate: Weekly" + "\n";
		testEmployee += "Name: " + "Thomas" + "\n";
		testEmployee += "SIN: " + THOMAS_SOCIAL_INSURANCE_NUMBER + "\n";
		testEmployee += "Address: " + "1000 Robson Street" + "\n";
		testEmployee += "Phone Number: " + "604-0000" + "\n";
		testEmployee += "Weekly Pay: " + currencyFormatter.format(pay);
		String actualToString = testEmployee.toString();
		assertEquals(testEmployee, actualToString);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {

		testEmployee = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		assertTrue(one.equals(testEmployee) && testEmployee.equals(one));

	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectFalse() {

		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		Employee two = new Employee("Richard", "11121 Horseshoe Way", "604-1234", RICHARD_SOCIAL_INSURANCE_NUMBER,
				RICHARD_PAY_RATE);
		assertFalse(one.equals(two) && two.equals(one));
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()}.
	 */
	@Test
	public final void testEmployee() {

		assertTrue(testEmployee instanceof Employee);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public final void testEmployeeStringStringStringIntDouble() {

		assertTrue(testEmployee instanceof Employee);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#getSocialInsuranceNumber()}.
	 */
	@Test
	public final void testGetSocialInsuranceNumber() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		int testGetSocialInsuranceNumber = JUSTIN_SOCIAL_INSURANCE_NUMBER;
		int actualGetSocialInsuranceNumber = testEmployee.getSocialInsuranceNumber();
		assertEquals(testGetSocialInsuranceNumber, actualGetSocialInsuranceNumber);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#setSocialInsuranceNumber(int)}
	 * .
	 */
	@Test
	public final void testSetSocialInsuranceNumber() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		testEmployee.setSocialInsuranceNumber(SET_SOCIAL_INSURANCE_NUMBER);
		assertEquals(SET_SOCIAL_INSURANCE_NUMBER, testEmployee.getSocialInsuranceNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#setSocialInsuranceNumber(int)}
	 * .
	 */
	@Test
	public final void testSetSocialInsuranceLessThanZero() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		testEmployee.setSocialInsuranceNumber(SIN_LESS_THAN_ZERO);
		assertEquals(DEFAULT_SIN, testEmployee.getSocialInsuranceNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#getPayRate()}
	 * .
	 */
	@Test
	public final void testGetPayRate() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		double testGetPayRate = JUSTIN_PAY_RATE;
		double actualGetPayRate = testEmployee.getPayRate();
		assertTrue(testGetPayRate == actualGetPayRate);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#getPayRate()}
	 * .
	 */
	@Test
	public final void testGetPayRateLessThanMinimumWage() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				LESS_MINIMUM_WAGE);
		double testGetPayRate = MINIMUM_WAGE;
		double actualGetPayRate = testEmployee.getPayRate();
		assertTrue(testGetPayRate == actualGetPayRate);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#setPayRate(double)}.
	 */
	@Test
	public final void testSetPayRate() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		testEmployee.setPayRate(SET_PAY_RATE);
		assertTrue(SET_PAY_RATE == testEmployee.getPayRate());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		Employee testDefault = new Employee();

		String name = "Enter a name";
		assertEquals(name, testDefault.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String address)}.
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		Employee testDefault = new Employee();

		String address = "Enter an address";
		assertEquals(address, testDefault.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		Employee testDefault = new Employee();

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testDefault.getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String
	 * socialInsuranceNumber)}.
	 */
	@Test
	public final void testDefaultConstructorSocialInsuranceNumber() {

		Employee testDefault = new Employee();

		int socialInsuranceNumber = DEFAULT_SIN;
		assertEquals(socialInsuranceNumber, testDefault.getSocialInsuranceNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		assertEquals("Justin", testEmployee.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testEmployee.setName("Ollie");
		assertEquals("Ollie", testEmployee.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		assertEquals("24 Sussex Drive", testEmployee.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testEmployee.setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testEmployee.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testEmployee = new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER,
				JUSTIN_PAY_RATE);
		assertEquals("250-0101", testEmployee.getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testEmployee.setPhoneNumber("299-9000");
		assertEquals("299-9000", testEmployee.getPhoneNumber());
	}
}