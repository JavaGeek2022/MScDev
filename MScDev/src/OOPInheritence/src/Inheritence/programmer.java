package Inheritence;

public class programmer extends staffMember{
	
	private String language;
/**
 * 
 * @param firstName
 * @param lastName
 * @param language
 */
	public programmer(String firstName, String lastName, String language) {
		super(firstName, lastName);//calling the parent class constructor for firstname and lastname
		this.setLanguage(language);
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String toString() {
		return "Programmer " + this.getFirstName() + " uses " + this.getLanguage()+ " to program";
	}

}
