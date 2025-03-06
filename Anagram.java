import java.util.*;

class Anagram{
	public static boolean Anagram(String s1, String s2){
		if(s1==null || s2 == null || s1.length() != s2.length()){
			return false;
		}
		
		int[] arr = new int[26];
		int n = s1.length(); // length of string
		
		for(int i=0;i<n;i++){
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			arr[c1 - 'a']++;
			arr[c2 - 'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(arr[i] % 2==0){
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = scn.next();
		s1 = s1.toLowerCase();
		
		System.out.print("Enter a string: ");
		String s2 = scn.next();
		s2 = s2.toLowerCase();
		
		
		
		System.out.print("Are two strings are anagram of each other: " + Anagram(s1,s2) );		
		
	}	

}



/*
Enter a string: listen
Enter a string: silent
Are two strings are anagram of each other: true
*/