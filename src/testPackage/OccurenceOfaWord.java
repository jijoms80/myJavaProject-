package testPackage;

public class OccurenceOfaWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String string = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy";
			String word = "happy";
			
			
			String temp[] = string.split(" ");
			int count = 0;
			
			for (int i = 0; i < temp.length; i++)
			{
				String wrd=temp[i];
			if (wrd.contains(word))
				
			count++;
			}
			System.out.println("The string is: " + string);
			System.out.println("The word " + word + " occurs " + count );
			
			
					}
		
	}


