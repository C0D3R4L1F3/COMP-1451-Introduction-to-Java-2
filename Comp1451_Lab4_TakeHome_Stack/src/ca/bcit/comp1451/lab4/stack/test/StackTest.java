package ca.bcit.comp1451.lab4.stack.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.bcit.comp1451.lab4.stack.StackImpl;

/**
 * StackTest.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 31 Jan 2016
 */
public class StackTest {

	/**
	 * Stack for the tests.
	 */
	private static StackImpl stackToTest;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stackToTest = new StackImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#StackImpl()}
	 * .
	 */
	@Test
	public final void testStackImpl() {

		assertTrue(stackToTest != null);// TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#isEmpty()}.
	 */
	@Test
	public final void testIsEmpty() {

		stackToTest = new StackImpl();
		assertTrue(stackToTest.isEmpty());// TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#makeEmpty()}
	 * .
	 */
	@Test
	public final void testMakeEmpty() {

		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		stackToTest.push("Ryan");
		stackToTest.push("Chris");
		stackToTest.push("Ronnie");
		stackToTest.makeEmpty();
		assertTrue(stackToTest.isEmpty()); // TODO
	}

	/**
	 * Test method for
	 * {@link ca.bcit.comp1451.lab4.stack.StackImpl#push(java.lang.Object)}.
	 */
	@Test
	public final void testPush() {

		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		stackToTest.push("Ryan");
		stackToTest.push("Chris");
		stackToTest.push("Ronnie");
		assertEquals("Ronnie", stackToTest.top()); // TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#pop()}.
	 */
	@Test
	public final void testPop() {

		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		assertEquals("Charlie", stackToTest.pop());// TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#top()}.
	 */
	@Test
	public final void testTop() {

		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		assertEquals("Charlie", stackToTest.top());
		// TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#size()}.
	 */
	@Test
	public final void testSize() {

		stackToTest = new StackImpl();
		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		stackToTest.push("Ryan");
		stackToTest.push("Chris");
		stackToTest.push("Ronnie");
		assertEquals(5, stackToTest.size());// TODO
	}

	/**
	 * Test method for {@link ca.bcit.comp1451.lab4.stack.StackImpl#toString()}.
	 */
	@Test
	public final void testToString() {

		stackToTest = new StackImpl();
		stackToTest.push("Mohammed");
		stackToTest.push("Charlie");
		assertEquals("[Mohammed,Charlie]", stackToTest.toString()); // TODO
	}
}
