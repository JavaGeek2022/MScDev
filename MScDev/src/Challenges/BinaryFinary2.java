package Challenges;

public class BinaryFinary2 {
	public static void main(String[] args) {
		
		boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
		
		//write a method that will output the 
		//array as a 0 or 1 based number representation; where true =1 and false = 0 i.e.
		int binary[]=binary(eightBitArray);
		
		//write a method that will out put the decimal value of the binary array
		System.out.println(convertToDecimal(binary));
	}
	
	
	public static int []binary(boolean eightBitArray[]) {
		int binary[]=new int [eightBitArray.length];
		
		for (int i=0; i<eightBitArray.length; i++) {
			if (eightBitArray[i]==true) {
				binary[i]=1;
			}
			else if(eightBitArray[i]==false) {
				binary[i]=0;
			}System.out.print(binary[i]);
		}
		
		return binary;
	}
	public static int convertToDecimal(int binary[]) {
		int decimal=0;
	
		for (int i=binary.length-1; i>=0; i--) {
			if(binary[i]==1) {
				
				decimal += Math.pow(2, binary.length - i - 1);
			}
		}System.out.println();
		
		return decimal;
	}

}
