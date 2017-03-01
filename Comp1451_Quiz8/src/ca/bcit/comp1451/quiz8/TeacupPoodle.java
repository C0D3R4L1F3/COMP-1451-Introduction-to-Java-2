/**
 * 
 */
package ca.bcit.comp1451.quiz8;

/**
 * @author Joscelyn
 *
 */
public class TeacupPoodle extends Dog {

	/**
	 * 
	 */
	public TeacupPoodle(String speak, String eat, String fetch) {
		super(speak, eat, fetch);
	}

	@Override
	public void fetch() {
		System.out.println("Squeak!");
		
	}

	@Override
	public void speak() {
		System.out.println("Squeak!");
		
	}

	@Override
	public void eat() {
		System.out.println("Squeak, squeak, squeak!");
		
	}

}
