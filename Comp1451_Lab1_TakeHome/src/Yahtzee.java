
/**
 * @author Ronnie Manimtim
 * @version 5.0 13 Jan 2016
 */
import java.util.*;

public class Yahtzee {
	private static final int NUMBER_OF_ROUNDS = 8;
	private static final int ZERO_ROUNDS = 0;
	private static final int NUMBER_OF_DICE = 5;
	private static final int NUM_REROLLS = 2;
	private static final int ZERO_REROLLS = 0;
	private static final int RANDOM_VALUE_ONE = 1;
	private static final int RANDOM_VALUE_SIX = 6;
	private static final int THREE_DICES = 3;
	private static final int TWO_DICES = 4;
	private static final int ZERO_DICES = 0;
	private static int DEFAULT_SCORE_VALUE = 0;
	private static int YAHTZEE_SCORE_VALUE = 50;
	private static int DEFAULT_TOKENIZER_VALUE = 0;
	private static int DICE_VALUE_ZERO = 0;
	private static int DICE_VALUE_ONE = 1;
	private static int DICE_VALUE_TWO = 2;
	private static int FOUR_OF_A_KIND_VALUE = 4;
	private static int DEFAULT_SUM_VALUE = 0;

	/**
	 * @param args
	 *            start the game Yahtzee and scoring for 8 rounds
	 */
	public static void main(String[] args) {
		int score = DEFAULT_SCORE_VALUE;
		int[] dice = new int[NUMBER_OF_DICE];
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner keyboard2 = new Scanner(System.in);
		for (int a = ZERO_ROUNDS; a < NUMBER_OF_ROUNDS; a++) {
			dice = rollDice();
			System.out.println(diceToString(dice));
			for (int b = ZERO_REROLLS; b < NUM_REROLLS; b++) {
				System.out.print("Do you want to re-roll (Y/N): ");
				char c = keyboard.next().toLowerCase().charAt(0);
				if (c == 'y') {
					System.out.print("Which dice do you want to reroll: ");
					String s = keyboard2.nextLine();
					rollDice(convert(s), dice);
					System.out.println(diceToString(dice));
				} else if (c == 'n') {
					score = score + scoreDice(dice);
					break;
				}
				score = score + scoreDice(dice);
			}
			System.out.println("You scored " + score + " points this game.");
		}
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return dice roll scores
	 */
	public static int scoreDice(int[] dice) {
		int score = DEFAULT_SCORE_VALUE;
		score = ScoreYahtzee(dice);
		if (score > DEFAULT_SCORE_VALUE) {
			System.out.println("You got Yahtzee.  Your score " + score + " points on this round!");
			return score;
		}
		score = scoreFourOfAKind(dice);
		if (score > DEFAULT_SCORE_VALUE) {
			System.out.println("You got Four of a Kind.  Your score" + score + " points on this round!");
			return score;
		}
		score = scoreThreeOfAKind(dice);
		if (score > DEFAULT_SCORE_VALUE) {
			System.out.println("You got Three of a Kind.  Your score " + score + " points on this round!");
			return score;
		}
		score = scoreTwoOfAKind(dice);
		if (score > DEFAULT_SCORE_VALUE) {
			System.out.println("You got Two of a Kind.  Your score " + score + " points on this round!");
			return score;
		}
		score = scoreChance(dice);
		if (score > DEFAULT_SCORE_VALUE) {
			System.out.println("You got a chance.  Your score " + score + " points on this round!");
			return score;
		}
		System.out.println("You did not get any points on this round.");
		return score;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the outcome of the dice roll
	 */
	public static String diceToString(int[] dice) {
		String outcome = "Your dice are: ";
		for (int a : dice) {
			outcome += a + " ";
		}
		return outcome;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return Yahtzee score
	 */
	public static int ScoreYahtzee(int[] dice) {
		if (isYahtzee(dice)) {
			return YAHTZEE_SCORE_VALUE;
		} else {
			return DEFAULT_SCORE_VALUE;
		}
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return true if it is Yahtzee outcome; otherwise false
	 */
	public static boolean isYahtzee(int[] dice) {
		for (int a : dice) {
			if (a != dice[DICE_VALUE_ZERO]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the dice value
	 */
	public static int[] valueSort(int[] dice) {
		for (int a = ZERO_DICES; a < dice.length - DICE_VALUE_ONE; a++) {
			for (int b = ZERO_DICES; b < dice.length - DICE_VALUE_ONE; b++) {
				if (dice[b] > dice[b + DICE_VALUE_ONE]) {
					int temp = dice[b];
					dice[b] = dice[b + DICE_VALUE_ONE];
					dice[b + DICE_VALUE_ONE] = temp;
				}
			}
		}
		return dice;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the score for two of a kind
	 */
	public static int scoreTwoOfAKind(int[] dice) {
		dice = valueSort(dice);
		for (int a = ZERO_DICES; a < TWO_DICES; a++) {
			if (dice[a] == dice[a + DICE_VALUE_ONE] && dice[a + DICE_VALUE_ONE] == dice[a + DICE_VALUE_ONE]) {
				return sumAllDice(dice);
			}
		}
		return DEFAULT_SCORE_VALUE;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the score for three of a kind
	 */
	public static int scoreThreeOfAKind(int[] dice) {
		dice = valueSort(dice);
		for (int a = ZERO_DICES; a < THREE_DICES; a++) {
			if (dice[a] == dice[a + DICE_VALUE_ONE] && dice[a + DICE_VALUE_ONE] == dice[a + DICE_VALUE_TWO]) {
				return sumAllDice(dice);
			}
		}
		return DEFAULT_SCORE_VALUE;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the score for four of a kind
	 */
	public static int scoreFourOfAKind(int[] dice) {
		for (int a = ZERO_DICES; a < dice.length; a++) {
			int score = DEFAULT_SCORE_VALUE;
			for (int b = ZERO_DICES; b < dice.length; b++) {
				if (dice[a] == dice[b]) {
					score++;
				}
			}
			if (score == FOUR_OF_A_KIND_VALUE) {
				return sumAllDice(dice);
			} else {
				score = DEFAULT_SCORE_VALUE;
			}
		}
		return DEFAULT_SCORE_VALUE;
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the score for chance
	 */
	public static int scoreChance(int[] dice) {
		return sumAllDice(dice);
	}

	/**
	 * @param dice
	 *            the dice roll
	 * @return the sum of all five dices
	 */
	public static int sumAllDice(int[] dice) {
		int sum = DEFAULT_SUM_VALUE;
		for (int a = ZERO_DICES; a < dice.length; a++) {
			sum = sum + dice[a];
		}
		return sum;
	}

	/**
	 * @return the roll of the dice
	 */
	public static int[] rollDice() {
		int[] diceRoll = new int[NUMBER_OF_DICE];
		for (int a = ZERO_DICES; a < NUMBER_OF_DICE; a++) {
			diceRoll[a] = getRandomDieValue();
		}
		return diceRoll;
	}

	/**
	 * @param diceToChange
	 *            choose which dices to roll
	 * @param dice
	 *            the dice roll
	 */
	public static void rollDice(int[] diceToChange, int[] dice) {
		for (int a : diceToChange) {
			dice[a - DICE_VALUE_ONE] = getRandomDieValue();
		}
	}

	/**
	 * @return random value for the dices
	 */
	public static int getRandomDieValue() {
		return (int) (Math.random() * RANDOM_VALUE_SIX) + RANDOM_VALUE_ONE;
	}

	/**
	 * @param string
	 *            the string
	 * @return the string tokens
	 */
	public static int[] convert(String token) {
		StringTokenizer tokenizer = new StringTokenizer(token);
		int[] tokens = new int[tokenizer.countTokens()];
		int tokenizers = DEFAULT_TOKENIZER_VALUE;

		while (tokenizer.hasMoreTokens()) {
			tokens[tokenizers++] = Integer.parseInt(tokenizer.nextToken());
		}
		return tokens;
	}
}
