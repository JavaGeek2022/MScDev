package CardChallengeOOP;

public class PlayingCard {

		public static final int LOW_VALUE=2;
		public static final int HIGH_VALUE=14;
		
		private Suit Suit;
		private int value;
		
		
		
		
		/**
		 * constructor 
		 * @param suit
		 * @param value
		 */
		public PlayingCard(int value, Suit suit) {
			this.setValue(value);
			this.setSuit(suit);
			}
		
		/**
		 * @return the suit
		 */
		public Suit getSuit() {
			return Suit;
		}
		/**
		 * @param suit the suit to set
		 */
		public void setSuit(Suit suit) {
			Suit = suit;
		}
		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(int value) throws IllegalArgumentException{
			if(value >=LOW_VALUE && value <= HIGH_VALUE) {
			this.value = value;
			}
			else {
				throw new IllegalArgumentException("card face value must be between 2 and 14 ");
			}
		}
		
		/**
		 * switch statement to convert hand value to written number
		 * ie 2 = two
		 * @param value
		 * @return
		 */
		private String valueWord (int value) {
			String word = "ERROR";
			switch(value) {
			case 2: word = "Two"; break;
			case 3: word = "Three"; break;
			case 4: word = "Four"; break;
			case 5: word = "Five"; break;
			case 6: word = "Six"; break;
			case 7: word = "Seven"; break;
			case 8: word = "Eight"; break;
			case 9: word = "Nine"; break;
			case 10: word = "Ten"; break;
			case 11: word = "Jack"; break;
			case 12: word = "Queen"; break;
			case 13: word = "King"; break;
			case 14: word = "Ace"; break;
			}
			
			return word;
			
		}
		
		/**
		 * switch statement to convert suit to simpler text 
		 * @param suit
		 * @return
		 */
		private String suitWord (Suit suit) {
			String wordsuit = "ERROR";
			switch (suit) {
			case CLUBS: wordsuit = "Clubs"; break;
			case HEARTS: wordsuit = "Hearts"; break;
			case DIAMONDS: wordsuit = "Diamonds"; break;
			case SPADES: wordsuit = "Spades"; break;
			
			}
			
			return wordsuit;
		}
		
		/**
		 * 
		 * toostring method
		 */
		@Override
		public String toString() {
			return String.format("%s of %s", valueWord(this.value), suitWord(this.Suit));
		}
		
		
		
		
}
