import java.util.Scanner;

class FrequentCharacter{
	public static void main(String[] args ){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = scn.next();
		s1 = s1.toLowerCase();
		
		char freqChar = mostFreq(s1); 
		 System.out.print("Most frequent character is: " + freqChar); 
	}
	
	public static char mostFreq(String s1){
		int[] freq = new int[26];
		
		for(int i=0;i<s1.length();i++){
			freq[s1.charAt(i) - 'a']++;
		}
		
		int max = 0;
		int maxIdx=-1;
		
		for(int i=0;i<26;i++){
			if(max < freq[i]){
				max = freq[i];
				maxIdx = i;
			}
		}
		
		
		return (char)(maxIdx + 'a');	
	} 

}

/*
Enter a string: sucess
Most frequent character is: s
*/