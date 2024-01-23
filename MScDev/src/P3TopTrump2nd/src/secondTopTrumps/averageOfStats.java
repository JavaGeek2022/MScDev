package secondTopTrumps;

import java.util.Comparator;

public class averageOfStats implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		
		int avg1= (o1.getSpeed()+o1.getStrength()+o1.getAgility()+o1.getIntelligence())/4;
		int avg2 =	(o2.getSpeed()+o2.getStrength()+o2.getAgility()+o2.getIntelligence())/4;
		return avg1-avg2;
	}

}
