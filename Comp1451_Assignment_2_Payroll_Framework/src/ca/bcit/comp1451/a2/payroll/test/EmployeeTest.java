package ca.bcit.comp1451.a2.payroll.test;

import java.text.NumberFormat;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Employee;
import junit.framework.TestCase;

/**
 * A Test Class for Employee methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class EmployeeTest extends TestCase {

	private static final int JUSTIN_SOCIAL_INSURANCE_NUMBER = 987654321;
	private static final int THOMAS_SOCIAL_INSURANCE_NUMBER = 010203040;
	private static final int RICHARD_SOCIAL_INSURANCE_NUMBER = 12345688;
	private static final double JUSTIN_PAY_RATE = 2000.00;
	private static final double THOMAS_PAY_RATE = 1500.00;
	private static final double RICHARD_PAY_RATE = 1600.00;
	private static final int SET_SOCIAL_INSURANCE_NUMBER = 123456789;
	private static final double SET_PAY_RATE = 5000.00;
	private static final int INDEX_ZERO = 0;

	private static ArrayList<Employee> testEmployee;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testEmployee = new ArrayList<Employee>();
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

		testEmployee = new ArrayList<Employee>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		testEmployee.add(new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE));
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
	public void testHashCode() {

		Employee testEmployee = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		assertEquals(one.hashCode(), testEmployee.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#hashCode()}.
	 */
	@Test
	public void testHashCodeFalse() {

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
	public void testPay() {

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE));
		assertEquals(THOMAS_PAY_RATE, testEmployee.get(INDEX_ZERO).pay());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#toString()}.
	 */
	@Test
	public void testToString() {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = THOMAS_PAY_RATE;

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE));
		String results = "[Employee Pay Rate: Weekly" + "\n";
		results += "Name: " + "Thomas" + "\n";
		results += "SIN: " + THOMAS_SOCIAL_INSURANCE_NUMBER + "\n";
		results += "Address: " + "1000 Robson Street" + "\n";
		results += "Phone Number: " + "604-0000" + "\n";
		results += "Weekly Pay: " + currencyFormatter.format(pay) + "]";
		assertEquals(results, testEmployee.toString());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE));
		Employee one = new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAY_RATE);
		assertEquals(one.equals(testEmployee), testEmployee.equals(one));
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalse() {

		testEmployee = new ArrayList<>();
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
	public void testEmployee() {

		assertTrue(testEmployee instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public void testEmployeeStringStringStringIntDouble() {

		assertTrue(testEmployee instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#getSocialInsuranceNumber()}.
	 */
	@Test
	public void testGetSocialInsuranceNumber() {

		testEmployee = new ArrayList<>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		assertEquals(JUSTIN_SOCIAL_INSURANCE_NUMBER, testEmployee.get(INDEX_ZERO).getSocialInsuranceNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#setSocialInsuranceNumber(int)}
	 * .
	 */
	@Test
	public void testSetSocialInsuranceNumber() {

		testEmployee.get(INDEX_ZERO).setSocialInsuranceNumber(SET_SOCIAL_INSURANCE_NUMBER);
		assertEquals(SET_SOCIAL_INSURANCE_NUMBER, testEmployee.get(INDEX_ZERO).getSocialInsuranceNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Employee#getPayRate()}
	 * .
	 */
	@Test
	public void testGetPayRate() {

		testEmployee = new ArrayList<>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		assertEquals(JUSTIN_PAY_RATE, testEmployee.get(INDEX_ZERO).getPayRate());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#setPayRate(double)}.
	 */
	@Test
	public void testSetPayRate() {

		testEmployee.get(INDEX_ZERO).setPayRate(SET_PAY_RATE);
		assertEquals(SET_PAY_RATE, testEmployee.get(INDEX_ZERO).getPayRate());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee());

		String name = "Enter a name";
		assertEquals(name, testEmployee.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String address)}.
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee());

		String address = "Enter an address";
		assertEquals(address, testEmployee.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Employee#Employee()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		testEmployee = new ArrayList<>();
		testEmployee.add(new Employee());

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testEmployee.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testEmployee = new ArrayList<>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		assertEquals("Justin", testEmployee.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testEmployee.get(INDEX_ZERO).setName("Ollie");
		assertEquals("Ollie", testEmployee.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testEmployee = new ArrayList<>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		assertEquals("24 Sussex Drive", testEmployee.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testEmployee.get(INDEX_ZERO).setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testEmployee.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testEmployee = new ArrayList<>();
		testEmployee.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAY_RATE));
		assertEquals("250-0101", testEmployee.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testEmployee.get(INDEX_ZERO).setPhoneNumber("299-9000");
		assertEquals("299-9000", testEmployee.get(INDEX_ZERO).getPhoneNumber());
	}
}