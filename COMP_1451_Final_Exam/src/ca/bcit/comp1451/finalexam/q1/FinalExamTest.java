/**
 * 
 */
package ca.bcit.comp1451.finalexam.q1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * A class for the final exam
 * 
 * @author Ronnie Manimtim
 * @version 1.0 16 Apr 2016
 */
public class FinalExamTest {

	private FinalExam finalExam;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
		finalExam = new FinalExam();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		finalExam = null;
	}

	/**
	 * 
	 */
	@Test
	public void C1() {
		try {
			finalExam.setC("aaaaaaaaaa");
			fail();
		} catch (TooLongException e) {
			assertEquals("aaaaaaaaaa is more than five characters; too long!", e.getMessage());
		} catch (Exception e) {
			fail();
		}
	}

	/**
	 * 
	 */
	private void fail() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	@Test
	public void C2() {
		try {
			finalExam.setC("......");
			fail();
		} catch (TooLongException e) {
			assertEquals("...... is more than five characters; too long!", e.getMessage());
		} catch (Exception e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void C3() {
		try {
			finalExam.setC(null);
			fail();
		} catch (TooShortException e) {
			assertEquals("null is not allowed; it is fewer than five characters; too short!", e.getMessage());
		} catch (Exception e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void C4() {
		try {
			finalExam.setC("");
			fail();
		} catch (TooShortException e) {
			assertEquals("empty string is fewer than five characters; too short!", e.getMessage());
		} catch (Exception e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void C5() {
		try {
			finalExam.setC("hi");
			fail();
		} catch (TooShortException e) {
			assertEquals("hi is fewer than five characters; too short!", e.getMessage());
		} catch (Exception e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void C6() {
		try {
			finalExam.setC("99887");
			assertEquals("99887", finalExam.getC());
		} catch (Exception e) {
			fail();
		}
	}
}
