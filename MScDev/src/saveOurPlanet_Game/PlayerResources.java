package saveOurPlanet_Game;

/**
* @author SusieMagill - 40028330
*/

//SOP12 - Assigning player resources
public class PlayerResources {

	private int resources;
	
	//Assigning initial credits of 2000
	public PlayerResources() {
		setResources(2000);
	}
	
	public PlayerResources(int resources) {
		setResources(resources);
	}
	
	public int getResources() {
		return resources;
	}

	public void setResources(int resources) {
		this.resources = resources;
	}
	
	//Player makes a purchase
	public void deductBalance(int amount) {
		resources -= amount;
	}
	
	//Player receives a credit
	public void addToBalance(int amount) {
		resources += amount;
	}

	//For testing purposes
	public void displayResources() {
		System.out.println(resources);
	}
	
}
