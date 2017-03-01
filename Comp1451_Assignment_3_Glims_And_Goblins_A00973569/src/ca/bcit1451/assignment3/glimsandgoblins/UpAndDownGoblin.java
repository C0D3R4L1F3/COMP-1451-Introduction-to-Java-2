package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the UpAndDownGoblin information and extends Goblin Class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class UpAndDownGoblin extends Goblin {

	private boolean moving = true;

	/**
	 * Default Constructor
	 */
	public UpAndDownGoblin() {

		super();
	}

	/**
	 * Constructor to initialize an instance of UpAndDownGoblin
	 * 
	 * @param positionX
	 *            given for UpAndDownGoblin
	 * @param positionY
	 *            given for UpAndDownGoblin
	 * @param entity
	 *            given for UpAndDownGoblin
	 */
	public UpAndDownGoblin(int positionX, int positionY, char entity) {

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
		} else {
			positionX -= MOVE_ONE_STEP;
		}

		// Moves the other way once it hits a wall barrier
		if (positionX == POSITION_NINE) {
			moving = false;
		} else if (positionX == POSITION_ONE) {
			moving = true;
		}

		// Wall Barriers
		if (positionX <= WALL_BARRIER_ZERO) {
			positionX += MOVE_ONE_STEP;
		} else if (positionX >= WALL_BARRIER_TEN) {
			positionX -= MOVE_ONE_STEP;
		}
	}
}