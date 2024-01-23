package secondTopTrumps;

import java.util.Comparator;

public class compareByStrength implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		// TODO Auto-generated method stub
		return o1.getStrength()-o2.getStrength();
	}

}
