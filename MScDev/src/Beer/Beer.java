package Beer;

public class Beer {
	private String beerName;
	private String beerStyle;
	private String country;
	private double alcoholPercent;

	/**
	 * @param beerName
	 * @param beerStyle
	 * @param country
	 * @param alcoholPercent
	 */
	public Beer(String beerName, String beerStyle, String country, double alcoholPercent) {
		super();
		this.setBeerName(beerName);
		this.setBeerStyle(beerStyle);
		this.setCountry(country);
		this.setAlcoholPercent(alcoholPercent);
		}

	public static void displayAll() {
		System.out.println("____________________");
		System.out.println("");
		
		System.out.println("____________________");
	}
	/**
	 * @return the beerName
	 */
	public String getBeerName() {
		return beerName;
	}

	/**
	 * @param beerName the beerName to set
	 */
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	/**
	 * @return the beerStyle
	 */
	public String getBeerStyle() {
		return beerStyle;
	}

	/**
	 * @param beerStyle the beerStyle to set
	 */
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the alcoholPercent
	 */
	public double getAlcoholPercent() {
		return alcoholPercent;
	}

	/**
	 * @param alcoholPercent the alcoholPercent to set
	 */
	public void setAlcoholPercent(double alcoholPercent) {
		this.alcoholPercent = alcoholPercent;
	}
	
}
