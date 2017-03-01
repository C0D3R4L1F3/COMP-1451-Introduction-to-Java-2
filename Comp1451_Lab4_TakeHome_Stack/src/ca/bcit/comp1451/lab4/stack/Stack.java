package ca.bcit.comp1451.lab4.stack;

/**
 * A simple Stack.
 * 
 * @author Your name here
 * @version 1.0
 */
public interface Stack {

	/**
	 * @return true if Stack is empty, else false
	 */
	public boolean isEmpty();

	/**
	 * Removes all items from the Stack
	 * 
	 * @post isEmpty() == true
	 */
	public void makeEmpty();

	/**
	 * Pushes the specified object onto the top of the Stack.
	 * 
	 * @param item
	 *            The object to be inserted on top of Stack
	 * @post the specified item is at top of Stack
	 */
	public void push(Object item);

	/**
	 * Removes and returns the top item from the Stack.
	 * 
	 * @return item at the top of the Stack, or null if the Stack was empty
	 * @post item at the top of the Stack has been removed from the stack
	 */
	public Object pop();

	/**
	 * Returns BUT DOES NOT REMOVE the top item in the Stack.
	 * 
	 * @return a reference to the item at the top of the Stack or null if empty
	 */
	public Object top();

	/**
	 * @return size The number of items on the Stack.
	 */
	public int size();

	/**
	 * Returns a String representing this Stack. The String is a comma separated
	 * list (no spaces) of the String representation of each element in the
	 * Stack, beginning from the bottom, enclosed in square brackets. For
	 * instance, a Stack containing Integers 1, 2 and 3 is represented as
	 * "[1,2,3]".
	 * 
	 * @return String representation of this Stack.
	 */
	public String toString();
}
