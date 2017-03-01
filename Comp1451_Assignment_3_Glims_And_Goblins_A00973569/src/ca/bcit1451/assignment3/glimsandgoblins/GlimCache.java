package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the GlimCache information extends Actor Class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class GlimCache extends Actor {

	/**
	 * Default Constructor
	 */
	public GlimCache() {

		super();
	}

	/**
	 * Constructor to initialize an instance of GlimCache
	 * 
	 * @param positionX
	 *            given for GlimCache
	 * @param positionY
	 *            given for GlimCache
	 * @param entity
	 *            given for GlimCache
	 */
	public GlimCache(int positionX, int positionY, char entity) {

		super(positionX, positionY, entity);
	}

	/**
	 * An abstract method that is invoked within the game
	 */
	@Override
	public void act() {

	}
}