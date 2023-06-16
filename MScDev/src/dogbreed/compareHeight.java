package dogbreed;

import java.util.Comparator;

public class compareHeight implements Comparator<dog> {

	@Override
	public int compare(dog o1, dog o2) {
		// a negative integer, zero,
		// or a positive integer as thefirst argument is
		// less than, equal to, or greater than thesecond
		if (o1.getHeight() < o2.getHeight()) {
			return -1;
		}
		if (o1.getHeight() == o2.getHeight()) {
			return 0;
		}
		if (o1.getHeight() > o2.getHeight()) {
			return 1;
		}else {
			return -2;
		}

	}

}
