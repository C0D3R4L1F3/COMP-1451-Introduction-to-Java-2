/**
 * 
 */
package ca.bcit.comp1451.quiz8;

/**
 * @author Joscelyn
 *
 */
public class Cat extends Animal {
	
	/**
	 * 
	 */
	public Cat(String speak, String eat) {
		super(speak, eat);
	}

	@Override
	public void speak() {
		
		System.out.println("Meow");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Mice, yum!");
		
	}

}
