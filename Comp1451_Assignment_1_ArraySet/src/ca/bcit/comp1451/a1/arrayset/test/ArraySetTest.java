package ca.bcit.comp1451.a1.arrayset.test;

import java.util.Random;
import static org.junit.Assert.*;
import ca.bcit.comp1451.a1.arrayset.ArraySet;
import ca.bcit.comp1451.a1.arrayset.ArraySet.SetIterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * JUnit tests for ArraySet
 *
 * @author BCIT
 * @version 3.0
 */
public class ArraySetTest {

    /**
     * Many (anything more than this takes too long).
     */
    public static final int LARGE = 100_000;

    /**
     * Some (seems like a good number).
     */
    public static final int MEDIUM = 1_000;

    /**
     * Few (seems like a good number).
     */
    public static final int SMALL = 10;

    /**
     * Test object.
     */
    protected ArraySet testArraySet;

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
        testArraySet = new ArraySet();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        testArraySet = null;
    }

    /**
     * Test method for constructor.
     */
    @Test
    public void testArraySet() {
        assertTrue(testArraySet instanceof ArraySet);
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddOneToEmptySetReturnsTrue() {
        int numberToAdd = 1;
        boolean result = testArraySet.add(numberToAdd);
        assertTrue(result);
        assertTrue(testArraySet.size() == 1);
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddManyToEmptySetNoDuplicatesReturnsTrue() {
        boolean result = true;
        for (int i = 0; i < LARGE; ++i) {
            result = result && testArraySet.add(i);
        }
        assertTrue(result);
        assertTrue(testArraySet.size() == LARGE);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddNullToEmptySetReturnsFalse() {
        boolean result = testArraySet.add(null);
        assertFalse(result);
        assertTrue(testArraySet.size() == 0);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddNullToNonemptySetReturnsFalse() {
        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        boolean result = testArraySet.add(null);
        assertFalse(result);
        assertTrue(testArraySet.size() == MEDIUM);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsReturnsTrueSetOfOne() {
        int numberToAdd = 1;
        @SuppressWarnings("unused")
		boolean result = testArraySet.add(numberToAdd);
        assertTrue(testArraySet.contains(numberToAdd));
        assertTrue(testArraySet.size() == 1);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsReturnsTrueLargeSet() {
        boolean result = true;
        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(i);
        }
        for (int i = 0; i < LARGE; ++i) {
            result = result && testArraySet.contains(i);
        }
        assertTrue(result);
        assertTrue(testArraySet.size() == LARGE);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsNoNullsEmptySet() {
        assertFalse(testArraySet.contains(null));
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsReturnsFalseForEmptySet() {
        assertFalse(testArraySet.contains(1));
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsReturnsFalseForSomethingNotInLargeSet() {
        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(i);
        }
        assertTrue(testArraySet.size() == LARGE);
        assertFalse(testArraySet.contains(LARGE));
        
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#contains(java.lang.Object)}.
     */
    @Test
    public void testContainsNoNullsNonemptySet() {
        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertTrue(testArraySet.size() == MEDIUM);
        @SuppressWarnings("unused")
		boolean result = testArraySet.add(null);
        assertFalse(testArraySet.contains(null));
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#size()}.
     */
    @Test
    public void testSizeEmptySet() {

        assertEquals(testArraySet.size(), 0);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#size()}.
     */
    @Test
    public void testSizeSmallSet() {

        for (int i = 0; i < SMALL; ++i) {
            testArraySet.add(i);
        }
        assertEquals(testArraySet.size(), SMALL);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#size()}.
     */
    @Test
    public void testSizeMediumSet() {

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertEquals(testArraySet.size(), MEDIUM);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#size()}.
     */
    @Test
    public void testSizeLargeSet() {

        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(i);
        }
        assertEquals(testArraySet.size(), LARGE);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#clear()}.
     */
    @Test
    public void testClearEmptySet() {

        testArraySet.clear();
        assertEquals(testArraySet.size(), 0);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#clear()}.
     */
    @Test
    public void testClearLargeSet() {

        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(i);
        }
        testArraySet.clear();
        assertEquals(testArraySet.size(), 0);
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddOneDuplicateSequentiallySmallSet() {

        assertTrue(testArraySet.add(1));
        assertFalse(testArraySet.add(1));
        assertEquals(testArraySet.size(), 1);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddOneDuplicateNonsequentuallySmallSet() {

        assertTrue(testArraySet.add(1));
        assertTrue(testArraySet.add(2));
        assertFalse(testArraySet.add(1));
        assertEquals(testArraySet.size(), 2);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddOneDuplicateSequentiallyLargeSet() {

        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(i);
        }
        for (int i = 0; i < LARGE; ++i) {
            assertFalse(testArraySet.add(i));
        }
        assertEquals(testArraySet.size(), LARGE);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#add(java.lang.Object)}.
     */
    @Test
    public void testAddManyDuplicatesNonSequentiallyLargeSet() {

        Random random = new Random();
        for (int i = 0; i < LARGE; ++i) {
            testArraySet.add(random.nextInt(SMALL));
        }
        assertEquals(SMALL, testArraySet.size());

    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#toArray()}.
     */
    @Test
    public void testToArraySmall() {
        for (int i = 0; i < SMALL; ++i) {
            testArraySet.add(i);
        }
        Object[] arr = testArraySet.toArray();
        assertEquals(arr.length, SMALL);
        for (int i = 0; i < SMALL; ++i) {
            assertNotNull(arr[i]);
        }
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#toArray()}.
     */
    @Test
    public void testToArraySmallCleared() {
        for (int i = 0; i < SMALL; ++i) {
            testArraySet.add(i);
        }
        testArraySet.clear();
        Object[] arr = testArraySet.toArray();
        assertEquals(arr.length, 0);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#toArray()}.
     */
    @Test
    public void testToArrayMediumSomeRemoved() {

        Random random = new Random();

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }

        int removed = 0;

        for (int i = 0; i < SMALL; ++i) {
            if (testArraySet.remove(random.nextInt(MEDIUM))) {
                removed++;
            }
            ;
        }
        Object[] arr = testArraySet.toArray();
        assertEquals(arr.length, (MEDIUM - removed));
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#iterator()}.
     */
    @Test
    public void testIteratorIsNotNull() {

        SetIterator itr = testArraySet.iterator();
        assertNotNull(itr);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#iterator()}.
     */
    @Test
    public void testIteratorOverEmptySet() {

        SetIterator itr = testArraySet.iterator();
        int count = 0;
        if (itr.hasNext()) {
            count++;
        }
        assertEquals(count, 0);
    }

    /**
     * Test method for {@link ca.bcit.comp1451.a1.arrayset.ArraySet#iterator()}.
     */
    @Test
    public void testIteratorOverMediumSet() {

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        SetIterator itr = testArraySet.iterator();
        int count = 0;
        while (itr.hasNext()) {
            itr.next();
            count++;
        }
        assertEquals(count, MEDIUM);
    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveNullFromEmptySet() {

        assertFalse(testArraySet.remove(null));
        assertTrue(testArraySet.size() == 0);

        
    }
    
    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveFromEmptySet() {

        assertFalse(testArraySet.remove(SMALL));
        assertTrue(testArraySet.size() == 0);

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveNullFromNonemptySet() {
        
        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertFalse(testArraySet.remove(null));
        assertTrue(testArraySet.size() == MEDIUM);

    }
    
    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveFirstElementFromNonemptySet() {

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertTrue(testArraySet.remove(0));
        assertTrue(testArraySet.size() == (MEDIUM - 1));
        assertFalse(testArraySet.contains(0));
    }
    
    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveLastElementFromNonemptySet() {

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertTrue(testArraySet.remove((MEDIUM - 1))); 
        assertTrue(testArraySet.size() == (MEDIUM - 1));
        assertFalse(testArraySet.contains((MEDIUM - 1)));

    }
    
    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveMiddleElementFromNonemptySet() {

        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        assertTrue(testArraySet.remove((MEDIUM / 2)));  
        assertTrue(testArraySet.size() == (MEDIUM - 1));
        assertFalse(testArraySet.contains((MEDIUM / 2)));

    }

    /**
     * Test method for
     * {@link ca.bcit.comp1451.a1.arrayset.ArraySet#remove(java.lang.Object)}.
     */
    @Test
    public void testRemoveAllElementsFromNonemptySet() {
        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.add(i);
        }
        for (int i = 0; i < MEDIUM; ++i) {
            testArraySet.remove(i);
        }
        assertTrue(testArraySet.size() == 0);
        boolean contains = false;
        for (int i = 0; i < MEDIUM; ++i) {
            contains = contains || testArraySet.contains(i);
        }
        assertFalse(contains);
    }

}
