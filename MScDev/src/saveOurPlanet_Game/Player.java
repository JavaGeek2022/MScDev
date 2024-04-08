package saveOurPlanet_Game;



public class Player {
	//constant value for initial resources
	public static final int INITIAL_RESOURCES = 2000;
	
    private String name;
    private int currentPosition;
    private int ecoCreditsBalance;
    private boolean bankruptStatus;

    //player registration constructor
    public Player(String name) {
        this.name = name;
        this.ecoCreditsBalance = INITIAL_RESOURCES;
        this.currentPosition = 0; // Assuming the starting position on the board is 0
        this.bankruptStatus = false;
    }

    // Method to move the player on the board
    public void move(int steps) {
        currentPosition = (currentPosition + steps) % 12;
    }

    // Method to handle transactions (add or deduct money)
    public void transact(int amount) {
        ecoCreditsBalance += amount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPosition() {
        return currentPosition;
    }

    public int getResources() {
        return ecoCreditsBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.currentPosition = position;
    }

    public void setResources(int Resources) {
        this.ecoCreditsBalance = Resources;
    }

    public void displayBalance (int currentResources) {
    	
    System.out.println("Player balance = "+ currentResources);	
    	
    }
    public boolean playerBankrupt (int currentResources) {
		
    	if (currentResources < 0) {
    		
    		bankruptStatus = true;
    		
    	}else{
    		
    		bankruptStatus = false;
    	}
    	
    	
    	return bankruptStatus;
    	
    }
    
    
    
    
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position=" + currentPosition +
                ", resources=" + ecoCreditsBalance +
                '}';
    }
}
