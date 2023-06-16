package Challenges;

public class mathPowTesting {
public static void main(String[] args) {
	
	System.out.println("variable\t MathPow");
	int math=0;
	for (int i=1; i<=8; i++) {
		math=(int)Math.pow(2, i);
		System.out.println(i+"\t\t"+math);
	}
}
}
