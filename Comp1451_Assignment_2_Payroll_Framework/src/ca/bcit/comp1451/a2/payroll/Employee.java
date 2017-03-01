package ca.bcit.comp1451.a2.payroll;

import java.text.NumberFormat;

/**
 * A Class that stores the person information of an Employee and there pay rate
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Employee extends StaffMember {

	private static final int DEFAULT_PRIME_VALUE = 31;
	private static final int DEFAULT_TEMP_VALUE = 32;
	private static final int DEFAULT_SIN = 0;
	private static final double MINIMUM_WAGE = 10.50;

	protected int socialInsuranceNumber;
	protected double payRate;

	/**
	 * Default Constructor
	 */
	public Employee() {

		super();
		setSocialInsuranceNumber(DEFAULT_SIN);
		setPayRate(MINIMUM_WAGE);
	}

	/**
	 * Constructor initializes the information for an Employee object
	 * 
	 * @param name
	 *            given for employee
	 * @param address
	 *            given for employee
	 * @param phoneNumber
	 *            given for employee
	 * @param socialInsuranceNumber
	 *            given for employee
	 * @param payRate
	 *            given for employee
	 */
	public Employee(String name, String address, String phoneNumber, int socialInsuranceNumber, double payRate) {

		super(name, address, phoneNumber);
		setSocialInsuranceNumber(socialInsuranceNumber);
		setPayRate(payRate);
	}

	/**
	 * @return the socialInsuranceNumber
	 */
	public int getSocialInsuranceNumber() {

		return socialInsuranceNumber;
	}

	/**
	 * Must enter a valid socialInsuranceNumber great than zero if a negative
	 * value is entered then it will display the default value of zero
	 * 
	 * @param socialInsuranceNumber
	 *            the socialInsuranceNumber to set for employee must not be less
	 *            than zero
	 */
	public void setSocialInsuranceNumber(int socialInsuranceNumber) {

		if (socialInsuranceNumber < DEFAULT_SIN) {
			this.socialInsuranceNumber = DEFAULT_SIN;
		} else {
			this.socialInsuranceNumber = socialInsuranceNumber;
		}
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {

		return payRate;
	}

	/**
	 * Must equal or be great than minimum wage if a value less then minimum
	 * wage is enter it will display the default minimum wage value
	 * 
	 * @param payRate
	 *            the payRate to set for employee must be equal to the minimum
	 *            wage or higher
	 */
	public void setPayRate(double payRate) {

		if (payRate < MINIMUM_WAGE) {
			this.payRate = MINIMUM_WAGE;
		} else {
			this.payRate = payRate;
		}
	}

	/**
	 * @return the pay rate of the employee
	 */
	@Override
	public double pay() {

		return payRate;
	}

	/**
	 * @return toString of employee information
	 */
	@Override
	public String toString() {

		// to format pay to currency value
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = payRate;

		String results = "Employee Pay Rate: Weekly" + "\n";
		results += "Name: " + name + "\n";
		results += "SIN: " + socialInsuranceNumber + "\n";
		results += "Address: " + address + "\n";
		results += "Phone Number: " + phoneNumber + "\n";
		results += "Weekly Pay: " + currencyFormatter.format(pay);
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
		temp = Double.doubleToLongBits(payRate);
		result = prime * result + (int) (temp ^ (temp >>> DEFAULT_TEMP_VALUE));
		result = prime * result + socialInsuranceNumber;
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
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(payRate) != Double.doubleToLongBits(other.payRate)) {
			return false;
		}
		if (socialInsuranceNumber != other.socialInsuranceNumber) {
			return false;
		}
		return true;
	}
}