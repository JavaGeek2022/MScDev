package CardChallengeOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CardDriver {

	public static void main(String[] args) {
		List<PlayingCard> myDeck = getNewDeck();
		System.out.println(myDeck);

		shuffleDeck(myDeck);
		System.out.println(myDeck);

		playHighCard(myDeck);

	}

	private static void playHighCard(List<PlayingCard> myDeck) {

		final int goal = 3;

		shuffleDeck(myDeck);
		int player1score = 0, player2score = 0;

		Queue<PlayingCard> dealer = new LinkedList<>(myDeck);

		if (dealer.size() % 2 != 0) {
			System.err.println("cards in deck: " + dealer.size());
			System.err.println("Even number of cards required to play");
			System.err.println("Discarding 1 card to balance it out");
			dealer.remove();

		}else if(dealer.size()<2){
			System.err.println("Not enough cards to play");
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Exiting method");
			return;
		}
		
		ArrayList<PlayingCard>p1deck = new ArrayList<>();
		ArrayList<PlayingCard>p2deck = new ArrayList<>();
		
		while (!dealer.isEmpty()) {
			p1deck.add(dealer.remove());
			p2deck.add(dealer.remove());
		}
		
		int round =1;
		
		Random rand = new Random();
		
		System.out.printf("High Card, Best of %d. First to %d wins.%n", ((goal * 2) - 1), goal);
		System.out.println("**************************************");
		
		while(player1score<goal && player2score<goal) {
			System.out.printf("Round %d%n", round);
			int p1index = rand.nextInt(p1deck.size());
			PlayingCard p1choice = p1deck.get(p1index);
			int p2index = rand.nextInt(p2deck.size());
			PlayingCard p2choice = p2deck.get(p2index);
			System.out.println("Player 1 chooses: " + p1choice.toString());
			System.out.println("Player 2 chooses: " + p2choice.toString());

			if (p1choice.getValue() > p2choice.getValue()) {
				System.out.println("Player 1 wins the round");
				player1score++;
			} else if (p2choice.getValue() > p1choice.getValue()) {
				System.out.println("Player 2 wins the round");
				player2score++;
			} else {
				System.out.println("Draw Round");
			}
			System.out.printf("Current Score: Player 1 (%d) | Player 2 (%d)%n", player1score, player2score);
			round++;
			
		}
		String result = player1score > player2score ? "Player 1 wins!!" : "Player 2 wins!!";
		System.out.println();
		System.out.println(result);
		System.out.printf("Final Score: Player 1 (%d) | Player 2 (%d)%n%n", player1score, player2score);
	

	}

	private static void shuffleDeck(List<PlayingCard> myDeck) {
		Collections.shuffle(myDeck);
	}

	private static void printDeck(List<PlayingCard> deck) {
		for (PlayingCard card : deck) {
			System.out.println(card.toString());
		}
	}

	private static List<PlayingCard> getNewDeck() {
		List<PlayingCard> deck = new ArrayList<>(52);

		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				deck.add(new PlayingCard(i, suit));
			}
		}

		return deck;
	}

}
