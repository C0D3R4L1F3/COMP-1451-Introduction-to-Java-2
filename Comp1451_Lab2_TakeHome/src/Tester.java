/**
 * This is a tester for EmailInfo class
 * 
 * @author Ronnie Manimtim
 * @version 1.0 19 Jan 2016
 */
public class Tester {

	/**
	 * Default constructor
	 */
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 *            simulates the tester and invokes the methods in EmailInfo
	 *            Class
	 */
	public static void main(String[] args) {

		EmailInfo addressBook = new EmailInfo();
		// Separates the sections after print out.
		String separator = "----------------------------------------------------";

		// Name of friends to add to address book
		String[] names = { "Ronnie", "Zoria", "Ollie", "Mariane", "Richard", "Chris", "Alvin" };

		// Adding the friends to the EmailInfo class
		for (String name : names) {
			addressBook.addFriend(name, name + "@BCITmail.com");
		}
		System.out.println(separator);

		// Printing all friend's in the address book
		System.out.println();
		addressBook.listAll();
		System.out.println(separator);

		// Removing a friend from the address book
		System.out.println();
		addressBook.removeFriend("Chris");
		addressBook.listAll();
		System.out.println(separator);

		// Locating a friend by there name in the address book
		System.out.println();
		System.out.println(addressBook.getAddress("Richard"));
		System.out.println(separator);

		// Looking for friend by there email address in the address book
		System.out.println();
		addressBook.findFriends("ronnie@BCITmail.com");
		System.out.println(separator);

		// List's all names in alphabetical sorting in the address book
		System.out.println();
		addressBook.listAllSorted();
		System.out.println(separator);
	}
}
