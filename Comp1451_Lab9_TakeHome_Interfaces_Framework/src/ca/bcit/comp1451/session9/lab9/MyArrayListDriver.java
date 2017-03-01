package ca.bcit.comp1451.session9.lab9;

/**
 * A Class to invoke the methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 13 March 2016
 */
public class MyArrayListDriver {

	private static final int INDEX_ZERO = 0;
	private static final int INTEGER_OBJECT_TYPE = 0;
	private static final int INTEGER_OBJECT_TYPE_THIRTYTHREE = 33;
	private static final int INTEGER_OBJECT_TYPE_TWENTYFIVE = 25;
	private static final int INTEGER_OBJECT_TYPE_FITYFIVE = 55;
	private static final int INTEGER_OBJECT_TYPE_SIXTYSIX = 66;
	private static final int INTEGER_OBJECT_TYPE_FORTYFOUR = 44;
	private static final int INTEGER_OBJECT_TYPE_NINTYNINE = 99;
	private static final int INTEGER_OBJECT_TYPE_ONEHUNDRED = 100;
	private static final int INTEGER_OBJECT_TYPE_ELEVEN = 11;
	private static final int INTEGER_OBJECT_TYPE_TWELEVE = 12;
	private static final int INTEGER_OBJECT_TYPE_TWENTYONE = 21;
	private static final int TEST_TO_SEE_IF_ADDS_OVER_LIST_SIZE_FALSE = 69;

	private static final String INVALID_OBJECT_TYPE = "Ronnie";
	private static final int FIRST_INDEX_ZERO = 0;

	/**
	 * Default Constructor
	 */
	public MyArrayListDriver() {

	}

	/**
	 * Drives the program
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		MyList list = new MyArrayList(INTEGER_OBJECT_TYPE);

		list.add(new Integer(INTEGER_OBJECT_TYPE_THIRTYTHREE));
		list.add(new Integer(INTEGER_OBJECT_TYPE_TWENTYFIVE));
		list.add(new String(INVALID_OBJECT_TYPE));
		list.add(new Integer(INTEGER_OBJECT_TYPE_FITYFIVE));
		list.add(new Integer(INTEGER_OBJECT_TYPE_SIXTYSIX));
		list.add(new Integer(INTEGER_OBJECT_TYPE_FORTYFOUR));
		list.add(new Integer(INTEGER_OBJECT_TYPE_NINTYNINE));
		list.add(new Integer(INTEGER_OBJECT_TYPE_ONEHUNDRED));
		list.add(new Integer(INTEGER_OBJECT_TYPE_ELEVEN));
		list.add(new Integer(INTEGER_OBJECT_TYPE_TWELEVE));
		list.add(new Integer(INTEGER_OBJECT_TYPE_TWENTYONE));
		list.add(new Integer(TEST_TO_SEE_IF_ADDS_OVER_LIST_SIZE_FALSE));// number 69 will not be added due to over capacity limit 
		System.out.println("Is list empty: " + list.isEmpty());
		System.out.println("------------------------------");
		System.out.println("The contents of the list");
		for (int i = INDEX_ZERO; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------");
		System.out.println("The size of the list: " + list.size());
		System.out.println("------------------------------");
		System.out.println("Gets the first element on the list: " + list.get(FIRST_INDEX_ZERO));
		System.out.println("------------------------------");
		System.out.println("Removes the first element on the list: " + list.remove(FIRST_INDEX_ZERO));
		System.out.println("------------------------------");
		System.out.println("The contents of the list");
		for (int i = INDEX_ZERO; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------");
		System.out.println("The size of the list: " + list.size());
	}
}