package saveOurPlanet_Game;

import java.util.ArrayList;

/*
 * @author Rory 
 * SOP 22 & 25
 */
public class Board {
	
	/*
	 * need to create a class of Square with getters/setters to include
	 * squareName
	 * fieldName
	 * owner = playerName
	 * owned = boolean
	 * purchase price
	 * MinorDev = int
	 * Major Dev = boolean
	 */
	
    private ArrayList<Square> squares;

    //setting static costs as per SOP22 and rents for scalability (only need changed once)
    private final int homeFieldCost = 150;
    private final int SupplyChainCost = 50;
    private final int biodiversityCost = 100;
    private final int transportCost = 200;
    
    private final double minorDevCost = 0.2; //one fifth of cost
    private final double majorDevCost = 0.6; //three fifth of cost
    
    
    public Board() {
    	//declare array
        squares = new ArrayList<>();
        
        // Add squares to the board using constructor(s)/subclasses- 
        squares.add(new Square("Pass Go", 0, 0, false)); //start square at position 1
        
        squares.add(new Square("Nothing Happens", 0, 0, false)); //as per specification this is square 2
        
        squares.add(new HomeField("Heating", true, Field.HOME, homeFieldCost, (int) ((homeFieldCost*minorDevCost)), false));
        squares.add(new HomeField("Cooling", false, Field.HOME, homeFieldCost, (int) ((homeFieldCost*minorDevCost)),  false));
        squares.add(new HomeField("Waste", false, Field.HOME, homeFieldCost,  (int) ((homeFieldCost*minorDevCost)),  false));

        squares.add(new SupplyChainField("Packaging", true, Field.SUPPLYCHAIN, SupplyChainCost,  (int) ((SupplyChainCost*minorDevCost)),  false));
        squares.add(new SupplyChainField("Farming", false, Field.SUPPLYCHAIN, SupplyChainCost, (int) ((SupplyChainCost*minorDevCost)),  false));

        squares.add(new BiodiversityField("Forests", false, Field.BIODIVERSITY, biodiversityCost, (int) ((biodiversityCost*minorDevCost)),  false));
        squares.add(new BiodiversityField("Seas", false, Field.BIODIVERSITY, biodiversityCost, (int) ((biodiversityCost*minorDevCost)),  false));
        squares.add(new BiodiversityField("Crops", false, Field.BIODIVERSITY, biodiversityCost, (int) ((biodiversityCost*minorDevCost)),  false));

        squares.add(new TransportField("Personal Transport", false, Field.TRANSPORT, transportCost, (int) ((transportCost*minorDevCost)), false));
        squares.add(new TransportField("Freight", false, Field.TRANSPORT, transportCost, (int) ((transportCost*minorDevCost)),  false));

        
              
        //testing that all details stored correctly and printed from method below
        //printBoardDetails();
    }
    /*
     * method to retrieve squares for accessing monopoly object board
     */
    public ArrayList<Square> getSquares() {
        return squares;
    }
    /*
     * print method for squares that contain attributes
     * Pass go and nothing happens square no 'rent' etc displayed
     * as per if statement below
     */
    public void printBoardDetails(int position) {
    	//System.out.println("Board details");
    	int i = 1;
    	Square square = squares.get(position);
    	
    		if (square.getName().equals("Pass Go") || square.getName().equals("Nothing Happens")) {
    			System.out.println("Square " + i++ + ": " + square.getName());
              
    		}else {
    			System.out.println("Square " + i++ + ": " + square.getName());
    			System.out.println("Field: "+ square.getField());
                System.out.println("    Purchase Cost: " + square.getPurchaseCost());
                System.out.println("    Minor Dev Rent: " + square.getMinorDev());
                System.out.println("    Major Dev Rent: " + square.getMajorDev());
                System.out.println("    Is owned: " + square.isOwned());
                System.out.println();
    		}    		
    	}          
    }
