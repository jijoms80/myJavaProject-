package testPackage;

public class SentenceContainstheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String inputString = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy";
		boolean isFound = inputString.contains("saw"); 
		if (isFound)
		{ System.out.println("Input String: " + inputString);
		System.out.println("Search String: " + "saw"); 
		}
		

		}
	}


