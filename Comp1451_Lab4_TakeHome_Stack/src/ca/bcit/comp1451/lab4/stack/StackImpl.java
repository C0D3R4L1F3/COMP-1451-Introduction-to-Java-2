package ca.bcit.comp1451.lab4.stack;

/**
 * A simple Stack implementation.
 * 
 * DO NOT LOOK AT THIS FILE!
 * 
 * @author Ronnie Manimtim
 * @version 1.0 31 Jan 2016
 */
public class StackImpl implements Stack {

	private static final int INITIAL_CAPACITY = 5;
	private Object list[];

	private int size;

	/**
	 * Constructs an empty Stack of initial capacity 5.
	 * 
	 * @post size == 0
	 */
	public StackImpl() {

		list = new Object[INITIAL_CAPACITY];
		size = 0;
	}

	/**
	 * @return true if Stack is empty, else false
	 */
	public boolean isEmpty() {

		return size <= 0; // Only error that I could find changed this to less
							// than or equal to zero
	}

	/**
	 * Removes all items from the Stack
	 * 
	 * @post isEmpty() == true
	 */
	public void makeEmpty() {

		for (int i = 0; i < list.length; i++)
			list[i] = null;
		size = 0;
	}

	/**
	 * Pushes the specified object onto the top of the Stack.
	 * 
	 * @param item
	 *            The object to be inserted on top of Stack
	 * @post the specified item is at top of Stack
	 */
	public void push(Object item) {

		if (size >= list.length) {
			Object b[] = new Object[size + INITIAL_CAPACITY];
			System.arraycopy(list, 0, b, 0, size);
			list = b;
		}
		list[size++] = item;
	}

	/**
	 * Removes and returns the top item from the Stack.
	 * 
	 * @return item at the top of the Stack, or null if the Stack was empty
	 * @post item at the top of the Stack has been removed from the stack
	 */
	public Object pop() {

		return (size <= 0) ? null : list[--size];
	}

	/**
	 * Returns BUT DOES NOT REMOVE the top item in the Stack.
	 * 
	 * @return a reference to the item at the top of the Stack or null if empty
	 */
	public Object top() {

		return (size <= 0) ? null : list[size - 1];
	}

	/**
	 * @return size The number of items on the Stack.
	 */
	public int size() {

		return size;
	}

	/**
	 * Returns a String representing this Stack. The String is a comma separated
	 * list (no spaces) of the String representation of each element in the
	 * Stack, beginning from the bottom, enclosed in square brackets. For
	 * instance, a Stack containing Integers 1, 2 and 3 is represented as
	 * "[1,2,3]".
	 * 
	 * @return String representation of this Stack.
	 */
	public String toString() {

		String s = new String("[");
		for (int i = 0; i < size; i++)
			s += (i < size - 1) ? list[i] + "," : list[i];
		return s + "]";
	}
}
