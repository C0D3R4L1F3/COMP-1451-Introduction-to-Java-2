package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the LeftAndRightGoblin information extends Goblin Class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class LeftAndRightGoblin extends Goblin {

	private boolean moving = true;

	/**
	 * Default Constructor
	 */
	public LeftAndRightGoblin() {

		super();
	}

	/**
	 * Constructor to initialize an instance of LeftAndRightGoblin
	 * 
	 * @param positionX
	 *            given for LeftAndRightGoblin
	 * @param positionY
	 *            given for LeftAndRightGoblin
	 * @param entity
	 *            given for LeftAndRightGoblin
	 */
	public LeftAndRightGoblin(int positionX, int positionY, char entity) {

		super(positionX, positionY, entity);
	}

	/**
	 * An abstract method invoked within the game
	 */
	@Override
	public void act() {

		// Moves goblin by one step
		if (moving) {
			positionY += MOVE_ONE_STEP;
		} else {
			positionY -= MOVE_ONE_STEP;
		}

		// Moves the other way once it hits a wall barrier
		if (positionY == POSITION_NINE) {
			moving = false;
		} else if (positionY == POSITION_ONE) {
			moving = true;
		}

		// Wall Barriers
		if (positionY <= WALL_BARRIER_ZERO) {
			positionY += MOVE_ONE_STEP;
		} else if (positionY >= WALL_BARRIER_TEN) {
			positionY -= MOVE_ONE_STEP;
		}
	}
}