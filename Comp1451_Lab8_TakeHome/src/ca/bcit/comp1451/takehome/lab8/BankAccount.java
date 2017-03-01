package ca.bcit.comp1451.takehome.lab8;

/**
 * A Class that holds BankAccount information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 12 Mar 2015
 */
public class BankAccount implements Comparable<BankAccount> {

	private static final String DEFAULT_ACCOUNT_NUMBER = "Enter Account Number";
	private static final double DEFAULT_BALANCE_IN_CAD = 0.0;
	private static final int DEFAULT_PIN_NUMBER = 0;
	private static final int COMPARE_TO_ONE = 1;
	private static final int COMPARE_TO_ONE_NEGATIVE = -1;
	private static final int COMPARE_TO_ZERO = 0;
	private static final int PRIME_VALUE = 31;
	private static final int HASH_CODE_VALUE_ONE = 1;
	private static final int HASH_CODE_VALUE_ZERO = 0;
	private static final int HASH_CODE_VALUE_THIRTYTWO = 32;
	private static final int BALANCE_DIFFERENCE_ONE_HUNDRED = 100;

	private String accountNumber;
	private double balanceInCAD;
	private int pinNumber;

	/**
	 * Default Constructor
	 */
	public BankAccount() {

		this.accountNumber = DEFAULT_ACCOUNT_NUMBER;
		this.balanceInCAD = DEFAULT_BALANCE_IN_CAD;
		this.pinNumber = DEFAULT_PIN_NUMBER;
	}

	/**
	 * Constructor to initialize a BankAccount Object
	 * 
	 * @param accountNumber
	 *            given
	 * @param pinNumber
	 *            given
	 * @param balanceInCAD
	 *            given
	 */
	public BankAccount(String accountNumber, int pinNumber, double balanceInCAD) {

		this.accountNumber = accountNumber;
		this.balanceInCAD = balanceInCAD;
		this.pinNumber = pinNumber;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {

		return accountNumber;
	}

	/**
	 * If null value is entered will display default values
	 * 
	 * @param accountNumber
	 *            the accountNumber to set for BankAccount
	 */
	public void setAccountNumber(String accountNumber) {

		if (accountNumber.equals(null)) {
			this.accountNumber = DEFAULT_ACCOUNT_NUMBER;
		}
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the balanceInCAD
	 */
	public double getBalanceInCAD() {

		return balanceInCAD;
	}

	/**
	 * If value less than 0.0 is entered will display default values
	 * 
	 * @param balanceInCAD
	 *            the balanceInCAD to set for BankAccount
	 */
	public void setBalanceInCAD(double balanceInCAD) {

		if (balanceInCAD < DEFAULT_BALANCE_IN_CAD) {
			this.balanceInCAD = DEFAULT_BALANCE_IN_CAD;
		} else {
			this.balanceInCAD = balanceInCAD;
		}
	}

	/**
	 * @return the pinNumber
	 */
	public int getPinNumber() {

		return pinNumber;
	}

	/**
	 * If value less than 0 is entered then default values will display
	 * 
	 * @param pinNumber
	 *            the pinNumber to set for BankAccount
	 */
	public void setPinNumber(int pinNumber) {

		if (pinNumber < DEFAULT_PIN_NUMBER) {
			this.pinNumber = DEFAULT_PIN_NUMBER;
		} else {
			this.pinNumber = pinNumber;
		}
	}

	/**
	 * Compares the BankAccounts
	 * 
	 * @param other
	 *            BankAccount to compare to
	 * @return the greater value of the BankAccount
	 */
	@Override
	public int compareTo(BankAccount other) {

		if (getBalanceInCAD() > other.getBalanceInCAD()) {
			return COMPARE_TO_ONE;
		} else if (getBalanceInCAD() < other.getBalanceInCAD()) {
			return COMPARE_TO_ONE_NEGATIVE;
		} else {
			return COMPARE_TO_ZERO;
		}
	}

	/**
	 * @return hashCode value of variables
	 */
	@Override
	public int hashCode() {

		final int prime = PRIME_VALUE;
		int result = HASH_CODE_VALUE_ONE;
		result = prime * result + ((accountNumber == null) ? HASH_CODE_VALUE_ZERO : accountNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balanceInCAD);
		result = prime * result + (int) (temp ^ (temp >>> HASH_CODE_VALUE_THIRTYTWO));
		result = prime * result + pinNumber;
		return result;
	}

	/**
	 * If accounts are within $100 of each other then they are equal otherwise
	 * false
	 * 
	 * @param obj
	 *            the it is equal to or not equal to
	 * @return true if they are equal otherwise false
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BankAccount)) {
			return false;
		}
		BankAccount other = (BankAccount) obj;
		double balanceInCADDifference = Math.abs(balanceInCAD - ((BankAccount) obj).getBalanceInCAD());
		if (balanceInCADDifference <= BALANCE_DIFFERENCE_ONE_HUNDRED
				&& balanceInCADDifference >= -BALANCE_DIFFERENCE_ONE_HUNDRED) {
			return true;
		}
		if (balanceInCADDifference != BALANCE_DIFFERENCE_ONE_HUNDRED) {
			return false;
		}
		if (accountNumber == null) {
			if (other.accountNumber != null) {
				return false;
			}
		} else if (!accountNumber.equals(other.accountNumber)) {
			return false;
		}
		if (pinNumber != other.pinNumber) {
			return false;
		}
		return true;
	}

	/**
	 * @return a toString() description of the BankAccount
	 */
	@Override
	public String toString() {

		return "BankAccount [Account Number: " + accountNumber + ", Pin Number: " + pinNumber + ", Balance In CAD: "
				+ balanceInCAD + "]";
	}
}