package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the StillGoblin information extends Goblin Class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class StillGoblin extends Goblin {

	/**
	 * Default Constructor
	 */
	public StillGoblin() {

		super();
	}

	/**
	 * Constructor to initialize an instance of StillGoblin
	 * 
	 * @param positionX
	 *            given for StillGoblin
	 * @param positionY
	 *            given for StillGoblin
	 * @param entity
	 *            given for StillGoblin
	 */
	public StillGoblin(int positionX, int positionY, char entity) {

		super(positionX, positionY, entity);
	}

	/**
	 * An abstract method invoked within the game
	 */
	@Override
	public void act() {

		boolean moving = true;

		// Keeps goblins still
		if (moving) {
			positionX += MOVE_ZERO_STEP;
			positionY += MOVE_ZERO_STEP;
		} else {
			positionX -= MOVE_ZERO_STEP;
			positionY -= MOVE_ZERO_STEP;
		}
	}
}