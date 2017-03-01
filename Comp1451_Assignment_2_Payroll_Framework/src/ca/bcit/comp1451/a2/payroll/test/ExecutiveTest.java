package ca.bcit.comp1451.a2.payroll.test;

import java.text.NumberFormat;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Executive;
import junit.framework.TestCase;

/**
 * A Test Class for Executive methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class ExecutiveTest extends TestCase {

	private static final int HILARY_SOCIAL_INSURANCE_NUMBER = 123456789;
	private static final int MARIANNE_SOCIAL_INSURANCE_NUMBER = 456789101;
	private static final double HILARY_PAY_RATE = 5000.00;
	private static final double MARIANNE_PAY_RATE = 8000.00;
	private static final double SET_BONUS = 1000.00;
	private static final double TOTAL_BONUS = 6000.00;
	private static final double DEFAULT_BONUS = 0.0;
	private static final int INDEX_ZERO = 0;

	private static ArrayList<Executive> testExecutive;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testExecutive = new ArrayList<>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		testExecutive = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		testExecutive = null;
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#hashCode()}.
	 */
	@Test
	public void testHashCode() {

		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive two = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive three = new Executive("Marianne", "2808 Rosewell Ave", "817-1234", MARIANNE_SOCIAL_INSURANCE_NUMBER,
				MARIANNE_PAY_RATE);
		assertTrue(one.hashCode() == two.hashCode());
		assertFalse(one.hashCode() == three.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#pay()}.
	 */
	@Test
	public void testPay() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		testExecutive.get(INDEX_ZERO).setBonus(SET_BONUS);
		assertEquals(TOTAL_BONUS, testExecutive.get(INDEX_ZERO).pay());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#toString()}.
	 */
	@Test
	public void testToString() {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = HILARY_PAY_RATE;

		NumberFormat bonusFormatter = NumberFormat.getCurrencyInstance();
		double extra = DEFAULT_BONUS;

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		String resutls = "[Employee Pay Rate: Executive Weekly" + "\n";
		resutls += "Name: " + "Hilary" + "\n";
		resutls += "SIN: " + HILARY_SOCIAL_INSURANCE_NUMBER + "\n";
		resutls += "Address: " + "203 Whitewater Line" + "\n";
		resutls += "Phone Number: " + "871-0469" + "\n";
		resutls += "Weekly Pay: " + currencyFormatter.format(pay) + "\n";
		resutls += "Bonus: " + bonusFormatter.format(extra) + "]";
		assertEquals(resutls, testExecutive.toString());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {

		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive two = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive three = new Executive("Marianne", "2808 Rosewell Ave", "817-1234", MARIANNE_SOCIAL_INSURANCE_NUMBER,
				MARIANNE_PAY_RATE);
		assertTrue(one.equals(two) && two.equals(one));
		assertFalse(one.equals(three) && three.equals(one));
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()}
	 * .
	 */
	@Test
	public void testExecutive() {

		assertTrue(testExecutive instanceof ArrayList);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public void testExecutiveStringStringStringIntDouble() {

		assertTrue(testExecutive instanceof ArrayList);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#getBonus()}.
	 */
	@Test
	public void testGetBonus() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		assertEquals(DEFAULT_BONUS, testExecutive.get(INDEX_ZERO).getBonus());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#setBonus(double)}.
	 */
	@Test
	public void testSetBonus() {

		testExecutive.get(INDEX_ZERO).setBonus(SET_BONUS);
		assertEquals(SET_BONUS, testExecutive.get(INDEX_ZERO).getBonus());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive());

		String name = "Enter a name";
		assertEquals(name, testExecutive.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String address)}
	 * .
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive());

		String address = "Enter an address";
		assertEquals(address, testExecutive.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive());

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testExecutive.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		assertEquals("Hilary", testExecutive.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testExecutive.get(INDEX_ZERO).setName("Ollie");
		assertEquals("Ollie", testExecutive.get(INDEX_ZERO).getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		assertEquals("203 Whitewater Line", testExecutive.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testExecutive.get(INDEX_ZERO).setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testExecutive.get(INDEX_ZERO).getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testExecutive = new ArrayList<>();
		testExecutive.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE));
		assertEquals("871-0469", testExecutive.get(INDEX_ZERO).getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testExecutive.get(INDEX_ZERO).setPhoneNumber("299-9000");
		assertEquals("299-9000", testExecutive.get(INDEX_ZERO).getPhoneNumber());
	}
}