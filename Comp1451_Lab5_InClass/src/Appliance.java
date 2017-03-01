/**
 * Appliance class that stores dimensions, manufacturer name, and serial number
 * of the appliance
 * 
 * @author Ronnie Manimtim
 * @version 1.0 18 Feb 2016
 */
public class Appliance {

	private final double DEFAULT_ZERO_CM = 0.00;

	private double heightInCm;
	private double widthInCm;
	private double depthInCm;
	private String manufacturer;
	private String serialNumber;

	/**
	 * 
	 */
	public Appliance(double heightInCm, double widthInCm, double depthInCm, String manufacturer, String serialNumber) {

		setHeightInCm(heightInCm);
		setWidthInCm(widthInCm);
		setDepthInCm(depthInCm);
		setManufacturer(manufacturer);
		setSerialNumber(serialNumber);
	}

	/**
	 * @return the heightInCm
	 */
	public double getHeightInCm() {

		return heightInCm;
	}

	/**
	 * @param heightInCm
	 *            the heightInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setHeightInCm(double heightInCm) {

		if (heightInCm > DEFAULT_ZERO_CM) {
			this.heightInCm = heightInCm;
		}
	}

	/**
	 * @return the widthInCm
	 */
	public double getWidthInCm() {

		return widthInCm;
	}

	/**
	 * @param widthInCm
	 *            the widthInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setWidthInCm(double widthInCm) {

		if (widthInCm > DEFAULT_ZERO_CM) {
			this.widthInCm = widthInCm;
		}
	}

	/**
	 * @return the depthInCm
	 */
	public double getDepthInCm() {

		return depthInCm;
	}

	/**
	 * @param depthInCm
	 *            the depthInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setDepthInCm(double depthInCm) {

		if (depthInCm > DEFAULT_ZERO_CM) {
			this.depthInCm = depthInCm;
		}
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {

		return manufacturer;
	}

	/**
	 * @param manufacturer
	 *            the manufacturer to set can not equal null
	 */
	public void setManufacturer(String manufacturer) {

		if (manufacturer != null) {
			this.manufacturer = manufacturer;
		}
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {

		return serialNumber;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set can not equal null
	 */
	public void setSerialNumber(String serialNumber) {

		if (serialNumber != null) {
			this.serialNumber = serialNumber;
		}
	}
}