import java.util.*;

class ToggleCase{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = scn.next();
		char[] charArr = s.toCharArray();
		String toggled = "";
		
		
		for(int i=0; i<charArr.length; i++){
			char c = charArr[i]; 
			if(c >= 'a' && c <= 'z'){
				toggled += (char)(c-32) + ""; 
			}else if(c >= 'A' && c <= 'Z'){
				toggled += (char)(c+32) + "";
			}
			else{
				toggled += c + "";
			}			
			
		}
		
		System.out.print("Toggled string: \"" + toggled + "\"");		
		
	}	

}



/*
Enter a string: aYUSHgOYAL
Toggled string: "AyushGoyal"
*/