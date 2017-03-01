/**
 * 
 */

/**
 * @author a00973569
 *
 */
public class Romance extends Novel {

	public static final Rating DEFAULT_RATING = Romance.Rating.General;

	public enum Rating {
		RatedR, General, RatedX
	};

	private Rating rated;

	/**
	 * 
	 */
	public Romance() {

		super();
		rated = DEFAULT_RATING;// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Romance(Rating rated, int yearPublished, String author, String title, String publisher) {

		super(yearPublished, author, title, publisher);
		setRated(rated);
	}

	/**
	 * @return the rated
	 */
	public Rating getRated() {
		return rated;
	}

	/**
	 * @param rated
	 *            the rated to set
	 */
	public void setRated(Rating rated) {
		this.rated = rated;
	}

	/**
	 * 
	 */
	public String toString() {
		return super.toString() + " Rating: " + getRated();
	}

}
