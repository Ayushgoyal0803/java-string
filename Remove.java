import java.util.*;

class Remove{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.nextLine();
		
		System.out.print("Enter a character you want to remove: ");
		char c = scn.next().charAt(0);
		
		String removeString = "";
		
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i); 
			
			if(ch == c){
				continue; 
			}
			
			removeString += ch +"";
			
		}
		
		System.out.print("New string: \"" + removeString + "\"");		
		
	}	

}



/*
Enter a string: Hello World
Enter a character you want to remove: l
New string: "Heo Word"
*/