import java.util.Scanner;

class RemoveBetweenSpaces{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.nextLine();
		
		String newString =  s.replaceAll("\\s+"," ");
		
		System.out.print("Oriinal string: \"" +s+ "\"\nupdated string : \"" + newString + "\"" );
		
		
	}	

}