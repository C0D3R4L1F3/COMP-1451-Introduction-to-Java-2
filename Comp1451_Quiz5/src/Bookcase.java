import java.util.ArrayList;

/**
 * 
 */

/**
 * @author a00973569
 *
 */
public class Bookcase {
	
	public static ArrayList<Book> books;

	/**
	 * 
	 */
	public Bookcase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		books = new ArrayList<>();
		
		books.add(new Book());
		books.add(new Novel());
		books.add(new Romance());
		
		books.add(new Book("Ollie", "BCIT", "KWANTLEN"));
		books.add(new Novel(1981, "Ollie", "BCIT", "KWANTLEN"));
		books.add(new Romance(Romance.Rating.RatedX, 1981, "Ollie", "BCIT", "KWANTLEN"));
		
		for(Book list : books){
			System.out.println(list);
		}
		// TODO Auto-generated method stub

	}

}
