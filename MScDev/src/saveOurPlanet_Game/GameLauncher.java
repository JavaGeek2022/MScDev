package saveOurPlanet_Game;

import java.util.List;


import saveOurPlanet_Game.Game;


public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rules printed to console with welcome message
		Game.rules();
		
		//Enter number of players
		int numOfPlayers = Game.enterNumPlayers();
		
		//SOP-08 - Enter player names - takes integer from enterNumPlayers() method
		List<Player> player = Game.playerRegistration(numOfPlayers); 
		
		//setup board
        Board boardSetup = new Board();
        
		//SOP19 - take turn
		Game.optionToTakeTurn(player, boardSetup);
		
		

		
	}

}
