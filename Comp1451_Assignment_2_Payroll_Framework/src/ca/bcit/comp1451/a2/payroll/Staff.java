package ca.bcit.comp1451.a2.payroll;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Staff stores a list of StaffMembers and calculates the weekly payroll.
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Staff {

	private static final int HILARY_SOCIAL_INSURANCE_NUMBER = 123456789;
	private static final int JUSTIN_SOCIAL_INSURANCE_NUMBER = 987654321;
	private static final int THOMAS_SOCIAL_INSURANCE_NUMBER = 010203040;
	private static final int CONDOLEEZA_SOCIAL_INSURANCE_NUMBER = 958473625;
	private static double HILARY_PAYRATE = 5000.00;
	private static double JUSTIN_PAYRATE = 2000.00;
	private static double THOMAS_PAYRATE = 1500.00;
	private static double CONDOLEEZA_PAYRATE = 18.50;
	private static final double DEFAULT_AMOUNT = 0.0;

	private ArrayList<StaffMember> staffList;

	/**
	 * Constructor for objects of type Staff.
	 */
	public Staff() {

		staffList = new ArrayList<StaffMember>();
		staffList.add(new Executive("Hilary", "203 Whitewater Line", "871-0469", HILARY_SOCIAL_INSURANCE_NUMBER,
				HILARY_PAYRATE));
		staffList.add(
				new Employee("Justin", "24 Sussex Drive", "250-0101", JUSTIN_SOCIAL_INSURANCE_NUMBER, JUSTIN_PAYRATE));
		staffList.add(new Employee("Thomas", "1000 Robson Street", "604-0000", THOMAS_SOCIAL_INSURANCE_NUMBER,
				THOMAS_PAYRATE));
		staffList.add(new Hourly("Condoleeza", "678 Fifth Ave.", "905-0690", CONDOLEEZA_SOCIAL_INSURANCE_NUMBER,
				CONDOLEEZA_PAYRATE));
		staffList.add(new Volunteer("Kimberly", "1200 West Point Grey Road", "514-8374"));
		staffList.add(new Volunteer("Jean", "321 Shawinigate Lane", "613-7282"));
	}

	/**
	 * Adds the specified number of hours worked to the Hourly employees.
	 * 
	 * @param hoursWorked
	 */
	public void setHoursWorked(double hoursWorked) {

		for (StaffMember currentHourly : staffList) {
			if (currentHourly instanceof Hourly) {
				Hourly employee = (Hourly) currentHourly;
				employee.setHoursWorked(hoursWorked);
				System.out.println("Hourly Employee " + employee.getName() + ", Hours Worked: " + employee.getHoursWorked());
				System.out.println();
				System.out.println("------------------------------");
			}
		}
	}

	/**
	 * Assigns the specified flat value weekly bonus to the Executives.
	 * 
	 * @param bonusValue
	 *            as a double, i.e., $1,000 = 1000.0
	 */
	public void setExecutiveBonusFlatRate(double bonusValue) {

		for (StaffMember currentExecutive : staffList) {
			if (currentExecutive instanceof Executive) {
				Executive employee = (Executive) currentExecutive;
				employee.setBonus(bonusValue);
				// bonus converted to currency format
				NumberFormat bonusFormatter = NumberFormat.getCurrencyInstance();
				double bonus = employee.getBonus();
				System.out.println("Executive Employee " + employee.getName() + ", Bonus Flat Rate: "
						+ bonusFormatter.format(bonus));
				System.out.println();
			}
		}
	}

	/**
	 * Assigns the specified percentage weekly bonus to the Executives.
	 * 
	 * @param bonus
	 *            as a percentage, i.e., 20% = 0.2
	 */
	public void setExecutiveBonusPercentage(double bonusPercentage) {

		for (StaffMember currentExecutive : staffList) {
			if (currentExecutive instanceof Executive) {
				Executive employee = (Executive) currentExecutive;
				double salary = employee.getPayRate();
				employee.setBonus(bonusPercentage * salary);
				// bonus converted to currency format
				NumberFormat bonusFormatter = NumberFormat.getCurrencyInstance();
				double bonus = employee.getBonus();
				System.out.println("Executive Employee " + employee.getName() + ", Bonus By Percentage: "
						+ bonusFormatter.format(bonus));
				System.out.println();
			}
		}
	}

	/**
	 * Pays all the staff members.
	 */
	public void payday() {
		
		// amount converted to a currency format
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		double amount;

		for (StaffMember employee : staffList) {
			System.out.println(employee);
			System.out.println();
			amount = employee.pay(); // polymorphic
			if (amount == DEFAULT_AMOUNT) {
				System.out.print("Thank you for voluntering!");
				System.out.println();
				// To space out the employees with a separator
				System.out.println("------------------------------");
			} else {
				System.out.println("Paid: " + currencyFormatter.format(amount));
				// To space out the employees with a separator
				System.out.println("------------------------------");
			}
		}
	}
}