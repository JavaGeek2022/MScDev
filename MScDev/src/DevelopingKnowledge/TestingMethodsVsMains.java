package DevelopingKnowledge;

import java.util.Scanner;

public class TestingMethodsVsMains {
	
	public static void sayHello() {
		// Simple print statement method
		System.out.println("calling method sayHello");
	}
	public static void dataIn() {
		//Scanner method 
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please input your name: ");
		String Name = scanner.next();
		
		System.out.println("you have inputted " + Name + " as your name");
		scanner.close();
	}
	
	public static void main (String[]args) {
		
		dataIn();  //calling the dataIn scanner method 
		
		//sayHello(); //testing the method calling function as print statement 
	}

}
