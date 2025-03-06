import java.util.Scanner; 

class CompareStrings{
	
	public static boolean compare(String s1, String s2){
		if(s1==null || s2 == null || s1.length() != s2.length()){
			return false;
		}
		
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		for(int i=0;i<charArr1.length;i++){
			if(charArr1[i]!=charArr2[i]){
				return false;
			}
		}
		return true;
	
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = scn.next();
		System.out.print("Enter second string: ");
		String s2 = scn.next();
		
		
		System.out.println("Are the two strings equals using char array? " + compare(s1,s2));
		System.out.println("Are the two strings equals using inbuilt function? " + s1.equals(s2) );
		
		
		
	}
}

/*
Enter first string: equals
Enter second string: equals
Are the two strings equals using char array? true
Are the two strings equals using inbuilt function? true
*/