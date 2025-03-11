import java.util.Scanner;

class LowerCase{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string: ");	
		String st = scn.nextLine();
		
		String userDefined = lowerCase(st);
		String builtIn = lowerCaseBuiltIn(st);
		
		boolean isEqual = compare(userDefined, builtIn);
		
		System.out.println("Characters to lower case using user defined method: " + userDefined);
        System.out.println("Characters to lower case using built in method: " + builtIn);
		
		if (isEqual) {
            System.out.println("Both methods return the same result.");
        } else {
            System.out.println("The methods return different results.");
        }
	}
	
	public static String lowerCase(String s){
		String result = "";
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z' ){
				ch += 32;   
			}
			
			result += ch;
		}
		
		return result;
	}
	
	public static String lowerCaseBuiltIn(String s){
		String result = s.toLowerCase();		
		return result;
	}
	
	public static boolean compare(String s1, String s2){
		return s1.equals(s2);
	}

}

/*
Enter a string: QWERTYUIOP
Characters to lower case using user defined method: qwertyuiop
Characters to lower case using built in method: qwertyuiop
Both methods return the same result.
*/