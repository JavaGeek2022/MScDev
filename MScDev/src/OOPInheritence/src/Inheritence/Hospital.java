package Inheritence;

public class Hospital {
	
	public static void main(String[] args) {
		
		staffMember s1 = new staffMember("Rory", "Bonnar");
		staffMember s2 = new staffMember("Jimmy", "sheldon");
		Doctor s3 = new Doctor("Sarah", "porter", 45);
		programmer s4 = new programmer("Clare", "Rodgers", "Python");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s2.getFirstName());
		System.out.println("getting last name of staffMember class and object S1: "
		+s1.getLastName());
		
		//putting staffmembers into an array of employee roster
		
		staffMember [] employeeRoster = new staffMember[4];
		
		employeeRoster[0]= s1;
		employeeRoster[1]= s2;
		employeeRoster[2]= s3;
		employeeRoster[3]= s4;
		
		for (staffMember e:employeeRoster) {
			System.out.println(e);
		}
		
		
		
	}

}
