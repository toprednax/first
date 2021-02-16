
public class first {
	/**
	 * @invar het aantal uren ligt tussen 0 en 23 uur.
	 *		| 0 <= hours <= 23
	 */
	private int hours;
	/**
	 * @invar het aantal minuten ligt tussen 0 en 59.
	 * 		| 0 <= minutes <= 59
	 */
	private int minutes;
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	/**
	 * Stelt het aantal uur van de tijd op.
	 * 
	 * @post Het aantal uren is gelijk aan het gegeven aantal uren.
	 * 		| getHours() == hours
	 */
	public void setHours(int hours) {
		if (hours>23 || hours < 0)
			throw new IllegalArgumentException("Het uur moet tussen 0 en 24 uur liggen");
		this.hours = hours;
	}
	/**
	 * Stelt het aantal minuten van de tijd op
	 * 
	 *@post Het aantal minuten is gelijk aan het gegevan aantal minuten.
	 * 		| getMinutes() == minutes
	 */
	
	public void setMinutes(int minutes) {
		if (minutes>59 || minutes < 0)
			throw new IllegalArgumentException("Het aantal minutes moet tussen 0 en 60 liggen");
		this.minutes = minutes;
	}
	
}
