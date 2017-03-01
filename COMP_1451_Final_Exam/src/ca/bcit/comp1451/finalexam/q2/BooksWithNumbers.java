/**
 * 
 */
package ca.bcit.comp1451.finalexam.q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A class for the final exam
 * 
 * @author Ronnie Manimtim
 * @version 1.0 16 April 2016
 */
public class BooksWithNumbers {

	private static final int YEAR_ONE = 1984;
	private static final int YEAR_TWO = 2001;
	private static final int NUMBER_VALUE_ONE = 22;
	private static final int NUMBER_VALUE_TWO = 451;
	private HashMap<Integer, String> bookTitles;

	/**
	 * Constructor to initialize HashMap
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BooksWithNumbers() {
		bookTitles = new HashMap<Integer, String>();

		bookTitles.put(YEAR_ONE, "nineteen eighty four");
		bookTitles.put(YEAR_TWO, "2001: a space odyssey");
		bookTitles.put(NUMBER_VALUE_ONE, "catch 22");
		bookTitles.put(NUMBER_VALUE_TWO, "farenheit: 451");

		Iterator it = bookTitles.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> value = (Map.Entry<Integer, String>) it.next();
			System.out.println(value.getKey() + " => " + value.getValue());
		}

	}

}
