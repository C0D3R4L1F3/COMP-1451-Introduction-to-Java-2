package ca.bcit.comp1451.lab7;

import java.util.ArrayList;

/**
 * A Class that displays Student information
 * 
 * @author Ronnie Manimtim
 * @version 1.0 08 Mar 2016
 */
public class StudentsInfo {

	private static final int RONNIE_STUDENT_NUMBER = 123456789;
	private static final int BASIL_STUDENT_NUMBER = 456789198;
	private static final int OLLIE_STUDENT_NUMBER = 987654345;
	private static final int CHARLES_STUDENT_NUMBER = 234569789;
	private static final int RONNIE_YEAR_BORN = 1981;
	private static final int BASIL_YEAR_BORN = 1985;
	private static final int OLLIE_YEAR_BORN = 1980;
	private static final int CHARLES_YEAR_BORN = 1983;
	private static double RONNIE_GRADE = 90.00;
	private static double BASIL_GRADE = 50.00;
	private static double OLLIE_GRADE = 55.55;
	private static double CHARLES_GRADE = 55.45;

	private static ArrayList<Student> studentList;

	/**
	 * Constructor to initialize an ArrayList of student objects information
	 */
	public StudentsInfo() {

		studentList = new ArrayList<>();
		studentList.add(new BCITStudent("Ronnie", "Manimtim", RONNIE_STUDENT_NUMBER, RONNIE_YEAR_BORN, RONNIE_GRADE));
		studentList.add(new SFUStudent("Basil", "Mansur", BASIL_STUDENT_NUMBER, BASIL_YEAR_BORN, BASIL_GRADE));
		studentList.add(new UBCStudent("Ollie", "Sabacan", OLLIE_STUDENT_NUMBER, OLLIE_YEAR_BORN, OLLIE_GRADE));
		studentList.add(new UBCStudent("Charles", "Arula", CHARLES_STUDENT_NUMBER, CHARLES_YEAR_BORN, CHARLES_GRADE));
	}

	/**
	 * Method to display the students information
	 */
	public static void displayStudentInfo() {

		for (Student student : studentList) {
			System.out.println(student);
			System.out.println();
			student.displayGrade();
			System.out.println("--------------------");
		}
	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		new StudentsInfo();
		displayStudentInfo();
	}
}