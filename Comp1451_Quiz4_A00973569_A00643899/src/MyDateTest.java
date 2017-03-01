import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyDateTest {
	
	private MyDate testMyDate;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		testMyDate = new MyDate();
	}

	@After
	public void tearDown() throws Exception {
		
		testMyDate = null;
	}

	@Test
	public void testMyDate() {
		testMyDate = new MyDate();
		int testMonth = 2;
		int testDay = 20;
		int testYear = 2016;
		assertEquals(testMonth,  testMyDate.getMonth());
		assertEquals(testDay,  testMyDate.getDay());
		assertEquals(testYear,  testMyDate.getYear());
		
	}

	@Test
	public void testMyDateIntIntInt() {	
		int testMonth = 4;
		int testDay = 20;
		int testYear = 2014;
		
		testMyDate = new MyDate();
		
		testMyDate.setDay(20);
		testMyDate.setMonth(4);
		testMyDate.setYear(2014);
		
		assertEquals(testMonth,  testMyDate.getMonth());
		assertEquals(testDay,  testMyDate.getDay());
		assertEquals(testYear,  testMyDate.getYear());
	}

	@Test
	public void testGetDay() {

		assertEquals(20, testMyDate.getDay());
	}

	@Test
	public void testSetDay() {
		
		testMyDate.setDay(16);
		assertEquals(16, testMyDate.getDay());
	}

	@Test
	public void testGetMonth() {
		
		
		assertEquals(2, testMyDate.getMonth());
	}

	@Test
	public void testSetMonth() {
		
		testMyDate.setMonth(11);
		assertEquals(11, testMyDate.getMonth());		
		
	}

	@Test
	public void testGetYear() {
		
		assertEquals(2016, testMyDate.getYear());
		
	}

	@Test
	public void testSetYear() {	
		
		testMyDate.setYear(1855);
		assertEquals(1855, testMyDate.getYear());
		
		}

	
	

	@Test
	public void testGetDayOfTheWeek() {		
		
		assertEquals("Sunday", testMyDate.getDayOfTheWeek(0));		
		assertEquals("Saturday", testMyDate.getDayOfTheWeek(6));
	}
	
	@Test
	public void testGetDayOfTheWeekHigherBound() {
		
		assertEquals("Please try again.", testMyDate.getDayOfTheWeek(10));
	}
	
	@Test
	public void testGetDayOfTheWeekLowerBound() {
		
		assertEquals("Please try again.", testMyDate.getDayOfTheWeek(-1));
	}

}
