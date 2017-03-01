/**
 * 
 */
package ca.bcit.comp1451.finalexam.q3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class for the final exam
 * 
 * @author Ronnie Manimtim
 * @version 1.0 16 Apr 2016
 */
public class Vehicles {

	private static final int CAR_WEIGHT_ONE = 1000;
	private static final int CAR_WEIGHT_TWO = 800;
	private static final int BOAT_WEIGHT_ONE = 1200;
	private static final int BOAT_WEIGHT_TWO = 900;
	private ArrayList<Vehicle> list;
	
	/**
	 * 
	 */
	public Vehicles() {
		
		list = new ArrayList<>();
		list.add(new Car(CAR_WEIGHT_ONE));
		list.add(new Boat(BOAT_WEIGHT_ONE));
		list.add(new Car(CAR_WEIGHT_TWO));
		list.add(new Boat(BOAT_WEIGHT_TWO));

		// Unsorted list
		for (Vehicle l : list) {
			System.out.println(l.toString());
		}
		System.out.println("--------------------");
		
		// Sort statement
		Collections.sort(list);

		// Sorted list
		for (Vehicle l : list) {
			System.out.println(l.toString());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Vehicles();
	}

}
