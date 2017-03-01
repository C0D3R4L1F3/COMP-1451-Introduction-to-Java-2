package ca.bcit.comp1451.lab7;

/**
 * A Class that holds BCIT Student information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 08 Mar 2016
 */
public class BCITStudent extends Student {

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
	public BCITStudent() {

		super();
	}

	/**
	 * Constructor to initialize a BCITStudent object
	 * 
	 * @param firstName
	 *            given for BCIT student
	 * @param lastName
	 *            given for BCIT student
	 * @param studentNumber
	 *            given for BCIT student
	 * @param yearBorn
	 *            given for BCIT student
	 * @param percentageGrade
	 *            given for BCIT student
	 */
	public BCITStudent(String firstName, String lastName, int studentNumber, int yearBorn, double percentageGrade) {

		super(firstName, lastName, studentNumber, yearBorn, percentageGrade);
	}

	/**
	 * A method to display and convert a percentage grade to a GPA
	 */
	public void displayGrade() {

		if (percentageGrade >= GRADE_ZERO && percentageGrade <= GRADE_FORTYNINE) {
			System.out.println("BCIT student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the GPA is 0.");
		} else if (percentageGrade >= GRADE_FIFTY && percentageGrade <= GRADE_FIFTYNINE) {
			System.out.println("BCIT student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the GPA is 2.0.");
		} else if (percentageGrade >= GRADE_SIXTY && percentageGrade <= GRADE_SIXTYNINE) {
			System.out.println("BCIT student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the GPA is 3.0.");
		} else if (percentageGrade >= GRADE_SEVENTY && percentageGrade <= GRADE_EIGHTYFIVE) {
			System.out.println("BCIT student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the GPA is 3.5.");
		} else if (percentageGrade >= GRADE_EIGHTYSIX && percentageGrade <= GRADE_ONEHUNDRED) {
			System.out.println("BCIT student " + firstName + " " + lastName + " percentage grade is " + percentageGrade
					+ " and the GPA is 4.0.");
		}
	}

	/**
	 * @return BCIT student information in a toString() format
	 */
	@Override
	public String toString() {

		String results = "BCIT Student" + "\n";
		results += "First Name: " + firstName + "\n";
		results += "Last Name: " + lastName + "\n";
		results += "Student Number: " + studentNumber + "\n";
		results += "Year Born: " + yearBorn + "\n";
		results += "Percentage Grade: " + percentageGrade;
		return results;
	}
}