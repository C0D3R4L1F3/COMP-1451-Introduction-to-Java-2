/**
 * 
 */
package ca.bcit.comp1451.quiz8;

import java.util.ArrayList;

/**
 * @author Joscelyn
 *
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat("Meow", "Mice, yum!"));
		animals.add(new TeacupPoodle("Squeak!", "Squeak!", "Squeak, squeak, Squeak!"));
		
		for(Animal list : animals) {
				list.eat();
				list.speak();
				if(list instanceof Dog) {
				((Dog) list).fetch();
			}
			
			
	}
	}
}
