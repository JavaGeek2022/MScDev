package CardChallengeOOP;

import java.util.Comparator;

public class compareCardBySuit implements Comparator<PlayingCard>{

	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {
		
		
		return o1.getSuit().compareTo(o2.getSuit());
	}

}
