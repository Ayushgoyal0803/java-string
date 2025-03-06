import java.util.*;

class Duplicates{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.next();
		char[] charArr = s.toLowerCase().toCharArray(); // converting string into char array
		HashSet<Character> hs = new HashSet<>();	
		String newString = ""; 	
		
		
		for(int i=0; i<charArr.length; i++){
			if(hs.contains(charArr[i])){ // to check if characters are duplicate or not
				continue;
			}
			else{
				hs.add(charArr[i]);
				newString += charArr[i];
			}			
		}
		
		System.out.print("Modified string: \"" + newString + "\"");		
		
	}	

}

/*Enter a string: aassddccrtyuiopppssderffsscvbnn
Modified string: "asdcrtyuiopefvbn"
*/


