package testPackage;

public class ArrayAverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] marks= {75,55,80,75};
		double sum=0;double avrg=0;
		for(int i=0;i<marks.length;i++) 
		{
			
			 sum=sum+marks[i];
		}
				avrg=sum/marks.length;
		System.out.println("The average of the marks is "+avrg);
		

	}

}
