/**
 * Refrigerator class that stores the temperature and position of the freezer
 * 
 * @author Ronnie Manimtim
 * @version 1.0 18 Feb 2016
 */
public class Refrigerator extends Appliance {

	private final int MIN_TEMP_ZERO = 0;
	private final int MIN_TEMP_TWENTY = 20;

	private double minTempInCelsius;
	private final Freezer freezerPosition;

	/**
	 * 
	 */
	public Refrigerator(double minTempInCelsius, Freezer freezerPosition, double heightInCm, double widthInCm,
			double depthInCm, String manufacturer, String serialNumber) {

		super(heightInCm, widthInCm, depthInCm, manufacturer, serialNumber);
		setMinTempInCelsius(minTempInCelsius);
		this.freezerPosition = freezerPosition;
	}

	/**
	 * @return the minTempInCelsius
	 */
	public double getMinTempInCelsius() {

		return minTempInCelsius;
	}

	/**
	 * @param minTempInCelsius
	 *            the minTempInCelsius to set must be between or equal to
	 *            MIN_TEMP_ZERO - -MIN_TEMP_TWENTY
	 */
	public void setMinTempInCelsius(double minTempInCelsius) {

		if (minTempInCelsius <= MIN_TEMP_ZERO && minTempInCelsius >= -MIN_TEMP_TWENTY) {
			this.minTempInCelsius = minTempInCelsius;
		}
	}

	/**
	 * @return the freezerPosition
	 */
	public Freezer getFreezerPosition() {

		return freezerPosition;
	}
}