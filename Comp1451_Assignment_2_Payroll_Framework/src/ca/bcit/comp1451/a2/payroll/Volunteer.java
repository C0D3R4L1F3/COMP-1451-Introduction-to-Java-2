package ca.bcit.comp1451.a2.payroll;

/**
 * A Class that stores the personal information of a Volunteer and there pay
 * rate which equals to $0.00
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
public class Volunteer extends StaffMember {

	private static final double DEFAULT_PAYRATE = 0.0;

	/**
	 * Default Constructor
	 */
	public Volunteer() {

		super();
	}

	/**
	 * Constructor initializes the information for an Volunteer object
	 * 
	 * @param name
	 *            given for volunteer
	 * @param address
	 *            given for volunteer
	 * @param phoneNumber
	 *            given for volunteer
	 */
	public Volunteer(String name, String address, String phoneNumber) {

		super(name, address, phoneNumber);
	}

	/**
	 * Volunteers do not get paid pay rate is $0.00
	 * 
	 * @return the pay rate of the volunteer should be $0.00
	 */
	@Override
	public double pay() {

		return DEFAULT_PAYRATE;
	}

	/**
	 * @return toString of volunteer employee information
	 */
	@Override
	public String toString() {

		String results = "Volunteer Staff Member" + "\n";
		results += "Name: " + name + "\n";
		results += "Address: " + address + "\n";
		results += "Phone Number: " + phoneNumber;
		return results;
	}
}