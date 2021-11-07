package Assignments;

import sun.security.util.Length;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = new int[10];
		int sum = 0;
		for (int i = 0; i < test.length; i++)
			if (i == 0) {
				test[i] = test[i] + 1;
				System.out.println(test[i]);
			} else {
				test[i] = test[i - 1] + 1;

				System.out.println(test[i]);
			}
		for (int i = 0; i < test.length; i++)

		{
			int temp=test[i];
			
 sum= sum+temp;
		}
 System.out.println(sum);
 
 int a=100;
 int b=5;
 b=b+a;
 a=b-a;
 b=b-a;
 System.out.println(a);
 System.out.println(b);
		}	}
