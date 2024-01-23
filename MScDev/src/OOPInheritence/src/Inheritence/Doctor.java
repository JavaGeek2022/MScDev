/**
 * 
 */
package Inheritence;

/**
 * @author 44782
 *
 */
public class Doctor extends staffMember {
	
	private int ward;
	
	

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param ward
	 */
	public Doctor(String firstName, String lastName, int ward) {
		super(firstName, lastName);
		this.setWard(ward);
		
	}

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}
	
	public String toString() {
		return "doctor " + this.getFirstName()+ " in ward " + ward;
	}
}
