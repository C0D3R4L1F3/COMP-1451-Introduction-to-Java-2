package ca.bcit.comp1451.a2.payroll;

/**
 * Firm is a simple payroll system.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Firm {

	/**
	 * Default Constructor
	 */
	public Firm() {

	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		Staff personnel = new Staff();
		personnel.setExecutiveBonusPercentage(0.20);
		personnel.setHoursWorked(40);
		personnel.payday();
	}
}