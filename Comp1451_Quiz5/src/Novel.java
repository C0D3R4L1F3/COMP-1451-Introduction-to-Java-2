/**
 * 
 */

/**
 * @author a00973569
 *
 */
public class Novel extends Book {
	
	private static final int YEAR_PUBLISHED = 1969;
	
	private int yearPublished;
	/**
	 * 
	 */
	public Novel() {
		super();
		yearPublished = YEAR_PUBLISHED;
		// TODO Auto-generated constructor stub
	}
	
	public Novel(int yearPublished, String author, String title, String publisher) {
		super(author, title, publisher);
		setYearPublished(yearPublished);
	}
	/**
	 * @return the yearPublished
	 */
	public int getYearPublished() {
		return yearPublished;
	}
	/**
	 * @param yearPublished the yearPublished to set
	 */
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return super.toString() + " Year: " + getYearPublished();
	}

}
