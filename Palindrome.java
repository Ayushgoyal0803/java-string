import java.util.Scanner;

class Palindrome{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.next();
		char[] charArr = s.toLowerCase().toCharArray(); // converting string into char array
		int start =0;
		int end = charArr.length-1; 		
			
		
		boolean flag = true; // to keep track if string is palindrome
		
		while(start < end && flag){
			if(charArr[start] == charArr[end]){ // to check if characters match or not
				flag = true; //updating status to keep check if string is palindrome
			}
			else{
				flag = false;
			}
			
			start++;
			end--;
		}
		
		System.out.print("Is the given string palindrome: " + flag);
		
		
		
	}	

}


/*Enter a string: Racecar
Is the given string palindrome: true
*/

/*Enter a string: Ayush
Is the given string palindrome: false
*/