import java.util.*;

class LongestWord{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String s = scn.nextLine();
		String[] stringArr = s.split(" ");
		int longestWord = stringArr[0].length();
		String longest = stringArr[0];
		
		
		for(int i=1; i<stringArr.length; i++){
			if(longestWord < stringArr[i].length()){
				longestWord = stringArr[i].length();
				longest = stringArr[i];
			}			
			
		}
		
		System.out.print("Longest word in string sentence: \"" + longest + "\"");		
		
	}	

}

/*
Enter a sentence: sadasdsaf sdsaefeerdscdc ssa fdser dsadas
Longest word in string sentence: "sdsaefeerdscdc"
*/

