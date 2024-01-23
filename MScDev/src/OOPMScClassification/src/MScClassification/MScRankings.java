package MScClassification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MScRankings {
	public static void main(String[] args) {
		
		ArrayList<StudentObj> students = readInStudentRecords("ModuleScoresMSc.csv"); 
		
		for (StudentObj current:students) {
			current.displayAll();
		}
		
	}
	
	public static ArrayList<StudentObj> readInStudentRecords(String filename) {
		String studentRecord;
		
		ArrayList<StudentObj>studentDetails = new ArrayList<>();
		
		try {
		File file = new File (filename);
		FileReader fr = new FileReader (file);
		BufferedReader br = new BufferedReader(fr);
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studentRecord = br.readLine();
		
		//looping across the element
		while (studentRecord != null) {
			
			String []parts = studentRecord.split(",");
			String studentNo = parts[0];
			String FirstName = parts[1];
			String Surname=parts[2];
			int programming =Integer.parseInt(parts[3]);
			int compFound = Integer.parseInt(parts[4]);
			int databases = Integer.parseInt(parts[5]);
			int webdev = Integer.parseInt(parts[6]);
			int softEng = Integer.parseInt(parts[7]);
			
			studentDetails.add(new StudentObj(studentNo, FirstName, Surname, programming, compFound, databases, webdev, softEng));
				
		}
				
	} catch (FileNotFoundException e) {
		System.err.println("file not found");
		// TODO Auto-generated catch block
		//e.printStackTrace();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end of programme ");
//	StudentObj Student1 = new StudentObj("10001", "Rory", "Bonnar", 45, 45, 56, 45, 45, 0);
//	
//	//array to store each object created and allow searches
//	StudentObj [] array = new StudentObj [5];
//	
//	array[0]=Student1;
//	
//	Student1.displayAll();
	return studentDetails;
	
	}
}
