/**
 * 
 */

/**
 * @author a00973569
 *
 */
public class Book {

	private static final String DEFAULT_AUTHOR = "Ronnie";
	private static final String DEFAULT_TITLE = "JavaDocing";
	private static final String DEFAULT_PUBLISHER = "BCIT";

	private String author;
	private String title;
	private String publisher;

	/**
	 * 
	 */
	public Book() {
		author = DEFAULT_AUTHOR;
		title = DEFAULT_TITLE;
		publisher = DEFAULT_PUBLISHER;
	}

	/**
	 * 
	 */
	public Book(String author, String title, String publisher) {
		setAuthor(author);
		setTitle(title);
		setPublisher(publisher);
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * 
	 */
	public String toString() {
		return "Name: " + getAuthor() + " Title: " + getTitle() + " Publisher: " + getPublisher();
	}

}
