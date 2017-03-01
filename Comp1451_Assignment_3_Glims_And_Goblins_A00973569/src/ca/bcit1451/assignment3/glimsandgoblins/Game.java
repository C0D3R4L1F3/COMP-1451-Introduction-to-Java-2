package ca.bcit1451.assignment3.glimsandgoblins;

/**
 * A Class that stores the Games logic and driver
 * 
 * @author Ronnie Manimtim
 * @version 1.0 04 Apr 16
 */
public class Game {

	private Dungeon inDungeon;

	/**
	 * Constructor to initialize Dungeon Object
	 */
	public Game() {

		inDungeon = new Dungeon();
	}

	/**
	 * Introduction of the game
	 */
	public void gameIntro() {

		System.out.println("Greetings, brave warrior!");
		System.out.println("Welcome to Glims and Goblins.");
		System.out.println(" ");
		System.out.println("The object of the game is to defeat all the Goblins in the dungeon map.");
		System.out.println("To defeat a Goblin just shine your Glim towards the Goblin to turn the Goblin to stone.");
		System.out.println(
				"Watch out for these sneaky, slippery, hopping, teleporting Goblins as they can be tricky to defeat.");
		System.out.println("To win the game defeat all the Goblins.");
		System.out.println(
				"If you want something more challenging find all the Glims and defeat all the Goblins for the BONUS WIN!");
		System.out.println(
				"But beware for every step you take you use a Glim to find your way through this dark dungeon.");
		System.out.println(
				"There are hidden Glims, teleporting Glims, and still Glims to help restore your Glim inventory.");
		System.out.println("If your Glim inventory hits 0 you will lose the game.");
		System.out.println(" ");
		System.out.println("The dungeon map below contains character entities @(H), G, and #.");
		System.out.println("The character entity H represents you, when you have more than 5 Glims in the inventory.");
		System.out
				.println("The character entity @ represents you, when you've got less than 6 glims in the inventory.");
		System.out.println("The character entity G represents Goblins that you need to defeat.");
		System.out.println("The character entity # represents Glim refills that you can add to your inventory.");
		System.out.println(" ");
		System.out.println("To move your character enter w to go up, s to go down, a to go left, and d to go right. ");
		System.out.println(" ");
		System.out.println(
				"Now get ready to defeat all the Goblins good luck brave warrior MAY THE FORCE BE WITH YOU!!!.........");
	}

	/**
	 * Creates an instance of being inside the dungeon
	 * 
	 * @throws InvalidKeyPressedException
	 *             when wrong key has been pressed
	 */
	public void inDungeon() throws InvalidKeyPressedException {

		inDungeon.createDungeon();
	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		Game newGame = new Game();
		newGame.gameIntro();
		try {
			newGame.inDungeon();
		} catch (InvalidKeyPressedException e) {
			e.printStackTrace();
		}
	}
}
