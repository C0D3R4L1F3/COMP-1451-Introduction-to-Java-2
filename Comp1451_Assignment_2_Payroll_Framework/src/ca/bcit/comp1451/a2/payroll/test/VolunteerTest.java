package ca.bcit.comp1451.a2.payroll.test;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Volunteer;
import junit.framework.TestCase;

/**
 * A Test Class for Volunteer methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class VolunteerTest extends TestCase {

	private static final double DEFAULT_PAY_RATE = 0.0;
	private static final int INDEX_ZERO = 0;

	private static ArrayList<Volunteer> testVolunteer;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testVolunteer = new ArrayList<>();
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

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		testVolunteer.add(new Volunteer("Jean", "321 Shawinigate Lane", "613-7282"));
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
	public void testPay() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		double pay = DEFAULT_PAY_RATE;
		assertEquals(pay, testVolunteer.get(INDEX_ZERO).pay());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Volunteer#toString()}.
	 */
	@Test
	public void testToString() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		String results = "[Volunteer Staff Member" + "\n";
		results += "Name: " + "Kimberly" + "\n";
		results += "Address: " + "1200 West Point Grey Road" + "\n";
		results += "Phone Number: " + "514-8374" + "]";
		assertEquals(results, testVolunteer.toString());

	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()}
	 * .
	 */
	@Test
	public void testVolunteer() {

		assertTrue(testVolunteer instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer(java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testVolunteerStringStringString() {

		assertTrue(testVolunteer instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer());

		String name = "Enter a name";
		assertEquals(name, testVolunteer.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String address)}
	 * .
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer());

		String address = "Enter an address";
		assertEquals(address, testVolunteer.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Volunteer#Volunteer()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer());

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testVolunteer.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		assertEquals("Kimberly", testVolunteer.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testVolunteer.get(INDEX_ZERO).setName("Ollie");
		assertEquals("Ollie", testVolunteer.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		assertEquals("1200 West Point Grey Road", testVolunteer.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testVolunteer.get(INDEX_ZERO).setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testVolunteer.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testVolunteer = new ArrayList<>();
		testVolunteer.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		assertEquals("514-8374", testVolunteer.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testVolunteer.get(INDEX_ZERO).setPhoneNumber("299-9000");
		assertEquals("299-9000", testVolunteer.get(INDEX_ZERO).getPhoneNumber());
	}
}