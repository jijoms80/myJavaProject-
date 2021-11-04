package Assignments;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//int temp=0;
		int[] tenNumber = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<tenNumber.length;i++) {
			 sum = sum+tenNumber[i];
		//sum=sum+temp;
		}
		System.out.println("Sum of the ten numbers is :"+sum);
	}

}
