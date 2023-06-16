package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {

	public static void main(String[] args) {

		CheckException ck = new CheckException();

		try {
			ck.iAmChecked();
		} catch (FileNotFoundException e) {
			System.out.println("File not found I think...");
		}

	}

	public void iAmChecked() throws FileNotFoundException {

		FileReader fr = new FileReader("nothere.txt");

	}
}
