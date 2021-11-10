package Mcq;

public class OutputCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num[] = { 5.5, 10.1, 11, 12.8, 56.9, 2.5 };
		double result;
		result = 0;
		for (int i = 0; i < 6; ++i)
			result = result + num[i];
		//System.out.print(result / 6);
		
		
		
		
		
		double a = 500;
        int  b = 300;
       // double f=a%b;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + " "  + d);
		
        
        
        
        int array_variable [] = new int[10];
	    for (int i = 0; i < 10; ++i) {
                array_variable[i] = i;
                System.out.print(array_variable[i] + " ");
                i++;
            }

	}
	
}
