/**
 * 
 */
package ca.bcit1451.quiz9;

/**
 * @author RonDog
 *
 */
public class Platypus extends Animal implements EggLayer, Swimmer {

	/**
	 * 
	 */
	public Platypus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Platypus";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		return true;
	}

}
