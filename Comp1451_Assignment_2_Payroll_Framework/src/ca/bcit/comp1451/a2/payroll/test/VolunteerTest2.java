package ca.bcit.comp1451.a2.payroll.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Volunteer;

/**
 * A Test2 Class for Volunteer methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class VolunteerTest2 {

	private static final double DEFAULT_PAY_RATE = 0.0;

	private static Volunteer testVolunteer;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testVolunteer = new Volunteer();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		testVolunteer = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		testVolunteer = null;
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Volunteer#pay()}.
	 */
	@Test
	public final void testPay() {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
		double testPay = DEFAULT_PAY_RATE;
		double actualPay = testVolunteer.pay();
		assertTrue(testPay == actualPay);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Volunteer#toString()}.
	 */
	@Test
	public final void testToString() {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
		String testVolunteer = "Volunteer Staff Member" + "\n";
		testVolunteer += "Name: " + "Kimberly" + "\n";
		testVolunteer += "Address: " + "1200 West Point Grey Road" + "\n";
		testVolunteer += "Phone Number: " + "514-8374";
		String actualToString = testVolunteer.toString();
		assertEquals(testVolunteer, actualToString);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()}
	 * .
	 */
	@Test
	public final void testVolunteer() {

		assertTrue(testVolunteer instanceof Volunteer);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer(java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public final void testVolunteerStringStringString() {

		assertTrue(testVolunteer instanceof Volunteer);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		Volunteer testDefault = new Volunteer();

		String name = "Enter a name";
		assertEquals(name, testDefault.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String address)}
	 * .
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		Volunteer testDefault = new Volunteer();

		String address = "Enter an address";
		assertEquals(address, testDefault.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		Volunteer testDefault = new Volunteer();

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testDefault.getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
		assertEquals("Kimberly", testVolunteer.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testVolunteer.setName("Ollie");
		assertEquals("Ollie", testVolunteer.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
		assertEquals("1200 West Point Grey Road", testVolunteer.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testVolunteer.setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testVolunteer.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testVolunteer = new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374");
		assertEquals("514-8374", testVolunteer.getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testVolunteer.setPhoneNumber("299-9000");
		assertEquals("299-9000", testVolunteer.getPhoneNumber());
	}
}