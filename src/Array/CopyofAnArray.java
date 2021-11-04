package Array;

import java.util.Arrays;

public class CopyofAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0;
		int[] number = { 29, 20, 14 };
		int[] copyNumber = new int[3];
		System.out.println("Before copying");
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copyNumber));
         while(i<number.length) {
        	 copyNumber[i]=number[i];
        	i++;
         }
		System.out.println("After copying");
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copyNumber));
	}

}
