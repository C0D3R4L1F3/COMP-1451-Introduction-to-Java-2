package ca.bcit.comp1451.takehome.lab8;

/**
 * A Class that stores Hockey Players information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 12 Mar 2015
 */
public class HockeyPlayer implements Comparable<HockeyPlayer> {

	private static final int DEFAULT_YEAR_BORN = 0;
	private static final int DEFAULT_GOAL_SCORED = 0;
	private static final String DEFAULT_LAST_NAME = "Enter Last Name";
	private static final int COMPARE_TO_ONE = 1;
	private static final int COMPARE_TO_ONE_NEGATIVE = -1;
	private static final int COMPARE_TO_ZERO = 0;
	private static final int PRIME_VALUE = 31;
	private static final int HASH_CODE_VALUE_ONE = 1;
	private static final int HASH_CODE_VALUE_ZERO = 0;
	private static final int GOALS_SCORED_DIFFERENCE_TEN = 10;

	private int yearBorn;
	private int goalScored;
	private String lastName;

	/**
	 * Default Constructor
	 */
	public HockeyPlayer() {

		this.lastName = DEFAULT_LAST_NAME;
		this.yearBorn = DEFAULT_YEAR_BORN;
		this.goalScored = DEFAULT_GOAL_SCORED;
	}

	/**
	 * Constructor to initialize a HOckeyPlayer object
	 * 
	 * @param lastName
	 *            given
	 * @param yearBorn
	 *            given
	 * @param goalScored
	 *            given
	 */
	public HockeyPlayer(String lastName, int yearBorn, int goalScored) {

		this.lastName = lastName;
		this.yearBorn = yearBorn;
		this.goalScored = goalScored;
	}

	/**
	 * @return the yearBorn
	 */
	public int getYearBorn() {

		return yearBorn;
	}

	/**
	 * If a value less than the 0 is entered then default value will display
	 * 
	 * @param yearBorn
	 *            the yearBorn to set for HockeyPlayer
	 */
	public void setYearBorn(int yearBorn) {

		if (yearBorn < DEFAULT_YEAR_BORN) {
			this.yearBorn = DEFAULT_YEAR_BORN;
		} else {
			this.yearBorn = yearBorn;
		}
	}

	/**
	 * @return the goalScored
	 */
	public int getGoalScored() {

		return goalScored;
	}

	/**
	 * If a value less than the 0 is entered then default value will display
	 * 
	 * @param goalScored
	 *            the goalScored to set for HockeyPlayer
	 */
	public void setGoalScored(int goalScored) {

		if (goalScored < DEFAULT_GOAL_SCORED) {
			this.goalScored = DEFAULT_GOAL_SCORED;
		} else {
			this.goalScored = goalScored;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * If a null value is entered than default value will display
	 * 
	 * @param lastName
	 *            the lastName to set for HockeyPlayer
	 */
	public void setLastName(String lastName) {

		if (lastName.equals(null)) {
			this.lastName = DEFAULT_LAST_NAME;
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * Compares the HockeyPlayers
	 * 
	 * @param other
	 *            HockeyPlayer to compare to
	 * @return the larger goal scorer
	 */
	@Override
	public int compareTo(HockeyPlayer other) {

		if (getGoalScored() > other.getGoalScored()) {
			return COMPARE_TO_ONE;
		} else if (getGoalScored() < other.getGoalScored()) {
			return COMPARE_TO_ONE_NEGATIVE;
		} else {
			return COMPARE_TO_ZERO;
		}
	}

	/**
	 * @return hashCode() value of the variables
	 */
	@Override
	public int hashCode() {

		final int prime = PRIME_VALUE;
		int result = HASH_CODE_VALUE_ONE;
		result = prime * result + goalScored;
		result = prime * result + ((lastName == null) ? HASH_CODE_VALUE_ZERO : lastName.hashCode());
		result = prime * result + yearBorn;
		return result;
	}

	/**
	 * If goals are within 10 goals of each other than HockeyPlayers are equal
	 * otherwise false
	 * 
	 * @param obj
	 *            the other HockeyPlayer to compare to
	 * @return true if they are equal otherwise false
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof HockeyPlayer)) {
			return false;
		}
		HockeyPlayer other = (HockeyPlayer) obj;
		int goalScoredDifference = Math.abs(goalScored - ((HockeyPlayer) obj).getGoalScored());
		if (goalScoredDifference <= GOALS_SCORED_DIFFERENCE_TEN
				&& goalScoredDifference >= -GOALS_SCORED_DIFFERENCE_TEN) {
			return true;
		}
		if (goalScoredDifference != GOALS_SCORED_DIFFERENCE_TEN) {
			return false;
		}

		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (yearBorn != other.yearBorn) {
			return false;
		}
		return true;
	}

	/**
	 * @return a toString() description of the HockeyPlayer
	 */
	@Override
	public String toString() {

		return "HockeyPlayer [Year Born: " + yearBorn + ", Goal Scored: " + goalScored + ", Last Name: " + lastName
				+ "]";
	}
}