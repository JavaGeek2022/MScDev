package Challenges;

public class FizzBuzz {
	
	public static void main(String[] args) {
		//program to print numbers 1-100
		
		//multiples of 3 print Fizz
		//multiples of 5 print Buzz
		//multiples of 3&5 print Fizz Buzz
		int number =1;
		for (int i=1; i<=100; i++) {
			
			if (number%15==0) {
				System.out.println("Fizz Buzz");
				number++;
			}
			else if (number%5==0) {
				System.out.println("Buzz");				
				number++;
				}
			else if (number%3==0) {
				System.out.println("Fizz");
				number++;
			}

			else {
				System.out.println(number);
				number++;
			}
			
		}
	}

}
