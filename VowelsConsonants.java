import java.util.Scanner;

class VowelsConsonants{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=scn.next();
		int[] result=convert(str);
		System.out.println("Count of Vowels: "+result[0]+"\nCount of Consonants: "+result[1]);
		
	}
	
	// Method to count vowels and consonants in a given string
	public static int[] convert(String s){
		s=s.toLowerCase();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
					vowelCount++;
				}
				else{
					consonantCount++;
				}
			}
		}
		
		// Return an array containing both vowel and consonant counts
		return new int[]{vowelCount,consonantCount};
	}
}
/*
Enter a string: AyushGoyal
Count of Vowels: 4
Count of Consonants: 6
*/
	