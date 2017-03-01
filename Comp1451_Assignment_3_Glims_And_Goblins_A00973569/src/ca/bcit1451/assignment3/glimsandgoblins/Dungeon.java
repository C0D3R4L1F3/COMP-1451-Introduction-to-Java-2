package ca.bcit1451.assignment3.glimsandgoblins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * A Class that stores the Dungeon and initializes the game play
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class Dungeon {

	Scanner keyboard = new Scanner(System.in);
	static Random r = new Random();

	private final int ROWHEIGHT = 11;
	private final int COLUMNWIDTH = 11;
	private static final int PLAYER_POSITION_X = 1;
	private static final int PLAYER_POSITION_Y = 1;
	private static final int NUMBER_OF_GLIM = r.nextInt(20 - 10 + 1) + 10;
	private static final int MOVE_ONE_STEP = 1;
	private static final int HAS_SIX_GLIM = 6;
	private static final int EMPTY = 0;
	private static final int ROW_ZERO = 0;
	private static final int COL_ZERO = 0;
	private static final int ROW_ONE = 1;
	private static final int COL_ONE = 1;
	private static final int WALL_BARRIER_ZERO = 0;
	private static final int WALL_BARRIER_TEN = 10;
	private static final int CHARACTER_SIZE_ONE = 1;
	private static final int CHARACTER_SIZE_THREE = 3;
	private static final int CHARACTER_SIZE_FIVE = 5;
	private static final int CHARACTER_SIZE_SEVEN = 7;
	private static final int RANDOM_NUMBER_GOBLINS = 6;
	private static final int RANDOM_VALUE_ONE = 1;
	private static final int RANDOM_VALUE_FIVE = 5;
	private static final int RANDOM_VALUE_NINE = 9;
	private static final int RANDOM_VALUE_TEN = 10;
	private static final int SLEEP_THREAD = 50;

	private char[][] dungeon;
	private ArrayList<Actor> character;
	private Player hero;
	private boolean gameloop = true;

	/**
	 * Construct to initializes instance of a dungeon and characters
	 */
	public Dungeon() {

		dungeon = new char[ROWHEIGHT][COLUMNWIDTH];
		hero = new Player(PLAYER_POSITION_X, PLAYER_POSITION_Y, NUMBER_OF_GLIM, '@');
		character = new ArrayList<Actor>();
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(new GlimCache(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE),
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE), '#'));
		character.add(
				new StillGoblin(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE,
						r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE, 'G'));
		character.add(new TeleportingGoblin(
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE,
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE, 'G'));
		character.add(new UpAndDownGoblin(
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE,
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE, 'G'));
		character.add(new LeftAndRightGoblin(
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE,
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE, 'G'));
		character.add(new Goblin(r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE,
				r.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE) + RANDOM_VALUE_ONE, 'G'));
	}

	/**
	 * Creates the dungeon and game scenarios
	 * 
	 * @throws InvalidKeyPressedException
	 *             when wrong key is pressed
	 */
	public void createDungeon() throws InvalidKeyPressedException {

		int heroX = hero.getPositionX();
		int heroY = hero.getPositionY();
		char heroEntity = hero.getEntity();

		do {

			// Initialize Dungeon
			for (int row = ROW_ZERO; row < ROWHEIGHT; row++) {
				for (int col = COL_ZERO; col < COLUMNWIDTH; col++) {
					dungeon[row][col] = '.';
				}
			}

			// Dungeon Wall Barriers
			for (int row = ROW_ZERO; row < ROWHEIGHT; row++) {
				dungeon[row][COL_ZERO] = 'X';
				dungeon[row][COLUMNWIDTH - COL_ONE] = 'X';
			}
			for (int col = COL_ZERO; col < COLUMNWIDTH; col++) {
				dungeon[ROW_ZERO][col] = 'X';
				dungeon[ROWHEIGHT - ROW_ONE][col] = 'X';
			}

			// Player/Hero
			dungeon[heroX][heroY] = heroEntity;
			// Player/Hero entity switched to 'H' if has more then 5 Glims
			if (hero.getNumberOfGlims() >= HAS_SIX_GLIM) {
				dungeon[heroX][heroY] = 'H';
				System.out.println(
						"--------------------------------------------------------------------------------------");
				System.out.println("You've got more than 5 Glims your entity is now 'H' Master of Glims Holder");
				System.out.println(
						"--------------------------------------------------------------------------------------");
				// Player/Hero entity switched to '@' if player has only one
				// Glim to remind player only 5 Glims left
			} else {
				System.out.println(
						"--------------------------------------------------------------------------------------");
				System.out.println(" Warning!!! You've got less than 5 Glims your entity is now '@' mini Glim Holder");
				System.out.println(
						"--------------------------------------------------------------------------------------");
			}

			// Glim Scenario 1
			int random = RANDOM_VALUE_FIVE + (int) (Math.random() * RANDOM_VALUE_TEN);
			// Random Appearance Of Glims
			if (character.size() == random) {
				System.out.println("**********GLIM HAS APPEARED QUICKLY GRAB THEM BEFORE THEY DISAPPEAR!**********");
				for (Actor currentGlim : character) {
					if (currentGlim instanceof GlimCache) {
						GlimCache glim = (GlimCache) currentGlim;
						int glimX = glim.positionX;
						int glimY = glim.positionY;
						dungeon[glimX][glimY] = glim.entity;
					}
				}
				// Glim Scenario 2
			} else if (character.size() == CHARACTER_SIZE_SEVEN) {
				System.out.println(
						"*******GLIM HAS APPEARED QUICKLY GRAB THEM BEFORE THEY TELEPORT AND DISAPPEAR!*******");
				for (Actor currentGlim : character) {
					if (currentGlim instanceof GlimCache) {
						GlimCache glim = (GlimCache) currentGlim;
						// Random Location(Teleporting) Glims
						Random rand = new Random();
						dungeon[rand.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE)
								+ RANDOM_VALUE_ONE][rand
										.nextInt(RANDOM_VALUE_NINE - RANDOM_VALUE_ONE + RANDOM_VALUE_ONE)
										+ RANDOM_VALUE_ONE] = glim.entity;
					}
				}
				// Glim Scenario 3
			} else if (character.size() == CHARACTER_SIZE_FIVE) {
				System.out.println("**********GLIM HAS APPEARED QUICKLY GRAB THEM BEFORE THEY DISAPPEAR!**********");
				for (Actor currentGlim : character) {
					if (currentGlim instanceof GlimCache) {
						GlimCache glim = (GlimCache) currentGlim;
						int glimX = glim.positionX;
						int glimY = glim.positionY;
						dungeon[glimX][glimY] = glim.entity;
					}
				}
				// Glim Scenario 4
			} else if (character.size() <= CHARACTER_SIZE_THREE && character.size() > CHARACTER_SIZE_ONE) {
				System.out.println("**********GLIM HAS APPEARED!**********");
				for (Actor currentGlim : character) {
					if (currentGlim instanceof GlimCache) {
						GlimCache glim = (GlimCache) currentGlim;
						int glimX = glim.positionX;
						int glimY = glim.positionY;
						dungeon[glimX][glimY] = glim.entity;
					}
				}
			}

			// Goblins Random Spawning of Goblins
			int goblins = EMPTY;
			while (goblins < RANDOM_NUMBER_GOBLINS) {
				for (Actor currentGoblin : character) {
					if (currentGoblin instanceof Monster) {
						Goblin goblin = (Goblin) currentGoblin;
						dungeon[goblin.positionX][goblin.positionY] = goblin.entity;
						goblins++;
					}
				}
			}

			// In Dungeon
			for (int row = ROW_ZERO; row < ROWHEIGHT; row++) {
				for (int col = COL_ZERO; col < COLUMNWIDTH; col++) {
					System.out.print(dungeon[row][col]);
				}
				System.out.println("");
			}

			// Run Into A Glim
			for (Iterator<Actor> its = character.iterator(); its.hasNext();) {
				Actor currentGlim = its.next();
				if (currentGlim instanceof GlimCache) {
					GlimCache glim = (GlimCache) currentGlim;
					int glimX = glim.positionX;
					int glimY = glim.positionY;
					if (heroX == glimX && heroY == glimY || glimX == heroY && glimY == heroX) {
						System.out.println("You've found a Glim take it with you and turn the Goblins to stone!");
						hero.addGlim();
						its.remove();
					}
				}
			}

			// Run Into A Goblin
			for (Iterator<Actor> it = character.iterator(); it.hasNext();) {
				Actor currentGoblin = it.next();
				if (currentGoblin instanceof Monster) {
					Goblin goblin = (Goblin) currentGoblin;
					int heroHasGlims = hero.getNumberOfGlims();
					int goblinX = goblin.positionX;
					int goblinY = goblin.positionY;
					if (heroX == goblinX && heroY == goblinY || goblinX == heroY && goblinY == heroX) {
						if (heroHasGlims > EMPTY) {
							it.remove();
						}
						System.out.println(
								"You raise your Glim to shine on the Goblin before you and turn him to stone.");
					}
				}
			}

			// GAME OVER 1 SCENARIO
			if (hero.getNumberOfGlims() == EMPTY) {
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println("******************** Y O U  L O S E *******************");
				System.out.println("************** YOU'VE RUN OUT OF GLIMS!!! *************");
				System.out.println("********************** GAME OVER **********************");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				gameloop = false;
			}

			// GAME OVER SCENARIO 2
			for (Iterator<Actor> it = character.iterator(); it.hasNext();) {
				Actor currentGlim = it.next();
				if (currentGlim instanceof GlimCache) {
					if (it.hasNext() == false) {
						System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						System.out.println("**************** Y O U   W I N ! ! ! ****************");
						System.out.println("CONGRATULATIONS!!! YOU'VE DEFEATED ALL THE GOBLINS!!!");
						System.out.println("********************* GAME OVER *********************");
						System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						gameloop = false;
					}
				}
			}

			// GAME OVER SCENARIO 3
			if (character.isEmpty()) {
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println("**************************** B O N U S  W I N ! ! ! *****************************");
				System.out.println("******************** Y O U   B R A V E   W A R R I O R ! ! ! ********************");
				System.out.println("CONGRATULATIONS!!! YOU'VE COLLECTED ALL THE GLIMS AND DEFEATED ALL THE GOBLINS!!!");
				System.out.println("*********************************** GAME OVER ***********************************");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				gameloop = false;
			}

			// Dash Board
			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.println("Glim Inventory: " + hero.getNumberOfGlims() + " Glims left!");
			System.out.println("Enter a direction: w = up, a = left, s = down, d = right");
			System.out
					.println("--------------------------------------------------------------------------------------");

			// Keyboard Controls Throws InvalidKeyPressed Exception
			try {
				String move = keyboard.nextLine();
				switch (move) {
				case "w":
					heroX -= MOVE_ONE_STEP;
					hero.removeGlim();
					break;
				case "a":
					heroY -= MOVE_ONE_STEP;
					hero.removeGlim();
					break;
				case "s":
					heroX += MOVE_ONE_STEP;
					hero.removeGlim();
					break;
				case "d":
					heroY += MOVE_ONE_STEP;
					hero.removeGlim();
					break;
				default:
					throw new InvalidKeyPressedException();
				}
			} catch (InvalidKeyPressedException e) {
				System.out.println(
						"--------------------------------------------------------------------------------------");
				System.out.println("Warning!!! Warning!!! Warning!!! Warning!!! Warning!!! Warning!!! Warning!!!");
				System.out.println("Invalid Key Pressed!!! Enter a direction: w = up, a = left, s = down, d = right");
			}

			// Wall Barriers
			if (heroX <= WALL_BARRIER_ZERO) {
				heroX += MOVE_ONE_STEP;
			} else if (heroX >= WALL_BARRIER_TEN) {
				heroX -= MOVE_ONE_STEP;
			} else if (heroY <= WALL_BARRIER_ZERO) {
				heroY += MOVE_ONE_STEP;
			} else if (heroY >= WALL_BARRIER_TEN) {
				heroY -= MOVE_ONE_STEP;
			}

			// Prevent Collision and Overlapping of Actor's
			for (Actor currentActor : character) {
				if (currentActor instanceof Actor) {
					Actor actor = (Actor) currentActor;
					actor.preventCollision(actor);
				}
			}

			// Polymorphism Invoking The abstract act(); Method

			for (Actor currentGoblin : character) {
				if (currentGoblin instanceof Monster) {
					Goblin goblin = (Goblin) currentGoblin;
					goblin.act();// Polymorphism
				}
			}

		} while (gameloop == true);

		// Reduce game to lower amount of CPU Memory by 50%
		while (true) {
			try {
				Thread.sleep(SLEEP_THREAD);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}