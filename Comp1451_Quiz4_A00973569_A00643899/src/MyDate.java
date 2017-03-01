/**
 * 
 */

/**
 * @author Ronnie Manimtim and Ollie Sabacan
 * @version 2 Feb 2016
 */
public class MyDate {

	private int day;
	private int month;
	private int year;

	/**
	 * 
	 */
	public MyDate() {

		day = 20;
		month = 2;
		year = 2016;
	}

	public MyDate(int day, int month, int year) {

		setDay(day);
		setMonth(month);
		setYear(year);
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {

		this.year = year;
	}

	/**
	 * @param day
	 * @return
	 */
	public String getDayOfTheWeek(int day) {

		String dayName = "Please try again.";

		if (day >= 0 && day <= 6) {

			if (day == 0) {
				dayName = "Sunday";

			} else if (day == 1) {
				dayName = "Monday";

			} else if (day == 2) {
				dayName = "Tuesday";

			} else if (day == 3) {
				dayName = "Wednesday";

			} else if (day == 4) {
				dayName = "Thursday";

			} else if (day == 5) {
				dayName = "Friday";

			} else if (day == 6)
				dayName = "Saturday";
		}
		return dayName;
	}

}
