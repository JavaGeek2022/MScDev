package dogbreed;

import java.util.Comparator;

public class compareWeight implements Comparator<dog> {

	@Override
	public int compare(dog o1, dog o2) {

		if (o1.getWeight() < o2.getWeight()) {
			return 1;
		}
		if (o1.getWeight() == o2.getWeight()) {
			return 0;
		} else {
			return -1;
		}

	}

}
