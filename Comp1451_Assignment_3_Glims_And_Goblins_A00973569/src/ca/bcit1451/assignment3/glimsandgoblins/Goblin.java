package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the Goblin information extends Actor Class and implements
 * Monster class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class Goblin extends Actor implements Monster {

	private boolean moving = true;

	/**
	 * Default Constructor
	 */
	public Goblin() {

		super();
	}

	/**
	 * Constructor to initialize an instance of Goblin
	 * 
	 * @param positionX
	 *            given for Goblin
	 * @param positionY
	 *            given for Goblin
	 * @param entity
	 *            given for Goblin
	 */
	public Goblin(int positionX, int positionY, char entity) {

		super(positionX, positionY, entity);
	}

	/**
	 * An abstract method invoked within the game
	 */
	@Override
	public void act() {

		// Moves goblin by one step
		if (moving) {
			positionX += MOVE_ONE_STEP;
			positionY += MOVE_ONE_STEP;
		} else {
			positionX -= MOVE_ONE_STEP;
			positionY -= MOVE_ONE_STEP;
		}

		// Moves the other way once it hits a wall barrier
		if (positionX == POSITION_NINE) {
			moving = false;
		} else if (positionX == POSITION_ONE) {
			moving = true;
		}
		if (positionY == POSITION_NINE) {
			moving = false;
		} else if (positionY == POSITION_ONE) {
			moving = true;
		}

		// Wall Barriers
		if (positionX <= WALL_BARRIER_ZERO) {
			positionX += MOVE_ONE_STEP;
		} else if (positionX >= WALL_BARRIER_TEN) {
			positionX -= MOVE_ONE_STEP;
		} else if (positionY <= WALL_BARRIER_ZERO) {
			positionY += MOVE_ONE_STEP;
		} else if (positionY >= WALL_BARRIER_TEN) {
			positionY -= MOVE_ONE_STEP;
		}
	}
}