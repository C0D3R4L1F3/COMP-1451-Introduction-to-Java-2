/**
 * A Class that stores information on a Pet
 * 
 * @author Ronnie Manimtim
 * @version 1.0 27 Feb 2016
 */
public class Pet {

	private static final int DEFAULT_PRIME = 31;
	private static final int DEFAULT_RESULT = 1;
	private static final int DEFAULT_HASH = 0;
	private static final int DEFAULT_HASH_VALUE = 32;
	private static final String DEFAULT_BREED = "Enter the breed of the dog";
	private static final double DEFAULT_WEIGHT_IN_KG = 0.0;
	private static final int DEFAULT_AGE = 0;
	private static final String DEFAULT_NAME = "Enter the name of the dog";

	protected String breed;
	protected double weightInKg;
	protected int ageInYears;
	protected String name;

	/**
	 * Default Constructor
	 */
	public Pet() {

		setBreed(DEFAULT_BREED);
		setWeightInKg(DEFAULT_WEIGHT_IN_KG);
		setAgeInYears(DEFAULT_AGE);
		setName(DEFAULT_NAME);
	}

	/**
	 * Constructor to initialize a Pet object
	 * 
	 * @param breed
	 *            given for pet
	 * @param weightInKg
	 *            given for pet
	 * @param ageInYears
	 *            given for pet
	 * @param name
	 *            given for pet
	 */
	public Pet(String breed, double weightInKg, int ageInYears, String name) {

		this.breed = breed;
		this.weightInKg = weightInKg;
		this.ageInYears = ageInYears;
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	protected String getBreed() {

		return breed;
	}

	/**
	 * @param breed
	 *            the breed to set for pet
	 */
	protected void setBreed(String breed) {

		if (breed.equals(null)) {
			this.breed = DEFAULT_BREED;
		} else {
			this.breed = breed;
		}
	}

	/**
	 * @return the weightInKg
	 */
	protected double getWeightInKg() {

		return weightInKg;
	}

	/**
	 * @param weightInKg
	 *            the weightInKg to set for pet
	 */
	protected void setWeightInKg(double weightInKg) {

		if (weightInKg < DEFAULT_WEIGHT_IN_KG) {
			this.weightInKg = DEFAULT_WEIGHT_IN_KG;
		} else {
			this.weightInKg = weightInKg;
		}
	}

	/**
	 * @return the ageInYears
	 */
	protected int getAgeInYears() {

		return ageInYears;
	}

	/**
	 * @param ageInYears
	 *            the ageInYears to set for pet
	 */
	protected void setAgeInYears(int ageInYears) {

		if (ageInYears < DEFAULT_AGE) {
			this.ageInYears = DEFAULT_AGE;
		} else {
			this.ageInYears = ageInYears;
		}
	}

	/**
	 * @return the name
	 */
	protected String getName() {

		return name;
	}

	/**
	 * @param name
	 *            the name to set pet
	 */
	protected void setName(String name) {

		if (name.equals(null)) {
			this.name = DEFAULT_NAME;
		} else {
			this.name = name;
		}
	}

	/**
	 * @return a String description of the pet
	 */
	@Override
	public String toString() {

		String result = "Pet Name: " + getName() + "\n";
		result += "Breed: " + getBreed() + "\n";
		result += "Weight: " + getWeightInKg() + " Kg" + "\n";
		result += "Age: " + getAgeInYears() + "\n";
		result += "HashCode: " + hashCode();
		return result;
	}

	/**
	 * @return results in hashCode() int for pet variables
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME;
		int result = DEFAULT_RESULT;
		result = prime * result + ageInYears;
		result = prime * result + ((breed == null) ? DEFAULT_HASH : breed.hashCode());
		result = prime * result + ((name == null) ? DEFAULT_HASH : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weightInKg);
		result = prime * result + (int) (temp ^ (temp >>> DEFAULT_HASH_VALUE));
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pet)) {
			return false;
		}
		Pet other = (Pet) obj;
		if (ageInYears != other.ageInYears) {
			return false;
		}
		if (breed == null) {
			if (other.breed != null) {
				return false;
			}
		} else if (!breed.equals(other.breed)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(weightInKg) != Double.doubleToLongBits(other.weightInKg)) {
			return false;
		}
		return true;
	}
}
