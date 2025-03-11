import java.util.Scanner;

class UpperCase{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string: ");	
		String st = scn.nextLine();
		
		String userDefined = upperCase(st);
		String builtIn = upperCaseBuiltIn(st);
		
		boolean isEqual = compare(userDefined, builtIn);
		
		System.out.println("Characters to upper case using user defined method: " + userDefined);
        System.out.println("Characters to upper case using built in method: " + builtIn);
		
		if (isEqual) {
            System.out.println("Both methods return the same result.");
        } else {
            System.out.println("The methods return different results.");
        }
	}
	
	public static String upperCase(String s){
		String result = "";
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z' ){
				ch -= 32;   
			}
			
			result += ch;
		}
		
		return result;
	}
	
	public static String upperCaseBuiltIn(String s){
		String result = s.toUpperCase();		
		return result;
	}
	
	public static boolean compare(String s1, String s2){
		return s1.equals(s2);
	}

}

/*
Enter a string: AYUSh goyal
Characters to upper case using user defined method: AYUSH GOYAL
Characters to upper case using built in method: AYUSH GOYAL
Both methods return the same result.
*/