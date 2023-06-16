package Challenges;

public class BinaryFinary {
	public static void main(String[] args) {

		boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
		int[] binaryArray = new int[eightBitArray.length];
		int one = 1;
		int zero = 0;

			System.out.print("The array in binary would look like: ");
		for (int i = 0; i < eightBitArray.length; i++) {
			if (eightBitArray[i] == true) {
				System.out.print("1");
				binaryArray[i] = one;
			} else if (eightBitArray[i] == false) {
				System.out.print("0");
				binaryArray[i] = zero;
			}
		}
		System.out.println();
		System.out.println();
		DecimalValue(binaryArray);

	}

	public static void DecimalValue(int[] binaryArray) {
		// binary array 1, 0, 0 ,1, 0,1,0,1 being brought in
		// binary table 128,64,32,16,8,4,2,1
		int[] binaryTable = new int[] { 128, 64, 32, 16, 8, 4, 2, 1 };
		int sum = 0;
	
		for (int i = 0; i < binaryArray.length; i++) {
			if (binaryArray[i] == 1) {
				int j = i;
				sum += binaryTable[j];
			}
		}

		System.out.println("The decimal value of this piece of binary would be = " + sum);
		// return total;
		// Can't calculate the maths here to get the binary value at index other than
		// counting array
//		//poor code and not extendable	
//		for (int i = binaryArray.length-1; i >= 0; i--) {
//			//counting in reverse so the .Pow works correctly across array 
//			

//			sum += (int)Math.pow(i+1,(binaryArray[i]));
//			//sum+= (int)Math.pow(8, 1);
//			System.out.println("Printing the element to the power of array index");
//			System.out.println(sum);

		// System.out.println("sum value now: " + sum);
	}

}
