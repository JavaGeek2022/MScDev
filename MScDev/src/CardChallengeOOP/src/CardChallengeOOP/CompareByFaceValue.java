package CardChallengeOOP;

import java.util.Comparator;

public class CompareByFaceValue implements Comparator<PlayingCard> {

	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {
		
		return o1.getValue()-o2.getValue();
	}

	
}
