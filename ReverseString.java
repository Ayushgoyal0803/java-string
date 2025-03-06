import java.util.Scanner;

class ReverseString{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.next();
		String reversedString = "";
			
		
		for(int i=0; i< s.length(); i++ ){
			char c = s.charAt(i);
			
			reversedString = c + reversedString; 
		}
		
		System.out.print("String: \""+ s +"\"\nreversed string: \"" + reversedString + "\"");
		
	}	

}

/*Enter a string: ASSEDascvbjASxAzd
String: "ASSEDascvbjASxAzd"
reversed string: "dzAxSAjbvcsaDESSA"
*/

