package ca.bcit.comp1451.lab7;

/**
 * A Class that holds UBC Student information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 08 Mar 2016
 */
public class UBCStudent extends Student {

	private static final double GRADE_ZERO = 0;
	private static final double GRADE_FORTYNINE = 49;
	private static final double GRADE_FIFTY = 50;
	private static final double GRADE_FIFTYNINE = 59;
	private static final double GRADE_SIXTY = 60;
	private static final double GRADE_SIXTYNINE = 69;
	private static final double GRADE_SEVENTY = 70;
	private static final double GRADE_EIGHTYFIVE = 85;
	private static final double GRADE_EIGHTYSIX = 86;
	private static final double GRADE_ONEHUNDRED = 100;

	/**
	 * Default Constructor invoking superclass default constructor
	 */
	public UBCStudent() {

		super();
	}

	/**
	 * Constructor to initialize a UBCStudent object
	 * 
	 * @param firstName
	 *            given for UBC student
	 * @param lastName
	 *            given for UBC student
	 * @param studentNumber
	 *            given for UBC student
	 * @param yearBorn
	 *            given for UBC student
	 * @param percentageGrade
	 *            given for UBC student
	 */
	public UBCStudent(String firstName, String lastName, int studentNumber, int yearBorn, double percentageGrade) {

		super(firstName, lastName, studentNumber, yearBorn, percentageGrade);
	}

	/**
	 * A method to display and convert a percentage grade to a rounded
	 * percentage grade
	 */
	public void displayGrade() {

		if (percentageGrade >= GRADE_ZERO && percentageGrade <= GRADE_FORTYNINE) {
			System.out.println("UBC student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the percentage grade is rounded to " + (int) Math.round(percentageGrade) + ".");
		} else if (percentageGrade >= GRADE_FIFTY && percentageGrade <= GRADE_FIFTYNINE) {
			System.out.println("UBC student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the percentage grade is rounded to " + (int) Math.round(percentageGrade) + ".");
		} else if (percentageGrade >= GRADE_SIXTY && percentageGrade <= GRADE_SIXTYNINE) {
			System.out.println("UBC student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the the percentage grade is rounded to " + (int) Math.round(percentageGrade) + ".");
		} else if (percentageGrade >= GRADE_SEVENTY && percentageGrade <= GRADE_EIGHTYFIVE) {
			System.out.println("UBC student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the percentage grade is rounded to " + (int) Math.round(percentageGrade) + ".");
		} else if (percentageGrade >= GRADE_EIGHTYSIX && percentageGrade <= GRADE_ONEHUNDRED) {
			System.out.println("UBC student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the percentage grade is rounded to " + (int) Math.round(percentageGrade) + ".");
		}
	}

	/**
	 * @return UBC student information in a toString() format
	 */
	@Override
	public String toString() {

		String results = "UBC Student" + "\n";
		results += "First Name: " + firstName + "\n";
		results += "Last Name: " + lastName + "\n";
		results += "Student Number: " + studentNumber + "\n";
		results += "Year Born: " + yearBorn + "\n";
		results += "Percentage Grade: " + percentageGrade;
		return results;
	}
}