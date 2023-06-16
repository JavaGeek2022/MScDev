package Exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		UncheckedException unc = new UncheckedException();
		try {
			unc.checkNumber(6,0);
		} catch (ArithmeticException arithmeticException){
			System.out.println("That was a zero");
			System.err.println("REALLY BAD THING JUST HAPPENED!!!");
			//arithmeticException.printStackTrace();
		}
	}
	
	
	/**
	 * This method divides by a number 
	 * @param number
	 * @throws ArithmeticException - if a zero is passed in
	 */
	public void checkNumber(int num1, int num2) throws ArithmeticException {
		if (num2==0){
			throw new ArithmeticException("A Zero");
		} else {
			System.out.println(num1/num2);
		}
	}
}
