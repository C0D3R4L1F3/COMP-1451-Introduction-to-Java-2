package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * An interface Class that stores information of Actors
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public interface Monster {

	public static final int MOVE_ZERO_STEP = 0;
	public static final int MOVE_ONE_STEP = 1;
	public static final int POSITION_NINE = 9;
	public static final int POSITION_ONE = 1;
	public static final int WALL_BARRIER_ZERO = 0;
	public static final int WALL_BARRIER_TEN = 10;

	/**
	 * An abstract method that each Goblin contains some will be able to
	 * teleport, move up and down, move left and right, move diagonally, or just
	 * sit still
	 */
	abstract public void act();

	/**
	 * @return the positionX
	 */
	public int getPositionX();

	/**
	 * @param positionX
	 *            the positionX to set for Actor
	 */
	public void setPositionX(int positionX);

	/**
	 * @return the positionY
	 */
	public int getPositionY();

	/**
	 * @param positionY
	 *            the positionY to set for Actor
	 */
	public void setPositionY(int positionY);

	/**
	 * @return the entity
	 */
	public char getEntity();

	/**
	 * @param entity
	 *            the entity to set for Actor
	 */
	public void setEntity(char entity);
}