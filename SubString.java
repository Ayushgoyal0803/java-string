import java.util.*;

class SubString{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scn.next();
		System.out.print("Enter start index: ");
		int start = scn.nextInt();
		System.out.print("Enter end index: ");
		int end = scn.nextInt();
		
		String subIn = s.substring(start,end);
		String subArr = subString(s,start,end);
		
		System.out.println("Substring using char array method '" + subArr + "'");
		System.out.println("Substring using in built method '" + subIn + "'");
		System.out.println("Are both the substring equals? " + subArr.equals(subIn));
	} 
	
	public static String subString(String s1, int start, int end){
		char[] arr = s1.toCharArray();
		String sub = "";
		
		for(int i=start;i<end;i++){
			sub += arr[i] + ""; 
		}
		
		return sub;
		
	}
}