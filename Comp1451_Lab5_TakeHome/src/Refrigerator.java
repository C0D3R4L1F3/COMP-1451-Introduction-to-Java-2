/**
 * Refrigerator class that stores the temperature and position of the freezer
 * @author Ronnie Manimtim
 * @version 1.0 18 Feb 2016
 */
public class Refrigerator extends Appliance{
	
	private final int MIN_TEMP_ZERO = 0;
	private final int MIN_TEMP_TWENTY = 20;
	
	private double minTempInCelsius;
	public enum Freezer{ TOP, LEFT, RIGHT, BOTTOM };
	private final Freezer freezerPosition;

	/**
	 * @param minTempInCelsius given minTempInCelsius will be stored and set
	 * @param freezerPosition given freezerPosition will be stored and set
	 * @param heightInCm given heightInCm will be stored and set
	 * @param widthInCm given widthInCm will be stored and set
	 * @param depthInCm given depthInCm will be stored and set
	 * @param manufacturer given manufacturer will be stored and set
	 * @param serialNumber given serialNumber will be stored and set
	 */
	public Refrigerator(double minTempInCelsius, Freezer freezerPosition, double heightInCm, double widthInCm, double depthInCm, String manufacturer, String serialNumber) {
		
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
	 * @param minTempInCelsius the minTempInCelsius to set must be between or equal to MIN_TEMP_ZERO - -MIN_TEMP_TWENTY
	 */
	public void setMinTempInCelsius(double minTempInCelsius) {
		
		if(minTempInCelsius <= MIN_TEMP_ZERO && minTempInCelsius >= -MIN_TEMP_TWENTY) {
			this.minTempInCelsius = minTempInCelsius;
		}
	}
	
	/**
	 * @return the freezerPosition
	 */
	public Freezer getFreezerPosition() {
		
		return freezerPosition;
	}
	
	
	/**
	 * Displays the dimensions, manufacturer, serial number, min temp, and freezer position of the Refrigerator
	 */
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("Min. temp.: " + this.getMinTempInCelsius() + " degrees Farenheit");
		System.out.println("Freezer: " + this.getFreezerPosition());
	}
}