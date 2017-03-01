/**
 * 
 */
package ca.bcit.comp1451.quiz8;

/**
 * @author Joscelyn
 *
 */
public abstract class Dog extends Animal {

	/**
	 * 
	 */
	public Dog(String speak, String eat, String fetch) {
		super(speak, eat);
	}
	
	public abstract void fetch();

}
