package ca.bcit1451.assignment3.glimsandgoblins;

import java.util.Random;

/**
 * A Class that stores the TeleportingGoblin information extends Goblin Class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class TeleportingGoblin extends Goblin {

	/**
	 * Default Constructor
	 */
	public TeleportingGoblin() {

		super();
	}

	/**
	 * Constructor to initialize an instance of TeleportingGoblin
	 * 
	 * @param positionX
	 *            given for TeleportingGoblin
	 * @param positionY
	 *            given for TeleportingGoblin
	 * @param entity
	 *            given for TeleportingGoblin
	 */
	public TeleportingGoblin(int positionX, int positionY, char entity) {

		super(positionX, positionY, entity);
	}

	/**
	 * An abstract method invoked within the game
	 */
	@Override
	public void act() {

		Random rand = new Random();

		// Moves goblin by teleporting to random location
		positionX = rand.nextInt(POSITION_NINE - POSITION_ONE + MOVE_ONE_STEP) + MOVE_ONE_STEP;
		positionY = rand.nextInt(POSITION_NINE - POSITION_ONE + MOVE_ONE_STEP) + MOVE_ONE_STEP;
	}
}