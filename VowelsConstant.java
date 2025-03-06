import java.util.Scanner;

class VowelsConstant{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.next();
		int vowel = 0;
		int constant = 0;
		s = s.toLowerCase();
		
		for(int i=0; i< s.length(); i++ ){
			char c = s.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u' )
			{
				vowel++;
			}
			else{
				constant++; 
			}
			
		}
		
		System.out.print("String \""+ s +"\" contains\nnumber of vowels: " + vowel+ "\nnumber of constants: " + constant);
		
	}	

}