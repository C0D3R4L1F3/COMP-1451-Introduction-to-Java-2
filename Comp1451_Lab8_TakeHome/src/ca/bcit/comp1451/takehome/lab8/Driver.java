package ca.bcit.comp1451.takehome.lab8;

/**
 * A Class to invoke the methods
 * 
 * @author Ronnie Manimtim
 * @version 1.0 12 Mar 2015
 */
public class Driver {

	private static final int COMPARE_TO_VALUE_ZERO = 0;
	private static final int OLLIE_YEAR_BORN = 1980;
	private static final int RONNIE_YEAR_BORN = 1981;
	private static final int CHARLES_YEAR_BORN = 1980;
	private static final int BASIL_YEAR_BORN = 1985;
	private static final int OLLIE_GOAL_SCORES = 20;
	private static final int RONNIE_GOAL_SCORES = 100;
	private static final int CHARLES_GOAL_SCORES = 95;
	private static final int BASIL_GOAL_SCORES = 50;
	private static final int PIN_NUMBER_ONE = 1234;
	private static final int PIN_NUMBER_TWO = 5678;
	private static final int PIN_NUMBER_THREE = 8765;
	private static final int PIN_NUMBER_FOUR = 4321;
	private static final double ACCOUT_BALANCE_ONE = 950.00;
	private static final double ACCOUT_BALANCE_TWO = 1000.00;
	private static final double ACCOUT_BALANCE_THREE = 20000.00;
	private static final double ACCOUT_BALANCE_FOUR = 50000.00;

	/**
	 * Default Constructor
	 */
	public Driver() {
	}

	/**
	 * Compares the objects and see which one has the maximum values to compare
	 * 
	 * @param first
	 *            object given
	 * @param second
	 *            object given
	 * @param third
	 *            object given
	 * @param fourth
	 *            object given
	 * @return the highest object with the maximum value to compare
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable maximum(Comparable first, Comparable second, Comparable third, Comparable fourth) {

		if (first.compareTo(second) > COMPARE_TO_VALUE_ZERO && first.compareTo(third) > COMPARE_TO_VALUE_ZERO
				&& first.compareTo(fourth) > COMPARE_TO_VALUE_ZERO) {
			return first;
		} else if (second.compareTo(first) > COMPARE_TO_VALUE_ZERO && second.compareTo(third) > COMPARE_TO_VALUE_ZERO
				&& second.compareTo(fourth) > COMPARE_TO_VALUE_ZERO) {
			return second;
		} else if (third.compareTo(first) > COMPARE_TO_VALUE_ZERO && third.compareTo(second) > COMPARE_TO_VALUE_ZERO
				&& third.compareTo(fourth) > COMPARE_TO_VALUE_ZERO) {
			return third;
		} else {
			return fourth;
		}
	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		HockeyPlayer playerOne = new HockeyPlayer("Ollie", OLLIE_YEAR_BORN, OLLIE_GOAL_SCORES);
		HockeyPlayer playerTwo = new HockeyPlayer("Ronnie", RONNIE_YEAR_BORN, RONNIE_GOAL_SCORES);
		HockeyPlayer playerThree = new HockeyPlayer("Charles", CHARLES_YEAR_BORN, CHARLES_GOAL_SCORES);
		HockeyPlayer playerFour = new HockeyPlayer("Basil", BASIL_YEAR_BORN, BASIL_GOAL_SCORES);
		System.out.println(maximum(playerOne, playerTwo, playerThree, playerFour));
		System.out.println("Player Two vs Three are equal: " + playerTwo.equals(playerThree));
		System.out.println("Player One vs Two are equal: " + playerTwo.equals(playerOne));
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		BankAccount accountOne = new BankAccount("123456", PIN_NUMBER_ONE, ACCOUT_BALANCE_ONE);
		BankAccount accountTwo = new BankAccount("456789", PIN_NUMBER_TWO, ACCOUT_BALANCE_TWO);
		BankAccount accountThree = new BankAccount("987654", PIN_NUMBER_THREE, ACCOUT_BALANCE_THREE);
		BankAccount accountFour = new BankAccount("654321", PIN_NUMBER_FOUR, ACCOUT_BALANCE_FOUR);
		System.out.println(maximum(accountOne, accountTwo, accountThree, accountFour));
		System.out.println("Accounts One vs Two are equal: " + accountOne.equals(accountTwo));
		System.out.println("Accounts One vs Three are equal: " + accountOne.equals(accountThree));
	}
}