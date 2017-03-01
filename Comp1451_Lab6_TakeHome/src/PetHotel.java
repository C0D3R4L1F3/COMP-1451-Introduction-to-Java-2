import java.util.ArrayList;

/**
 * A Class that initializes Pet objects
 * 
 * @author Ronnie Manimtim
 * @version 1.0 27 Feb 2016
 */
public class PetHotel {

	private static final int PET_ONE_WEIGHT = 65;
	private static final int PET_TWO_WEIGHT = 50;
	private static final int PET_THREE_WEIGHT = 1;
	private static final int CAT_ONE_WEIGHT = 10;
	private static final int CAT_TWO_WEIGHT = 9;
	private static final int CAT_THREE_WEIGHT = 12;
	private static final int DOG_ONE_WEIGHT = 60;
	private static final int DOG_TWO_WEIGHT = 59;
	private static final int DOG_THREE_WEIGHT = 13;
	private static final int PET_ONE_AGE = 10;
	private static final int PET_TWO_AGE = 8;
	private static final int PET_THREE_AGE = 5;
	private static final int CAT_ONE_AGE = 10;
	private static final int CAT_TWO_AGE = 12;
	private static final int CAT_THREE_AGE = 9;
	private static final int DOG_ONE_AGE = 8;
	private static final int DOG_TWO_AGE = 7;
	private static final int DOG_THREE_AGE = 6;

	private static ArrayList<Pet> pets;

	/**
	 * Constructor that initializes an ArrayList of pets
	 */
	public PetHotel() {

		pets = new ArrayList<>();
	}

	/**
	 * @param pet
	 *            added to ArrayList
	 */
	public void addPet(Pet pet) {

		pets.add(pet);
	}

	/**
	 * Displays all the guest in the PetHotel
	 */
	public static void displayGuest() {

		for (Pet pet : pets) {
			System.out.println(pet);
			System.out.println("----------------------------"); // To seperate
																// each object
																// info
		}
	}

	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		new PetHotel();

		pets = new ArrayList<>();
		pets.add(new Pet("Bule Marlin", PET_ONE_WEIGHT, PET_ONE_AGE, "Charles"));
		pets.add(new Pet("Amberjack", PET_TWO_WEIGHT, PET_TWO_AGE, "Ollie"));
		pets.add(new Pet("Gerbil", PET_THREE_WEIGHT, PET_THREE_AGE, "Micky"));
		pets.add(new Cat("Siamese", CAT_ONE_WEIGHT, CAT_ONE_AGE, "Joscelyn", true, true));
		pets.add(new Cat("British Shorthair", CAT_TWO_WEIGHT, CAT_TWO_AGE, "Marianne", false, false));
		pets.add(new Cat("Persian", CAT_THREE_WEIGHT, CAT_THREE_AGE, "Minnie", true, false));
		pets.add(new Dog("German Shepherd", DOG_ONE_WEIGHT, DOG_ONE_AGE, "Richard", true));
		pets.add(new Dog("Husky", DOG_TWO_WEIGHT, DOG_TWO_AGE, "Romeo", false));
		pets.add(new Dog("Bulldog", DOG_THREE_WEIGHT, DOG_THREE_AGE, "Snoopy", true));

		displayGuest();

		new PetHotel();

		Pet petOne = new Pet("Bule Marlin", PET_ONE_WEIGHT, PET_ONE_AGE, "Charles");
		@SuppressWarnings("unused")
		Pet petTwo = new Pet("Amberjack", PET_TWO_WEIGHT, PET_TWO_AGE, "Ollie");
		@SuppressWarnings("unused")
		Pet petThree = new Pet("Gerbil", PET_THREE_WEIGHT, PET_THREE_AGE, "Micky");
		Cat catOne = new Cat("Siamese", CAT_ONE_WEIGHT, CAT_ONE_AGE, "Joscelyn", true, true);
		Cat catTwo = new Cat("Siamese", CAT_ONE_WEIGHT, CAT_ONE_AGE, "Joscelyn", true, true);
		Cat catThree = new Cat("Persian", CAT_THREE_WEIGHT, CAT_THREE_AGE, "Minnie", true, false);
		Dog dogOne = new Dog("German Shepherd", DOG_ONE_WEIGHT, DOG_ONE_AGE, "Richard", true);
		Dog dogTwo = new Dog("German Shepherd", DOG_ONE_WEIGHT, DOG_ONE_AGE, "Richard", true);
		Dog dogThree = new Dog("Bulldog", DOG_THREE_WEIGHT, DOG_THREE_AGE, "Snoopy", true);

		System.out.println("Pets equal each other: " + catOne.equals(petOne));
		System.out.println("Pets equal each other: " + catOne.equals(catTwo));
		System.out.println("Pets equal each other: " + catOne.equals(catThree));
		System.out.println("Pets equal each other: " + catOne.equals(dogOne));
		System.out.println("---------------------------");
		System.out.println("Pets equal each other: " + dogOne.equals(petOne));
		System.out.println("Pets equal each other: " + dogOne.equals(dogTwo));
		System.out.println("Pets equal each other: " + dogOne.equals(dogThree));
		System.out.println("Pets equal each other: " + dogOne.equals(catTwo));
		System.out.println("---------------------------");
		System.out.println("Pets equal each other: " + ((Object) catOne.equals((Object) petOne)));
		System.out.println("Pets equal each other: " + ((Object) catOne.equals((Object) catTwo)));
		System.out.println("Pets equal each other: " + ((Object) catOne.equals((Object) catThree)));
		System.out.println("Pets equal each other: " + ((Object) catOne.equals((Object) dogOne)));
		System.out.println("---------------------------");
		System.out.println("Pets equal each other: " + ((Object) dogOne.equals((Object) petOne)));
		System.out.println("Pets equal each other: " + ((Object) dogOne.equals((Object) dogTwo)));
		System.out.println("Pets equal each other: " + ((Object) dogOne.equals((Object) dogThree)));
		System.out.println("Pets equal each other: " + ((Object) dogOne.equals((Object) catTwo)));
	}
}
