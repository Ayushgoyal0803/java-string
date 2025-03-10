import java.util.Scanner;

class StringIndexException{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String text=scn.nextLine();
		
		System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
		try{
			generateException(text);
		}
		catch(Exception e){
			System.out.println("Caught Exception in main: " + e);
		}
		System.out.println("\nHandling StringIndexOutOfBoundsException:");
		handleException(text);
	}
	
	
	public static void generateException(String str){
		int invalidIndex=str.length();
		 System.out.println("Character at invalid index " + invalidIndex + ": " + str.charAt(invalidIndex));
	}
	
	
	public static void handleException(String str) {
        int invalidIndex = str.length(); // Accessing index beyond valid range
        try {
            System.out.println("Character at invalid index " + invalidIndex + ": " + str.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index " + invalidIndex + " is out of bounds for string of length " + str.length());
        }
    }
}


/*

Enter a string: dfj

Demonstrating StringIndexOutOfBoundsException:
Caught Exception in main: java.lang.StringIndexOutOfBoundsException: Index 3 out of bounds for length 3

Handling StringIndexOutOfBoundsException:
Exception caught: Index 3 is out of bounds for string of length 3

*/