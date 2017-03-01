package ca.bcit1451.assignment3.glimsandgoblins;

import java.util.Random;

/**
 * A Class that stores the Actor's information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public abstract class Actor {

	static Random r = new Random();

	private static final int DEFAULT_POSITION_X = r.nextInt(9 - 1 + 1) + 1;
	private static final int DEFAULT_POSITION_Y = r.nextInt(9 - 1 + 1) + 1;
	private static final char DEFAULT_ENTITY = 'A';
	private static final int MOVE_ONE_STEP = 1;
	private static final int POSITION_NINE = 9;
	private static final int POSITION_ONE = 1;
	private static final int WALL_BARRIER_ZERO = 0;
	private static final int WALL_BARRIER_TEN = 10;
	private static final int PRIME_VALUE = 31;
	private static final int RESULT_VALUE = 1;

	private boolean moving = true;
	protected int positionX;
	protected int positionY;
	protected char entity;

	/**
	 * Default Constructor
	 */
	public Actor() {

		setPositionX(DEFAULT_POSITION_X);
		setPositionY(DEFAULT_POSITION_Y);
		setEntity(DEFAULT_ENTITY);
	}

	/**
	 * Constructor to initialize an instance of Actor
	 * 
	 * @param positionX
	 *            given for Actor
	 * @param positionY
	 *            given for Actor
	 * @param entity
	 *            given for Actor
	 */
	public Actor(int positionX, int positionY, char entity) {

		setPositionX(positionX);
		setPositionY(positionY);
		setEntity(entity);
	}

	/**
	 * An abstract method that each Actor contains
	 */
	abstract public void act();

	/**
	 * @return the positionX
	 */
	public int getPositionX() {

		return positionX;
	}

	/**
	 * @param positionX
	 *            the positionX to set for Actor
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
	 *            the positionY to set for Actor
	 */
	public void setPositionY(int positionY) {

		if (positionY > WALL_BARRIER_ZERO && positionY < WALL_BARRIER_TEN) {
			this.positionY = positionY;
		} else {
			this.positionY = DEFAULT_POSITION_Y;
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
	 *            the entity to set for Actor
	 */
	public void setEntity(char entity) {

		this.entity = entity;
	}

	/**
	 * Prevents collision of Actor's
	 * 
	 * @param other
	 *            instance of Actor
	 */
	public void preventCollision(Actor other) {

		// Prevents collision of Actor's
		if (entity != other.entity) {
			if (moving) {
				if (positionX != other.positionX && positionY != other.positionY && positionX != other.positionY
						&& positionY != other.positionX) {
					moving = true;
					positionX += MOVE_ONE_STEP;
					positionY -= MOVE_ONE_STEP;
				} else {
					moving = false;
					positionX -= MOVE_ONE_STEP;
					positionY += MOVE_ONE_STEP;
				}
			}
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

	/**
	 * HashCode of each instance variable
	 */
	@Override
	public int hashCode() {
		final int prime = PRIME_VALUE;
		int result = RESULT_VALUE;
		result = prime * result + entity;
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
		if (!(obj instanceof Actor)) {
			return false;
		}
		Actor other = (Actor) obj;
		if (entity != other.entity) {
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
		return "Actor [moving=" + moving + ", positionX=" + positionX + ", positionY=" + positionY + ", entity="
				+ entity + "]";
	}

}