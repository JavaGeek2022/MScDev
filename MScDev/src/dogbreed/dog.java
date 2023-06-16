package dogbreed;

import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class dog {

	private String breed;
	private double weight;
	private double height;
	private double lifeExpec;
	private String colour;
	private String country;

	/**
	 * @param breed
	 * @param weight
	 * @param height
	 * @param lifeExpec
	 * @param colour
	 * @param country
	 */
	public dog(String breed, double weight, double height, double lifeExpec, String colour, String country) {
		super();
		this.setBreed(breed);
		this.setWeight(weight);
		this.setHeight(height);
		this.setLifeExpec(lifeExpec);
		this.setColour(colour);
		this.setCountry(country);

	}

	@Override
	public String toString() {
		return String.format("dog [breed=%s, weight=%s, height=%s, lifeExpec=%s, colour=%s, country=%s]", breed, weight,
				height, lifeExpec, colour, country);
	}

	public void displayAll(List<dog> inputlist) {
		System.out.println("_".repeat(20));
		System.out.println(this.getBreed());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Weight: " + this.getWeight());
		System.out.println("Life Expectancy: " + this.getLifeExpec());
		System.out.println("Colour: " + this.getColour());
		System.out.println("Country of Origin: " + this.getCountry());
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {

		Pattern pattern = Pattern.compile("[!*&%]");
		Matcher matcher = pattern.matcher(breed);
		
		boolean matchFound = matcher.find();
		
		if (matchFound) {
			this.breed = "invalid";
			//throw new IllegalArgumentException("Name contains invalid characters");

		}else 
		this.breed = breed;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the lifeExpec
	 */
	public double getLifeExpec() {
		return lifeExpec;
	}

	/**
	 * @param lifeExpec the lifeExpec to set
	 */
	public void setLifeExpec(double lifeExpec) {
		this.lifeExpec = lifeExpec;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
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

	@Override
	public int hashCode() {
		return Objects.hash(breed, colour, country, height, lifeExpec, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dog other = (dog) obj;
		return Objects.equals(breed, other.breed) && Objects.equals(colour, other.colour)
				&& Objects.equals(country, other.country)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(lifeExpec) == Double.doubleToLongBits(other.lifeExpec)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
