/**
 * This is a tester class to invoke methods in StudentDatabase class
 * 
 * @author Ronnie Manimtim
 * @author Charles A
 * @version 1.0 17 Jan 2016
 */
public class Tester {

	/**
	 * Default Constructor
	 */
	public Tester() {
	}

	/**
	 * @param args
	 *            invoking the StudentDatabase methods and testing them
	 */
	public static void main(String[] args) {

		// Creating new array of students for StudentDatabase class
		StudentDatabase quizMarks = new StudentDatabase();
		String[] students = { "Ronnie", "Charles", "Basil", "Richard", "Marianne" };

		// Adding a student to the list
		for (String student : students) {
			quizMarks.addStudent(student);
		}

		// Retrieving students name and quizzes
		for (String student : students) {
			quizMarks.getQuizzes(student);
		}

		// Changing a certain quiz and the marks on the quiz
		for (String student : students) {
			quizMarks.changeQuizMark(student, 5, 10);
		}

		// Prints the name and students quiz marks
		quizMarks.showQuizMarks();
	}

}
