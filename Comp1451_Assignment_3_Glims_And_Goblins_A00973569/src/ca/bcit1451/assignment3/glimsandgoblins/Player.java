package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * An interface Class that stores information of Player
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class Player {

	private static final int PRIME_VALUE = 31;
	private static final int RESULT_VALUE = 1;
	private static final int DEFAULT_POSITION_X = 1;
	private static final int DEFAULT_POSITION_Y = 1;
	private static final int DEFAULT_GLIMS = 20;
	private static final char DEFAULT_ENTITY = '@';
	private static final int NUMBER_OF_GLIM_ZERO = 0;
	private static final int NUMBER_OF_GLIM_THIRTY = 30;
	private static final int WALL_BARRIER_ZERO = 0;
	private static final int WALL_BARRIER_TEN = 10;
	private int positionX;
	private int positionY;
	private int numberOfGlims;
	private char entity;

	/**
	 * Default Constructor
	 */
	public Player() {

		setPositionX(DEFAULT_POSITION_X);
		setPositionY(DEFAULT_POSITION_Y);
		setNumberOfGlims(DEFAULT_GLIMS);
		setEntity(DEFAULT_ENTITY);
	}

	/**
	 * Constructor to initialize an instance of Player
	 * 
	 * @param positionX
	 *            given for Player
	 * @param positionY
	 *            given for Player
	 * @param numberOfGlims
	 *            given for Player
	 * @param entity
	 *            given for Player
	 */
	public Player(int positionX, int positionY, int numberOfGlims, char entity) {

		setPositionX(positionX);
		setPositionY(positionY);
		setNumberOfGlims(numberOfGlims);
		setEntity(entity);

	}

	/**
	 * @return the positionX
	 */
	public int getPositionX() {

		return positionX;
	}

	/**
	 * @param positionX
	 *            the positionX to set for Player
	 */
	public void setPositionX(int positionX) {

		if (positionX > WALL_BARRIER_ZERO && positionX < WALL_BARRIER_TEN) {
			this.positionX = positionX;
		} else {
			this.positionX = DEFAULT_POSITION_X;
		}
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY() {

		return positionY;
	}

	/**
	 * @param positionY
	 *            the positionY to set for Player
	 */
	public void setPositionY(int positionY) {

		if (positionY > WALL_BARRIER_ZERO && positionY < WALL_BARRIER_TEN) {
			this.positionY = positionY;
		} else {
			this.positionY = DEFAULT_POSITION_Y;
		}
	}

	/**
	 * @return the numberOfGlims
	 */
	public int getNumberOfGlims() {

		return numberOfGlims;
	}

	/**
	 * @param numberOfGlims
	 *            the numberOfGlims to set for Player
	 */
	public void setNumberOfGlims(int numberOfGlims) {

		if (numberOfGlims > NUMBER_OF_GLIM_ZERO && numberOfGlims < NUMBER_OF_GLIM_THIRTY) {
			this.numberOfGlims = numberOfGlims;
		} else {
			this.numberOfGlims = DEFAULT_GLIMS;
		}
	}

	/**
	 * @return the entity
	 */
	public char getEntity() {

		return entity;
	}

	/**
	 * @param entity
	 *            the entity to set for Player
	 */
	public void setEntity(char entity) {

		this.entity = entity;
	}

	/**
	 * Adds a Glim to inventory
	 */
	public void addGlim() {

		numberOfGlims++;
	}

	/**
	 * Removes Glim from inventory
	 */
	public void removeGlim() {

		numberOfGlims--;
	}

	/**
	 * HashCode of each instance variable
	 */
	@Override
	public int hashCode() {
		final int prime = PRIME_VALUE;
		int result = RESULT_VALUE;
		result = prime * result + entity;
		result = prime * result + numberOfGlims;
		result = prime * result + positionX;
		result = prime * result + positionY;
		return result;
	}

	/**
	 * @param obj
	 *            other object
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Player)) {
			return false;
		}
		Player other = (Player) obj;
		if (entity != other.entity) {
			return false;
		}
		if (numberOfGlims != other.numberOfGlims) {
			return false;
		}
		if (positionX != other.positionX) {
			return false;
		}
		if (positionY != other.positionY) {
			return false;
		}
		return true;
	}

	/**
	 * @return String value of variables
	 */
	@Override
	public String toString() {
		return "Player [positionX=" + positionX + ", positionY=" + positionY + ", numberOfGlims=" + numberOfGlims
				+ ", entity=" + entity + "]";
	}

}
