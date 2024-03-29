package Inheritence;

public class staffMember {
	
	private String firstName;
	private String lastName;
	
	public staffMember() {
		//null constructor created 
	}
	/**
	 * constructor created 
	 * @param firstName
	 * @param lastName
	 */
	public staffMember(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String toString() {
		return String.format("staffMember [firstName=%s, lastName=%s]", firstName, lastName);
	}
	
	

}
