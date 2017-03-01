/**
 * A Class that stores information a Dog
 * 
 * @author Ronnie Manimtim
 * @version 1.0 27 Feb 2016
 */
public class Dog extends Pet {

	private static final int DEFAULT_PRIME = 31;
	private static final int DEFAULT_HASH_VALUE = 1231;
	private static final int DEFAULT_HASH_VALUE_TWO = 1237;

	private boolean walks;

	/**
	 * Default Constructor
	 */
	public Dog() {

		super();
		setWalks(walks);
	}

	/**
	 * Constructor to initialize a Dog object
	 * 
	 * @param walksYN
	 *            true or false if dog likes to walk
	 * @param breed
	 *            give for dog
	 * @param weightInKg
	 *            give for dog
	 * @param ageInYears
	 *            give for dog
	 * @param name
	 *            give for dog
	 */
	public Dog(String breed, double weightInKg, int ageInYears, String name, boolean walksYN) {

		super(breed, weightInKg, ageInYears, name);
		this.walks = walksYN;
	}

	/**
	 * @return the walks
	 */
	public boolean isWalks() {

		return walks;
	}

	/**
	 * @param walks
	 *            the walks to set for dog true or false
	 */
	public void setWalks(boolean walksYN) {

		this.walks = walksYN;
	}

	/**
	 * @return a String description of the dog
	 */
	@Override
	public String toString() {

		String result = "Dog Name: " + getName() + "\n";
		result += "Breed: " + getBreed() + "\n";
		result += "Weight: " + getWeightInKg() + " Kg" + "\n";
		result += "Age: " + getAgeInYears() + "\n";
		result += "Likes walks: " + isWalks() + "\n";
		result += "HashCode: " + hashCode();
		return result;
	}

	/**
	 * @return results in hashCode() int for dog variables
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME;
		int result = super.hashCode();
		result = prime * result + (walks ? DEFAULT_HASH_VALUE : DEFAULT_HASH_VALUE_TWO);
		return result;
	}

	/**
	 * @return true if pet objects equal to each other otherwise false
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Dog)) {
			return false;
		}
		Dog other = (Dog) obj;
		if (walks != other.walks) {
			return false;
		}
		return true;
	}
}
