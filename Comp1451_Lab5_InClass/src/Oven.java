/**
 * Oven class that stores the temperature and number of elements of the oven
 * 
 * @author Ronnie Manimtim
 * @version 1.0 18 Feb 2016
 */
public class Oven extends Appliance {

	private final int NUMB_ELEMENTS_ONE = 1;
	private final int NUMB_ELEMENTS_SIXTEEN = 16;
	private final int MAX_TEMP_ONEHUNDRED = 100;
	private final int MAX_TEMP_FIVEHUNDRED = 500;

	private int numberOfElements;
	private double maxTempInCelsium;

	/**
	 * 
	 */
	public Oven(int numberOfElements, double maxTempInCelsium, double heightInCm, double widthInCm, double depthInCm,
			String manufacturer, String serialNumber) {

		super(heightInCm, widthInCm, depthInCm, manufacturer, serialNumber);
		setNumberOfElements(numberOfElements);
		setMaxTempInCelsium(maxTempInCelsium);
	}

	/**
	 * @return the numberOfElements
	 */
	public int getNumberOfElements() {

		return numberOfElements;
	}

	/**
	 * @param numberOfElements
	 *            the numberOfElements to set needs to be in between or equal to
	 *            NUMB_ELEMENTS_ONE and NUMB_ELEMENTS_SIXTEEN
	 */
	public void setNumberOfElements(int numberOfElements) {

		if (numberOfElements >= NUMB_ELEMENTS_ONE && numberOfElements <= NUMB_ELEMENTS_SIXTEEN) {
			this.numberOfElements = numberOfElements;
		}
	}

	/**
	 * @return the maxTempInCelsium
	 */
	public double getMaxTempInCelsium() {

		return maxTempInCelsium;
	}

	/**
	 * @param maxTempInCelsium
	 *            the maxTempInCelsium to set needs to be between or equal to
	 *            MAX_TEMP_ONEHUNDRED - MAX_TEMP_FIVEHUNDRED
	 */
	public void setMaxTempInCelsium(double maxTempInCelsium) {

		if (maxTempInCelsium >= MAX_TEMP_ONEHUNDRED && maxTempInCelsium <= MAX_TEMP_FIVEHUNDRED) {
			this.maxTempInCelsium = maxTempInCelsium;
		}
	}
}