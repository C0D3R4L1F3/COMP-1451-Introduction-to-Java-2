/**
 * 
 */
package ca.bcit.comp1451.a2.payroll.test;

import static org.junit.Assert.*;

import java.text.NumberFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.a2.payroll.Executive;

/**
 * A Test2 Class for Executive methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class ExecutiveTest2 {

	private static final int HILARY_SOCIAL_INSURANCE_NUMBER = 123456789;
	private static final int MARIANNE_SOCIAL_INSURANCE_NUMBER = 456789101;
	private static final double HILARY_PAY_RATE = 5000.00;
	private static final double MARIANNE_PAY_RATE = 8000.00;
	private static final double SET_BONUS = 1000.00;
	private static final double SET_BONUS_TWO = 2300.00;
	private static final double DEFAULT_BONUS = 0.0;
	private static final double FLAT_RATE_BONUS = 2000;
	private static final double BONUS_PERCENTAGE = 0.02;

	private static Executive testExecutive;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		testExecutive = new Executive();
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

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
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
	public final void testHashCode() {

		Executive testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469",
				HILARY_SOCIAL_INSURANCE_NUMBER, HILARY_PAY_RATE);
		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		assertTrue(one.hashCode() == testExecutive.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#hashCode()}.
	 */
	@Test
	public final void testHashCodeFalse() {

		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive two = new Executive("Marianne", "2808 Rosewell Ave", "817-1234", MARIANNE_SOCIAL_INSURANCE_NUMBER,
				MARIANNE_PAY_RATE);
		assertFalse(one.hashCode() == two.hashCode());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#pay()}.
	 */
	@Test
	public final void testPay() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		testExecutive.setBonus(SET_BONUS);
		double testPay = HILARY_PAY_RATE + SET_BONUS;
		double actualPay = testExecutive.pay();
		assertTrue(testPay == actualPay);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#pay()}.
	 */
	@Test
	public final void testPayResetBonusToZero() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		testExecutive.setBonus(SET_BONUS);
		double testPay = HILARY_PAY_RATE + SET_BONUS;
		double actualPay = testExecutive.pay();
		assertTrue(testPay == actualPay);
		testExecutive.pay();
		assertTrue(DEFAULT_BONUS == testExecutive.getBonus());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#toString()}.
	 */
	@Test
	public final void testToString() {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = HILARY_PAY_RATE;

		NumberFormat bonusFormatter = NumberFormat.getCurrencyInstance();
		double extra = DEFAULT_BONUS;

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		String testExecutive = "Employee Pay Rate: Executive Weekly" + "\n";
		testExecutive += "Name: " + "Hilary" + "\n";
		testExecutive += "SIN: " + HILARY_SOCIAL_INSURANCE_NUMBER + "\n";
		testExecutive += "Address: " + "203 Whitewater Line" + "\n";
		testExecutive += "Phone Number: " + "871-0469" + "\n";
		testExecutive += "Weekly Pay: " + currencyFormatter.format(pay) + "\n";
		testExecutive += "Bonus: " + bonusFormatter.format(extra);
		String actualTestToString = testExecutive.toString();
		assertEquals(testExecutive, actualTestToString);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {

		Executive testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469",
				HILARY_SOCIAL_INSURANCE_NUMBER, HILARY_PAY_RATE);
		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		assertTrue(one.equals(testExecutive) && testExecutive.equals(one));
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectFalse() {

		Executive one = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		Executive two = new Executive("Marianne", "2808 Rosewell Ave", "817-1234", MARIANNE_SOCIAL_INSURANCE_NUMBER,
				MARIANNE_PAY_RATE);
		assertFalse(one.equals(two) && two.equals(one));
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()}
	 * .
	 */
	@Test
	public final void testExecutive() {

		assertTrue(testExecutive instanceof Executive);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive(java.lang.String, java.lang.String, java.lang.String, int, double)}
	 * .
	 */
	@Test
	public final void testExecutiveStringStringStringIntDouble() {

		assertTrue(testExecutive instanceof Executive);
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.Executive#getBonus()}.
	 */
	@Test
	public final void testGetBonus() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		double testGetBonus = DEFAULT_BONUS;
		double actualGetBonus = testExecutive.getBonus();
		assertTrue(testGetBonus == actualGetBonus);
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#setBonus(double)}.
	 */
	@Test
	public final void testSetBonus() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		testExecutive.setBonus(SET_BONUS_TWO);
		assertTrue(SET_BONUS_TWO == testExecutive.getBonus());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#setBonus(double)}.
	 */
	@Test
	public final void testSetExecutiveBonusFlatRate() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		testExecutive.setBonus(FLAT_RATE_BONUS);
		double bonusFlatRate = testExecutive.getBonus();
		assertTrue(bonusFlatRate == testExecutive.getBonus());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#setBonus(double)}.
	 */
	@Test
	public final void testSetExecutiveBonusPercentage() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		double salary = testExecutive.getPayRate();
		testExecutive.setBonus(BONUS_PERCENTAGE * salary);
		double bonusPercentage = testExecutive.getBonus();
		assertTrue(bonusPercentage == testExecutive.getBonus());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String name)}.
	 */
	@Test
	public final void testDefaultConstructorName() {

		Executive testDefault = new Executive();

		String name = "Enter a name";
		assertEquals(name, testDefault.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String address)}
	 * .
	 */
	@Test
	public final void testDefaultConstructorAddress() {

		Executive testDefault = new Executive();

		String address = "Enter an address";
		assertEquals(address, testDefault.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.Executive#Executive()(String
	 * phoneNumber)}.
	 */
	@Test
	public final void testDefaultConstructorPhoneNumber() {

		Executive testDefault = new Executive();

		String phoneNumber = "Enter a phone number";
		assertEquals(phoneNumber, testDefault.getPhoneNumber());
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.a2.payroll.StaffMember#getName()}
	 * .
	 */
	@Test
	public void testGetName() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		assertEquals("Hilary", testExecutive.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setName(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetName() {

		testExecutive.setName("Ollie");
		assertEquals("Ollie", testExecutive.getName());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getAddress()}.
	 */
	@Test
	public void testGetAddress() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		assertEquals("203 Whitewater Line", testExecutive.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setAddress(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetAddress() {

		testExecutive.setAddress("11121 Horseshoe Way");
		assertEquals("11121 Horseshoe Way", testExecutive.getAddress());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#getPhoneNumber()}.
	 */
	@Test
	public void testGetPhoneNumber() {

		testExecutive = new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAY_RATE);
		assertEquals("871-0469", testExecutive.getPhoneNumber());
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.a2.payroll.StaffMember#setPhoneNumber(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetPhoneNumber() {

		testExecutive.setPhoneNumber("299-9000");
		assertEquals("299-9000", testExecutive.getPhoneNumber());
	}
}