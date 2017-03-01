/**
 * 
 */
package ca.bcit.comp1451.quiz8;

/**
 * @author Joscelyn
 *
 */
public abstract class Animal {
	
	private String speak;
	private String eat;

	/**
	 * 
	 */
	public Animal(String speak, String eat) {
		
		this.speak = speak;
		this.eat = eat;		
	}
	
	abstract public void speak();
	abstract public void eat();

	/**
	 * @return the speak
	 */
	public String getSpeak() {
		return speak;
	}

	/**
	 * @param speak the speak to set
	 */
	public void setSpeak(String speak) {
		this.speak = speak;
	}

	/**
	 * @return the eat
	 */
	public String getEat() {
		return eat;
	}

	/**
	 * @param eat the eat to set
	 */
	public void setEat(String eat) {
		this.eat = eat;
	}

}
