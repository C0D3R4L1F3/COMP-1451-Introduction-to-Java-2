package ca.bcit.comp1451.lab7;

/**
 * A Class that holds Student information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 08 Mar 2016
 */
abstract public class Student {

	private static final String DEFAULT_FIRST_NAME = "Enter first name!";
	private static final String DEFAULT_LAST_NAME = "Enter last name!";
	private static final int DEFAULT_STUDENT_NUMBER = 0;
	private static final int DEFAULT_YEAR_BORN = 0;
	private static final double DEFAULT_PERCENTAGE_GRADE = 0.0;
	private static final double GRADE_ONEHUNDRED = 100;
	private static final int DEFAULT_PRIME = 31;
	private static final int DEFAULT_HASH_ONE = 1;
	private static final int DEFAULT_HASH_ZERO = 0;
	private static final int DEFAULT_HASH_THIRTYTWO = 32;

	protected String firstName;
	protected String lastName;
	protected int studentNumber;
	protected int yearBorn;
	protected double percentageGrade;

	/**
	 * Default Constructor
	 */
	public Student() {

		setFirstName(DEFAULT_FIRST_NAME);
		setLastName(DEFAULT_LAST_NAME);
		setStudentNumber(DEFAULT_STUDENT_NUMBER);
		setYearBorn(DEFAULT_YEAR_BORN);
		setPercentageGrade(DEFAULT_PERCENTAGE_GRADE);
	}

	/**
	 * Constructor to initialize a Student Object
	 * 
	 * @param firstName
	 *            given for student
	 * @param lastName
	 *            given for student
	 * @param studentNumber
	 *            given for student
	 * @param yearBorn
	 *            given for student
	 * @param percentageGrade
	 *            given for student
	 */
	public Student(String firstName, String lastName, int studentNumber, int yearBorn, double percentageGrade) {

		setPercentageGrade(percentageGrade);
		setFirstName(firstName);
		setLastName(lastName);
		setStudentNumber(studentNumber);
		setYearBorn(yearBorn);

	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {

		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set for student
	 */
	public void setFirstName(String firstName) {

		if (firstName.equals(null)) {
			this.firstName = DEFAULT_FIRST_NAME;
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set for student
	 */
	public void setLastName(String lastName) {

		if (lastName.equals(null)) {
			this.lastName = DEFAULT_LAST_NAME;
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {

		return studentNumber;
	}

	/**
	 * @param studentNumber
	 *            the studentNumber to set for student
	 */
	public void setStudentNumber(int studentNumber) {

		if (studentNumber < DEFAULT_STUDENT_NUMBER) {
			this.studentNumber = DEFAULT_STUDENT_NUMBER;
			System.out.println("Please enter a student number that is not a negative value");
		} else {
			this.studentNumber = studentNumber;
		}
	}

	/**
	 * @return the yearBorn
	 */
	public int getYearBorn() {

		return yearBorn;
	}

	/**
	 * @param yearBorn
	 *            the yearBorn to set for student
	 */
	public void setYearBorn(int yearBorn) {

		if (yearBorn < DEFAULT_YEAR_BORN) {
			this.yearBorn = DEFAULT_YEAR_BORN;
			System.out.println("Please enter a year that's not a negative value");
		} else {
			this.yearBorn = yearBorn;
		}
	}

	/**
	 * @return the percentageGrade
	 */
	public double getPercentageGrade() {

		return percentageGrade;
	}

	/**
	 * @param percentageGrade
	 *            the percentageGrade to set for student
	 */
	public void setPercentageGrade(double percentageGrade) {

		if (percentageGrade < DEFAULT_PERCENTAGE_GRADE && percentageGrade > GRADE_ONEHUNDRED) {
			this.percentageGrade = DEFAULT_PERCENTAGE_GRADE;
			System.out.println("Please enter a percentage grade between 0.0 - 100.0");
		} else {
			this.percentageGrade = percentageGrade;
		}
	}

	/**
	 * Abstract Method to display the students grade
	 */
	public abstract void displayGrade();

	/**
	 * @return student information in a toString() format
	 */
	@Override
	public String toString() {

		String results = "Student" + "\n";
		results += "First Name: " + firstName + "\n";
		results += "Last Name: " + lastName + "\n";
		results += "Student Number: " + studentNumber + "\n";
		results += "Year Born: " + yearBorn + "\n";
		results += "Percentage Grade: " + percentageGrade;
		return results;
	}

	/**
	 * @return Hashcode value for variables
	 */
	@Override
	public int hashCode() {

		final int prime = DEFAULT_PRIME;
		int result = DEFAULT_HASH_ONE;
		result = prime * result + ((firstName == null) ? DEFAULT_HASH_ZERO : firstName.hashCode());
		result = prime * result + ((lastName == null) ? DEFAULT_HASH_ZERO : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentageGrade);
		result = prime * result + (int) (temp ^ (temp >>> DEFAULT_HASH_THIRTYTWO));
		result = prime * result + studentNumber;
		result = prime * result + yearBorn;
		return result;
	}

	/**
	 * @return True if objects equal each other otherwise false
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (Double.doubleToLongBits(percentageGrade) != Double.doubleToLongBits(other.percentageGrade)) {
			return false;
		}
		if (studentNumber != other.studentNumber) {
			return false;
		}
		if (yearBorn != other.yearBorn) {
			return false;
		}
		return true;
	}
}