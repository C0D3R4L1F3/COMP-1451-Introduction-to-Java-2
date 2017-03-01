import java.util.*;

/**
 * This is a contact list of names and email addresses to store in a address
 * book of email info
 * 
 * @author Ronnie Manimtim
 * @version 1.0 19 Jan 2016
 */
public class EmailInfo {

	private HashMap<String, String> addressBook;

	/**
	 * Constructor creates new HashMap of address book
	 */
	public EmailInfo() {

		addressBook = new HashMap<>();// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 *            given name
	 * @return name with first letter upper case and the rest lower casee
	 */
	private String formatName(String name) {

		if (name != null && name.trim().length() > 0) {
			return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} else {
			return null;
		}
	}

	/**
	 * @param name
	 *            given name
	 * @param email
	 *            given email address
	 */
	public void addFriend(String name, String email) {

		if (name != null && name.trim().length() > 0) {
			name = formatName(name);

			if (!this.addressBook.containsKey(name)) {
				this.addressBook.put(formatName(name), email.toLowerCase());
			} else {
				System.out.println("Name already in address book");
			}
		} else {
			System.out.println("Provide valid name for email address");
		}
		System.out.println("Contact " + name + " added to address book");
	}

	/**
	 * @param name
	 *            contact to be removed from address book
	 */
	public void removeFriend(String name) {

		if (name != null && name.trim().length() > 0) {
			name = formatName(name);
			if (this.addressBook.containsKey(name) != false) {
				this.addressBook.remove(name);
				System.out.println("Contact " + name + " removed from address book");
			} else {
				System.out.println("No contact under " + name);
			}
		} else {
			System.out.println("Provide a valid name");
		}
	}

	/**
	 * @param name
	 *            given name
	 * @return the name and email address for contact
	 */
	public String getAddress(String name) {

		if (name != null && name.trim().length() > 0) {
			name = formatName(name);
			if (this.addressBook.containsKey(name) != false) {
				System.out.println("Contact " + name + " found");
				return this.addressBook.get(name);
			} else {
				System.out.println("No email under " + name);
			}
		} else {
			System.out.println("Provide a valid name");
		}
		return null;
	}

	/**
	 * @param email
	 *            contacts email address
	 * @return the name and email address for contact
	 */
	public String findFriends(String email) {

		if (email != null && email.trim().length() > 0) {
			email = email.toLowerCase();
			if (this.addressBook.containsValue(email)) {
				System.out.println("Contact found email address is " + email);
				for (String name : this.addressBook.keySet()) {
					if (this.addressBook.get(name).equals(email)) {
						System.out.println("Contacts name: " + name);
					}
				}
			} else {
				System.out.println("No record of " + email);
			}
		} else {
			System.out.println("Provide a valid email address");
		}
		return null;
	}

	/**
	 * List's all the contacts in address book
	 */
	public void listAll() {

		if (!this.addressBook.isEmpty()) {
			System.out.println("All contacts in address book");
			for (String name : this.addressBook.keySet()) {
				System.out.println("Contacts name: " + name + ", Contacts email: " + this.addressBook.get(name));
			}
		} else {
			System.out.println("Address book is empty");
		}
	}

	/**
	 * List's all the contacts in address book sorted alphabetically
	 */
	@SuppressWarnings("rawtypes")
	public void listAllSorted() {

		Map<String, String> unsorted = new HashMap<String, String>();
		unsorted.put("Zoria", "zoria@bcitmail.com");
		unsorted.put("Ronnie", "ronnie@bcitmail.com");
		unsorted.put("Ollie", "ollie@bcitmail.com");
		unsorted.put("Mariane", "mariane@bcitmail.com");
		unsorted.put("Richard", "richard@bcitmail.com");
		unsorted.put("Chris", "chris@bcitmail.com");
		unsorted.put("Alvin", "alvin@bcitmail.com");
		Map<String, String> names = new TreeMap<String, String>(unsorted);
		System.out.println("Sorted contacts in address book " + " ***FOR BONUS MARKS***");
		for (Map.Entry entry : names.entrySet()) {
			System.out.println("Contacts name: " + entry.getKey() + ", Contacts email: " + entry.getValue());
		}
	}
}