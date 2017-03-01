package ca.bcit.comp1451.a2.payroll;

/**
 * A Class that stores the personal information of a StaffMember
 * 
 * @author Ronnie Manimtim
 * @version 1.0 29 Feb 2016
 */
abstract public class StaffMember {

	private static final int DEFAULT_PRIME_VALUE = 31;
	private static final int HASH_VALUE = 1;
	private static final int HASH_VALUE_ZERO = 0;
	private static final String DEFAULT_NAME = "Enter a name";
	private static final String DEFAULT_ADDRESS = "Enter an address";
	private static final String DEFAULT_PHONE = "Enter a phone number";

	protected String name;
	protected String address;
	protected String phoneNumber;

	/**
	 * Default Constructor
	 */
	public StaffMember() {

		setName(DEFAULT_NAME);
		setAddress(DEFAULT_ADDRESS);
		setPhoneNumber(DEFAULT_PHONE);
	}

	/**
	 * Constructor initializes the information for an StaffMember object
	 * 
	 * @param name
	 *            given for staff member
	 * @param address
	 *            given for staff member
	 * @param phoneNumber
	 *            given for staff member
	 */
	public StaffMember(String name, String address, String phoneNumber) {

		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}

	/**
	 * @return the name
	 */
	public String getName() {

		return name;
	}

	/**
	 * Must enter a valid name, if no value is entered default name displays
	 * "Enter a name"
	 * 
	 * @param name
	 *            the name to set for a staff member
	 */
	public void setName(String name) {

		if (name.equals(null)) {
			this.name = DEFAULT_NAME;
		} else {
			this.name = name;
		}
	}

	/**
	 * @return the address
	 */
	public String getAddress() {

		return address;
	}

	/**
	 * Must enter a valid address, if no value is entered default address
	 * displays "Enter an address"
	 * 
	 * @param address
	 *            the address to set for a staff member
	 */
	public void setAddress(String address) {

		if (address.equals(null)) {
			this.address = DEFAULT_ADDRESS;
		} else {
			this.address = address;
		}
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {

		return phoneNumber;
	}

	/**
	 * Must enter a valid phone number, if no value is entered default address
	 * displays "Enter a phone number"
	 * 
	 * @param phoneNumber
	 *            the phoneNumber to set for staff a member
	 */
	public void setPhoneNumber(String phoneNumber) {

		if (phoneNumber.equals(null)) {
			this.phoneNumber = DEFAULT_PHONE;
		} else {
			this.phoneNumber = phoneNumber;
		}
	}

	/**
	 * Pay method is abstracted
	 */
	public abstract double pay();

	/**
	 * @return toString of staff member information
	 */
	@Override
	public String toString() {

		String results = "StaffMember" + "\n";
		results += "Name: " + name + "\n";
		results += "Address: " + address + "\n";
		results += "Phone Number: " + phoneNumber;
		return results;
	}

	/**
	 * @return int result of variables to hashcode()
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME_VALUE;
		int result = HASH_VALUE;
		result = prime * result + ((address == null) ? HASH_VALUE_ZERO : address.hashCode());
		result = prime * result + ((name == null) ? HASH_VALUE_ZERO : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? HASH_VALUE_ZERO : phoneNumber.hashCode());
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof StaffMember)) {
			return false;
		}
		StaffMember other = (StaffMember) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phoneNumber == null) {
			if (other.phoneNumber != null) {
				return false;
			}
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		return true;
	}
}