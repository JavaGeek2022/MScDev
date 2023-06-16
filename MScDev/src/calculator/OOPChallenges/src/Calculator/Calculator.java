package calculator.OOPChallenges.src.Calculator;

public class Calculator {
	private int memory;
	
	public int addNumbers (int num1, int num2) {
		
		this.memory= num1+num2;
		System.out.printf("%d + %d = %d \n", num1, num2, memory);
		return memory;
	}
	
	public int subtract (int num1, int num2) {
		this.memory = num1-num2;
		System.out.printf("%d - %d = %d \n", num1, num2, memory);
		return memory;
	}
	
	public int multiply(int num1, int num2) {
		this.memory = num1*num2;
		System.out.printf("%d X %d = %d \n", num1, num2, memory);
		return memory;
	}
	
	public int divide (int num1, int num2) {
		this.memory = num1/num2;
		System.out.printf("%d / %d = %d \n", num1, num2, memory);
		return memory;
	}
	
	public double sqrRoot (int num1) {
		System.out.printf("Square root of %d is: %d ", num1, Math.sqrt(num1));
		return memory;
	}
	public void clearMemory() {
		this.memory = 0;
	}
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int num) {
		this.memory = num;
	}

}
