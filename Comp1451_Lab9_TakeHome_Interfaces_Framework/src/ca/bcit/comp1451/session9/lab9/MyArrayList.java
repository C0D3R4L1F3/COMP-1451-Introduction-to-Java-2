package ca.bcit.comp1451.session9.lab9;

/**
 * A simple implementation of a FIXED SIZE array list implemented with a FIXED
 * SIZE array.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 13 March 2016
 */
public class MyArrayList implements MyList {

	private Object[] theList;
	private int elementCount;
	private Object objectType;

	/**
	 * Constructor - start with an empty array
	 */
	public MyArrayList() {

		theList = new Object[LIST_SIZE];
	}

	/**
	 * Constructor to initialize a objectType
	 * 
	 * @param objectType
	 *            given
	 */
	public MyArrayList(Object objectType) {

		this.objectType = objectType;
		theList = new Object[LIST_SIZE];
		elementCount = DEFAULT_ELEMENT_COUNT;
	}

	/**
	 * Adds a new element at the end of the list. If the list is already full,
	 * returns false.
	 * 
	 * @param the
	 *            object to add
	 * @return true if element successfully added, otherwise false
	 */
	@Override
	public boolean add(Object toAdd) {

		if (toAdd.getClass().equals(objectType.getClass())) {
			if (elementCount < theList.length) {
				theList[elementCount] = toAdd;
				elementCount++;
			}
			return true;
		} else {
			System.out.println(
					"You entered: " + toAdd + ", this type of object parameter was rejected due to incompatible type.");
		}
		return false;
	}

	/**
	 * Gets the object at the specified index. If the index is out of bounds,
	 * returns null.
	 * 
	 * @param index
	 *            value of object to get
	 * @return object at that index
	 */
	@Override
	public Object get(int index) {

		if (index >= DEFAULT_INDEX_ZERO && index < size()) {
			return theList[index];
		} else {
			return null;
		}
	}

	/**
	 * Removes specified object from list. If the index is out of bounds,
	 * returns null.
	 * 
	 * @param index
	 *            value of object to remove
	 * @return the object removed
	 */
	@Override
	public Object remove(int index) {

		if (index >= DEFAULT_INDEX_ZERO && index < size()) {
			Object temp = theList[index];
			for (int i = index; i < size();) {
				elementCount--;
				theList[i] = theList[elementCount];
				return temp;
			}
		}
		return null;
	}

	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return number of elements in the list
	 */
	@Override
	public int size() {

		return elementCount;
	}

	/**
	 * @return true if the list has no elements, false otherwise
	 */
	@Override
	public boolean isEmpty() {

		if (elementCount == DEFAULT_ELEMENT_COUNT) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the objectType
	 */
	public Object getObjectType() {

		return objectType;
	}

	/**
	 * @param objectType
	 *            the objectType to set for MyArrayList
	 */
	public void setObjectType(Object objectType) {

		this.objectType = objectType;
	}
}