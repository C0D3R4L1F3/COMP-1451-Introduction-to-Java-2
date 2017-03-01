/**
 * Appliance class that stores dimensions, manufacturer name, and serial number of the appliance
 * @author Ronnie Manimtim
 * @version 2.0 18 Feb 2016
 */
public class Appliance {
	
	private final double DEFAULT_ZERO_CM = 0.00;
	
	private double heightInCm;
	private double widthInCm;
	private double depthInCm;
	private String manufacturer;
	private String serialNumber;

	/**
	 * @param heightInCm given heightInCm will be stored and set
	 * @param widthInCm given widthInCm will be stored and set
	 * @param depthInCm given depthInCm will be stored and set
	 * @param manufacturer given manufacturer will be stored and set
	 * @param serialNumber given serialNumber will be stored and set
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
	 * @param heightInCm the heightInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setHeightInCm(double heightInCm) {
		
		if(heightInCm > DEFAULT_ZERO_CM) {
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
	 * @param widthInCm the widthInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setWidthInCm(double widthInCm) {
		
		if(widthInCm > DEFAULT_ZERO_CM) {
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
	 * @param depthInCm the depthInCm to set can not be less than DEFAULT_ZERO_CM
	 */
	public void setDepthInCm(double depthInCm) {
		
		if(depthInCm > DEFAULT_ZERO_CM) {
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
	 * @param manufacturer the manufacturer to set can not equal null
	 */
	public void setManufacturer(String manufacturer) {
		
		if(manufacturer != null){
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
	 * @param serialNumber the serialNumber to set can not equal null
	 */
	public void setSerialNumber(String serialNumber) {
		
		if(serialNumber != null){
			this.serialNumber = serialNumber;
		}
	}
	
	
	/**
	 * Displays the dimensions, manufacturer, and serial number of the Appliance
	 */
	public void displayDetails() {
		
		System.out.println("h,w,d (cm): " + this.getDepthInCm() + ", " + this.getWidthInCm() + ", " + this.getDepthInCm());
		System.out.println("Made by: " + this.getManufacturer());
		System.out.println("Serial #: " + this.getSerialNumber());
	}
}