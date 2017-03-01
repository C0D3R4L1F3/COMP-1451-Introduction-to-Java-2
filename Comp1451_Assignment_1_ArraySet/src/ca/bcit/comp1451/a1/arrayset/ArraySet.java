package ca.bcit.comp1451.a1.arrayset;

/**
 * <p>
 * ArraySet is a resizable-array implementation of a Set. It contains a set of
 * elements in no particular order that excludes duplicates or nulls.
 * </p>
 * 
 * <p>
 * Elements may be added to, removed from, and searched for in the ArraySet. As
 * elements are added to the ArraySet its capacity is resized automatically.
 * </p>
 * 
 * <p>
 * ArraySet contains a SetIterator that permits access to the elements in the
 * ArraySet one at a time.
 * </p>
 * 
 * @author Ronnie Manimtim
 * @version 1.0 11 Feb 2016
 * @invariant The ArraySet never contains duplicate elements.
 * @invariant The ArraySet never contains nulls.
 */
public class ArraySet {

	private static final int INDEX_COUNT_ZERO = 0;
	private static final int INDEX_COUNT_ONE = 1;
	private static final int ELEMENT_COUNT_ZERO = 0;
	private static final int DOUBE_CAPACITY = 2;

	/**
	 * The initial capacity of the ArraySet.
	 */
	public static final int INITIAL_CAPACITY = 10;

	/**
	 * The capacity of the ArraySet.
	 */
	private int capacity;

	/**
	 * The number of elements contained in the ArraySet.
	 */
	private int elementCount;

	/**
	 * The array buffer that stores the elements of the ArraySet.
	 */
	private Object[] collection;

	/**
	 * Constructs a new empty ArraySet of default initial capacity equal to
	 * INITIAL_CAPACITY.
	 * 
	 * @pre true
	 * @post size() = 0.
	 */
	public ArraySet() {

		capacity = INITIAL_CAPACITY;
		collection = new Object[capacity];
		elementCount = ELEMENT_COUNT_ZERO;
	}

	/**
	 * Adds the specified object to the set.
	 * 
	 * @param newItem
	 *            The object to be added to the set.
	 * @pre true
	 * @post IF ( newItem !=null AND NOT @pre.contains(newItem) ) THEN
	 *       contains(newItem) ELSE the set is not changed
	 * @return true if newItem was added to the set, false otherwise.
	 */
	public boolean add(Object newItem) {

		if (newItem == null) {
			return false;
		}
		if (contains(newItem)) {
			return false;
		} else {
			resize();
			collection[elementCount] = newItem;
			elementCount++;
			return true;
		}
	}

	/**
	 * Checks if the specified object is in the set.
	 * 
	 * @param item
	 *            The object to be checked.
	 * @pre true
	 * @post true
	 * @return true if item is in the set, and false otherwise.
	 */
	public boolean contains(Object item) {

		int index = -INDEX_COUNT_ONE;

		for (int i = INDEX_COUNT_ZERO; i < elementCount && index == -INDEX_COUNT_ONE; i++) {
			if (collection[i].equals(item)){
				index = i;		
				return index != -INDEX_COUNT_ONE;
			}
		}
		return false;
	}

	/**
	 * Removes a given object from the set.
	 * 
	 * @param item
	 *            The object to be removed.
	 * @pre true
	 * @post IF @pre.contains(item) THEN NOT contains(item) ELSE the set is not
	 *       changed
	 * @return true if item was removed from the set, and false otherwise.
	 */
	public boolean remove(Object item) {

		if (item == null) {
			return false;
		}

		if (contains(item)) {
			for (int i = INDEX_COUNT_ZERO; i < collection.length; i++) {
				if (item.equals(collection[i])) {
					elementCount--;
					collection[i] = collection[elementCount];
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Creates and returns an array with all of the objects in the set.
	 * 
	 * @pre true
	 * @post Set is not changed.
	 * @return An unordered array containing all objects in the set.
	 */
	public Object[] toArray() {

		Object[] temp = new Object[elementCount];
		for (int i = INDEX_COUNT_ZERO; i < elementCount; i++) {
			temp[i] = collection[i];
		}
		return temp;
	}

	/**
	 * Removes all elements from the set.
	 * 
	 * @pre true
	 * @post size() = 0
	 */
	public void clear() {

		elementCount = ELEMENT_COUNT_ZERO;
	}

	/**
	 * Returns the number of items in the set.
	 * 
	 * @pre true
	 * @post true
	 * @return The number of objects contained in the set.
	 */
	public int size() {

		return elementCount;
	}

	/**
	 * Returns all items in the Array to a String ****************FOR BONUS
	 * MARKS********************
	 */
	@Override
	public String toString() {

		String result = "";

		for (int i = INDEX_COUNT_ZERO; i < elementCount; i++) {
			result = result + collection[i].toString();
		}
		return result;
	}

	/**
	 * Returns an iterator for this set of objects.
	 * 
	 * @pre true
	 * @post Set is not changed
	 * @return An iterator for the set of objects that points to the beginning
	 *         of the set.
	 */
	public SetIterator iterator() {

		return new SetIterator();
	}

	/*
	 * (non-Javadoc) Doubles the size of the ArraySet.
	 * 
	 * @pre true
	 * 
	 * @post the capacity of the ArraySet is doubled.
	 */
	private void resize() {

		if (elementCount >= collection.length) {
			Object[] resize = new Object[collection.length * DOUBE_CAPACITY];
			for (int i = INDEX_COUNT_ZERO; i < collection.length; i++) {
				resize[i] = collection[i];
			}
			collection = resize;
		}
	}

	/*
	 * (non-Javadoc) SetIterator provides a means for iterating over the
	 * elements of an ArraySet.
	 */
	public class SetIterator {

		private int nextIndex = INDEX_COUNT_ZERO;

		/**
		 * Checks if there are more objects in the set to iterate over.
		 * 
		 * @pre true
		 * @post true
		 * @return true if there are more objects in the set to iterate over,
		 *         false otherwise
		 */
		public boolean hasNext() {

			return nextIndex < size();
		}

		/**
		 * Returns the next object of the set the iterator walks over.
		 * 
		 * @pre hasNext() == true
		 * @post Iterator points to the next object in the set
		 * @return The object in the set the iterator was pointing to when the
		 *         method was called.
		 */
		public Object next() {

			assert hasNext();
			nextIndex++;
			return collection[nextIndex - INDEX_COUNT_ONE];
		}
	}
}