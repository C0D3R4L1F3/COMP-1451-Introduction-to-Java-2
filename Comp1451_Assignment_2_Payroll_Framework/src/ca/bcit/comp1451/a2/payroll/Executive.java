package ca.bcit.comp1451.a2.payroll;

import java.text.NumberFormat;

/**
 * A Class that stores the person information of an Executive and there pay rate
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Executive extends Employee {

	private static final double BONUS_RESET_ZERO = 0.0;
	private static final int DEFAULT_PRIME_VALUE = 31;
	private static final int DEFAULT_TEMP_VALUE = 32;
	private static final double DEFAULT_BONUS = 0.0;

	private double bonus;

	/**
	 * Default Constructor
	 */
	public Executive() {

		super();
		setBonus(DEFAULT_BONUS);
	}

	/**
	 * Constructor initializes the information for an Executive object
	 * 
	 * @param name
	 *            given for executive
	 * @param address
	 *            given for executive
	 * @param phoneNumber
	 *            given for executive
	 * @param socialInsuranceNumber
	 *            given for executive
	 * @param payRate
	 *            given for executive
	 */
	public Executive(String name, String address, String phoneNumber, int socialInsuranceNumber, double payRate) {

		super(name, address, phoneNumber, socialInsuranceNumber, payRate);
		setBonus(bonus);
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {

		return bonus;
	}

	/**
	 * The bonus rewarded to an Executive employee must be greater than zero if
	 * a negative number is enter then default value of zero will display
	 * 
	 * @param bonus
	 *            the bonus to set for executive
	 */
	public void setBonus(double bonus) {

		if (bonus < DEFAULT_BONUS) {
			this.bonus = DEFAULT_BONUS;
		} else {
			this.bonus = bonus;
		}
	}

	/**
	 * Pay is calculated at Executive weekly payRate once paid bonus is reseted
	 * back to zero
	 * 
	 * @return the pay rate of the executive with bonus
	 */
	@Override
	public double pay() {

		double payCheck = super.pay() + bonus;
		bonus = BONUS_RESET_ZERO; // bonus reseted to zero
		return payCheck;
	}

	/**
	 * @return toString of executive information
	 */
	@Override
	public String toString() {

		// to format pay to currency value
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = payRate;
		// to format bonus to currency value
		NumberFormat bonusFormatter = NumberFormat.getCurrencyInstance();
		double extra = bonus;

		String results = "Employee Pay Rate: Executive Weekly" + "\n";
		results += "Name: " + name + "\n";
		results += "SIN: " + socialInsuranceNumber + "\n";
		results += "Address: " + address + "\n";
		results += "Phone Number: " + phoneNumber + "\n";
		results += "Weekly Pay: " + currencyFormatter.format(pay) + "\n";
		results += "Bonus: " + bonusFormatter.format(extra);
		return results;
	}

	/**
	 * @return int result of variables to hashcode()
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME_VALUE;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> DEFAULT_TEMP_VALUE));
		return result;
	}

	/**
	 * @return true if obj equals each other otherwise false
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Executive)) {
			return false;
		}
		Executive other = (Executive) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus)) {
			return false;
		}
		return true;
	}
}