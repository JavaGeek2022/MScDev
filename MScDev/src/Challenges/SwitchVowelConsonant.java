package Challenges;
import java.util.Scanner;

public class SwitchVowelConsonant {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please input the character you wish to know about: ");
		String inputLetter = sc.next();
		 
		char c =  inputLetter.toLowerCase().charAt(0);
		 Character.isLetter(c); 
		 switch (c) {
		 		 
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 System.out.println("Vowel");
			 break;
		 case 'b':
		 case 'c':
		 case 'd':
		 case 'f':
		 case 'g':
		 case 'h':
		 case 'j':
		 case 'k':
		 case 'l':
		 case 'm':
		 case 'n':
		 case 'p':
		 case 'q':
		 case 'r':
		 case 's':
		 case 't':
		 case 'v':
		 case 'x':
		 case 'y':
		 case 'z':
		 System.out.println("consonant");
			 break;
			 default:
			 System.out.println("Unrecognised character ");
			 sc.close();
		 }
				
	}

}
