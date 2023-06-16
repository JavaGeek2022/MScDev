package DevelopingKnowledge;

public class MethodsWithDogBreed {
	// instances here
	String breed;
	boolean hasOwner;
	int age;

	public MethodsWithDogBreed(String dogBreed, boolean dogOwned, int dogYears) {
		  //constructor method
		  
	    breed = dogBreed;
	    hasOwner = dogOwned;
	    age = dogYears;
	  }

	public static void main(String[] args) {
		System.out.println("Main method started");
		MethodsWithDogBreed fido = new MethodsWithDogBreed("poodle", false, 4);
		MethodsWithDogBreed nunzio = new MethodsWithDogBreed("shiba inu", true, 12);

		boolean isFidoOlder = fido.age > nunzio.age;
		int totalDogYears = nunzio.age + fido.age;
		System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
		System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
		System.out.println("The total age of the dogs is: " + totalDogYears);
		System.out.println("Main method finished");
	}
}
