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
public abstract class Vehicle implements Comparable<Vehicle> {

	private static final int DEFAULT_WEIGHT_POUNDS = 0;
	private static final int COMPARE_TO_VALUE_ONE = 1;
	private static final int COMPARE_TO_VALUE_ZERO = 0;
	private static final int PRIME_VALUE = 31;
	private static final int RESULT_VALUE = 1;
	protected int weightPounds;
	

	/**
	 * Default Constructor
	 */
	public Vehicle() {
		setWeightPounds(DEFAULT_WEIGHT_POUNDS);
	}

	/**
	 * Constructor to initialize Vehicle object
	 */
	public Vehicle(int weightPounds) {
		this.weightPounds = weightPounds;
	}

	/**
	 * @return the weightPounds
	 */
	public int getWeightPounds() {
		return weightPounds;
	}

	/**
	 * @param weightPounds
	 *            the weightPounds to set
	 */
	public void setWeightPounds(int weightPounds) {

		if (weightPounds < DEFAULT_WEIGHT_POUNDS) {
			this.weightPounds = DEFAULT_WEIGHT_POUNDS;
		} else {
			this.weightPounds = weightPounds;
		}
	}

	public int compartTo(Vehicle other) {

		if (weightPounds > other.weightPounds) {
			return COMPARE_TO_VALUE_ONE;
		} else if (weightPounds < other.weightPounds) {
			return -COMPARE_TO_VALUE_ONE;
		}
		return COMPARE_TO_VALUE_ZERO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [weightPounds=" + weightPounds + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = PRIME_VALUE;
		int result = RESULT_VALUE;
		result = prime * result + weightPounds;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Vehicle)) {
			return false;
		}
		Vehicle other = (Vehicle) obj;
		if (weightPounds != other.weightPounds) {
			return false;
		}
		return true;
	}

}
