package ca.bcit.comp1451.session9.lab9;

/**
 * Interface MyList.
 * 
 * @author BCIT
 * @version 2.0
 */
public interface MyList {

	public static final int LIST_SIZE = 10;
	public static final int DEFAULT_ELEMENT_COUNT = 0;
	public static final int DEFAULT_INDEX_ZERO = 0;

	/**
	 * Adds a new element at the end of the list. If the list is already full,
	 * returns false.
	 * 
	 * @param the
	 *            object to add
	 * @return true if element successfully added, otherwise false
	 */
	public boolean add(Object toAdd);

	/**
	 * Gets the object at the specified index. If the index is out of bounds,
	 * returns null.
	 * 
	 * @param index
	 *            value of object to get
	 * @return object at that index
	 */
	public Object get(int index);

	/**
	 * Removes specified object from list. If the index is out of bounds,
	 * returns null.
	 * 
	 * @param index
	 *            value of object to remove
	 * @return the object removed
	 */
	public Object remove(int index);

	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return number of elements in the list
	 */
	public int size();

	/**
	 * @return true if the list has no elements, false otherwise
	 */
	public boolean isEmpty();

}
