/**
 * 
 */
package ca.bcit.comp1451.finalexam.q1;

/**
 * A class for the final exam
 * 
 * @author Ronnie Manimtim
 * @version 1.0 16 Apr 2016
 */
public class FinalExam {

	private static final int LIMIT_FIVE = 5;

	private String c;

	/**
	 * 
	 */
	public FinalExam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the c
	 */
	public String getC() {
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(String c) throws TooLongException, TooShortException {

		if (getC() != null && c.trim().length() > LIMIT_FIVE && !(getC().equals(""))) {
			throw new TooLongException(getC() + "is more than five characers; too long!");
		} else if (getC() != null && c.trim().length() < LIMIT_FIVE && !(getC().equals(""))) {
			throw new TooShortException(getC() + "null is not allowed; it is fewer than five characters; too short!");
		} else {
			this.c = c;
		}
	}

}
