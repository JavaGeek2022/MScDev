package Challenges;

import java.util.Scanner;

public class CodeBreaker {
	public static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		String name;
		
		//scanner in for name input
		name = nameInput();
		//method to encode inputted name
		int [] encoded = ASCIIencode(name);
		
		//method to decode inputted name
		Decode(encoded);
	}
	
	public static String nameInput() {
		String name;
		System.out.println("Please input the text you wish converted to ASCII");
		name=sc.next();
		
		return name;
	}
	public static int []ASCIIencode(String name) {
		int [] encoded = new int [name.length()];
		char letter;
		int index;
		
		for (int i=0; i<name.length(); i++) {
			letter=name.charAt(i);
			index=letter;
			encoded[i]=index;
			System.out.println("Letter "+ letter +" in ASCII = "+ index);
		}
		System.out.println();
		return encoded;
	}
	public static void Decode (int []encoded) {
		char letter;
		
		for (int i=0; i<encoded.length; i++) {
		letter=(char)encoded[i];
		System.out.println("testing print of Letter "+ letter);
		}
	}

}
