/**
 * 
 */
package ca.bcit.comp1451.finalexam.q3;

/**
 * A class for the final exam
 * 
 * @author Ronnie Manimtim
 * @version 1.0 16 Apr 2016
 */
public final class Car extends Vehicle {
	
	private static final int COMPARE_TO_VALUE_ONE = 1;
	private static final int COMPARE_TO_VALUE_ZERO = 0;
	
	/**
	 * Defualt Constructor
	 */
	public Car() {
		super();
	}

	/**
	 * Constructor to initialize Car Object
	 */
	public Car(int weightPounds) {
		super(weightPounds);
	}

	@Override
	public int compareTo(Vehicle other) {
		if (weightPounds > other.weightPounds) {
			return COMPARE_TO_VALUE_ONE;
		} else if (weightPounds < other.weightPounds) {
			return -COMPARE_TO_VALUE_ONE;
		}
		return COMPARE_TO_VALUE_ZERO;
	}
	

}
