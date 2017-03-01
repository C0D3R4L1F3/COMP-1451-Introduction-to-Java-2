/**
 * 
 */
package ca.bcit1451.quiz9;

import java.util.ArrayList;

/**
 * @author RonDog
 *
 */
public class Driver {
	private static ArrayList<Animal> list;

	/**
	 * 
	 */
	public Driver() {

		list = new ArrayList<>();
		list.add(new Platypus());
		list.add(new Seal());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Driver newDriver = new Driver();
		for (Animal animals : list) {
			System.out.println(animals.toString());
		}

		for (Animal swimmer : list) {
			if (swimmer instanceof Swimmer) {
				System.out.println(swimmer.toString());
			}
		}

		for (Animal eggLayer : list) {
			if (eggLayer instanceof EggLayer) {
				System.out.println(eggLayer.toString());
			}
		}
		// TODO Auto-generated method stub

	}

}
