import java.util.Scanner;

class DictionaryOrder{

	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1 = scn.next();
		System.out.print("Enter a string: ");
		String s2 = scn.next();
		
		int result = compareStrings(s1,s2);
		
		if(result > 0){
			System.out.print("\""+ s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
		}
		else if(result < 0){
			System.out.print("\""+ s2 + "\" comes before \"" + s1 + "\" in lexicographical order.");
		}
		else{
			System.out.print("Both strings are identical.");
		}
		
		
		
		
		
	}
	
	public static int compareStrings(String s1, String s2 ){
		int minLength = Math.min(s1.length() , s2.length() );
		
		for (int i=0; i<minLength; i++){
			if(s1.charAt(i) < s2.charAt(i)){
				return 1;
			}
			else if(s1.charAt(i) > s2.charAt(i)){
				return -1;
			}
		}
		
		if(s1.length() < s2.length() ){
			return 1;
		}
		else if(s1.length() > s2.length()){
			return -1;
		}
		
		return 0;
		
	}
}



/* test case
Enter a string: apple
Enter a string: banana
"apple" comes before "banana" in lexicographical order.
*/