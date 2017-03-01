package ca.bcit.comp1451.a2.payroll;

import java.text.NumberFormat;

/**
 * A Class that stores the personal information of a Full-time Hourly employee
 * and there pay rate. We do not hire a part-time employees so gross hours will
 * be 40hours per week.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Hourly extends Employee {

	private static final int DEFAULT_PRIME_VALUE = 31;
	private static final int DEFAULT_TEMP_VALUE = 32;
	private static final double DEFAULT_HOURS_WORKED = 40.0;
	private static final double RESET_HOURS_WORKED = 0.0;
	private static final double TIME_AND_A_HALF_PERCENT = 1.5;

	private double hoursWorked;

	/**
	 * Default Constructor
	 */
	public Hourly() {

		super();
		setHoursWorked(DEFAULT_HOURS_WORKED);
	}

	/**
	 * Constructor initializes the information for an Hourly employee object
	 * 
	 * @param name
	 *            given for hourly employee
	 * @param address
	 *            given for hourly employee
	 * @param phoneNumber
	 *            given for hourly employee
	 * @param socialInsuranceNumber
	 *            given for hourly employee
	 * @param payRate
	 *            given for hourly employee
	 */
	public Hourly(String name, String address, String phoneNumber, int socialInsuranceNumber, double payRate) {

		super(name, address, phoneNumber, socialInsuranceNumber, payRate);
		setHoursWorked(hoursWorked);
	}

	/**
	 * To add more hours to a full-time hourly employees regular 40hr week
	 * 
	 * @param newHours
	 *            the additional hours worked by employee during the week
	 */
	public void addHours(double newHours) {

		hoursWorked = hoursWorked + newHours;
	}

	/**
	 * Must be 40hrs or greater if a value below 40hrs is set it will
	 * automatically be set to default of 40hours
	 * 
	 * @param hoursWorked
	 *            the hoursWorked to set for full-time hourly employee on a 40hr
	 *            per week basis must not be less than 40hrs
	 */
	public void setHoursWorked(double hoursWorked) {

		if (hoursWorked < DEFAULT_HOURS_WORKED) {
			this.hoursWorked = DEFAULT_HOURS_WORKED;
		} else {
			this.hoursWorked = hoursWorked;
		}
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {

		return hoursWorked;
	}

	/**
	 * Pay is calculated at the regular payRate for the first 40hrs, 1.5 times
	 * the regular payRate for additional hoursWorked once hourly employee has
	 * been paid hours are reseted back to zero
	 * 
	 * @return the pay rate of the hourly employee
	 */
	@Override
	public double pay() {

		if (hoursWorked <= DEFAULT_HOURS_WORKED) {
			// calculation for regular hours pay
			double payCheck = payRate * hoursWorked;
			hoursWorked = RESET_HOURS_WORKED; // hours worked reseted to zero
			return payCheck;
		} else {
			// calculation for overtime time and a half pay
			double overTime = payRate * DEFAULT_HOURS_WORKED
					+ TIME_AND_A_HALF_PERCENT * payRate * (hoursWorked - DEFAULT_HOURS_WORKED);
			hoursWorked = RESET_HOURS_WORKED; // hours worked reseted to zero
			return overTime;
		}
	}

	/**
	 * @return toString of hourly employee information
	 */
	@Override
	public String toString() {

		double regularHours = DEFAULT_HOURS_WORKED;
		// to format over time pay to currency value
		NumberFormat overFormatter = NumberFormat.getCurrencyInstance();
		double overTime = TIME_AND_A_HALF_PERCENT * payRate * (hoursWorked - DEFAULT_HOURS_WORKED);
		// to format regular pay to currency value
		NumberFormat regularFormatter = NumberFormat.getCurrencyInstance();
		double regularPay = payRate * regularHours;
		// to format pay to currency value
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double pay = payRate;

		String results = "Employee Pay Rate: Hourly" + "\n";
		results += "Name: " + name + "\n";
		results += "SIN: " + socialInsuranceNumber + "\n";
		results += "Address: " + address + "\n";
		results += "Phone Number: " + phoneNumber + "\n";
		results += "Hours Worked: " + hoursWorked + "\n";
		results += "Hourly Pay: " + currencyFormatter.format(pay) + "\n";
		results += "Regular Hours Pay: " + regularFormatter.format(regularPay) + "\n";
		results += "Over Time Pay: " + overFormatter.format(overTime);
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
		temp = Double.doubleToLongBits(hoursWorked);
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
		if (!(obj instanceof Hourly)) {
			return false;
		}
		Hourly other = (Hourly) obj;
		if (Double.doubleToLongBits(hoursWorked) != Double.doubleToLongBits(other.hoursWorked)) {
			return false;
		}
		return true;
	}
}