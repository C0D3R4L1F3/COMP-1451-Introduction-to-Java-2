/**
 * A Class that stores information a Cat
 * 
 * @author Ronnie Manimtim
 * @version 1.0 27 Feb 2016
 */
public class Cat extends Pet {

	private static final int DEFAULT_PRIME = 31;
	private static final int DEFAULT_HASH_VALUE = 1231;
	private static final int DEFAULT_HASH_VALUE_TWO = 1237;

	private boolean outdoorCat;
	private boolean declawed;

	/**
	 * Default Constructor
	 */
	public Cat() {

		super();
		setOutdoorCat(outdoorCat);
		setDeclawed(declawed);
	}

	/**
	 * Constructor to initialize a cat object
	 * 
	 * @param outdoorCatYN
	 *            true or false if cat is an outdoor cat
	 * @param declawedYN
	 *            true if false if cat is declawed
	 * @param breed
	 *            give for cat
	 * @param weightInKg
	 *            give for cat
	 * @param ageInYears
	 *            give for cat
	 * @param name
	 *            give for cat
	 */
	public Cat(String breed, double weightInKg, int ageInYears, String name, boolean outdoorCatYN, boolean declawedYN) {

		super(breed, weightInKg, ageInYears, name);
		this.outdoorCat = outdoorCatYN;
		this.declawed = declawedYN;
	}

	/**
	 * @return the outdoorCat
	 */
	public boolean isOutdoorCat() {

		return outdoorCat;
	}

	/**
	 * @param outdoorCat
	 *            the outdoorCat to set for cat true or false
	 */
	public void setOutdoorCat(boolean outdoorCatYN) {

		this.outdoorCat = outdoorCatYN;
	}

	/**
	 * @return the declawed
	 */
	public boolean isDeclawed() {

		return declawed;
	}

	/**
	 * @param declawed
	 *            the declawed to set for cat true or false
	 */
	public void setDeclawed(boolean declawedYN) {

		this.declawed = declawedYN;
	}

	/**
	 * @return a String description of the cat
	 */
	@Override
	public String toString() {

		String result = "Cat Name: " + getName() + "\n";
		result += "Breed: " + getBreed() + "\n";
		result += "Weight: " + getWeightInKg() + " Kg" + "\n";
		result += "Age: " + getAgeInYears() + "\n";
		result += "Declawed: " + isDeclawed() + "\n";
		result += "Outdoor cat: " + isOutdoorCat() + "\n";
		result += "HashCode: " + hashCode();
		return result;
	}

	/**
	 * @return results in hashCode() int for cat variables
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME;
		int result = super.hashCode();
		result = prime * result + (declawed ? DEFAULT_HASH_VALUE : DEFAULT_HASH_VALUE_TWO);
		result = prime * result + (outdoorCat ? DEFAULT_HASH_VALUE : DEFAULT_HASH_VALUE_TWO);
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
		if (!(obj instanceof Cat)) {
			return false;
		}
		Cat other = (Cat) obj;
		if (declawed != other.declawed) {
			return false;
		}
		if (outdoorCat != other.outdoorCat) {
			return false;
		}
		return true;
	}
}
