import java.util.ArrayList;
import java.util.Iterator;

/**
 * ApplianceStore class stores all the appliances in the store and iterates over them
 * @author Ronnie Manimtim
 * @version 2.0 18 Feb 2016
 */
public class ApplianceStore {
	
	private final int TEMP_TEN = 10;
	private final int TEM_FIFTEEN = 15;
	private final int TEMP_THIRTEEN = 13;
	private final int TEMP_EIGHTTEEN = 18;
	private final double DIMENSION_ONE = 150.7;
	private final double DIMENSION_TWO = 50.0;
	private final double DIMENSION_THREE = 61.5;
	private final double DIMENSION_FOUR = 168.5;
	private final double DIMENSION_FIVE = 75.8;
	private final double DIMENSION_SIX = 63.7;
	private final double DIMENSION_SEVEN = 200.0;
	private final double DIMENSION_EIGHT = 98.0;
	private final double DIMENSION_NINE = 75.0;
	private final double DIMENSION_TEN = 190.4;
	private final double DIMENSION_ELEVEN = 80.3;
	private final double DIMENSION_TWELVE = 68.9;
	
	private final int ELEMENTS_FOUR = 4;
	private final int ELEMENTS_TEN = 10;
	private final int ELEMENTS_FIFTEEN = 15;		
	private final int TEMP_ONE_HUNDRED = 100;
	private final int TEMP_TWO_HUNDRED = 200;
	private final int TEMP_THREE_HUNDRED = 300;
	private final double DIMENSION_THIRTEEN = 59.5;
	private final double DIMENSION_FOURTEEN = 54.6;
	private final double DIMENSION_FIFTEEN = 60.3;
	private final double DIMENSION_SIXTEEN = 66.6;
	private final double DIMENSION_SEVENTEEN = 70.4;
	private final double DIMENSION_EIGHTTEEN = 68.9;
	
	private final double DIMENSION_NINETEEN = 20.5;
	private final double DIMENSION_TWENTY = 15.5;
	private final double DIMENSION_TWENTYONE = 13.5;
		
	private static ArrayList<Appliance> item;
	
	/**
	 * Constructor to initiate an ArrayList of Appliance, Oven, and Refrigerator.
	 */
	public ApplianceStore() {
		
		item = new ArrayList<>();
		item.add(new Refrigerator(-TEMP_TEN, Refrigerator.Freezer.BOTTOM, DIMENSION_ONE, DIMENSION_TWO, DIMENSION_THREE, "Maytag", "12345"));
		item.add(new Refrigerator(-TEM_FIFTEEN, Refrigerator.Freezer.LEFT, DIMENSION_FOUR, DIMENSION_FIVE, DIMENSION_SIX, "Bosch", "678910"));
		item.add(new Refrigerator(-TEMP_THIRTEEN, Refrigerator.Freezer.TOP, DIMENSION_SEVEN, DIMENSION_EIGHT, DIMENSION_NINE, "Samsung", "11121314"));
		item.add(new Refrigerator(-TEMP_EIGHTTEEN, Refrigerator.Freezer.RIGHT, DIMENSION_TEN, DIMENSION_ELEVEN, DIMENSION_TWELVE, "Siemens", "1516171819"));
		item.add(new Oven(ELEMENTS_FOUR, TEMP_ONE_HUNDRED, DIMENSION_THIRTEEN, DIMENSION_THIRTEEN, DIMENSION_FOURTEEN, "Maytag", "23456"));
		item.add(new Oven(ELEMENTS_TEN, TEMP_TWO_HUNDRED, DIMENSION_FIFTEEN, DIMENSION_FIFTEEN, DIMENSION_SIXTEEN, "Samsung", "7891011"));
		item.add(new Oven(ELEMENTS_FIFTEEN, TEMP_THREE_HUNDRED, DIMENSION_SEVENTEEN, DIMENSION_SEVENTEEN, DIMENSION_EIGHTTEEN, "Siemens", "1213141516"));
		item.add(new Appliance(DIMENSION_NINETEEN, DIMENSION_TWENTY, DIMENSION_TWENTYONE, "Samsung", "17181920"));
	}
	
	/**
	 * To Iterate over each item in the ArrayList with an Iterator Object.
	 */
	public void displayAllApplianceInformationIteratorObject() {
		
        Iterator<Appliance> it = item.iterator();
        
        	 while (it.hasNext()) {
        		 Appliance item = it.next();
        		 item.displayDetails();
        		//To space each item on the ArrayList
        		 System.out.println();
        	 }
        
    }
	
	/**
	 * To Iterate over each item with a for each loop.
	 */
	public void displayAllAppliaceInformationForEachLoop() {
		
			for(Appliance list : item) {
				list.displayDetails();
				//To space each item on the ArrayList
				System.out.println();
			}
	}
	
	/**
	 * To separate Iterator object and for each loop methods from displayAllApplianceInformation
	 */
	public void seperator() {
		
		System.out.println("--------------------------------------------");
		System.out.println();
	}
	
	/**
     * Main method is the point of entry into the
     * program.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
    	
    	new ApplianceStore().displayAllApplianceInformationIteratorObject();
    	new ApplianceStore().seperator();
    	new ApplianceStore().displayAllAppliaceInformationForEachLoop();
    	
    }
}